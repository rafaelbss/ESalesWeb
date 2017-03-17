package cloud.codeworks.esales.persistence.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cloud.codeworks.esales.business.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> { 
	
	public Optional<Product> findBySku(String sku);
}
