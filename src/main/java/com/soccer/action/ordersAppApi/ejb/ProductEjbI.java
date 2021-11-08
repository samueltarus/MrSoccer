package com.soccer.action.ordersAppApi.ejb;

import com.soccer.action.ordersAppApi.model.Product;

import javax.transaction.*;
import java.util.List;
import java.util.Optional;

public interface ProductEjbI {
    Product save(Product product) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException;

    Product update(Product product) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException;

    void deleteById(Long id) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException;

    Optional<Product> findById(Long id);

    List<Product> findAll();
}
