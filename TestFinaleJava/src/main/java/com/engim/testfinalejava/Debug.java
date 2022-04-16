package com.engim.testfinalejava;

import com.engim.testfinalejava.model.repository.MenuRepository;
import com.engim.testfinalejava.model.repository.OrdiniRepository;
import com.engim.testfinalejava.model.repository.RigheOrdiniRepository;
import com.engim.testfinalejava.model.repository.AdminRepository;

public class Debug {
    public static void main(String[] args) {
        System.out.println(AdminRepository.getStaff());
        System.out.println(MenuRepository.getMenu());
        System.out.println(OrdiniRepository.getOrdini());
        System.out.println(RigheOrdiniRepository.getRigheOrdini());
    }

}
