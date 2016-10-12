package com.dao;

import com.models.UserEntity;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAO {
    private EntityManager entityManager = Persistence.createEntityManagerFactory("persistenceUnit").createEntityManager();

    public List<UserEntity> getUserList() {
        return entityManager.createQuery("select u from UserEntity u").getResultList();
    }
}
