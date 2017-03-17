package cloud.codeworks.esales.business.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cloud.codeworks.esales.business.model.ProductType;
import cloud.codeworks.esales.persistence.repository.ProductTypeRepository;

@Service
public class ProductTypeService {
	
	@Autowired
	private ProductTypeRepository productTypeRepository;
	
	public List<ProductType> findAll() {
		return this.productTypeRepository.findAll();
	}
}
