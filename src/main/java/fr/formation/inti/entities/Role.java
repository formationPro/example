package fr.formation.inti.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "app_role")
public class Role implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_role")
	private long id_role;
	private String role_name;
	private String description;

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Role(long id_role, String role_name, String description) {
		super();
		this.id_role = id_role;
		this.role_name = role_name;
		this.description = description;
	}

	public Role(long id_role, String role_name) {
		super();
		this.id_role = id_role;
		this.role_name = role_name;
	}

	public long getId_role() {
		return id_role;
	}

	public void setId_role(long id_role) {
		this.id_role = id_role;
	}

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Role [id_role=" + id_role + ", role_name=" + role_name + ", description=" + description + "]";
	}

}
