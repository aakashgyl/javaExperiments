package com.rs.expt.interfacing;

public interface DbInterface {
	User getUser();

	Set<User> getAllUsers();

	User getUserByUserNameAndPassword();

	boolean insertUser();

	boolean updateUser();

	boolean deleteUser();
}
