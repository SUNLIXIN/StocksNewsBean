package dao;

import java.util.List;

import javax.ejb.Local;

import entity.Post;

@Local
public interface PostInterface {

	public void insert(Post post);
	public void update(Post post);
	public void delete(Post post);
	public Post queryById(int id);
	public Post queryByUrl(String url);
	public List<Post> queryAll();
}
