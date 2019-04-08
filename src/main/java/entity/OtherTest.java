/**  

* <p>Title: OtherTest.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: OtherTest</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class OtherTest {
	public static final int OCCER = 1;
	public static final int NO_OCCER = 0;
	private double exerciseEquival;
	//心律失常
	private int isArrhythmia;
	//心绞痛
	private int angina;
	//心电图缺血改变
	private int ischemia;
	/**
	 * @return the exerciseEquival
	 */
	public double getExerciseEquival() {
		return exerciseEquival;
	}
	/**
	 * @param exerciseEquival the exerciseEquival to set
	 */
	public void setExerciseEquival(double exerciseEquival) {
		this.exerciseEquival = exerciseEquival;
	}
	/**
	 * @return the isArrhythmia
	 */
	public int getIsArrhythmia() {
		return isArrhythmia;
	}
	/**
	 * @param isArrhythmia the isArrhythmia to set
	 */
	public void setIsArrhythmia(int isArrhythmia) {
		this.isArrhythmia = isArrhythmia;
	}
	/**
	 * @return the angina
	 */
	public int getAngina() {
		return angina;
	}
	/**
	 * @param angina the angina to set
	 */
	public void setAngina(int angina) {
		this.angina = angina;
	}
	/**
	 * @return the ischemia
	 */
	public int getIschemia() {
		return ischemia;
	}
	/**
	 * @param ischemia the ischemia to set
	 */
	public void setIschemia(int ischemia) {
		this.ischemia = ischemia;
	}
	
}
