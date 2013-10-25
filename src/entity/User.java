package entity;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(columnDefinition="TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
	private Date createdTime;
	@Column(unique=true)
	private String name;
	private String password;
	@Column(unique=true)
	private String email;
	private String about;
	@Column(columnDefinition="int default 0")
	private int karma;
	@Column(columnDefinition="boolean default false")
	private boolean showdead;
	@Column(columnDefinition="boolean default false")
	private boolean noprocrast;
	@Column(columnDefinition="int default 20")
	private int maxvisit;
	@Column(columnDefinition="int default 180")
	private int minaway;
	@Column(columnDefinition="int default 0")
	private int delay;
	@ManyToMany(mappedBy="savedBy")
	private Set<Post> saved;
	@OneToMany(mappedBy="postedBy")
	private Set<Post> posted;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedTime() {
		return createdTime;
	}
	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public int getKarma() {
		return karma;
	}
	public void setKarma(int karma) {
		this.karma = karma;
	}
	public boolean isShowdead() {
		return showdead;
	}
	public void setShowdead(boolean showdead) {
		this.showdead = showdead;
	}
	public boolean isNoprocrast() {
		return noprocrast;
	}
	public void setNoprocrast(boolean noprocrast) {
		this.noprocrast = noprocrast;
	}
	public int getMaxvisit() {
		return maxvisit;
	}
	public void setMaxvisit(int maxvisit) {
		this.maxvisit = maxvisit;
	}
	public int getMinaway() {
		return minaway;
	}
	public void setMinaway(int minaway) {
		this.minaway = minaway;
	}
	public int getDelay() {
		return delay;
	}
	public void setDelay(int delay) {
		this.delay = delay;
	}
	public Set<Post> getSaved() {
		return saved;
	}
	public void setSaved(Set<Post> saved) {
		this.saved = saved;
	}
	public Set<Post> getPosted() {
		return posted;
	}
	public void setPosted(Set<Post> posted) {
		this.posted = posted;
	}
}
