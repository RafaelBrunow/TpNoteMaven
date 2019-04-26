package com.infotel.TpNoteMaven.dao;

import com.infotel.TpNoteMaven.metier.Dev;
import com.infotel.TpNoteMaven.metier.Etudiant;

public interface Idao {
	
	public int ajouterDev(Dev d);
	
	public int ajouterEtudiant(Etudiant e);

}
