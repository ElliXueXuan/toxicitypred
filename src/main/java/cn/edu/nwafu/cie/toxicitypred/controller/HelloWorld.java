package cn.edu.nwafu.cie.toxicitypred.controller;

import cn.edu.nwafu.cie.toxicitypred.service.IRegService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author: SungLee
 * @date: 2018-10-01 17:21
 * @description: This is a test class
 */
@RestController
@EnableAutoConfiguration
public class HelloWorld {
    @Autowired
    private IRegService regService;
    @RequestMapping("/hello")
    String home() {
        return "Hello World";
    }
    @RequestMapping("/reg")
    @ResponseBody
    Boolean reg(@RequestParam("loginPwd") String loginNum, @RequestParam("userId") String userId ){
        String pwd = creatMD5(loginNum);
        System.out.println(userId+":"+loginNum);
        regService.regUser("1", userId,pwd);
        return true;
    }
    private String creatMD5(String loginNum){
        // 生成一个MD5加密计算摘要
        MessageDigest md = null;
        try {
            md = MessageDigest.getInstance("MD5");
            md.update(loginNum.getBytes());

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return new BigInteger(1, md.digest()).toString(16);
    }
}
