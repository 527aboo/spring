package spring.app.logic.user;

import java.util.List;

import spring.app.entity.user.User;
import spring.app.form.user.UserForm;

public interface UserLogic {

	List<User> findAllUser();

	User findByUserId(String userId);

	void insertUser(UserForm userForm);

	void updateUser(UserForm userForm);

	void delteUser(String userId);

}
