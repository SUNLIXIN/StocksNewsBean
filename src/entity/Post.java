package entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String title;
	@Column(unique=true)
	private String url;
	private String Text;
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date postedTime;
	@Column(columnDefinition="int default 0")
	private int savedTimes;
	@Column(columnDefinition="int default 0")
	private int clickedTimes;
	@ManyToOne
	private User postedBy;
	@ManyToMany
	private Set<User> savedBy;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getText() {
		return Text;
	}
	public void setText(String text) {
		Text = text;
	}
	public Date getPostedTime() {
		return postedTime;
	}
	public void setPostedTime(Date postedTime) {
		this.postedTime = postedTime;
	}
	public int getSavedTimes() {
		return savedTimes;
	}
	public void setSavedTimes(int savedTimes) {
		this.savedTimes = savedTimes;
	}
	public int getClickedTimes() {
		return clickedTimes;
	}
	public void setClickedTimes(int clickedTimes) {
		this.clickedTimes = clickedTimes;
	}
	public User getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(User postedBy) {
		this.postedBy = postedBy;
	}
	public Set<User> getSavedBy() {
		return savedBy;
	}
	public void setSavedBy(Set<User> savedBy) {
		this.savedBy = savedBy;
	}
}
