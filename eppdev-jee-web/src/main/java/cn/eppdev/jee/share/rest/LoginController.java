/* FileName: LoginController.java
 * Copyright EPPDEV.CN, All Rights Preserved!
 * Licensed By Anti-996 License 1.0
 */

package cn.eppdev.jee.share.rest;

import cn.eppdev.jee.conf.entity.EppdevUser;
import cn.eppdev.jee.conf.service.EppdevUserService;
import cn.eppdev.jee.share.entity.RestResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jinlong.hao
 */
@RestController
@RequestMapping("/rest/share")
public class LoginController {

    @Autowired
    EppdevUserService userService;

    @RequestMapping("/login")
    public RestResult<EppdevUser> login(String loginName, String password){
        return null;
    }

    @RequestMapping("/logout")
    public RestResult<String> logout(){
        return null;
    }

}
