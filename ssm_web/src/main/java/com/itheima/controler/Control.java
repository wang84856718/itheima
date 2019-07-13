package com.itheima.controler;

import com.itheima.domain.Item;
import com.itheima.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/items")
public class Control {
    @Autowired
    private UserService userService;
      @RequestMapping(value = "/show")
    public String save(Model model){
            System.out.println(5);
        Item item = userService.findid(1);
        model.addAttribute("item",item);
        return "/itemDetail";
    }
}
