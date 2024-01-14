package co.edu.practice.serviceproduct.repository;

import co.edu.practice.serviceproduct.entity.Category;
import co.edu.practice.serviceproduct.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findByCategory(Category category);
}
