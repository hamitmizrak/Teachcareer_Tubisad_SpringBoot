package com.hamitmizrak.ui.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
@Log4j2
public class BookRestController {

    //@Controller gelen Header verisi almak
    //http://localhost:8080/book/restcontroller
    @GetMapping("restcontroller")
    public ResponseEntity<?>  headerBook(@RequestHeader(value = "key_header",defaultValue = "yedek data") String data){
        String headerData="@RestController: "+data;
        log.info(headerData);
        return ResponseEntity.ok(headerData);
    }
}
