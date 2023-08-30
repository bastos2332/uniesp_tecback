package br.com.fujideia.iesp.tecback.repository;

import br.com.fujideia.iesp.tecback.model.CategoriaFilme;
import br.com.fujideia.iesp.tecback.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaFilmeRepository  extends JpaRepository<CategoriaFilme,Integer> {




}
