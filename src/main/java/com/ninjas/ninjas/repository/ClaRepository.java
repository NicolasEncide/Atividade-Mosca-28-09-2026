package com.ninjas.ninjas.repository;

import com.ninjas.ninjas.model.Cla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ClaRepository extends JpaRepository<Cla, Long> {

    List<Cla> findByNomeContainingIgnoreCase (String nome);
    List<Cla> findByDescricaoContainingIgnoreCase (String descricao);

}
