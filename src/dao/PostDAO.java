package dao;

import java.util.List;

import javax.ejb.Stateless;

import entity.Post;

@Stateless
public class PostDAO implements PostInterface {

	@Override
	public void insert(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Post queryById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> queryAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post queryByUrl(String url) {
		// TODO Auto-generated method stub
		return null;
	}

}
