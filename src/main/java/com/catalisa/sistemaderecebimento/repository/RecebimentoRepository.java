package com.catalisa.sistemaderecebimento.repository;

import com.catalisa.sistemaderecebimento.model.RecebimentoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecebimentoRepository extends JpaRepository<RecebimentoModel, Long> {
}
