package com.itheima;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author xx
 * @Date 2021/11/19 10:18
 * @Version 1.0
 */
//Rest模式
@RestController
@RequestMapping("/book")
public class BookController {
    @GetMapping
   public String getById(){
       System.out.println("springboot is running ...2");
       return "springboot is running...2";
   }

}





















