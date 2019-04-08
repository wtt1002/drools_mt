/**  

* <p>Title: AccessProblem.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: AccessProblem</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class AccessProblem {
	public static final int OCCER = 1;
	public static final int NO_OCCER = 0;
	//出血
	private int hemorrhage;
	//血肿
	private int hematoma;
	//假性动脉瘤
	private int Pseudoaneurysm;
	//动静脉瘘
	private int fistula;
	//合并心原性休克
	private int shock;
	//心力衰竭
	private int heartFailure;
	//血管阻塞
	private int vascularObstruction;
	/**
	 * @return the hemorrhage
	 */
	public int getHemorrhage() {
		return hemorrhage;
	}
	/**
	 * @param hemorrhage the hemorrhage to set
	 */
	public void setHemorrhage(int hemorrhage) {
		this.hemorrhage = hemorrhage;
	}
	/**
	 * @return the hematoma
	 */
	public int getHematoma() {
		return hematoma;
	}
	/**
	 * @param hematoma the hematoma to set
	 */
	public void setHematoma(int hematoma) {
		this.hematoma = hematoma;
	}
	/**
	 * @return the pseudoaneurysm
	 */
	public int getPseudoaneurysm() {
		return Pseudoaneurysm;
	}
	/**
	 * @param pseudoaneurysm the pseudoaneurysm to set
	 */
	public void setPseudoaneurysm(int pseudoaneurysm) {
		Pseudoaneurysm = pseudoaneurysm;
	}
	/**
	 * @return the fistula
	 */
	public int getFistula() {
		return fistula;
	}
	/**
	 * @param fistula the fistula to set
	 */
	public void setFistula(int fistula) {
		this.fistula = fistula;
	}
	/**
	 * @return the shock
	 */
	public int getShock() {
		return shock;
	}
	/**
	 * @param shock the shock to set
	 */
	public void setShock(int shock) {
		this.shock = shock;
	}
	/**
	 * @return the heartFailure
	 */
	public int getHeartFailure() {
		return heartFailure;
	}
	/**
	 * @param heartFailure the heartFailure to set
	 */
	public void setHeartFailure(int heartFailure) {
		this.heartFailure = heartFailure;
	}
	/**
	 * @return the vascularObstruction
	 */
	public int getVascularObstruction() {
		return vascularObstruction;
	}
	/**
	 * @param vascularObstruction the vascularObstruction to set
	 */
	public void setVascularObstruction(int vascularObstruction) {
		this.vascularObstruction = vascularObstruction;
	}
	
	
}
