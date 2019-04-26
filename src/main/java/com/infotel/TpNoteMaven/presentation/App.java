package com.infotel.TpNoteMaven.presentation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.infotel.TpNoteMaven.service.Iservice;
import com.infotel.TpNoteMaven.service.ServiceImpl;
import com.infotel.TpNoteMaven.metier.Dev;
import com.infotel.TpNoteMaven.metier.Etudiant;
import com.infotel.TpNoteMaven.metier.Formation;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	Dev d = context.getBean("dev", Dev.class);
    	
    	System.out.println(d + " " + d.getDevLogiciel());
    	
	
	Etudiant e = context.getBean("etudiant", Etudiant.class);
	e.setIdetudiant(1);
    e.setNom("Tom");
    e.setPrenom("Jerry");
    e.setFormation("Inti");
    
    System.out.println(e);
    
    Formation f = context.getBean("formation", Formation.class);
    f.setIdformation(1);
    f.setNomFormation("Inti");
    
    System.out.println(f);
    
    Iservice service = context.getBean("service", ServiceImpl.class);
    
    service.ajouterDev(d);
    service.ajouterEtudiant(e);
	
	context.close();
	
	
    }
}
