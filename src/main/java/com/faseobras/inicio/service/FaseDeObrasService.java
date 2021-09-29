package com.faseobras.inicio.service;

import java.util.Optional;

import com.faseobras.inicio.model.FaseDeObras;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.FaseDeObrasRepository;

@Service
public class FaseDeObrasService {

    @Autowired
    private FaseDeObrasRepository repo;

    public FaseDeObras fases(Integer id) {

        Optional<FaseDeObras> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado!! ID: " + id + ", Tipo:" + FaseDeObras.class.getName()));

    }

}