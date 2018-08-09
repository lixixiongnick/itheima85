package com.itheima.a_params;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
@RequestMapping("/user")
public class UserController {
    @RequestMapping("/save.do")
    //请求路径:http://localhost:8080/user/save?id=100&name=jack
    public String save(int id,String name){
        System.out.println(id+","+name);
        return "success";
    }
    @RequestMapping("/update.do")
    //请求路径:http://localhost:8080/user/update?id=100,username=jack
    public String update(int id,String username){
        System.out.println(id+","+username);
        return "success";
    }
    @RequestMapping("/update2.do")
    public String update2(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping(value = "/update3.do",method = RequestMethod.POST)
    public String update3(User user){
        System.out.println(user);
        return "success";
    }
    @RequestMapping("/update4.do")
    public String update4(String name){
        System.out.println("肆无忌惮");
        System.out.println(name);
        return "success";
    }
    @RequestMapping("/save2.do")
    public String save2(Integer id,String name){
        System.out.println(id+","+name);
        return "success";
    }
    @RequestMapping("/save3.do")
    public String save3(@RequestParam("id") Integer id_,
                        @RequestParam("username") String name
                        ){
        System.out.println(id_+","+name);
        return "success";
    }
    @RequestMapping("/searchByDate")
    public String ByDate(String data){
        System.out.println(data);
        return "success";
    }
    @RequestMapping("/searchByDate2")
    public  String ByDate2(Date date){
        System.out.println(date);
        return "success";
    }
    @RequestMapping("/service.do")
    public  String service(HttpServletResponse response, HttpServletRequest request, HttpSession session){
        System.out.println(request);
        System.out.println(response);
        System.out.println(session);
        return "success";
    }
}
