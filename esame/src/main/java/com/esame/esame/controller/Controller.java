package com.esame.esame.controller;

import com.esame.esame.model.Fermate;
import com.esame.esame.model.Linee;
import com.esame.esame.model.Preventivo;
import com.esame.esame.model.repository.FermateRepository;
import com.esame.esame.model.repository.LineeRepository;
import com.esame.esame.model.repository.Preventivorepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/fermate")
@CrossOrigin("*")
public class Controller {
    //restituisce la lista delle fermate
    @GetMapping("/fermate")
    public List<Fermate> fermate(){
        return FermateRepository.getFermate();
    }


    //restituisce la lista delle linee
    @GetMapping("/linee")
    public List<Linee> linee(){
        return LineeRepository.getLinee();
    }

    //restituisce la lista dei preventivi
    @GetMapping("preventivi")
    public List<Preventivo> preventivo(){
        return Preventivorepository.getPreventivi();
    }
}
