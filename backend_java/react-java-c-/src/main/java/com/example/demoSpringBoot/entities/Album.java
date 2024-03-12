package com.example.demoSpringBoot.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
    private int id;
    private String title;
    private String description;
    private String createdDate;
    private List<Music> musics;
    private int[] musicIds;
    
	public Album(int id, String title, String description, String createdDate, List<Music> musics, int[] musicIds) {
		super();
		this.id = id;
		this.title = title!=null ? title:"";
		this.description = description!=null ? description:"";
		this.createdDate = createdDate!=null ? createdDate:"";
		this.musics = musics;
		this.musicIds = musicIds;
	}
	public int getId() {
		return id;
	}
	public List<Music> getMusics() {
		return musics;
	}
	public void setMusics(List<Music> musics) {
		this.musics = musics;
	}
	public int[] getMusicIds() {
		return musicIds;
	}
	public void setMusicIds(int[] musicIds) {
		this.musicIds = musicIds;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	@Override
	public String toString() {
		return id + ";"+ title + ";"+ description + ";" +createdDate+";"+(musicIds!=null ? Arrays.stream(musicIds).mapToObj(String::valueOf).collect(Collectors.joining(" ")):"");
	}
	
}
