/* FileName: BasicService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.service;

import cn.eppdev.jee.commons.dao.BasicDao;
import cn.eppdev.jee.commons.entity.BasicEntity;
import cn.eppdev.jee.commons.param.BasicParam;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Date;
import java.util.UUID;
import org.springframework.transaction.annotation.Transactional;

/**
 * 基础Service类，提供了一些基础的方法
 *
 * @author jinlong.hao
 */
public abstract class BasicService<T extends BasicEntity, P extends BasicParam> {
    private static Logger logger = LoggerFactory.getLogger(BasicService.class);

    public static final Integer DEL_FLAG_NORMAL = 0;

    /**
     * 获取一条数据
     *
     * @param id 数据ID
     * @return 单条数据
     */
    public T get(String id) {
        return getDao().get(id);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        return getDao().delete(entity);
    }

    /* 删除一条数据
     *
     * @param id 要删除的数据ID
     * @param userId 要删除的用户ID
     * @return 实际删除的数据条数
     */
    @Transactional(readOnly = false)
    public int delete(String id, String userId) {
        BasicEntity entity = new BasicEntity();
        entity.setId(id);
        entity.setUpdateDate(new Date());
        entity.setUpdateBy(userId);
        return getDao().delete(entity);
    }

    /**
     * 根据条件进行数据删除
     *
     * @param param 条件（主要是_inIdList，支持多条数据的删除）
     * @return 删除的总条数
     */
    public int deleteBy(P param) {
        return getDao().deleteBy(param);
    }

    /**
     * 保存数据，若存在ID，则执行更新操作，若不存在，则执行插入操作
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int save(T entity) {
        logger.debug("entity: {}", entity);
        // 首先判断逻辑主键是否有重复的，如有则不更新修改
        if (!exists(entity)) {
            if (entity.getId() == null || entity.getId().trim().length() == 0) {
                return insert(entity);
            } else {
                return update(entity);
            }
        } else {
            return 0;
        }
    }

    /**
     * 插入输入，若无ID则新初始化一个ID，若有则用原来的id进行保存
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    @Transactional(readOnly = false)
    public int insert(T entity) {
        logger.debug("entity: {}", entity);
        if (!exists(entity)) {
            _init(entity);
            return getDao().insert(entity);
        } else {
            return 0;
        }
    }

    /**
     * 修改数据
     *
     * @param entity 要保存的数据对象
     * @return 保存的数据条数
     */
    public int update(T entity) {
        logger.debug("entity:{}", entity);
        if (!exists(entity)) {
            entity.setUpdateDate(new Date());
            return getDao().update(entity);
        } else {
            return 0;
        }
    }


    /**
     * 插入强的数据初始化
     *
     * @param entity 要插入的数据
     */
    private void _init(T entity) {
        Date date = new Date();
        if (entity.getId() == null || entity.getId().trim().length() == 0) {
            entity.setId(UUID.randomUUID().toString().replace("-", ""));
        }
        entity.setCreateDate(date);
        entity.setUpdateDate(date);
        entity.setDelFlag(DEL_FLAG_NORMAL);
        customeInit(entity);
    }


    /**
     * 获取所有的数据
     *
     * @return 获取所有数据
     */
    public PageInfo<T> listAll() {
        return new PageInfo<>(getDao().list(null));
    }

    /**
     * 获取分页列表
     *
     * @param param 参数值
     * @return
     */
    public PageInfo<T> list(P param) {
        return new PageInfo<>(getDao().list(param));
    }


    /**
     * 业务上根据逻辑主键判断此数据是否存在
     *
     * @param entity 要判断的对象
     * @return 数据是否存在
     */
    public abstract boolean exists(T entity);

    /**
     * 数据保存前自定义的初始化操作，数据的初始化
     * @param entity 要初始化的对象
     */
    public abstract void customeInit(T entity);

    /**
     * 获取此处要使用的Dao对象，之所以要这样做，为了实现自动生成的Dao配置文件和可以修改的配置文件的分离
     * @return 要使用的Dao实例
     */
    public abstract BasicDao<T, P> getDao();
}

