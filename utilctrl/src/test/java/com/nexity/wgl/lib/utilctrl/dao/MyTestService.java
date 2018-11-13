package com.nexity.wgl.lib.utilctrl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.nexity.wgl.lib.utilctrl.model.CompteurPOJO;

@Component
public class MyTestService {

	@PersistenceContext
	private EntityManager em;

	@Transactional
	public String test() {
		final Object o = em.createNativeQuery("select c.NUMERO from Client C").getSingleResult();
		return (String) o;
	}

	public CompteurPOJO testMapping() {
		final List<CompteurPOJO> result = em
				.createNativeQuery("select c.ANNEE as anneeTable, c.VALEUR as valeurTable from Compteur C",
						"compteurMappingXml")
				.getResultList();
		return result.get(0);
	}
}
