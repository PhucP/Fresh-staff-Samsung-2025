package final_test.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import final_test.app.Model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    User findUserByEmail(String email);
}
