package org.eforum.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 用户
 */
@Entity(name = "user")
public class User extends BaseEntity{
	/**
	 * 登录账号
	 */
	@Column
	private String name;
	/**
	 * 电子邮箱
	 */
	@Column
	private String email;
	/**
	 * 登录密码
	 */
	@Column
	@JSONField(serialize = false)
	private String password;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}