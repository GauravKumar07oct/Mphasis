package com.mphasis.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.mphasis.model.SectorFinancialDetails;

@Component
public class LoanRepoistoryCommandLineRunner implements CommandLineRunner {
	
	
	@Autowired
	LoanRepository loanRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		loanRepository.save(new SectorFinancialDetails("Gaurav", "Agriculture", 2000L, "OverDraft", "Agriculture_1", "Gaurav_AGR_OD"));
		loanRepository.save(new SectorFinancialDetails("Sourabh", "Agriculture", 2500L, "OverDraft", "Agriculture_2", "Sourabh_AGR_OD"));
		loanRepository.save(new SectorFinancialDetails("Shivi", "Agriculture", 2600L, "TermLoan", "Agriculture_3", "Shivi_AGR_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "Agriculture", 3700L, "TermLoan", "Agriculture_4", "Mahendra_AGR_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "Agriculture", 2300L, "LettersOfCredit", "Agriculture_5", "Sam_AGR_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "Agriculture", 2050L, "LettersOfCredit", "Agriculture_6", "Rocky_AGR_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "Agriculture", 4000L, "OverDraft", "Agriculture_7", "Bob_AGR_OD"));

		loanRepository.save(new SectorFinancialDetails("Gaurav", "NonAgriculture", 3000L, "OverDraft", "NonAgriculture_1", "Gaurav_NAGR_OD"));
	//	loanRepository.save(new SectorFinancialDetails("Sourabh", "NonAgriculture", 2500L, "OverDraft", "NonAgriculture_2", "Sourabh_NAGR_OD"));
	//	loanRepository.save(new SectorFinancialDetails("Shivi", "NonAgriculture", 1600L, "TermLoan", "NonAgriculture_3", "Shivi_NAGR_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "NonAgriculture", 3700L, "TermLoan", "NonAgriculture_4", "Mahendra_NAGR_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "NonAgriculture", 1300L, "LettersOfCredit", "NonAgriculture_5", "Sam_NAGR_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "NonAgriculture", 2150L, "LettersOfCredit", "NonAgriculture_6", "Rocky_NAGR_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "NonAgriculture", 3000L, "OverDraft", "NonAgriculture_7", "Bob_NAGR_OD"));

		loanRepository.save(new SectorFinancialDetails("Gaurav", "Govermant", 2000L, "OverDraft", "Govermant_1", "Gaurav_GOVT_OD"));
		loanRepository.save(new SectorFinancialDetails("Sourabh", "Govermant", 2500L, "OverDraft", "Govermant_2", "Sourabh_GOVT_OD"));
		loanRepository.save(new SectorFinancialDetails("Shivi", "Govermant", 2600L, "TermLoan", "Govermant_3", "Shivi_GOVT_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "Govermant", 3700L, "TermLoan", "Govermant_4", "Mahendra_GOVT_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "Govermant", 2300L, "LettersOfCredit", "Govermant_5", "Sam_GOVT_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "Govermant", 2050L, "LettersOfCredit", "Govermant_6", "Rocky_GOVT_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "Govermant", 4000L, "OverDraft", "Govermant_7", "Bob_GOVT_OD"));

		loanRepository.save(new SectorFinancialDetails("Kavita", "Private", 2200L, "OverDraft", "Private_1", "Kavita_PVT_OD"));
		loanRepository.save(new SectorFinancialDetails("Rani", "Private", 2300L, "OverDraft", "Private_2", "Rani_PVT_OD"));
		loanRepository.save(new SectorFinancialDetails("Shivi", "Private", 3600L, "TermLoan", "Private_3", "Shivi_PVT_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "Private", 700L, "TermLoan", "Private_4", "Mahendra_PVT_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "Private", 3200L, "LettersOfCredit", "Private_5", "Sam_PVT_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "Private", 2250L, "LettersOfCredit", "Private_6", "Rocky_PVT_LOC"));
	//	loanRepository.save(new SectorFinancialDetails("Bob", "Private", 4500L, "OverDraft", "Private_7", "Bob_PVT_OD"));

		loanRepository.save(new SectorFinancialDetails("Gaurav", "CreditUnions", 2050L, "OverDraft", "CreditUnions_1", "Gaurav_CU_OD"));
		loanRepository.save(new SectorFinancialDetails("Sourabh", "CreditUnions", 1500L, "OverDraft", "CreditUnions_2", "Sourabh_CU_OD"));
		loanRepository.save(new SectorFinancialDetails("Shivi", "CreditUnions", 2650L, "TermLoan", "CreditUnions_3", "Shivi_CU_TL"));
	//	loanRepository.save(new SectorFinancialDetails("Mahendra", "CreditUnions", 4700L, "TermLoan", "CreditUnions_4", "Mahendra_CU_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "CreditUnions", 2350L, "LettersOfCredit", "CreditUnions_5", "Sam_CU_LOC"));
	//	loanRepository.save(new SectorFinancialDetails("Rocky", "CreditUnions", 7050L, "LettersOfCredit", "CreditUnions_6", "Rocky_CU_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "CreditUnions", 4000L, "OverDraft", "CreditUnions_7", "Bob_CU_OD"));

		loanRepository.save(new SectorFinancialDetails("Gaurav", "SmallBusiness", 2050L, "OverDraft", "SmallBusiness_1", "Gaurav_SB_OD"));
		loanRepository.save(new SectorFinancialDetails("Sourabh", "SmallBusiness", 3500L, "OverDraft", "SmallBusiness_2", "Sourabh_SB_OD"));
		loanRepository.save(new SectorFinancialDetails("Shivi", "SmallBusiness", 2650L, "TermLoan", "SmallBusiness_3", "Shivi_SB_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "SmallBusiness", 5700L, "TermLoan", "SmallBusiness_4", "Mahendra_SB_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "SmallBusiness", 2350L, "LettersOfCredit", "SmallBusiness_5", "Sam_SB_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "SmallBusiness", 7050L, "LettersOfCredit", "SmallBusiness_6", "Rocky_SB_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "SmallBusiness", 4040L, "OverDraft", "SmallBusiness_7", "Bob_SB_OD"));

	//	loanRepository.save(new SectorFinancialDetails("Gaurav", "LargeBusiness", 2055L, "OverDraft", "LargeBusiness_1", "Gaurav_LB_OD"));
		loanRepository.save(new SectorFinancialDetails("Sourabh", "LargeBusiness", 1500L, "OverDraft", "LargeBusiness_2", "Sourabh_LB_OD"));
//		loanRepository.save(new SectorFinancialDetails("Shivi", "LargeBusiness", 2700L, "TermLoan", "LargeBusiness_3", "Shivi_LB_TL"));
		loanRepository.save(new SectorFinancialDetails("Mahendra", "LargeBusiness", 4700L, "TermLoan", "LargeBusiness_4", "Mahendra_LB_TL"));
		loanRepository.save(new SectorFinancialDetails("Sam", "LargeBusiness", 9350L, "LettersOfCredit", "LargeBusiness_5", "Sam_LB_LOC"));
		loanRepository.save(new SectorFinancialDetails("Rocky", "LargeBusiness", 6050L, "LettersOfCredit", "LargeBusiness_6", "Rocky_LB_LOC"));
		loanRepository.save(new SectorFinancialDetails("Bob", "LargeBusiness", 4000L, "OverDraft", "LargeBusiness_7", "Bob_LB_OD"));
		
		
		for(SectorFinancialDetails sectorFinancialDetails:loanRepository.findAll()) {
			System.out.println(sectorFinancialDetails.toString());
		}
		
	}

}
