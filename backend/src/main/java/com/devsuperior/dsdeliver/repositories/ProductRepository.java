package com.devsuperior.dsdeliver.repositories;

import com.devsuperior.dsdeliver.entities.Product;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

     List<Product> findAllByOrderByNameAsc();

}
