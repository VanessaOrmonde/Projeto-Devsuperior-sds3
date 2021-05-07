package com.devsuperior.dev.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dev.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
