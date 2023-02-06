package hospital_a1.dto;
 

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Hospital {

	@Id
	private int hospital_id;
	private String hospital_name;
	private String ceo_name;
	private String website;
	
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public String getHospital_name() {
		return hospital_name;
	}
	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}
	public String getCeo_name() {
		return ceo_name;
	}
	public void setCeo_name(String ceo_name) {
		this.ceo_name = ceo_name;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	@Override
	public String toString() {
		return "Hospital [hospital_id=" + hospital_id + ", hospital_name=" + hospital_name + ", ceo_name=" + ceo_name
				+ ", website=" + website + "]";
	}

	 
}
