package com.saraya.phoneApp.repository;

import com.saraya.phoneApp.entity.Phone;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository(value = "phoneRepository")
@Scope(value = "singleton")
public interface PhoneRepository extends JpaRepository<Phone, Long> {
}
