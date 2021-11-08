package com.soccer.action.ordersAppApi.dao;

import com.soccer.action.ordersAppApi.model.Product;

import javax.transaction.*;
import java.util.List;
import java.util.Optional;

public interface ProductDaoI {
    Product save(Product product) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException;

    Product update(Product product) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException;

    void deleteById(Long id) throws SystemException, NotSupportedException, HeuristicRollbackException, HeuristicMixedException, RollbackException;

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
