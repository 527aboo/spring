package spring.app.dao.user.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import spring.app.dao.AbstractDao;
import spring.app.dao.user.UserDao;
import spring.app.entity.user.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao implements UserDao {

	@SuppressWarnings("unchecked")
	public List<User> findAllUser() {
		Criteria criteria = getSession().createCriteria(User.class);
		return (List<User>) criteria.list();
	}

	public User findByUserId(String userId) {
		Criteria criteria = getSession().createCriteria(User.class);
		criteria.add(Restrictions.eqOrIsNull("userId", userId));
		return (User) criteria.uniqueResult();
	}

	@Transactional
	public void insertUser(User user) {
		persisit(user);
	}

	@Transactional
	public void updateUser(User user) {
		getSession().update(user);
	}

	@Transactional
	public void deleteUser(String userId) {
		Query query = getSession().createQuery("delete from User where userId = :userId");
		query.setString("userId", userId);
		query.executeUpdate();
	}

}
