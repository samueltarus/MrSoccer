package com.soccer.action.ordersAppApi.dao;

import com.soccer.action.ordersAppApi.model.Product;

import javax.annotation.Resource;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.*;
import java.util.List;
import java.util.Optional;

public class ProductDao implements ProductDaoI {

    @PersistenceContext
    private EntityManager em;

    @Resource
    private UserTransaction transaction;

    @Transactional(Transactional.TxType.REQUIRED)

    public Product save(Product product) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException {
        transaction.begin();
        em.merge(product);
        transaction.commit();
        return product;
    }

    public Optional<Product> findById(Long id) {
        Product product = em.find(Product.class, id);
        return product != null ? Optional.of(product) : Optional.empty();
    }

    public List<Product> findAll() {
        String sqlQuery = "SELECT p FROM Product p WHERE p.id is not null";
        return em.createQuery(sqlQuery).getResultList();
    }

    public Product update(Product product) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException {
        transaction.begin();
        product = em.merge(product);
        transaction.commit();
        return product;
    }

    public void deleteById(Long id) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException {
        transaction.begin();
        em.remove(em.find(Product.class, id));
        transaction.commit();
    }

}
