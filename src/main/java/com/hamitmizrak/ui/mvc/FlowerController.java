package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.data.entity.FlowerEntity;
import com.hamitmizrak.data.repository.IFlowerRepository;
import com.hamitmizrak.business.dto.FlowerDto;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
@Log4j2
public class FlowerController {

    @Autowired
    IFlowerRepository repository;

    //Fake Save
    // http://localhost:8080/flower/save
    @GetMapping("flower/save")
    @ResponseBody
    public String saveFlowerList() {
        int i=0;
        for ( i = 0; i <10 ; i++) {
            repository.save(FlowerEntity.builder().flowerName("çiçek adı "+i).flowerPrice("fiyat"+i).flowerType("çiçek türü "+i).build());
        }
      return i+" adet Flower kaydedildi";
    }

    //Listeleme
    // http://localhost:8080/flower/list
    @GetMapping("flower/list")
    public String getFlowerList(Model model) {
        List<FlowerEntity> list = repository.findAll();
        model.addAttribute("flower_key", list);
        return "flower_list";
    }

    //find
    //http://localhost:8080/find/flower/1
    @GetMapping("find/flower/{id}")
    public String findFlowerById(@PathVariable(name="id") Long id,Model model){
        Optional<FlowerEntity> entity=   repository.findById(id);
        if(entity.isPresent()){
            model.addAttribute("flower_details",entity.get());
        }else{
            model.addAttribute("flower_details","failed");
        }
        return "flower_detail_pages";
    }

    //Form GetMapping
    //Save
    //http://localhost:8080/flower/form
    @GetMapping("flower/form")
    public String getForm(Model model){
        model.addAttribute("flower_save",new FlowerDto());
        return "flower_save";
    }

    //Form PostMapping
    //Save
    //http://localhost:8080/flower/form
    @PostMapping("flower/form")
    public String postForm(@Valid @ModelAttribute("flower_save") FlowerDto flowerDto, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            log.error("Hata oluştu.");
            return "flower_save";
        }
        FlowerEntity flowerEntity=new FlowerEntity();
        flowerEntity.setFlowerName(flowerDto.getFlowerName());
        flowerEntity.setFlowerType((flowerDto.getFlowerType()));
        flowerEntity.setFlowerPrice((flowerDto.getFlowerPrice()));
        repository.save(flowerEntity);
        return "redirect:/flower/list";
    }

    //delete
    //http://localhost:8080/delete/flower/1
    @GetMapping("delete/flower/{id}")
    public String deleteFlowerById(@PathVariable(name="id") Long id, Model model){
        Optional<FlowerEntity> optionalEntity=  repository.findById(id);
        if(optionalEntity.isPresent()){
            model.addAttribute("computer_delete_success",optionalEntity.get());
            repository.deleteById(id);
        }else{
            model.addAttribute("failed","Silinmedi");
        }
        return "redirect:/flower/list";
    }

    //update
    //http://localhost:8080/update/flower/2
    @GetMapping("update/flower/{id}")
    public String updateFlowerById(@PathVariable(name="id") Long id,FlowerDto flowerDto){
        Optional<FlowerEntity>  optionalEntity=  repository.findById(id);
        if(optionalEntity.isPresent()){
            FlowerEntity entity=optionalEntity.get();
            entity.setFlowerName(flowerDto.getFlowerName());
            entity.setFlowerType(flowerDto.getFlowerType());
            entity.setFlowerPrice(flowerDto.getFlowerPrice());
            repository.save(entity);
            log.info("bulundu ve güncellendi:  "+entity);
        }
        return "flower_update";
    }


    @GetMapping("/somePostAction")
    public String somePostAction(Model model, RedirectAttributes redirAttrs) {
        if (true) {
            redirAttrs.addFlashAttribute("error", "The error XYZ occurred.");
            return "redirect:/flower/list";
        }
        redirAttrs.addFlashAttribute("success", "Everything went just fine.");
        return "redirect:/flower/list";
    }

}
