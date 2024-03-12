package com.example.demoSpringBoot.entities;

public class Singer extends Person{
    protected String ranking;
    protected String nationality;
	public String getRanking() {
		return ranking;
	}
	public void setRanking(String ranking) {
		this.ranking = ranking;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	@Override
	public String toString() {
		return  super.toString() + ";"+ranking+";"+nationality;
	}
    
    
}
