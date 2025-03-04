package phucp.com.example_project.Controllers;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import phucp.com.example_project.Models.LoginUser;

@RestController
@RequestMapping("/auth")
public class LoginController {

    @PostMapping("/login")
    public String Login(@Valid() @RequestBody() LoginUser loginUser, BindingResult result) {
        if(result.hasErrors()){
            return result.toString();
        }
        return loginUser.getEmail() + " : " + loginUser.getPassword();
    }
}
