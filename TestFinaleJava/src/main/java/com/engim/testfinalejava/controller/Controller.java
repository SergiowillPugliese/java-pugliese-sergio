package com.engim.testfinalejava.controller;

import com.engim.testfinalejava.model.Admin;
import com.engim.testfinalejava.model.repository.AdminRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staff")
public class Controller {
   @GetMapping()
    public List<Admin> staff(){
       return AdminRepository.getStaff();
   }

   @PostMapping()
    public Admin inserisciStaff(@RequestBody Admin staff){
       return AdminRepository.insertStaff(staff);
   }
}
