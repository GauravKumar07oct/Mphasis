package com.mphasis.controller;

import java.util.Arrays;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mphasis.LoanSectorfinancialManagementApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=LoanSectorfinancialManagementApplication.class, webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class TestLoanSectorFinancialController {

	@LocalServerPort
	private String port;
	
	HttpHeaders headers = new HttpHeaders();
	
	@Before
	public void before() {
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	}
	
	

	@Test
	public void testGetTop5SectorFinancialDetails() throws Exception {
		String url="http://localhost:"+port+"/sectorFinancialDetails/top5Sector/totalExposure";
		TestRestTemplate restTemplate = new TestRestTemplate();
		
		HttpEntity<String> httpEntity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		System.out.println("Get Response entity : "+response);
		String expected = "[{\"noOfCustomer\":7,\"sector\":\"SmallBusiness\",\"totalExposure\":27340},{\"noOfCustomer\":5,\"sector\":\"LargeBusiness\",\"totalExposure\":25600},{\"noOfCustomer\":7,\"sector\":\"Govermant\",\"totalExposure\":19150},{\"noOfCustomer\":7,\"sector\":\"Agriculture\",\"totalExposure\":19150},{\"noOfCustomer\":6,\"sector\":\"Private\",\"totalExposure\":14250}]";
		JSONAssert.assertEquals(expected, response.getBody(), false);
	} 

	
	@Test
	public void testGetCustomerNamesInSector() throws Exception {
		
		String url="http://localhost:"+port+"/sectorFinancialDetails/Private";
		TestRestTemplate restTemplate = new TestRestTemplate();
		
		HttpEntity<String> httpEntity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		System.out.println("Get Response entity : "+response);
		String expected = "[\"Rocky\",\"Shivi\",\"Mahendra\", \"Rani\",\"Sam\",\"Kavita\"]";
		JSONAssert.assertEquals(expected, response.getBody(), false);
		
		//assertTrue(response.getBody().contains("id:question01"));
	}

	@Test
	public void testGetCustomerNamesAndTypesInSector() throws Exception {
		String url="http://localhost:"+port+"/sectorFinancialDetails/Private/customerNameAndType";
		TestRestTemplate restTemplate = new TestRestTemplate();
	
		HttpEntity<String> httpEntity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, httpEntity, String.class);
		
		String expected ="[{\"customername\":\"Rocky\",\"customerType\":\"LettersOfCredit\"},{\"customername\":\"Shivi\",\"customerType\":\"TermLoan\"},{\"customername\":\"Mahendra\",\"customerType\":\"TermLoan\"},{\"customername\":\"Rani\",\"customerType\":\"OverDraft\"},{\"customername\":\"Sam\",\"customerType\":\"LettersOfCredit\"},{\"customername\":\"Kavita\",\"customerType\":\"OverDraft\"}]";
		JSONAssert.assertEquals(expected, response.getBody(), false);		
		
	}

}
