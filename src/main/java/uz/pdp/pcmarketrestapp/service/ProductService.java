package uz.pdp.pcmarketrestapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import uz.pdp.pcmarketrestapp.entity.Category;
import uz.pdp.pcmarketrestapp.entity.Product;
import uz.pdp.pcmarketrestapp.payload.ProductDto;
import uz.pdp.pcmarketrestapp.repository.CategoryRepository;
import uz.pdp.pcmarketrestapp.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;

    public String getOne(Integer id) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (!optionalProduct.isPresent()) {
            return "not found";
        }
        Product product = optionalProduct.get();
        String describedProduct = product.describeThisProduct();
        return describedProduct;
    }

    public List<String> getByCategory(Integer categoryId) {
        List<Product> allProductByCategoryId = productRepository.findAllByCategoryId(categoryId);
        List<String> productDescribes = null;
        for (Product product : allProductByCategoryId) {
            String s = product.describeThisProduct();
            productDescribes.add(s);
        }
        return productDescribes;

    }

    public String delete(Integer id) {
        productRepository.deleteById(id);
        return "deleted eee";
    }

    public String edit(Integer id, ProductDto productDto) {
        Optional<Product> optionalProduct = productRepository.findById(id);
        if (!optionalProduct.isPresent()) {
            return "not found such product";
        }
        Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return "category not found";
        }
        Product product = optionalProduct.get();
        product.setBrand(productDto.getBrand());
        product.setActive(productDto.isActive());
        product.setColor(productDto.getColor());
        product.setCurved(productDto.isCurved());

        product.setDisplayInch(productDto.getDisplayInch());
        product.setCategory(optionalCategory.get());
        product.setFunctions(productDto.getFunctions());
        product.setDisplayRefreshHz(productDto.getDisplayRefreshHz());
        product.setDoubleSidedPrinting(productDto.isDoubleSidedPrinting());
        product.setLiftingCapacity(productDto.getLiftingCapacity());
        product.setGaming(productDto.isGaming());
        product.setHdd(productDto.getHdd());
        product.setRam(productDto.getRam());
        product.setResponseTime(productDto.getResponseTime());
        product.setColorFull(productDto.isColorFull());
        product.setVideoConnectorType(productDto.getVideoConnectorType());
        product.setProcessor(productDto.getProcessor());
        product.setPrice(productDto.getPrice());
        product.setGraphicProcessor(productDto.getGraphicProcessor());
        product.setHeadrest(productDto.isHeadrest());
        product.setMotherBoard(productDto.getMotherBoard());
        product.setName(productDto.getName());
        product.setWireless(productDto.isWireless());
        product.setOtherFields(productDto.getOtherFields());
        product.setSilentButtons(productDto.isSilentButtons());
        product.setSsd(productDto.getSsd());
        productRepository.save(product);
        return "product edited";

    }

    public Product add(ProductDto productDto) {
        Optional<Category> optionalCategory = categoryRepository.findById(productDto.getCategoryId());
        if (!optionalCategory.isPresent()) {
            return null;
        }
        Product product = new Product();
        product.setBrand(productDto.getBrand());
        product.setActive(productDto.isActive());
        product.setColor(productDto.getColor());
        product.setCurved(productDto.isCurved());

        product.setDisplayInch(productDto.getDisplayInch());
        product.setCategory(optionalCategory.get());
        product.setFunctions(productDto.getFunctions());
        product.setDisplayRefreshHz(productDto.getDisplayRefreshHz());
        product.setDoubleSidedPrinting(productDto.isDoubleSidedPrinting());
        product.setLiftingCapacity(productDto.getLiftingCapacity());
        product.setGaming(productDto.isGaming());
        product.setHdd(productDto.getHdd());
        product.setRam(productDto.getRam());
        product.setResponseTime(productDto.getResponseTime());
        product.setColorFull(productDto.isColorFull());
        product.setVideoConnectorType(productDto.getVideoConnectorType());
        product.setProcessor(productDto.getProcessor());
        product.setPrice(productDto.getPrice());
        product.setGraphicProcessor(productDto.getGraphicProcessor());
        product.setHeadrest(productDto.isHeadrest());
        product.setMotherBoard(productDto.getMotherBoard());
        product.setName(productDto.getName());
        product.setWireless(productDto.isWireless());
        product.setOtherFields(productDto.getOtherFields());
        product.setSilentButtons(productDto.isSilentButtons());
        product.setSsd(productDto.getSsd());
        Product save = productRepository.save(product);
        return save;


    }
}
