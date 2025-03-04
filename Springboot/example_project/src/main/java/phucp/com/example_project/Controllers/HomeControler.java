package phucp.com.example_project.Controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;
import phucp.com.example_project.Models.LoginUser;
import phucp.com.example_project.Services.TestService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/home")
public class HomeControler {
    private final TestService testService;

    public HomeControler(TestService testService) {
        this.testService = testService;
    }
    @GetMapping("/helloworld/{id}")
    public String helloWorld(@PathParam("id") String id) {
        return "hello " + id;
     }
     
}
