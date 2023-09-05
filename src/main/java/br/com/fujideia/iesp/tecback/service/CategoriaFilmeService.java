package br.com.fujideia.iesp.tecback.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fujideia.iesp.tecback.repository.*;
import br.com.fujideia.iesp.tecback.model.*;

import java.util.List;

@Slf4j
@Service
public class CategoriaFilmeService {
    @Autowired
    private CategoriaFilmeRepository repository;


    public CategoriaFilme salvar(CategoriaFilme categoriaFilme){
        return repository.save(categoriaFilme);
    }

    public List<CategoriaFilme> listar(){
        return  repository.findAll();
    }

}
