package com.rest.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import org.springframework.stereotype.Indexed;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table
@JsonIgnoreProperties(value = {"createdAt"}, allowGetters = true)
public class Todo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	 @NotBlank
	 @Size(max=100)
	//@Indexed(unique=true)
	 private String title;
	 
	 private Boolean completed = false;
	 
	 private Date createdAt = new Date();

	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	

	public Todo(Long id, @NotBlank @Size(max = 100) String title, Boolean completed, Date createdAt) {
		super();
		this.id = id;
		this.title = title;
		this.completed = completed;
		this.createdAt = createdAt;
	}

	public Todo() {
		super();
		
	}

	@Override
	public String toString() {
		return "Todo [id=" + id + ", title=" + title + ", completed=" + completed + ", createdAt=" + createdAt + "]";
	}
	 
	 
}
