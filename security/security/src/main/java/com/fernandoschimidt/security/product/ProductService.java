package com.fernandoschimidt.security.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    List<Product> listAll();

    Product create(Product product);

    Product update(Product product);

    void delete(Long id);
}
