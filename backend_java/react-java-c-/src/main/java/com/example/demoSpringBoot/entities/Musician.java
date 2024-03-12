package com.example.demoSpringBoot.entities;

public class Musician extends Person{
    private int numOfSongs;
    private String awarded;
	public int getNumOfSongs() {
		return numOfSongs;
	}
	public void setNumOfSongs(int numOfSongs) {
		this.numOfSongs = numOfSongs;
	}
	public String getAwarded() {
		return awarded;
	}
	public void setAwarded(String awarded) {
		this.awarded = awarded;
	}
	@Override
	public String toString() {
		return super.toString()+";"+numOfSongs+";"+awarded;
	}
    
}
