package com.saraya.phoneApp.service;

import com.saraya.phoneApp.entity.Phone;
import com.saraya.phoneApp.repository.PhoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "phoneService")
@Scope(value = "singleton")
public class PhoneImplementation implements IPhone {
     @Autowired
     @Qualifier("phoneRepository")
     private PhoneRepository phoneRepository;


    @Override
    public Phone addPhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public Phone updatePhone(Phone phone) {
        return phoneRepository.save(phone);
    }

    @Override
    public void deletePhoneById(Long id) {
        phoneRepository.deleteById(id);
    }

    @Override
    public Phone getPhoneById(Long id) {
        return phoneRepository.findById(id).get();
    }

    @Override
    public List<Phone> getAllPhones() {
        return phoneRepository.findAll();
    }
}
