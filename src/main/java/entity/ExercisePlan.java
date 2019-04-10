/**  

* <p>Title: ExercisePlan.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: ExercisePlan</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

*/
public class ExercisePlan {
	//运动强度 心率
	private double strength;
	private double strengthStart;
	private double strengthEnd;
	//运动强度 摄氧量
	private double strenghVo2;
	private double durationStart;
	private double durationEnd;
	private double timesStart;
	private double timesEnd;
	private double tiredStart = 12;
	private double tiredEnd = 16;
	/**
	 * @return the strength
	 */
	public double getStrength() {
		return strength;
	}
	/**
	 * @param strength the strength to set
	 */
	public void setStrength(double strength) {
		this.strength = strength;
	}
	/**
	 * @return the strengthStart
	 */
	public double getStrengthStart() {
		return strengthStart;
	}
	/**
	 * @param strengthStart the strengthStart to set
	 */
	public void setStrengthStart(double strengthStart) {
		this.strengthStart = strengthStart;
	}
	/**
	 * @return the strengthEnd
	 */
	public double getStrengthEnd() {
		return strengthEnd;
	}
	/**
	 * @param strengthEnd the strengthEnd to set
	 */
	public void setStrengthEnd(double strengthEnd) {
		this.strengthEnd = strengthEnd;
	}
	/**
	 * @return the strenghVo2
	 */
	public double getStrenghVo2() {
		return strenghVo2;
	}
	/**
	 * @param strenghVo2 the strenghVo2 to set
	 */
	public void setStrenghVo2(double strenghVo2) {
		this.strenghVo2 = strenghVo2;
	}
	/**
	 * @return the durationStart
	 */
	public double getDurationStart() {
		return durationStart;
	}
	/**
	 * @param durationStart the durationStart to set
	 */
	public void setDurationStart(double durationStart) {
		this.durationStart = durationStart;
	}
	/**
	 * @return the durationEnd
	 */
	public double getDurationEnd() {
		return durationEnd;
	}
	/**
	 * @param durationEnd the durationEnd to set
	 */
	public void setDurationEnd(double durationEnd) {
		this.durationEnd = durationEnd;
	}

	/**
	 * @return the timesStart
	 */
	public double getTimesStart() {
		return timesStart;
	}
	/**
	 * @param timesStart the timesStart to set
	 */
	public void setTimesStart(double timesStart) {
		this.timesStart = timesStart;
	}
	/**
	 * @return the timesEnd
	 */
	public double getTimesEnd() {
		return timesEnd;
	}
	/**
	 * @param timesEnd the timesEnd to set
	 */
	public void setTimesEnd(double timesEnd) {
		this.timesEnd = timesEnd;
	}
	/**
	 * @return the tiredStart
	 */
	public double getTiredStart() {
		return tiredStart;
	}
	/**
	 * @param tiredStart the tiredStart to set
	 */
	public void setTiredStart(double tiredStart) {
		this.tiredStart = tiredStart;
	}
	/**
	 * @return the tiredEnd
	 */
	public double getTiredEnd() {
		return tiredEnd;
	}
	/**
	 * @param tiredEnd the tiredEnd to set
	 */
	public void setTiredEnd(double tiredEnd) {
		this.tiredEnd = tiredEnd;
	}
	
	
	
}
