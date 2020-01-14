package hello.dto;

import java.util.HashMap;
import java.util.List;

public class PersonDTO {

	Object firstName;
	Object secondName;
	Object dateOfBirth;
	Object profession;
	Object innerJson;
	public Object getFirstName() {
		return firstName;
	}
	public void setFirstName(Object firstName) {
		this.firstName = firstName;
	}
	public Object getSecondName() {
		return secondName;
	}
	public void setSecondName(Object secondName) {
		this.secondName = secondName;
	}
	public Object getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Object dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Object getProfession() {
		return profession;
	}
	public void setProfession(Object profession) {
		this.profession = profession;
	}
	public Object getInnerJson() {
		return innerJson;
	}
	public void setInnerJson(Object innerJson) {
		this.innerJson = innerJson;
	}
	@Override
	public String toString() {
		return "PersonDTO [firstName=" + firstName + ", secondName=" + secondName + ", dateOfBirth=" + dateOfBirth
				+ ", profession=" + profession + ", innerJson=" + innerJson + "]";
	}
	
    
	
	
    
    
	
}
