package com.example.demo.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.example.demo.model.bean.Veiculo;
import com.example.demo.model.repository.JPAUtil;

public class TesteAtualizaVeiculo {
	public static void main(String[] args) {
		EntityManager manager = JPAUtil.getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		
		Veiculo v = manager.find(Veiculo.class, 1L);
		
		v.setModelo(v.getModelo() + " LS");
		
		transaction.commit();
		
		manager.close();
		JPAUtil.close();
	}

}
