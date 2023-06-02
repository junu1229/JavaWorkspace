package com.youtube.controller;

import com.youtube.model.Video;

public class VideoController {
	Video[] videoList = new Video[5];
	// 영상 업로드
		public Video upload(int index, Video video) {
			videoList[index++] = video;
			return video;
		}

		// 영상 목록
		public Video[] list() {
			return videoList;
		}

		// 영상 1개 보기
		public Video viewVideo(int index) {
			
			return videoList[index];
			
		}

		// 동영상 수정
		public Video updateVideo(int index, Video video) {
			
			videoList[index] = video;
			return video;
			
		}

		// 동영상 삭제
		public boolean deleteVideo() {
			
			return true;
			
		}


}
