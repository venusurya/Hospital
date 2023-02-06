package hospital_a1.dto;

 

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MedItems {

	@Id
	private int meditems_id;
	private String meditems_medicine;
	private int meditems_pills;
	private double meditems_price;
	
	@ManyToOne
	private MedOrder medOrder;

	public int getMeditems_id() {
		return meditems_id;
	}

	public void setMeditems_id(int meditems_id) {
		this.meditems_id = meditems_id;
	}

	public String getMeditems_medicine() {
		return meditems_medicine;
	}

	public void setMeditems_medicine(String meditems_medicine) {
		this.meditems_medicine = meditems_medicine;
	}

	public int getMeditems_pills() {
		return meditems_pills;
	}

	public void setMeditems_pills(int meditems_pills) {
		this.meditems_pills = meditems_pills;
	}

	public double getMeditems_price() {
		return meditems_price;
	}

	public void setMeditems_price(double meditems_price) {
		this.meditems_price = meditems_price;
	}

	public MedOrder getMedOrder() {
		return medOrder;
	}

	public void setMedOrder(MedOrder medOrder) {
		this.medOrder = medOrder;
	}

	@Override
	public String toString() {
		return "MedItems [meditems_id=" + meditems_id + ", meditems_name=" + meditems_medicine + ", meditems_pills="
				+ meditems_pills + ", meditems_price=" + meditems_price + ", medOrder=" + medOrder + "]";
	}
	
}
