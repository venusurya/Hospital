package hospital_a1.dto;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Branch {

	@Id
	private int branch_id;
	private String branch_name;
	private String branch_manager;
	private String branch_location;
	
	
	@ManyToOne
	private Hospital hospital;
	
	
	public int getBranch_id() {
		return branch_id;
	}

	public void setBranch_id(int branch_id) {
		this.branch_id = branch_id;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public String getBranch_location() {
		return branch_location;
	}

	public void setBranch_location(String branch_location) {
		this.branch_location = branch_location;
	}

	public String getBranch_manager() {
		return branch_manager;
	}

	public void setBranch_manager(String branch_manager) {
		this.branch_manager = branch_manager;
	}

	public Hospital getHospital() {
		return hospital;
	}

	public void setHospital(Hospital hospital) {
		this.hospital = hospital;
	}

	@Override
	public String toString() {
		return "Branch [branch_id=" + branch_id + ", branch_name=" + branch_name + ", branch_manager=" + branch_manager
				+ ", branch_location=" + branch_location + ", hospital=" + hospital + "]";
	}
}
