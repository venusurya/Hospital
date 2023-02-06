package hospital_a1.dto;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Address {

	@Id
	private int address_id;
	private String address_street;
	private String address_cross; 
	private double address_pincode;
	private String address_state;
	private String address_country;
	
	
	@OneToOne
	private Branch branch;


	public int getAddress_id() {
		return address_id;
	}


	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}


	public String getAddress_street() {
		return address_street;
	}


	public void setAddress_street(String address_street) {
		this.address_street = address_street;
	}


	public String getAddress_cross() {
		return address_cross;
	}


	public void setAddress_cross(String address_cross) {
		this.address_cross = address_cross;
	}


	public double getAddress_pincode() {
		return address_pincode;
	}


	public void setAddress_pincode(double address_pincode) {
		this.address_pincode = address_pincode;
	}


	public String getAddress_state() {
		return address_state;
	}


	public void setAddress_state(String address_state) {
		this.address_state = address_state;
	}


	public String getAddress_country() {
		return address_country;
	}


	public void setAddress_country(String address_country) {
		this.address_country = address_country;
	}


	public Branch getBranch() {
		return branch;
	}


	public void setBranch(Branch branch) {
		this.branch = branch;
	}


	@Override
	public String toString() {
		return "Address [address_id=" + address_id + ", address_street=" + address_street + ", address_cross="
				+ address_cross + ", address_pincode=" + address_pincode + ", address_state=" + address_state
				+ ", address_country=" + address_country + ", branch=" + branch + "]";
	} 
}