package cloud.codeworks.esales.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cloud.codeworks.esales.business.model.Product;
import cloud.codeworks.esales.persistence.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Transactional
	public void save(Product product) {
		this.productRepository.save(product);
	}

}
