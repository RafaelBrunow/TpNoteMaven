package com.infotel.TpNoteMaven.service;

import com.infotel.TpNoteMaven.metier.Dev;
import com.infotel.TpNoteMaven.metier.Etudiant;

public interface Iservice {
	
	public int ajouterDev(Dev d);
	
	public int ajouterEtudiant(Etudiant e);

}
