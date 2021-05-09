package com.devsuperior.dev.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dev.dto.SaleSuccessDTO;
import com.devsuperior.dev.dto.SaleSumDTO;
import com.devsuperior.dev.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {
	
	@Query("SELECT new com.devsuperior.dev.dto.SaleSumDTO(obj.seller, SUM(obj.amount)) "
		+ " FROM Sale AS obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();
	
	@Query("SELECT new com.devsuperior.dev.dto.SaleSuccessDTO(obj.seller, SUM(obj.visited),SUM(obj.deals)) "
			+ " FROM Sale AS obj GROUP BY obj.seller")
		List<SaleSuccessDTO> successGroupedBySeller();
}
