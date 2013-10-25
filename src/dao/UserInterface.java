package dao;

import java.util.List;

import javax.ejb.Local;

import entity.User;

@Local
public interface UserInterface {

	public void insert(User user);
	public void update(User user);
	public void delete(User user);
	public User queryByName(String name);
	public User queryByUsername(String username);
	public User queryByEmail(String email);
	
	public List<User> getLeaders();
}
