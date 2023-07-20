package com.mj.minhasfinancas.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mj.minhasfinancas.model.entity.Lancamento;

public interface LancamentoRepository extends JpaRepository<Lancamento, Long>{

}
