package com.sdxg.angrybulls.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YangSheng
 * @Package com.sdxg.angrybulls.web
 * @date 2018/9/8 14:55
 */
@Controller
@RequestMapping("/")
public class AppController {


    /**
     * 首页跳转
     *
     * @return java.lang.String
     * @author 杨盛
     * @date 2018/9/8 15:07
     */
    @GetMapping(value={"/", "/index"})
    public String homePage(){
        return "index";
    }

    /**
     * 视频上传页面跳转
     *
     * @return java.lang.String
     * @author 杨盛
     * @date 2018/9/8 15:07
     */
    @GetMapping("/upload")
    public String upload(){
        return "upload";
    }
}
