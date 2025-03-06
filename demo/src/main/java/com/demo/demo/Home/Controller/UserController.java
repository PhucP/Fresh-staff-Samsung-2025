package com.demo.demo.Home.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.demo.Home.Service.IUserService;
import com.demo.demo.Home.entity.InsertUserDTO;
import com.demo.demo.Home.entity.User;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;




@Controller
@RequestMapping("/home")
public class UserController {
    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }    

    @GetMapping("/all")
    public String getAllUser(final Model model, HttpSession session) {
        List<User> users = userService.getAllUser();
        if (!users.isEmpty()) {
            session.setAttribute("currentUser", users.get(0)); 
        }
        model.addAttribute("users", users);
        return "html/home";
    }

    @PostMapping("/{email}")
    public String postMethodName(@RequestBody String entity) {
        return entity;
    }
    
    @PostMapping("/insert")
    public String insertAllUser(@RequestBody InsertUserDTO dto) {
        userService.insertAllUser(dto);
        return "html/home";
    }
    

    @SuppressWarnings("rawtypes")
    @GetMapping("/getSession")
    public ResponseEntity getSession(HttpSession session) {
        User currentUser = (User) session.getAttribute("currentUser");
        return ResponseEntity.ok(currentUser);
    }
    
}
