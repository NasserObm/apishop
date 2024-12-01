package shop.com.shop.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.com.shop.entity.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Long> {
}
