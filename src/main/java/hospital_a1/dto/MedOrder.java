package hospital_a1.dto;

 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MedOrder {

	@Id
	private int medorder_id;
	private String medorder_docter;
	private int medorder_age;
	private String medorder_date;
	
	@ManyToOne
	private Encounter encounter;

	public int getMedorder_id() {
		return medorder_id;
	}

	public void setMedorder_id(int medorder_id) {
		this.medorder_id = medorder_id;
	}

	public String getMedorder_docter() {
		return medorder_docter;
	}

	public void setMedorder_docter(String medorder_docter) {
		this.medorder_docter = medorder_docter;
	}

	public int getMedorder_age() {
		return medorder_age;
	}

	public void setMedorder_age(int medorder_age) {
		this.medorder_age = medorder_age;
	}

	public String getMedorder_date() {
		return medorder_date;
	}

	public void setMedorder_date(String medorder_date) {
		this.medorder_date = medorder_date;
	}

	public Encounter getEncounter() {
		return encounter;
	}

	public void setEncounter(Encounter encounter) {
		this.encounter = encounter;
	}

	@Override
	public String toString() {
		return "MedOrder [medorder_id=" + medorder_id + ", medorder_docter=" + medorder_docter + ", medorder_age="
				+ medorder_age + ", medorder_date=" + medorder_date + ", encounter=" + encounter + "]";
	}

}
