package cloud.codeworks.esales.controller.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.util.StringUtils;

import cloud.codeworks.esales.business.model.ProductType;

public class ProductTypeConverter implements Converter<String, ProductType> {

	@Override
	public ProductType convert(String code) {
		if (!StringUtils.isEmpty(code)) {
			ProductType productType = new ProductType();
			productType.setCode(Long.valueOf(code));
			
			return productType;
		}
		
		return null;
	}
}
