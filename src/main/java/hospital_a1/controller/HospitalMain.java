package hospital_a1.controller;

import java.util.List;
import java.util.Scanner;

import hospital_a1.dto.Address;
import hospital_a1.dto.Branch;
import hospital_a1.dto.Encounter;
import hospital_a1.dto.Hospital;
import hospital_a1.dto.MedItems;
import hospital_a1.dto.MedOrder;
import hospital_a1.dto.Person;
import hospital_p1_dao.AddressDao;
import hospital_p1_dao.BranchDao;
import hospital_p1_dao.EncounterDao;
import hospital_p1_dao.HospitalDao;
import hospital_p1_dao.MedOrderDao;
import hospital_p1_dao.PersonDao;
import hospital_p1_dao.MeditemsDao;

public class HospitalMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MedItems items = new MedItems();
		Person person = new Person();
		Hospital hospital = new Hospital();
		Branch branch = new Branch();
		Address address = new Address();
		Encounter encounter = new Encounter();
		MedOrder medOrder = new MedOrder();
		HospitalDao dao = new HospitalDao();
		BranchDao branchDao = new BranchDao();
		AddressDao addressDao = new AddressDao();
		PersonDao personDao = new PersonDao();
		EncounterDao encounterDao = new EncounterDao();
		MedOrderDao medOrderDao = new MedOrderDao();
		MeditemsDao itemsDao = new MeditemsDao();
		boolean mainexit = true;
		do {
			System.out.println("...........Welcome To hospital Project................");
			System.out.println("enter the option");
			System.out.println("1.Hospital \n2.Person \n3.Enter exit");
			int mainChoice = scanner.nextInt();
			switch (mainChoice) {
			case 1: {
				boolean exit = true;
				do {
					System.out.println("enter the option");
					System.out.println("1.to enter hospital \n2.to enter the branch \n3.to enter address \n4.to exit");
					int choice = scanner.nextInt();
					switch (choice) {
					case 1: {
						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save Hospital \n 2 Update Hospital \n 3 Delete Hospital"
											+ " \n 4 Get Details Based on Hospital Id \n 5 Get All Hospital Details"
											+ "\n 6 to Exit");
							int choice1 = scanner.nextInt();
							switch (choice1) {
							case 1: {
								System.out.println("enter the hospital id");
								int id = scanner.nextInt();
								System.out.println("enter the hospital name");
								String name = scanner.next();
								System.out.println("enter the Ceo Name");
								String ceo = scanner.next();
								System.out.println("enter the website");
								String website = scanner.next();

								hospital.setHospital_id(id);
								hospital.setHospital_name(name);
								hospital.setCeo_name(ceo);
								hospital.setWebsite(website);

								dao.saveHospital(hospital);
							}
								break;
							case 2: {
								 
								System.out.println("enter the hospital id");
								int id = scanner.nextInt();
								System.out.println("enter the hospital name");
								String name = scanner.next();
								System.out.println("enter the Ceo Name");
								String ceo = scanner.next();
								System.out.println("enter the website");
								String website = scanner.next();

								hospital.setHospital_name(name);
								hospital.setCeo_name(name);
								hospital.setWebsite(website);
								dao.updateHospital(id, hospital);
							}
								break;
							case 3: {
								System.out.println("enter the Hospital  id to be Delete ");
								int id = scanner.nextInt();
								dao.deleteHospital(id);
							}
								break;
							case 4: {
								System.out.println("enter the Hospital Id To Get Details ");
								int id = scanner.nextInt();
								dao.getHospitalById(id);
							}
								break;
							case 5: {
								dao.getAllHospital();
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}

					}
						break;
					case 2: {
						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save Branch  \n 2 Update Branch \n 3 Delete Branch"
											+ " \n 4 Get Details Based on Branch Id \n 5 Get All Branch Details"
											+ "\n 6 to Exit");
							int choice1 = scanner.nextInt();
							switch (choice1) {
							case 1: {
								dao.getAllHospital();
								System.out.println("enter the hospital id to enter branch for");
								int hospital_id = scanner.nextInt();
								System.out.println("Enter Branch id");
								int branch_id = scanner.nextInt();
								System.out.println("Enter Branch name");
								String name = scanner.next();
								System.out.println("Enter Branch Manager name");
								String manager = scanner.next();
								System.out.println("Enter Branch Location");
								String location = scanner.next();

								branch.setBranch_id(branch_id);
								branch.setBranch_name(name);
								branch.setBranch_manager(manager);
								branch.setBranch_location(location);

								branchDao.saveBranch(hospital_id, branch);
								System.out.println("Branch added successfully");
							}
								break;
							case 2: {
								System.out.println("enter the hospital id to enter branch for");
								int hospital_id = scanner.nextInt();
								System.out.println("Enter Branch id");
								int branch_id = scanner.nextInt();
								System.out.println("Enter Branch name");
								String name = scanner.next();
								System.out.println("Enter Branch Manager name");
								String manager = scanner.next();
								System.out.println("Enter Branch Location");
								String location = scanner.next();

								 
								branch.setBranch_name(name);
								branch.setBranch_manager(manager);
								branch.setBranch_location(location); 
								
								branchDao.updateBranch(branch_id, branch);
								
							}
								break;
							case 3: {
								System.out.println("enter the Branch   id to be Delete ");
								int id = scanner.nextInt();
								branchDao.deleteBranch(id);
							}
								break;
							case 4: {
								System.out.println("enter the Branch Id To Get Details ");
								int id = scanner.nextInt();
								branchDao.getBranchById(id);
							}
								break;
							case 5: {
								branchDao.getAllBranch();
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}

						
						break;
					}
					case 3: {
						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save Address  \n 2 Update Address \n 3 Delete Address"
											+ " \n 4 Get Details Based on Address Id \n 5 Get All Address Details"
											+ "\n 6 to Exit");
							int choice1 = scanner.nextInt();
							switch (choice1) {
							case 1: {
								branchDao.getAllBranch();
								System.out.println("enter the branch id to enter address for");
								int branch_id = scanner.nextInt();
								System.out.println("enter Addres Id");
								int id = scanner.nextInt();
								System.out.println("Enter Address Street");
								String street = scanner.next();
								System.out.println("Enter Cross");
								String cross = scanner.next();
								System.out.println("Enter Pincode");
								double pincode = scanner.nextDouble();
								System.out.println("Enter State");
								String state = scanner.next();
								System.out.println("enter Country");
								String country = scanner.next();
								address.setAddress_id(id);
								address.setAddress_street(street);
								address.setAddress_cross(cross);
								address.setAddress_pincode(pincode);
								address.setAddress_state(state);
								address.setAddress_country(country);
								addressDao.saveAddress(branch_id, address);
							}
								break;
							case 2: {
								System.out.println("enter Addres Id");
								int id = scanner.nextInt();
								System.out.println("Enter Address Street");
								String street = scanner.next();
								System.out.println("Enter Cross");
								String cross = scanner.next();
								System.out.println("Enter Pincode");
								double pincode = scanner.nextDouble();
								System.out.println("Enter State");
								String state = scanner.next();
								System.out.println("enter Country");
								String country = scanner.next();
								address.setAddress_id(id);
								address.setAddress_street(street);
								address.setAddress_cross(cross);
								address.setAddress_pincode(pincode);
								address.setAddress_state(state);
								address.setAddress_country(country);
								addressDao.updateAddress(id, address);
								
							}
								break;
							case 3: {
								System.out.println("enter the Address id to be Delete ");
								int id = scanner.nextInt();
								addressDao.deleteAddress(id);
							}
								break;
							case 4: {
								System.out.println("enter the Address  Id To Get Details ");
								int id = scanner.nextInt();
								addressDao.getAddressById(id);
							}
								break;
							case 5: {
								 addressDao.getAllAddress();
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}

						
					}
					break;
					case 4: {
						exit = false;
						break;
					}
					}
				} while (exit);

				break;
			}
			case 2: {
				boolean exit2 = true;
				do {
					System.out.println("enter the choice");
					System.out.println(
							"1.to enter the person \n Enter 2  encounter details \n3.to enter the Medorder \n4.to enter the MedItems \n5.exit");
					int choise = scanner.nextInt();
					switch (choise) {
					case 1: {
						System.out.println("Enter the person details");

						System.out.println("enter person id");
						int person_id = scanner.nextInt();
						System.out.println("enter the person name");
						String person_name = scanner.next();
						System.out.println("enter the person address");
						String person_address = scanner.next();
						System.out.println("enter the person phone");
						long person_phone = scanner.nextLong();

						person.setPid(person_id);
						person.setPname(person_name);
						person.setPaddress(person_address);
						person.setPhone(person_phone);

						personDao.savePerson(person);
						break;
					}

					case 2: {
						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save Encounter \n 2 Update Encounter \n 3 Delete Encounter"
											+ " \n 4 Get Details Based od Encounter Id \n 5 Get All Encounter Details"
											+ "\n 6 to Exit");
							int choice = scanner.nextInt();
							switch (choice) {
							case 1: {
								System.out.println("enter the details for encounter");

								System.out.println("enter the encounte id");
								int id = scanner.nextInt();
								System.out.println("enter the disease");
								String disease = scanner.next();
								System.out.println("enter the date");
								String date = scanner.next();

								encounter.setEncounter_id(id);
								encounter.setEncounter_disease(disease);
								encounter.setEncounter_date(date);

								System.out.println("Here is our branches details,choose any one");
								branchDao.getAllBranch();
								System.out.println("enter person id");
								int person_id = scanner.nextInt();
								System.out.println("enter the branch id");
								int branch_id = scanner.nextInt();
								encounterDao.saveEncounter(person_id, branch_id, encounter);
							}
								break;
							case 2: {
								System.out.println("enter encounter id");
								int id = scanner.nextInt();
								System.out.println("Enter Disease name");
								String disese = scanner.next();
								System.out.println("Enter the date");

								encounter.setEncounter_disease(disese);
								encounter.setEncounter_date(disese);

								System.out.println("All Branch Details");
								System.out.println("Choose ur Branch");
								branchDao.getAllBranch();

								System.out.println("Enter branch id");
								int branch_id = scanner.nextInt();
								encounterDao.updateEncounter(id, encounter, branch_id);
							}
								break;
							case 3: {
								System.out.println("enter encounter id");
								int id = scanner.nextInt();
								encounterDao.deleteEncounter(id);
							}
								break;
							case 4: {
								System.out.println("enter encounter id");
								int id = scanner.nextInt();
								encounterDao.getEncounterById(id);
							}
								break;
							case 5: {
								encounterDao.getAllEncounter();
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}

						break;
					}
					case 3: {
						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save Medorder \n 2 Update MedOrder \n 3 Delete MedOrder"
											+ " \n 4 Get Details Based on MedOrder Id \n 5 Get All Medorder Details"
											+ "\n 6 to Exit");
							int choice = scanner.nextInt();
							switch (choice) {
							case 1: {
								System.out.println("enter the encounter id");
								int encounter_id = scanner.nextInt();

								System.out.println("enter the MedOrder details");

								System.out.println("enter the medOrder id");
								int id = scanner.nextInt();
								System.out.println("enter Your age");
								int age = scanner.nextInt();
								System.out.println("enter the consultant doctor name");
								String doctor = scanner.next();
								System.out.println("enter the date");
								String date = scanner.next();

								medOrder.setMedorder_id(id);
								medOrder.setMedorder_age(age);
								medOrder.setMedorder_docter(doctor);
								medOrder.setMedorder_date(date);

								medOrderDao.saveMedOrder(encounter_id, medOrder);

							}
								break;
							case 2: {
								System.out.println("enter the medOrder id to be Update ");
								int id = scanner.nextInt();
								System.out.println("enter Your age");
								int age = scanner.nextInt();
								System.out.println("enter the consultant doctor name");
								String doctor = scanner.next();
								System.out.println("enter the date");
								String date = scanner.next();

								medOrder.setMedorder_age(age);
								medOrder.setMedorder_docter(doctor);
								medOrder.setMedorder_date(date);

								System.out.println("enter the encounter id");
								int encounter_id = scanner.nextInt();
								medOrderDao.updateMedOrder(encounter_id, medOrder, id);

							}
								break;
							case 3: {
								System.out.println("enter the medOrder id to be Delete ");
								int id = scanner.nextInt();
								medOrderDao.deleteMedOrder(id);

							}
								break;
							case 4: {
								System.out.println("enter the medOrder id to be Delete ");
								int id = scanner.nextInt();
								medOrderDao.getMedOrderById(id);
							}
								break;
							case 5: {
								medOrderDao.getAllMedOrder();
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}
					}
						break;

					case 4: {

						boolean condition = true;
						while (condition) {
							System.out.println(
									"enter ur choice \n 1 Save MedItems \n 2 Update MedItems \n 3 Delete MedItemr"
											+ " \n 4 Get Details Based on MedItem Id \n 5 Get All MedItems Details"
											+ "\n 6 to Exit");
							int choice = scanner.nextInt();
							switch (choice) {
							case 1: {
								System.out.println("enter the MedItems details");
								medOrderDao.getAllMedOrder();
								System.out.println("enter your medOrder id");
								int med_id = scanner.nextInt();
								System.out.println("enter the meditems id");
								int meditems_id = scanner.nextInt();
								System.out.println("enter medicine name");
								String meditems_medicine = scanner.next();
								System.out.println("enter bill amout");
								Double price = scanner.nextDouble();

								items.setMeditems_id(meditems_id);
								items.setMeditems_medicine(meditems_medicine);
								items.setMeditems_pills(meditems_id);
								items.setMeditems_price(price);

								itemsDao.saveMedItems(med_id, items);
							}
								break;
							case 2: {
								System.out.println("enter the MedItems details");
								medOrderDao.getAllMedOrder();

								System.out.println("enter the meditems id to be Update ");
								int meditems_id = scanner.nextInt();
								System.out.println("enter medicine name");
								String meditems_medicine = scanner.next();
								System.out.println("enter bill amout");
								Double price = scanner.nextDouble();

								items.setMeditems_medicine(meditems_medicine);
								items.setMeditems_pills(meditems_id);
								items.setMeditems_price(price);

								System.out.println("enter your medOrder id");
								int med_id = scanner.nextInt();

								itemsDao.updateMedItems(med_id, items, med_id);

							}
								break;
							case 3: {
								System.out.println("enter the MedItem id to be Delete ");
								int id = scanner.nextInt();
								itemsDao.deleteMedItems(id);

							}
								break;
							case 4: {
								System.out.println("enter the MedItem id");
								int id = scanner.nextInt();
								itemsDao.getMedItemsById(id);
							}
								break;
							case 5: {
								itemsDao.getAllMedItems();
								;
							}
								break;
							case 6: {
								condition = false;
							}
								break;
							}
						}

					}
						break;

					case 5: {
						exit2 = false;
						break;
					}
					}

				} while (exit2);
				break;
			}

			case 3: {
				mainexit = false;
				System.out.println("....................Thank You for Visiting .........");
				break;
			}
			}
		} while (mainexit);

	}
}