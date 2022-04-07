package com.engim.testfinalejava.controller;

import com.engim.testfinalejava.model.Staff;
import com.engim.testfinalejava.model.repository.StaffRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {
   @GetMapping("/staff")
    public List<Staff> staff(){
       return StaffRepository.getStaff();
   }
}
