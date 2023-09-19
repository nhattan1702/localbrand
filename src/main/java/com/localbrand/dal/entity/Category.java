package com.localbrand.dal.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "category")
public class Category {
	private String id;
	private String name;
}
