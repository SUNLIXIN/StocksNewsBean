package dao;

import java.util.List;

import javax.ejb.Stateless;
import entity.User;

@Stateless
public class UserDAO implements UserInterface {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User queryByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryByUsername(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User queryByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> getLeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
