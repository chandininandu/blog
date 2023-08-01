package com.ssd.images.model;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "images")

public class Image {
	
	
	@Id
	public String id;
	
	public String name;
	
	public String type;
	
	public byte[] imagedata;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public byte[] getImagedata() {
		return imagedata;
	}

	public void setImagedata(byte[] imagedata) {
		this.imagedata = imagedata;
	}

	public Image(String id, String name, String type, byte[] imagedata) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.imagedata = imagedata;
	}

	public Image(String name, String type, byte[] imagedata) {
		super();
		this.name = name;
		this.type = type;
		this.imagedata = imagedata;
	}

	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Image [id=" + id + ", name=" + name + ", type=" + type + ", imagedata=" + Arrays.toString(imagedata)
				+ "]";
	}



	
	

}
