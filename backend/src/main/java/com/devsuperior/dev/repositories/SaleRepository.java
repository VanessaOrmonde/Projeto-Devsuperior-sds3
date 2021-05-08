package com.devsuperior.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dev.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
