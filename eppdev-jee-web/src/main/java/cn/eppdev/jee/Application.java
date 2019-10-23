/* FileName: Application.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author jinlong.hao
 */
@SpringBootApplication
@MapperScan("cn.eppdev.jee.conf.dao")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}
