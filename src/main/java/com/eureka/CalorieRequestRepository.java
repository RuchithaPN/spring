package com.eureka;




import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

public class CalorieRequestRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(CalorieRequest calorieRequest) {
        entityManager.persist(calorieRequest);
    }

    public CalorieRequest findByAge(int age) {
        return entityManager.find(CalorieRequest.class, age);
    }

    @Transactional
    public void deleteByAge(int age) {
        CalorieRequest calorieRequest = findByAge(age);
        if (calorieRequest != null) {
            entityManager.remove(calorieRequest);
        }
    }
}
