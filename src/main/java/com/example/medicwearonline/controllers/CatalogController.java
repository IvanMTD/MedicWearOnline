package com.example.medicwearonline.controllers;

import com.example.medicwearonline.services.ProductService;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Data
@Controller
@RequestMapping("/catalog")
@RequiredArgsConstructor
public class CatalogController {

    private final ProductService productService;

    private int pageNumber;
    private int pageSize = 3;
    private int pageTotal;

    @GetMapping("/{pageNumber}")
    public String catalogPage(Model model, @PathVariable("pageNumber") int pageNumber){
        setPageNumber(pageNumber);
        pageTotal = productService.findAll().size() / pageSize;
        Pageable pageable = PageRequest.of(pageNumber,pageSize);
        model.addAttribute("products",productService.findAllByPageableSort(pageable));
        model.addAttribute("pageTotal",pageTotal);
        model.addAttribute("pageNumber",pageNumber);
        model.addAttribute("pageSize",pageSize);
        return "catalog/catalog";
    }

    @ModelAttribute(name = "title")
    public String title(){
        return "Catalog Page";
    }
}
