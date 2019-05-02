/* FileName: GitUtils.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.cg.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author jinlong.hao
 */
public class GitUtils {
    static Logger logger = LoggerFactory.getLogger(GitUtils.class);

    public static void gitPull(String gitPath, String mainBranchName) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("mainBranchName:{}", mainBranchName);
        if (mainBranchName != null){
            String[] cmd = new String[]{"git", "checkout", mainBranchName};
            exec(cmd, gitPath);
        }
        String[] cmd = new String[]{"git", "pull"};
        exec(cmd, gitPath);
    }

    public static void gitNewBranch(String gitPath, String newBranchName) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("newBranchName:{}", newBranchName);
        if (newBranchName == null){
            return;
        }
        String[] cmd1 = new String[]{"git", "branch", newBranchName};
        String[] cmd2 = new String[]{"git", "checkout", newBranchName};
        exec(cmd1, gitPath);
        exec(cmd2, gitPath);
    }

    public static void gitPush(String gitPath, String newBranchName, String comment) throws IOException {
        logger.debug("gitPath:{}", gitPath);
        logger.debug("newBranchName:{}", newBranchName);
        logger.debug("comment:{}", comment);
        String[] cmd1 = new String[]{"git", "add", "."};
        String[] cmd2 = new String[]{"git", "commit",  "-m", comment};
        exec(cmd1, gitPath);
        exec(cmd2, gitPath);
        if (newBranchName != null){
            String[] cmd3 = new String[]{"git", "push",  "--set-upstream",  "origin", newBranchName};
            exec(cmd3, gitPath);
        } else {
            String[] cmd3 = new String[]{"git", "push"};
            exec(cmd3, gitPath);
        }
    }


    public static void exec(String[] cmd, String dirPath) throws IOException {
        if (logger.isDebugEnabled()) {
            logger.debug("cmd:{}", Arrays.asList(cmd));
            logger.debug("dirPath:{}", dirPath);
        }
        Process process = Runtime.getRuntime().exec(cmd, new String[]{"GIT_DIR="+dirPath + "/.git", "GIT_WORK_TREE="+dirPath}, null);
        if (logger.isWarnEnabled()){
            Reader reader = new InputStreamReader(process.getErrorStream());
            BufferedReader br = new BufferedReader(reader);
            String s = null;
            while ((s = br.readLine()) != null){
               logger.warn("exec error: {}", s);
            }
            br.close();
        }
        if (logger.isDebugEnabled()){
            Reader reader = new InputStreamReader(process.getInputStream());
            BufferedReader br = new BufferedReader(reader);
            String s = null;
            while ((s = br.readLine()) != null){
                logger.debug("exec output: {}", s);
            }
            br.close();
        }
        process.getOutputStream().close();
    }


    public static String generateNewBranchName(){
        DateFormat df = new SimpleDateFormat("yyyymmdd");
        return "eppdev/" + df.format(new Date()) + "-" + System.currentTimeMillis();
    }


}
