package com.hibernate.Demo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.exception.internal.CacheSQLExceptionConversionDelegate;

@Entity
@Table(name = "instructor_details")
public class InstructorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "youtube_channel")
	private String youTubeChannel;

	@Column(name = "hobby")
	private String hobby;

	
	/*Refers to the "instructorDetails" from "Instructor" Class*/
	
	@OneToOne(mappedBy = "instructorDetails", cascade = CascadeType.ALL)
	private Instructor instructor;

	public InstructorDetails() {

	}

	@Override
	public String toString() {
		return "InstructorDetails [id=" + id + ", youTubeChannel=" + youTubeChannel + ", hobby=" + hobby
				+ ", instructor=" + instructor + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public InstructorDetails(String youTubeChannel, String hobby) {
		this.youTubeChannel = youTubeChannel;
		this.hobby = hobby;
	}

	public String getYouTubeChannel() {
		return youTubeChannel;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public void setYouTubeChannel(String youTubeChannel) {
		this.youTubeChannel = youTubeChannel;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

}
