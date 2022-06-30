package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.business.dto.ProductDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
@Log4j2
public class ProductController {

    //http://localhost:8080/product
    @GetMapping("product")
    public String getProduct(Model model) {
        model.addAttribute("product_key", new ProductDto());
        return "product";
    }


    //http://localhost:8080/product
    @PostMapping("product")
    public String postProduct(@Valid @ModelAttribute("product_key") ProductDto productDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.error("Hata meydana geldi");
        }
        //database kayıt olacak
        log.info(productDto);
        return "product";
    }
}
