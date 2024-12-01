package shop.com.shop.mapper;

import org.springframework.stereotype.Component;
import shop.com.shop.dto.ProductDto;
import shop.com.shop.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductMapper {
    public Product convertFromDto(ProductDto productDto){
        Product product=new Product();
        product.setNom(product.getNom());
        product.setPrix(product.getPrix());
        return product;
    }
    public List<Product> convertFromListDto(List<ProductDto>productDtos ){
        List<Product> products=new ArrayList<>();
        for (ProductDto productDto:productDtos){
            products.add(convertFromDto(productDto));
        }
        return products;
    }
    public ProductDto convertToDto(Product product){
        ProductDto productDto=new ProductDto();
        productDto.setNom(product.getNom());
        productDto.setPrix(product.getPrix());
        return productDto;
    }

    public List<ProductDto>  convertToListDto(List<Product> products){
        List<ProductDto> productDtos=new ArrayList<>();
        for (Product product:products){
            productDtos.add(convertToDto(product));
        }
        return productDtos;
    }
}
