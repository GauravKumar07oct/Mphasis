package com.mphasis.model;

public class SectorDetails {

		private String SectorName;
		private String SectorId;
		private String Facilities;
		
		public SectorDetails() {
			
		}
		
		public String getSectorName() {
			return SectorName;
		}
		public String getSectorId() {
			return SectorId;
		}
		public String getFacilities() {
			return Facilities;
		}
		public void setSectorName(String sectorName) {
			SectorName = sectorName;
		}
		public void setSectorId(String sectorId) {
			SectorId = sectorId;
		}
		public void setFacilities(String facilities) {
			Facilities = facilities;
		}
		@Override
		public String toString() {
			return "SectorDetails [SectorName=" + SectorName + ", SectorId=" + SectorId + ", Facilities=" + Facilities
					+ "]";
		}
		public SectorDetails(String sectorName, String sectorId, String facilities) {
			super();
			SectorName = sectorName;
			SectorId = sectorId;
			Facilities = facilities;
		}
		
		
	
}
