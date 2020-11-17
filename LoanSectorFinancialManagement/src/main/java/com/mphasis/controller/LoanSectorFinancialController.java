package com.mphasis.controller;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.mphasis.model.SectorCustomernameAndType;
import com.mphasis.model.SectorDetailsResult;
import com.mphasis.service.LoanSectorService;

@RestController
public class LoanSectorFinancialController {

	@Autowired
	LoanSectorService loanSectorService;
	
	@GetMapping("/sectorFinancialDetails/top5Sector/totalExposure")
	public ResponseEntity<Object> getTop5SectorFinancialDetails() {
		
		List<SectorDetailsResult> sectorFinancialList = loanSectorService.getTop5SectorFinancialList();		
		if(sectorFinancialList == null || sectorFinancialList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return new ResponseEntity<Object>(sectorFinancialList, HttpStatus.OK);
	}
	
	@GetMapping("/sectorFinancialDetails/{sector}")
	public ResponseEntity<Object> getCustomerNamesInSector(@PathVariable String sector) {

		if(sector == null || sector.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		Set<String> customerNameList = loanSectorService.getCustomerNamesInSector(sector);	
		if(customerNameList == null || customerNameList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return new ResponseEntity<Object>(customerNameList, HttpStatus.OK);
	}
	
	@GetMapping("/sectorFinancialDetails/{sector}/customerNameAndType")
	public ResponseEntity<Object> getCustomerNamesAndTypesInSector(@PathVariable String sector) {		
		
		if(sector == null || sector.isEmpty()) {
			return ResponseEntity.badRequest().build();
		}
		List<SectorCustomernameAndType> customerNameAndTypeList = loanSectorService.getCustomerDetailsInSector(sector);	
		if(customerNameAndTypeList == null || customerNameAndTypeList.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return new ResponseEntity<Object>(customerNameAndTypeList, HttpStatus.OK);
	}
	
}
