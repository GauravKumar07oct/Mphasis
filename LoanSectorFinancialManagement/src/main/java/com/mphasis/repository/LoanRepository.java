package com.mphasis.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mphasis.model.SectorFinancialDetails;

@Repository
public interface LoanRepository extends PagingAndSortingRepository<SectorFinancialDetails, String> {

	public List<SectorFinancialDetails> findBySector(@Param("sector") String sector);
	
}

