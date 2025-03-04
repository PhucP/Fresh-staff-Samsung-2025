package phucp.com.example_project.Models;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class LoginUser {
    @Email(message = "Email khong hop le")
    private String email;

    @Size(min = 6, max = 8, message = "Password phai co do dai tu 6 den 8 ky tu")
    private String password;
}
