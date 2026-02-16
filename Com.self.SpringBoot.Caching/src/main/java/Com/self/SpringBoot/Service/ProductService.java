package Com.self.SpringBoot.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import Com.self.SpringBoot.Entity.ProductEntity;
import Com.self.SpringBoot.Repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public ProductEntity addProduct(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}

	@Cacheable(value="products",key="#id")
	public ProductEntity getProductById(Long id) {
		System.out.println("Fetching from Database..");
		return productRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Product not Found"));
	}

	@CachePut(value = "products",key = "#result.id")
	public ProductEntity updateProduct(ProductEntity productEntity) {
		
		return productRepository.save(productEntity);
	}

	@CacheEvict(value = "products", key = "#id")
	public void deleteProduct(Long id) {
		productRepository.deleteById(id);
		
	}
}
