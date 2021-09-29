package com.faseobras.inicio.controller;

import com.faseobras.inicio.model.FaseDeObras;
import com.faseobras.inicio.service.FaseDeObrasService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class FaseDeObrasController {

    @Autowired
    private FaseDeObrasService service;

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> find(@PathVariable Integer id) {

        FaseDeObras obj = service.fases(id);
        return ResponseEntity.ok().body(obj);

    }
}