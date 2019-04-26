package com.infotel.TpNoteMaven.metier;

public class Dev {
	
	private int iddev;
	private String nom;
	private int experience;
	
	private DevLogiciel devLogiciel;
	
	public int getIddev() {
		return iddev;
	}
	public void setIddev(int iddev) {
		this.iddev = iddev;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	@Override
	public String toString() {
		return "Dev [iddev=" + iddev + ", nom=" + nom + ", experience=" + experience + "]";
	}
	public DevLogiciel getDevLogiciel() {
		return devLogiciel;
	}
	public void setDevLogiciel(DevLogiciel devLogiciel) {
		this.devLogiciel = devLogiciel;
	}
	
	
}
