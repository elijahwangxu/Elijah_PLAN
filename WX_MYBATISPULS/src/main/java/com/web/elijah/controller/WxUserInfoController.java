package com.web.elijah.controller;

import com.web.elijah.service.WxUserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author:王旭
 * @date:2019/9/29 11:24
 * </p>
 * Description:
 */
@Controller
@RequestMapping("/userinfo")
public class WxUserInfoController {
    @Autowired
    private WxUserInfoService wxUserInfoService;

    @RequestMapping(value = "/insert",method = RequestMethod.POST)
    @ResponseBody
    public void insertMethod(){
        wxUserInfoService.insert();
    }

    @RequestMapping(value = "/tset01",method = RequestMethod.POST)
    @ResponseBody
    public String tset01(){
        wxUserInfoService.mapLambda();
        return "success";
    }
}
