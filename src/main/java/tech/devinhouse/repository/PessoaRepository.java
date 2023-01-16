package tech.devinhouse.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import tech.devinhouse.entity.PessoaEntity;

import java.util.List;


@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {


    @Query(value = "select p from pessoas as p")
    List<PessoaEntity> findByNome(String nome);


}
