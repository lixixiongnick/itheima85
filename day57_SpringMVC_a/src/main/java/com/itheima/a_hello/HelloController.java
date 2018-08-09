package com.itheima.a_hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
* @RequestMapping 建立请求的路径和控制器处理方法的映射关系
* 可以写到类上,也可以写到方法上,完成的请求路径访问:类+方法,
* 类上:区分不同的模块
* 方法:指定请求路径对应的后台的处理方法
* */
@Controller
@RequestMapping("/account")
public class HelloController {
    @RequestMapping("/hello.do")
    public String hello(){
        System.out.println("飞哥");
        System.out.println("A程序员上传代码了,大家注意");
        System.out.println("B程序员上传代码了,大家.....");
        System.out.println("这个月天气都不错");
        return "success";
    }
    @RequestMapping("/save.do")
    public String save(){
        System.out.println("save");
        return "success";
    }
    @RequestMapping(value = "/update",params = "id=100")
    public String update(){
        System.out.println("update");
        return "success";
    }
    @RequestMapping(value = "/delete.do",method = RequestMethod.POST)
    public String delete(){
        System.out.println("delete..");
        return "success";
    }
//    pojo类型
/*
* 请求参数名称一定要和对象的属性一致
* <input type=text name="id"/>id就是user对象的属性
* <input type=text name="name"/>name就是user对象属性
* */
}
