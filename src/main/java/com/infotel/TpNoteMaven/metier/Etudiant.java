package com.infotel.TpNoteMaven.metier;

import org.springframework.stereotype.Component;

@Component ("etudiant")
public class Etudiant {
	
	private int idetudiant;
	private String nom;
	private String prenom;
	private String formation;
	
	public int getIdetudiant() {
		return idetudiant;
	}
	public void setIdetudiant(int idetudiant) {
		this.idetudiant = idetudiant;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getFormation() {
		return formation;
	}
	public void setFormation(String formation) {
		this.formation = formation;
	}
	
	@Override
	public String toString() {
		return "Etudiant [idetudiant=" + idetudiant + ", nom=" + nom + ", prenom=" + prenom + ", formation=" + formation
				+ "]";
	}
	
}
