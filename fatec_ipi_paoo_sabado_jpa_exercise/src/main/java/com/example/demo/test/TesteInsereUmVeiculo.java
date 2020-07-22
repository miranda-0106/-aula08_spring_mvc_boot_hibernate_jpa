package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAUtil;

public class TesteInsereUmVeiculo {
	
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Veiculo v = new Veiculo ();
		v.setModelo("Onix");
		v.setMarca("Chevrolet");
		v.setAnoFabricacao("2020");
		v.setCor("Bordô");
		
		manager.persist(v);
		
		transaction.commit();
		manager.close();
		JPAUtil.close();
	}

}
