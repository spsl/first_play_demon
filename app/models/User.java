package models;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



import play.db.jpa.JPA;

@Entity
@Table(name="user")
public class User implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long id;
	public String username;
	public String password;
//	public String displayName;
	public String email;
	public String phone;
	public String typeId;
	public String department;
	public String remarks;
	public int isEnable;

	
	
	
	
	public static User findById(Long id){
		return JPA.em().find(User.class, id);
	}
	
	public static void add(User user){
		JPA.em().persist(user);
	}
	
	public static void update(User user){
		JPA.em().merge(user);
	}
	
	public static void delete(Long id){
		User user = findById(id);
		JPA.em().remove(user);
	}
	

	
	
	
}





























