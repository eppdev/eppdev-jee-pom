/* FileName: BasicDao.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.commons.dao;

import cn.eppdev.jee.commons.entity.BasicEntity;
import cn.eppdev.jee.commons.param.BasicParam;
import java.util.List;

/**
 * Dao的基础类
 * @author jinlong.hao
 */
public interface BasicDao<T extends BasicEntity, P extends BasicParam> {


    /**
     * 插入数据
     * @param entity 要插入的数据
     * @return 插入数据条数
     */
    int insert(T entity);

    /**
     * 删除数据 会自动修改del_flag, update_date, update_by三个字段，设置为删除.
     * @param entity 要删除的数据信息
     * @return 删除的数据条数
     */
    int delete(BasicEntity entity);

    /**
     * 根据条件进行数据删除（注意要慎重使用），删除条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 删除数据的条数
     */
    int deleteBy(P param);

    /**
     * 更新数据
     * @param Entity 要更新的数据
     * @return 更新成功的数据条数
     */
    int update(T Entity);

    /**
     * 获取数据
     * @param id 数据ID
     * @return 数据对象
     */
    T get(String id);

    /**
     * 查询数据，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 返回的结果列表
     */
    List<T> list(P param);

    /**
     * <b>Deprecated: 使用PageHelper后请使用#listBy方法代替</b><br />
     * 根据条件查询数据条数，查询条件包括（以name字段为例）：<br/>
     * <ul>
     *     <li>1. 等于，如name非空，则增加条件：name={name}</li>
     *     <li>2. 小于等于，如_maxName非空，则增加条件：name<=_maxName </li>
     *     <li>3. 大于等于，如_minName非空，则增加条件：name>=_minName</li>
     *     <li>4. like，如_likeName非空，则增加条件：name like '%'+_likeName+'%'</li>
     *     <li>5. left like, 如_leftLikeName非空，则增加条件： name like _leftLikeName+'%'</li>
     *     <li>6. in, 如_inNameList，则增加条件： name in (_inNameList[0], ... _inNameList[n])</li>
     * </ul>
     * @param param 参数对象
     * @return 满足条件的数据条数
     */
    @Deprecated
    public int count(P param);

}
