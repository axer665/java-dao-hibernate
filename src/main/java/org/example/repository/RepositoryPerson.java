package org.example.repository;

import jakarta.transaction.Transactional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class RepositoryPerson {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public List getPersonsByCity(String city) {
        List result = entityManager.createQuery(
                        "select c from Person c where c.city = :city order by c.surname")
                .setParameter("city", city).getResultList();
        return result;
    }
}
