package com.example.springsocial.repository;

import com.example.springsocial.model.Prodotto;
import com.example.springsocial.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProdottoRepository extends JpaRepository<Prodotto, Long> {

    Optional<Prodotto> findByNome(String nome);

    Boolean existsByNome(String nome);


}
