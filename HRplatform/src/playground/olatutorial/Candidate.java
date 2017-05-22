package playground.olatutorial;

//import java.util.Date;

public class Candidate {
	private String name;
	private String surname;
	private String studies; 
	private int fromYear; 
	private int toYear;
	
	public void setName(String name) {
		this.name=name;		
	}

	public void setSurname(String surname) {
		this.surname=surname;		
	}

	public String getName() {
		return (this.name.substring(0,1).toUpperCase()+this.name.substring(1,this.name.length()).toLowerCase());
	}

	public String getSurname() {
		return (this.surname.substring(0,1).toUpperCase()+this.surname.substring(1,this.surname.length()).toLowerCase());
	}

	public void addEducation(String studies, int fromYear, int toYear) {
		setStudies(studies);
		setFromYear(fromYear);
		setToYare(toYear);
	}

	private void setToYare(int toYear2) {
		this.toYear=toYear2;	
	}

	private void setFromYear(int fromYear2) {
		this.fromYear=fromYear2;	
	}

	private void setStudies(String studies2) {
		this.studies=studies2;	
	}

	public String getActivitySummary(int i) {
		if (i<this.toYear && i>this.fromYear){
			return "Education: "+ this.studies;
		}
		else return "No information";
	}

}
