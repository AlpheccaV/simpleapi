package ru.mtuci.simpleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.mtuci.simpleapi.dao.ProductRepository;
import ru.mtuci.simpleapi.model.Product;

import java.util.List;

@Service
public class ProductServiceImplement implements ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductServiceImplement(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product get(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    @Override
    public List<Product> getAll() {
        return productRepository.findAll();
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void delete(Long id) {
        productRepository.delete(id);
    }

    @Override
    public Product update(Product product, Product updatedProduct) {
        product.setName(updatedProduct.getName());
        product.setBrand(updatedProduct.getBrand());
        product.setType(updatedProduct.getType());
        product.setPrice(updatedProduct.getPrice());
        return productRepository.save(product);
    }
}
