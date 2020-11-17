package com.mphasis.model;

public class SectorDetailsResult {
	
	private Long TotalExposure;
	private String Sector;
	private int noOfCustomer;
	
	public SectorDetailsResult() {
		
	}
	
	public Long getTotalExposure() {
		return TotalExposure;
	}
	public String getSector() {
		return Sector;
	}
	public int getNoOfCustomer() {
		return noOfCustomer;
	}
	public void setTotalExposure(Long totalExposure) {
		TotalExposure = totalExposure;
	}
	public void setSector(String sector) {
		Sector = sector;
	}
	public void setNoOfCustomer(int noOfCustomer) {
		this.noOfCustomer = noOfCustomer;
	}
	@Override
	public String toString() {
		return "SectorDetailsResult [TotalExposure=" + TotalExposure + ", Sector=" + Sector + ", noOfCustomer="
				+ noOfCustomer + "]";
	}
	
	

}
