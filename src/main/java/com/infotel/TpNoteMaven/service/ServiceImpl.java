package com.infotel.TpNoteMaven.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.TpNoteMaven.dao.Idao;
import com.infotel.TpNoteMaven.metier.Dev;
import com.infotel.TpNoteMaven.metier.Etudiant;

@Service ("service")
public class ServiceImpl implements Iservice {
	
	@Autowired
	private Idao dao;

	@Override
	public int ajouterDev(Dev d) {
		// TODO Auto-generated method stub
		return dao.ajouterDev(d);
	}

	@Override
	public int ajouterEtudiant(Etudiant e) {
		// TODO Auto-generated method stub
		return dao.ajouterEtudiant(e);
	}
	


}
