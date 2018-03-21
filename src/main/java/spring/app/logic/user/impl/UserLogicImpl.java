package spring.app.logic.user.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.app.dao.user.UserDao;
import spring.app.entity.user.User;
import spring.app.form.user.UserForm;
import spring.app.logic.user.UserLogic;

@Service("userLogic")
@Transactional
public class UserLogicImpl implements UserLogic {

	@Autowired
	private UserDao userDao;

	public List<User> findAllUser() {
		List<User> list = userDao.findAllUser();
		return list;
	}

	public User findByUserId(String userId) {
		User user = userDao.findByUserId(userId);
		return user;
	}

	public void insertUser(UserForm userForm) {
		User user = new User();
		user.setUserId(userForm.getUserId());
		user.setFirstName(userForm.getFirstName());
		user.setLastName(userForm.getLastName());
		user.setPassword(userForm.getPassword());
		user.setRoleName(userForm.getUserRole());
		userDao.insertUser(user);
	}

	public void updateUser(UserForm userForm) {
		User user = new User();
		user.setUserId(userForm.getUserId());
		user.setFirstName(userForm.getFirstName());
		user.setLastName(userForm.getLastName());
		user.setPassword(userForm.getPassword());
		user.setRoleName(userForm.getUserRole());
		userDao.updateUser(user);
	}

	public void delteUser(String userId) {
		userDao.deleteUser(userId);
	}

}
