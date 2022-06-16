package com.saraya.phoneApp.controller;

import com.saraya.phoneApp.entity.Phone;
import com.saraya.phoneApp.service.IPhone;
import com.saraya.phoneApp.service.PhoneImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("phones")
@Scope("request")
public class PhoneController {
    @Autowired
    @Qualifier("phoneService")
    //private PhoneImplementation phoneImplementation;
    private IPhone phoneImplementation;

    @GetMapping(value = "/phone", produces = {MediaType.APPLICATION_JSON_VALUE})
    public List<Phone> getAllPhone(){
        return phoneImplementation.getAllPhones();
    }

    @PostMapping(value = "/phone", consumes = {MediaType.APPLICATION_JSON_VALUE},
    produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.CREATED)
    public Phone createPhone(@RequestBody Phone phone){
        return phoneImplementation.addPhone(phone);
    }

    @GetMapping(value = "/phone/{id}", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Phone getById(@PathVariable (value = "id") Long id){
        return phoneImplementation.getPhoneById(id);
    }

    @PutMapping(value = "/phone", consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseStatus(code = HttpStatus.OK)
    public Phone update(@RequestBody Phone phone) {
        /*Phone p = phoneImplementation.getPhoneById(id);
        p.setMark(phone.getMark());
        p.setPrice(phone.getPrice());
        p.setImageUrl(phone.getImageUrl());
       // p.setColor(phone.getColor());

        return phoneImplementation.addPhone(phone);*/
        return phoneImplementation.updatePhone(phone);
    }

    @DeleteMapping("/phone/{id}")
    public ResponseEntity<Phone> delete(@PathVariable (value = "id") Long id){
        Phone phones = phoneImplementation.getPhoneById(id);
        phoneImplementation.deletePhoneById(id);
        return ResponseEntity.ok().build();
    }


}
