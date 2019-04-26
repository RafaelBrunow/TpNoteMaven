package com.infotel.TpNoteMaven.dao;

import org.springframework.stereotype.Repository;

import com.infotel.TpNoteMaven.metier.Dev;
import com.infotel.TpNoteMaven.metier.Etudiant;

@Repository ("dao")
public class DaoImpl implements Idao {

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		System.out.println("Ca marche dev");
		return 0;
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		System.out.println("Ca marche Etudiant");
		return 0;
	}
	
	

}
