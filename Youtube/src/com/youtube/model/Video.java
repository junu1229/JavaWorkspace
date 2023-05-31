package com.youtube.model;

import javax.xml.crypto.Data;

public class Video {

	private String title;
	private String comment;
	private Data uploadAt;
	private int views;
	private String imgUrl;
	private String fileUrl;
	private String videoUploader;

	/*
	 * Create Read Update Delete
	 * 
	 */
	public Video() {
		// TODO Auto-generated constructor stub
	}

	public Video(String title, String comment, Data uploadAt, int views, String imgUrl, String fileUrl,
			String videoUploader) {
		this.title = title;
		this.comment = comment;
		this.uploadAt = uploadAt;
		this.views = views;
		this.imgUrl = imgUrl;
		this.fileUrl = fileUrl;
		this.videoUploader = videoUploader;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Data getUploadAt() {
		return uploadAt;
	}

	public void setUploadAt(Data uploadAt) {
		this.uploadAt = uploadAt;
	}

	public int getViews() {
		return views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getVideoUploader() {
		return videoUploader;
	}

	public void setVideoUploader(String videoUploader) {
		this.videoUploader = videoUploader;
	}

	@Override
	public String toString() {
		return "Video [title=" + title + ", comment=" + comment + ", uploadAt=" + uploadAt + ", views=" + views
				+ ", imgUrl=" + imgUrl + ", fileUrl=" + fileUrl + ", videoUploader=" + videoUploader + "]";
	}

}