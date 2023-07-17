package com.kh.practice1.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice1.compare.ArtistAscending;
import com.kh.practice1.compare.TitleAscending;
import com.kh.practice1.model.Music;

public class MusicController {
	private ArrayList<Music> list = new ArrayList<>();
	
	public boolean addList(Music music) {
		if(list.add(music)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean addAtZero(Music music) {
		list.add(0, music);
		if(music == list.get(0)) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public ArrayList<Music> printAll() {
		return list;
	}
	
	public Music searchMusic(String title) {
		
		Music result = null;
		for(Music music: list) {
			if(music.getTitle().contains(title)) {
				result = music;
				
			}

		}
		return result;
		
		
	}
	
	public Music removeMusic(String title) {
		Music result = null;
		for(Music music: list) {
			if(music.getTitle().equals(title)) {
				result = music;
				list.remove(music);
				
			}
			
		}
		return result;
		
		
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				return list.set(i, music);
				
			}
			
		}
		return null;
	}
	
	public ArrayList<Music> ascTitle() {
		ArrayList<Music> temp = (ArrayList<Music>)list.clone();
//		ArrayList<Music> temp = new ArrayList<>();
//		for(int i = 0; i<list.size(); i++) {
//			temp.add(list.get(i));
//		}
		Collections.sort(temp, new TitleAscending());
		
		
		return temp;
	}
	
	public ArrayList<Music> descArtist() {
		ArrayList<Music> temp = (ArrayList<Music>)list.clone();
//		ArrayList<Music> temp = new ArrayList<>();
//		for(int i = 0; i<list.size(); i++) {
//			temp.add(list.get(i));
//		}
		Collections.sort(temp, new ArtistAscending().reversed());
		return temp;
	}

}
