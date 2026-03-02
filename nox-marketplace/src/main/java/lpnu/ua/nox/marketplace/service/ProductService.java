package lpnu.ua.nox.marketplace.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import lpnu.ua.nox.marketplace.dto.ProductDTO;
import lpnu.ua.nox.marketplace.model.Product;
import lpnu.ua.nox.marketplace.repository.ProductRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    public List<ProductDTO> getAllProducts() {
        return productRepository.findAll().stream()
                .map(this::mapToDTO)
                .collect(Collectors.toList());
    }

    public ProductDTO getProductById(Long id) {
        return productRepository.findById(id)
                .map(this::mapToDTO)
                .orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
    }

    public ProductDTO createProduct(ProductDTO dto) {
        Product product = new Product();
        product.setName(dto.getName());
        product.setDescription(dto.getDescription());
        product.setPrice(dto.getPrice());
        product.setSellerId(dto.getSellerId());
        product.setStockQuantity(0);

        Product savedProduct = productRepository.save(product);
        return mapToDTO(savedProduct);
    }

    private ProductDTO mapToDTO(Product product) {
        ProductDTO dto = new ProductDTO();
        dto.setId(product.getId());
        dto.setName(product.getName());
        dto.setDescription(product.getDescription());
        dto.setPrice(product.getPrice());
        dto.setSellerId(product.getSellerId());
        return dto;
    }
}