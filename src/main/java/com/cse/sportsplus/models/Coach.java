package com.cse.sportsplus.models;

import java.io.Serializable;

<<<<<<< HEAD
=======
import javax.persistence.CascadeType;
>>>>>>> ef259aa64e698cbd4fc5043b1d42e79ac93c2e66
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
<<<<<<< HEAD
=======
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
>>>>>>> ef259aa64e698cbd4fc5043b1d42e79ac93c2e66
import javax.persistence.Table;

@Entity
@Table(name="tbl_coach")
public class Coach implements Serializable {

	@Id
	@GeneratedValue
	private Long coach_id;
	
<<<<<<< HEAD
	@Column(name="group_id")
	private Long group_id;
=======
	@ManyToOne
	@JoinColumn(name = "groupID")
	private Group group_id;
>>>>>>> ef259aa64e698cbd4fc5043b1d42e79ac93c2e66
	
	@Column(name="name")
	private String name;
	
	@Column(name="qualification")
	private String qualification;
	
	@Column(name="phone")
	private String phone;
	
	public Coach() {
		super();
	}

	public Long getCoach_id() {
		return coach_id;
	}

	public void setCoach_id(Long coach_id) {
		this.coach_id = coach_id;
	}

<<<<<<< HEAD
	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
=======
	

	public Group getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Group group_id) {
>>>>>>> ef259aa64e698cbd4fc5043b1d42e79ac93c2e66
		this.group_id = group_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

<<<<<<< HEAD
}
=======
}
>>>>>>> ef259aa64e698cbd4fc5043b1d42e79ac93c2e66
