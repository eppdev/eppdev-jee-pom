/* FileName: EppdevConfService.java
 * Copyright EPPDEV-JEE, All Rights Preserved!
 * License: Anti-996 License 1.0
 * Auto created by eppdev-jee(http://jee.eppdev.cn)!
 */

package cn.eppdev.jee.conf.service;

import cn.eppdev.jee.conf.entity.EppdevConf;
import cn.eppdev.jee.conf.param.EppdevConfParam;
import cn.eppdev.jee.conf.service.auto._EppdevConfService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author jinlong.hao
 */
@Service
public class EppdevConfService extends _EppdevConfService {

    static ConcurrentHashMap<String, String> CACHED_MAP = new ConcurrentHashMap<>();


    @Value("${eppdev.author.name:#{null}}")
    String authorName;

    @Value("${eppdev.author.mail:#{null}}")
    String authorMail;

    @Value("${eppdev.project.path:#{null}}")
    String projectPath;

    @Value("${eppdev.git.path:#{null}}")
    String gitPath;

    @Value("${eppdev.git.auto-push:#{null}}")
    String gitAuthPush;

    @Value("${eppdev.git.use-new-branch:#{null}}")
    String gitUseNewBrach;

    @Value("${eppdev.git.main-branch-name:#{null}}")
    String gitMainBranchName;


    @Override
    public void customeInit(EppdevConf entity) {
    }

    public String getConf(String key) {
        return getAllConf().get(key);
    }


    @Override
    public PageInfo<EppdevConf> listAll() {
        PageInfo<EppdevConf> pageInfo = super.listAll();
        return loadLocalConfig(pageInfo);
    }

    @Override
    public PageInfo<EppdevConf> list(EppdevConfParam param) {
        PageInfo<EppdevConf> pageInfo =  super.list(param);
        return loadLocalConfig(pageInfo);
    }

    PageInfo<EppdevConf> loadLocalConfig(PageInfo<EppdevConf> pageInfo){
        for (EppdevConf conf : pageInfo.getList()) {
            if (conf.getConfName().equals("AUTHOR_NAME") && authorName != null
                    && authorName.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(authorName);
            } else if (conf.getConfName().equals("AUTHOR_EMAIL") && authorMail != null
                    && authorMail.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(authorMail);
            } else if (conf.getConfName().equals("PROJECT_PATH") && projectPath != null
                    && projectPath.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(projectPath);
            } else if (conf.getConfName().equals("GIT_PATH") && gitPath != null
                    && gitPath.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitPath);
            } else if (conf.getConfName().equals("GIT_AUTO_PUSH") && gitAuthPush != null
                    && gitAuthPush.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitAuthPush);
            }else if (conf.getConfName().equals("GIT_USE_NEW_BRANCH") && gitUseNewBrach != null
                    && gitUseNewBrach.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitUseNewBrach);
            }else if (conf.getConfName().equals("GIT_MAIN_BRANCH_NAME") && gitMainBranchName != null
                    && gitMainBranchName.trim().length() > 0) {
                conf.setOverrided(true);
                conf.setConfValue(gitMainBranchName);
            } else {
                conf.setOverrided(false);
            }
        }
        return pageInfo;
    }

    public Map<String, String> getAllConf() {
        if (CACHED_MAP.keySet().size() == 0) {
            for (EppdevConf conf : listAll().getList()) {
                CACHED_MAP.put(conf.getConfName(), conf.getConfValue());
            }
        }
        return CACHED_MAP;
    }

    public String getDbType() {
        return getAllConf().get("DB_TYPE");
    }

    public String getProjectPath() {
        return getAllConf().get("PROJECT_PATH");
    }

    public String getBasicPackageName() {
        return getAllConf().get("BASIC_PACKAGE_NAME");
    }

    public String getGitPath() {
        return getAllConf().get("GIT_PATH");
    }

    public String getGitAutoPush() {
        return getAllConf().get("GIT_AUTO_PUSH");
    }

    public String getGitUseNewBranch() {
        return getAllConf().get("GIT_USE_NEW_BRANCH");
    }

    public String getGitMainBranchName() {
        return getAllConf().get("GIT_MAIN_BRANCH_NAME");
    }

    /**
     * 重载基础方法，更新缓存对象
     *
     * @param entity 要保存的数据对象
     * @return
     */
    @Override
    public int update(EppdevConf entity) {
        int cnt = super.update(entity);
        if (cnt > 0) {
            CACHED_MAP.put(entity.getConfName(), entity.getConfValue());
        }
        return cnt;
    }
}
