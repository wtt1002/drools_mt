/**  

* <p>Title: Patient.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

import java.math.BigDecimal;
import java.util.ArrayList;

/**  

* <p>Title: Patient</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class Patient {
	/**
	 * 患者类型：
	 * 普通冠心病患者：0
	 * 高龄冠心病患者：1
	 * PCI冠心病患者：2
	 */
	public static final int HAS_PCI = 1;
	public static final int NO_PCI = 0;
	public static final int OLD_PATIENT = 1;
	public static final int PCI_PATIENT = 2;
	public static final int ORDINARY_PATIENT = 0;
	public static final int HIGHRISK = 2;
	public static final int MIDRISK = 1;
	public static final int LOWRISK = 0;
	private String name;
	private int age;
	private String gender;
	private int height;
	private int weight;
	private double bmi;
	private int pci;
	private int patientType;
	private int riskRank = LOWRISK;
	public ArrayList<String> midList = new ArrayList<>();
	public ArrayList<String> highList = new ArrayList<>();
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	/**
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}
	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}
	/**
	 * @return the bmi
	 */
	public double getBmi() {
		return bmi;
	}
	/**
	 * @param bmi the bmi to set
	 */
	public void setBmi(double bmi) {
		this.bmi = bmi;
	}
	/**
	 * @return the pci
	 */
	public int getPci() {
		return pci;
	}
	/**
	 * @param pci the pci to set
	 */
	public void setPci(int pci) {
		this.pci = pci;
	}

	/**
	 * @return the patientType
	 */
	public int getPatientType() {
		return patientType;
	}
	/**
	 * @param patientType the patientType to set
	 */
	public void setPatientType(int patientType) {
		this.patientType = patientType;
	}
	/**
	 * @return the midList
	 */
	public ArrayList<String> getMidList() {
		return midList;
	}
	/**
	 * @param midList the midList to set
	 */
	public void setMidList(ArrayList<String> midList) {
		this.midList = midList;
	}
	/**
	 * @return the highList
	 */
	public ArrayList<String> getHighList() {
		return highList;
	}
	/**
	 * @param highList the highList to set
	 */
	public void setHighList(ArrayList<String> highList) {
		this.highList = highList;
	}
	/**
	 * @return the riskRank
	 */
	public int getRiskRank() {
		return riskRank;
	}
	/**
	 * @param riskRank the riskRank to set
	 */
	public void setRiskRank(int riskRank) {
		this.riskRank = riskRank;
	}
	
}
