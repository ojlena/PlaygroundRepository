package playground.olatutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class CandidateTest {

	@Test
	public final void testNamesSetGet() {
//		Given
		Candidate candidate = new Candidate();
		
//		When
		candidate.setName("grzegorz");
		candidate.setSurname("lenartowicz");
		
//		Then
		assertEquals("Grzegorz", candidate.getName());
		assertEquals("Lenartowicz", candidate.getSurname());
	}
	
	@Test
	public final void testAddEducation() {
//		Given
		Candidate candidate = new Candidate();
		String studies = "AGH Kraków";
		int fromYear = 2004;
		int toYear = 2007;
		
//		When
		candidate.addEducation(studies,fromYear,toYear);
		
//		Then
		assertEquals("Education: AGH Kraków", candidate.getActivitySummary(2005));
	}
	
	@Test
	public final void testAddExperience() {
//		Given
		Candidate candidate = new Candidate();
		String employer = "tom tom";
		String jobTitle = "cartographer";
		int fromYear = 2004;
		int toYear = 2007;
		
//		When
		candidate.addExperience(employer, jobTitle,fromYear,toYear);
		
//		Then
		assertEquals("Experience: cartographer at tom tom", candidate.getExperienceSummary(2005));
	}

}
