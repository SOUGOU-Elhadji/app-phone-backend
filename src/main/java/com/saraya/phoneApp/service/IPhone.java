package com.saraya.phoneApp.service;

import com.saraya.phoneApp.entity.Phone;

import java.util.List;

public interface IPhone {
    Phone addPhone(Phone phone);
    Phone updatePhone(Phone phone);
    void deletePhoneById(Long id);
    Phone getPhoneById(Long id);
    List<Phone> getAllPhones();
}
