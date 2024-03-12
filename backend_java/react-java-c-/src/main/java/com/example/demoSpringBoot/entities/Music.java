package com.example.demoSpringBoot.entities;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Music {
	private int id;
    private String name;
    private String createdDate;
    private int typeId;
    private String lyric;
    private String urlMV;
    private String urlAudio;
    private int view;
    private int duration;
    private int musicianId;
    private Musician musician;
    private List<Singer> singers;
    private int[] singerIds;
    
	public Music(int id, String name, String createdDate, int typeId, String lyric, String urlMV, String urlAudio,
			int view, int duration, int musicianId, Musician musician, List<Singer> singers, int[] singerIds) {
		this.id = id;
		this.name = name!=null ? name:"";
		this.createdDate = createdDate!=null ? createdDate:"";
		this.typeId = typeId;
		this.lyric = lyric!=null ? lyric:"";
		this.urlMV = urlMV!=null ? urlMV:"";
		this.urlAudio = urlAudio!=null ? urlAudio:"";
		this.view = view;
		this.duration = duration;
		this.musicianId = musicianId;
		this.musician = musician;
		this.singers = singers;
		this.singerIds = singerIds;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int type) {
		this.typeId = type;
	}
	public String getLyric() {
		return lyric;
	}
	public void setLyric(String lyric) {
		this.lyric = lyric;
	}
	public String getUrlMV() {
		return urlMV;
	}
	public void setUrlMV(String urlMV) {
		this.urlMV = urlMV;
	}
	public String getUrlAudio() {
		return urlAudio;
	}
	public void setUrlAudio(String urlAudio) {
		this.urlAudio = urlAudio;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public int getMusicianId() {
		return musicianId;
	}
	public void setMusicianId(int musicianId) {
		this.musicianId = musicianId;
	}
	public Musician getMusician() {
		return musician;
	}
	public void setMusician(Musician musician) {
		this.musician = musician;
	}
	public List<Singer> getSingers() {
		return singers;
	}
	public void setSingers(List<Singer> singers) {
		this.singers = singers;
	}
	public int[] getSingerIds() {
		return singerIds;
	}
	public void setSingerIds(int[] singerIds) {
		this.singerIds = singerIds;
	}
	@Override
	public String toString() {
		return  id +";"+ name +";" + createdDate +";" + typeId +";"+ lyric +";"+ urlMV + ";" + urlAudio +";" + view +";"+ duration
				+ ";" + musicianId 	+ ";"+ (singerIds!=null ? Arrays.stream(singerIds).mapToObj(String::valueOf).collect(Collectors.joining(" ")):"");
	}
    
}
