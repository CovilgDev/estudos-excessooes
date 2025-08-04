package br.com.dio.model;

import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.Objects;

public class UserModel{

	private long id;
	private String name;
	private String email;
	private LocalDate birthday;
	
	
	public UserModel(long id, String name, String email, LocalDate birthday) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.birthday = birthday;
	}

	public UserModel() {
		
	}
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getBirthday() {
		return birthday;
	}
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	@Override
	public int hashCode() {
		return Objects.hash(birthday, email, id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UserModel other = (UserModel) obj;
		return id == other.id && 
				Objects.equals(email, other.email) &&
				Objects.equals(birthday, other.birthday) &&
				Objects.equals(name, other.name);
	}
	@Override
	public String toString() {
		return "UserModel [id=" + id + ", name=" + name + ", email=" + email + ", birthday=" + birthday + "]";
	}
	
	
	
}
