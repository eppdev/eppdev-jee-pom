/* FileName: GitService.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.service;

import cn.eppdev.jee.cg.utils.GitUtils;
import cn.eppdev.jee.conf.service.EppdevConfService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * @author jinlong.hao
 */
@Service
public class GitService {
    static Logger logger = LoggerFactory.getLogger(GitService.class);


    @Autowired
    EppdevConfService confService;

    public void pull() throws IOException {
        if ("1".equals(confService.getGitAutoPush())){
            if ("1".equals(confService.getGitUseNewBranch())){  // 使用新的分支，pull以前需要checkout到主分支
                GitUtils.gitPull(confService.getGitPath(), confService.getGitMainBranchName());
            } else {  // 不使用新分支，不用checkout
                GitUtils.gitPull(confService.getGitPath(), null);
            }
        } else{
            logger.debug("不需要人工提交");
        }
    }


    public void push(String newBranchName, String comment) throws IOException {
        logger.debug("newBranchName:{}", newBranchName);
        logger.debug("comment:{}", comment);
        if ("1".equals(confService.getGitAutoPush())){
            if ("1".equals(confService.getGitUseNewBranch())){  // 使用新的分支，需要git push --set-upstream
                logger.debug("创建新的分支{}，自动提交", newBranchName);
                GitUtils.gitNewBranch(confService.getGitPath(), newBranchName);
                GitUtils.gitPush(confService.getGitPath(), newBranchName, comment);
            } else {  // 不使用新分支，直接git push即可
                logger.debug("不创建新的分支，自动提交");
                GitUtils.gitPush(confService.getGitPath(), null, comment);
            }
        } else{
            logger.debug("不需要自动提交");
        }
    }
}
