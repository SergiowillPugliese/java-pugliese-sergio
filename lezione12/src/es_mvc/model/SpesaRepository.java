package com.engim.lezione12.es_mvc.model;

import java.util.List;

public interface SpesaRepository {

    List<String> getListe();
    List<String> findListaByNome(String nome);
    boolean removeListaByNome(String nome);
    boolean addLista(String nome);
    boolean addElemToLista(String lista, String elem);
    boolean removeElemToLista(String lista, String elem);
}
