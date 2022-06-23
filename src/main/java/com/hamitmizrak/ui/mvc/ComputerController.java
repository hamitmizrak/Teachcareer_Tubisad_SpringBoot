package com.hamitmizrak.ui.mvc;

import com.hamitmizrak.data.entity.ComputerEntity;
import com.hamitmizrak.data.repository.IComputerRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
@Log4j2
public class ComputerController {

    @Autowired
    IComputerRepository repository;

    //save
    //http://localhost:8080/save/computer
    @GetMapping("save/computer")
    @ResponseBody
    public String saveComputer(){
        ComputerEntity entity=ComputerEntity.builder().computerName("Bilgisayar adı").computerPrice(15).build();
        repository.save(entity);
        log.info("Computer saved "+entity);
        return "computer saved";
    }

    //save: @RequestParam
    //http://localhost:8080/save/computer2?name=msi
    @GetMapping("save/computer2")
    @ResponseBody
    public String saveComputer2( @RequestParam(name = "name") String computerName ){
        ComputerEntity entity=ComputerEntity.builder().computerName(computerName).computerPrice(15).build();
        repository.save(entity);
        log.info("Computer saved "+entity);
        return "computer saved";
    }

    //find
    //http://localhost:8080/find/computer/1
    @GetMapping("find/computer/{id}")
    @ResponseBody
    public String findComputerById(@PathVariable(name="id") Long id){
       Optional<ComputerEntity>  entity=   repository.findById(id);
       if(entity.isPresent()){
           return "bulundu:  "+entity.get();
       }
        return id+ " id bulunmadı";
    }

    //delete
    //http://localhost:8080/delete/computer/1
    @GetMapping("delete/computer/{id}")
    @ResponseBody
    public String deleteComputerById(@PathVariable(name="id") Long id){
        Optional<ComputerEntity>  optionalEntity=  repository.findById(id);
        if(optionalEntity.isPresent()){
            repository.deleteById(id);
            return "bulundu ve silindi:  "+optionalEntity.get();
        }
        return id+ " id bulunmadı";
    }

    //update
    //http://localhost:8080/update/computer/2
    @GetMapping("update/computer/{id}")
    @ResponseBody
    public String updateComputerById(@PathVariable(name="id") Long id){
        Optional<ComputerEntity>  optionalEntity=  repository.findById(id);
        if(optionalEntity.isPresent()){
            ComputerEntity entity=optionalEntity.get();
            entity.setComputerName("bilgisayar adı44");
            entity.setComputerPrice(44);
            repository.save(entity);
            return "bulundu ve güncellendi:  "+entity;
        }
        return id+ " id bulunmadı";
    }

}
