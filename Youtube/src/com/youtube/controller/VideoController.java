package com.youtube.controller;

import java.util.ArrayList;

import com.youtube.model.Video;

public class VideoController {
	ArrayList<Video> videoList = new ArrayList<>();
	// 영상 업로드
		public Video upload(int index, Video video) {
			videoList.add(video);
			return video;
		}

		// 영상 목록
		public ArrayList<Video> list() {
			return videoList;
		}

		// 영상 1개 보기
		public Video viewVideo(int index) {
			
			return videoList.get(index);
			
		}

		// 동영상 수정
		public void updateVideo(int index, Video video) {
			
			videoList.set(index, video);
			
		}

		// 동영상 삭제
		public boolean deleteVideo(Video video) {
			
			return videoList.remove(video);
			
		}


}
