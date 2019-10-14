package kr.co.itcen.springcontainer.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {
	private Long no;
	private String name;
	
	
	private Friend friend;
	
	private List<String> Friends;
	
	 	
	public User() {
		no = 1L;
		name = "안대혁";
	}
	
	public User(Long no, String name) {
		this.no = no;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [no=" + no + ", name=" + name + ", friend=" + friend + ", Friends=" + Friends + "]";
	}

	public Long getNo() {
		return no;
	}
	public void setNo(Long no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Friend getFriend() {
		return friend;
	}
	public void setFriend(Friend friend) {
		this.friend = friend;
	}

	public List<String> getFriends() {
		return Friends;
	}
	public void setFriends(List<String> friends) {
		Friends = friends;
	}
		
	
}
