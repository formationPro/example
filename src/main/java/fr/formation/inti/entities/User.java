package fr.formation.inti.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;



@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@OnDelete(action = OnDeleteAction.CASCADE)
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private long code_user;

	@Column(name = "login")
	private String login;

	@Column(name = "password")
	private String password;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
	@JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id_role"))
	private List<Role> roles;

	@Column(name = "TYPE_USER")
	private String type_user;

	public User() {
		super();
	}

	public User(long code_user, String login, String password, List<Role> roles, String type_user) {
		super();
		this.code_user = code_user;
		this.login = login;
		this.password = password;
		this.roles = roles;
		this.type_user = type_user;
	}

	public User(String login, String password, List<Role> roles, String type_user) {
		super();
		this.login = login;
		this.password = password;
		this.roles = roles;
		this.type_user = type_user;
	}

	public long getCode_user() {
		return code_user;
	}

	public void setCode_user(long code_user) {
		this.code_user = code_user;
	}

	public void setCode_user(Long code_user) {
		this.code_user = code_user;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public String getType_user() {
		return type_user;
	}

	public void setType_user(String type_user) {
		this.type_user = type_user;
	}

}
