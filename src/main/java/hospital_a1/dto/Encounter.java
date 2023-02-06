package hospital_a1.dto;

 

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {

	@Id
	private int encounter_id;
	private String encounter_disease;
	private String encounter_date;
	
	@ManyToOne
	private Person person;
	
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Branch> branchs;
	
	public int getEncounter_id() {
		return encounter_id;
	}
	public void setEncounter_id(int encounter_id) {
		this.encounter_id = encounter_id;
	}
	public String getEncounter_disease() {
		return encounter_disease;
	}
	public void setEncounter_disease(String encounter_disease) {
		this.encounter_disease = encounter_disease;
	}
	public String getEncounter_date() {
		return encounter_date;
	}
	public void setEncounter_date(String encounter_date) {
		this.encounter_date = encounter_date;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public List<Branch> getBranchs() {
		return branchs;
	}
	public void setBranchs(List<Branch> branchs) {
		this.branchs = branchs;
	}
	@Override
	public String toString() {
		return "Encounter [encounter_id=" + encounter_id + ", encounter_disease=" + encounter_disease
				+ ", encounter_date=" + encounter_date + ", person=" + person + ", branchs=" + branchs + "]";
	}
}
