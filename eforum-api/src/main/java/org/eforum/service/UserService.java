package org.eforum.service;

import org.eforum.entity.User;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public interface UserService {
	@Transactional
	User addUser(User user);

	User findUserById(Long id);

	User findUserByName(String username);

	User findUserByEmail(String email);

	User findLoginUser(String username, String password);

	/**
	 * 修改密码
	 * 
	 * @param user
	 * @param newPassword
	 */
	void changePassword(User user, String newPassword);
}