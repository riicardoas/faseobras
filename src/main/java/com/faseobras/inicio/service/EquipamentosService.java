package com.faseobras.inicio.service;

import java.util.Optional;
import com.faseobras.inicio.model.Equipamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repositories.EquipamentosRepository;

@Service
public class EquipamentosService {

    @Autowired
    private EquipamentosRepository repo;

    public Equipamentos equiptos(Integer id) {

        Optional<Equipamentos> obj = repo.findById(id);

        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Objeto não encontrado!! ID: " + id + ", Tipo:" + Equipamentos.class.getName()));

    }

}