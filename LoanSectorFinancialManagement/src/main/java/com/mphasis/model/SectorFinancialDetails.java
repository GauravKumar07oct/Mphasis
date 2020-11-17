package com.mphasis.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SectorFinancialDetails {

		private String customerName;
		private String sector;
		private long exposure;
		private String type;
		private String sectorId;
		@Id
		private String custLoanId;
		
		public SectorFinancialDetails() {
			
		}
		
		
		public SectorFinancialDetails(String customerName, String sector, long exposure, String type, String sectorId,
				String custLoanId) {
			super();
			this.customerName = customerName;
			this.sector = sector;
			this.exposure = exposure;
			this.type = type;
			this.sectorId = sectorId;
			this.custLoanId = custLoanId;
		}
		

		public String getSectorId() {
			return sectorId;
		}


		public String getCustLoanId() {
			return custLoanId;
		}


		public void setSectorId(String sectorId) {
			this.sectorId = sectorId;
		}


		public void setCustLoanId(String custLoanId) {
			this.custLoanId = custLoanId;
		}


		public String getCustomerName() {
			return customerName;
		}
		public String getSector() {
			return sector;
		}
		public long getExposure() {
			return exposure;
		}
		public String getType() {
			return type;
		}
		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}
		public void setSector(String sector) {
			this.sector = sector;
		}
		public void setExposure(long exposure) {
			this.exposure = exposure;
		}
		public void setType(String type) {
			this.type = type;
		}


		@Override
		public String toString() {
			return "SectorFinancialDetails [customerName=" + customerName + ", sector=" + sector + ", exposure="
					+ exposure + ", type=" + type + ", sectorId=" + sectorId + ", custLoanId=" + custLoanId + "]";
		}
		
		
		
}
