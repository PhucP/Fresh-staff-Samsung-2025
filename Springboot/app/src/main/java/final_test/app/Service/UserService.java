package final_test.app.Service;

import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Service;

import final_test.app.Model.User;
import final_test.app.Model.Dto.CreateUserDto;
import final_test.app.Repository.UserRepo;

@Service
public class UserService {
    private final UserRepo userRepository;

    public UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public void saveUser(CreateUserDto dto) {
        if(findUserByEmail(dto.email) == null){
            User newUser = new User();
            newUser.setEmail(dto.email);
            newUser.setPassword(dto.password);
            userRepository.save(newUser);
        }
    }

    public User findUserByEmail(String email){
        return userRepository.findUserByEmail(email);
    }
}
