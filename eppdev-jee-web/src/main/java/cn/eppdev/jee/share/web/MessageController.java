/* FileName: MessageController.java
 * 郝金隆(jinlong.hao@eppdev.cn), All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author jinlong.hao
 */
@Controller
public class MessageController {
    static Logger logger = LoggerFactory.getLogger(MessageController.class);

    @RequestMapping("/message")
    public String message(Model model){
        return "message";
    }
}
