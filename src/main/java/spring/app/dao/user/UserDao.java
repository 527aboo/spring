package spring.app.dao.user;

import java.util.List;

import spring.app.entity.user.User;

public interface UserDao {

	List<User> findAllUser();

	User findByUserId(String userId);

	void insertUser(User user);

	void updateUser(User user);

	void deleteUser(String userId);

}
