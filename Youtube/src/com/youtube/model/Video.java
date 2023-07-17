package com.youtube.model;

import java.util.List;

import javax.xml.crypto.Data;

public class Video {

	private String title;
	private Data uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;
	private String desc;
	private char kind; //shorts & video 둘 중 하나!
	private List<Comment> comments;
	private Category category;
	
	private List<Video> videos;

	/*
	 * Create Read Update Delete
	 * 
	 */

}