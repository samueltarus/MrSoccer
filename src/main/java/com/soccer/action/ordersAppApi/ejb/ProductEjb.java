package com.soccer.action.ordersAppApi.ejb;

import com.soccer.action.ordersAppApi.model.Product;
import com.soccer.action.ordersAppApi.dao.ProductDaoI;

import javax.inject.Inject;
import javax.transaction.*;
import java.util.List;
import java.util.Optional;

public class ProductEjb implements ProductEjbI {

    @Inject
    private ProductDaoI productDao;

    @Override
    public Product save(Product product) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException {
        return productDao.save(product);
    }

    @Override
    public Product update(Product product) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException {
        return productDao.update(product);
    }

    @Override
    public void deleteById(Long id) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException {
        productDao.deleteById(id);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productDao.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }
}
