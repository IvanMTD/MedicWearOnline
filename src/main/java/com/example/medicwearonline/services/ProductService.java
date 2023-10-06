package com.example.medicwearonline.services;

import com.example.medicwearonline.models.Product;
import com.example.medicwearonline.util.ImageUtil;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private final List<Product> products;

    public ProductService(){
        String image = ImageUtil.loadImage("./src/main/resources/static/image/logo.png");
        if(image == null){
            image = "";
        }
        products = new ArrayList<>();
        for(int i=0; i<100; i++) {
            products.add(new Product("Test", "Test", "Test", new BigDecimal(10), image));
        }
    }

    public List<Product> findAll(){
        return products;
    }

    public List<Product> findAllByPageableSort(Pageable pageable) {
        int pn = pageable.getPageNumber();
        int ps = pageable.getPageSize();
        int start = ps * pn;
        int end = start + ps;
        List<Product> sortedProductList = new ArrayList<>();
        for(int i=start; i<end; i++){
            sortedProductList.add(products.get(i));
        }
        return sortedProductList;
    }
}
