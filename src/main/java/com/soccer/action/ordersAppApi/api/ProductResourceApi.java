package com.soccer.action.ordersAppApi.api;


import com.soccer.action.ordersAppApi.ejb.ProductEjbI;
import com.soccer.action.ordersAppApi.exceptions.ResourceNotFoundException;
import com.soccer.action.ordersAppApi.model.Product;

import javax.inject.Inject;
import javax.transaction.NotSupportedException;
import javax.transaction.*;
import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Root resource (exposed at "products" path)
 */

@Path("products")
public class ProductResourceApi {
    //@GET annotation indicates that the annotated method responds to HTTP GET requests.
    //@POST annotation indicates that the annotated method responds to HTTP POST requests.
    //@PUT annotation indicates that the annotated method responds to HTTP PUT requests.
    //@DELETE annotation indicates that the annotated method responds to HTTP DELETE requests.

    @Inject
    private ProductEjbI productEjb;

    @GET
    @Path("/list-products")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Product> getProductList() {
        return productEjb.findAll();
    }

    @GET
    @Path("{productId}")
    @Produces(MediaType.APPLICATION_JSON)
    public Product getProduct(@PathParam(value = "productId") Long productId) {
        return productEjb.findById(productId).orElseThrow(() -> new ResourceNotFoundException("productId " + productId + " not found"));
    }

    @POST
    @Path("save") //save
    public String createProduct(@Valid Product product) throws HeuristicRollbackException, SystemException, HeuristicMixedException, NotSupportedException, RollbackException {
        productEjb.save(product);
        return "Product added";
    }

    @PUT
    @Path("{productId}")
    public String updateProduct(@PathParam(value = "productId") Long productId, @Valid Product product) {
        return productEjb.findById(productId).map(p -> {
            p.setName(product.getName());
            p.setPrice(product.getPrice());
            try {
                productEjb.update(p);
            } catch (HeuristicRollbackException e) {
                e.printStackTrace();
            } catch (SystemException e) {
                e.printStackTrace();
            } catch (HeuristicMixedException e) {
                e.printStackTrace();
            } catch (NotSupportedException e) {
                e.printStackTrace();
            } catch (RollbackException e) {
                e.printStackTrace();
            }
            return "Product updated";
        }).orElseThrow(() -> new ResourceNotFoundException("productId " + productId + " not found"));
    }

    @DELETE
    @Path("{productId}")
    public String deleteProduct(@PathParam(value = "productId") Long productId) {
        return productEjb.findById(productId).map(p -> {
            try {
                productEjb.deleteById(productId);
            } catch (HeuristicRollbackException e) {
                e.printStackTrace();
            } catch (SystemException e) {
                e.printStackTrace();
            } catch (HeuristicMixedException e) {
                e.printStackTrace();
            } catch (NotSupportedException e) {
                e.printStackTrace();
            } catch (RollbackException e) {
                e.printStackTrace();
            }
            return "Product deleted";
        }).orElseThrow(() -> new ResourceNotFoundException("productId " + productId + " not found"));
    }
}
