package com.kovitad.domain;


public class Product {
	private String name;
	private byte[] image;
	private String imageType;
	private String imageUrl;
	private String imageCreditsUrl;

	
	public Product() {
	}

	public Product(String name, String imageUrl, String imageCreditsUrl) {
		this.name = name;
		this.imageUrl = imageUrl;
		this.imageCreditsUrl = imageCreditsUrl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getImageCreditsUrl() {
		return imageCreditsUrl;
	}

	public void setImageCreditsUrl(String imageCreditsUrl) {
		this.imageCreditsUrl = imageCreditsUrl;
	}

	public String getImageType() {
		return imageType;
	}

	public void setImageType(String imageType) {
		this.imageType = imageType;
	}
	
}
