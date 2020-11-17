package com.mphasis.service;

import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.mphasis.model.SectorCustomernameAndType;
import com.mphasis.model.SectorDetailsResult;

@Service
public interface LoanSectorService {

	public List<SectorDetailsResult> getTop5SectorFinancialList();
	public Set<String> getCustomerNamesInSector(String sector);
	public List<SectorCustomernameAndType> getCustomerDetailsInSector(String sector);
	
}
