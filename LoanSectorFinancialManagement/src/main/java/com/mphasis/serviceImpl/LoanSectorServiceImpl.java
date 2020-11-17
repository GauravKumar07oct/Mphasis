package com.mphasis.serviceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mphasis.model.SectorCustomernameAndType;
import com.mphasis.model.SectorDetailsResult;
import com.mphasis.model.SectorFinancialDetails;
import com.mphasis.repository.LoanRepository;
import com.mphasis.service.LoanSectorService;


@Service
public class LoanSectorServiceImpl implements LoanSectorService {
	
	@Autowired
	LoanRepository loanRepo;
	
	public List<SectorDetailsResult> getTop5SectorFinancialList() {
		
		Iterable<SectorFinancialDetails> result = loanRepo.findAll();
		if(result == null) {
			return null;
		}
		
		List<SectorFinancialDetails> sectorFinancialList= StreamSupport.stream(result.spliterator(), false).collect(Collectors.toList());
		if(sectorFinancialList == null || sectorFinancialList.isEmpty()) {
			return null;
		}
			
		List<SectorDetailsResult> sectorResultList = new ArrayList<SectorDetailsResult>();		
		
		// Creating a Map with key as Sector and value as total exposure for that sector	
		Map<String, Long> sectorTotalExposureMap = sectorFinancialList.stream().collect(Collectors.groupingBy(SectorFinancialDetails::getSector, Collectors.summingLong(SectorFinancialDetails::getExposure)));
		LinkedHashMap<String, Long> top5SectorWithTotalExposure = sectorTotalExposureMap.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue())).limit(5).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue, LinkedHashMap::new));
		
		// storing sector and total exposure in result SectorDetailsResult pojo
		top5SectorWithTotalExposure.forEach((k, v) -> {
	        SectorDetailsResult sectorObject = new SectorDetailsResult();
	        sectorObject.setSector(k);
	        sectorObject.setTotalExposure(v);
	        sectorResultList.add(sectorObject);
	    });
			
		// Creating a Map with key as Sector and value as total number of Customer for that sector
		Map<String, Long> sectorTotalNoOfCust = sectorFinancialList.stream().collect(Collectors.groupingBy(SectorFinancialDetails::getSector, Collectors.counting()));
			
		// storing no of customer information based on sectro in SectorDetailsResultPojo
		sectorTotalNoOfCust.forEach((k, v) -> {
	        for(SectorDetailsResult obj : sectorResultList) {
		        if(obj.getSector().equalsIgnoreCase(k)) {
		        	obj.setNoOfCustomer(v.intValue());
		        }
	        }
	    });
			
		return sectorResultList;
	}
	
	
	public Set<String> getCustomerNamesInSector(String sector){
		
		List<SectorFinancialDetails> customerNameList = loanRepo.findBySector(sector);
		if(customerNameList == null || customerNameList.isEmpty()) {
			return null;
		}
		
		// Getting Customer name based on sector
		Set<String> customerNamesInSector = customerNameList.stream().map(SectorFinancialDetails::getCustomerName).collect(Collectors.toSet());		
		return customerNamesInSector;
		
	}
	
	public List<SectorCustomernameAndType> getCustomerDetailsInSector(String sector){
		
			List<SectorFinancialDetails> customerDetails = loanRepo.findBySector(sector);
			if(customerDetails == null || customerDetails.isEmpty()) {
				return null;
			}
			List<SectorCustomernameAndType> custNameAndType = new ArrayList<SectorCustomernameAndType>();
			
			// Getting Map as key customer name and value as customer Type based on sector
			Map<String, String> customerNameAndTypeInSector = customerDetails.stream().collect(Collectors.toMap(SectorFinancialDetails::getCustomerName, SectorFinancialDetails::getType));

			customerNameAndTypeInSector.forEach((custName, custType) -> {
		        SectorCustomernameAndType custDetailsPojo= new SectorCustomernameAndType();
		        custDetailsPojo.setCustomername(custName);
		        custDetailsPojo.setCustomerType(custType);
		        custNameAndType.add(custDetailsPojo);
		    });
			
			return custNameAndType;
		}

}
