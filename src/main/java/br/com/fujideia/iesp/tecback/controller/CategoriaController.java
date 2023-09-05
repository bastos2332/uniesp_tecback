package br.com.fujideia.iesp.tecback.controller;

import br.com.fujideia.iesp.tecback.model.CategoriaFilme;
import br.com.fujideia.iesp.tecback.model.Filme;
import br.com.fujideia.iesp.tecback.service.CategoriaFilmeService;
import br.com.fujideia.iesp.tecback.service.FilmeService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/categoria")
public class CategoriaController {
    @Autowired
    private CategoriaFilmeService service;




    @GetMapping
    public ResponseEntity<List<CategoriaFilme>> listar(){
        return ResponseEntity.ok(service.listar());
    }


}
