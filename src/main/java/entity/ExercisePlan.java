/**  

* <p>Title: ExercisePlan.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

* @version 1.0  

*/  
package entity;

import java.util.ArrayList;
import java.util.List;

/**  

* <p>Title: ExercisePlan</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

*/
public class ExercisePlan extends Object {
	//运动强度 心率
	//private double strength;
	private double strengthStart;
	private double strengthEnd;
	//运动强度 摄氧量
	private double strenghVo2;
	//private double durationStart;
	//private double durationEnd;
	//private double timesStart;
	//private double timesEnd;
	//private double tiredStart = 12;
	//private double tiredEnd = 16;
	//有氧运动强度范围-心率储备法
	private double strength;
	private List<Double> oxyStrength = new ArrayList<>();
	//有氧运动时长 分钟
	private List<Double> oxyDuration = new ArrayList<>();
	//有氧运动频率
	private List<Double> oxyTimes = new ArrayList<>();
	//有氧运动劳累程度
	private List<Double> oxyTired = new ArrayList<>();
	//阻抗训练
	private List<Double> upImStrength = new ArrayList<>();
	private List<Double> downImStrength = new ArrayList<>();
	private List<Double> imSingleGroup = new ArrayList<>();
	private List<Double> imSingleTime = new ArrayList<>();
	private List<Double> imMuscles = new ArrayList<>();
	private List<Double> imSingleWeek = new ArrayList<>();
	//柔韧性运动处方
	private List<Double> flexDuration = new ArrayList<>();
	private List<Double> flexTargetDuration = new ArrayList<>();
	private List<Double> flexTotalDuration = new ArrayList<>();
	private List<Double> flexSingleWeek = new ArrayList<>();
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
	 * @return the upImStrength
	 */
	public List<Double> getUpImStrength() {
		return upImStrength;
	}
	/**
	 * @param upImStrength the upImStrength to set
	 */
	public void setUpImStrength(List<Double> upImStrength) {
		this.upImStrength = upImStrength;
	}
	/**
	 * @return the downImStrength
	 */
	public List<Double> getDownImStrength() {
		return downImStrength;
	}
	/**
	 * @param downImStrength the downImStrength to set
	 */
	public void setDownImStrength(List<Double> downImStrength) {
		this.downImStrength = downImStrength;
	}
	/**
	 * @return the imSingleGroup
	 */
	public List<Double> getImSingleGroup() {
		return imSingleGroup;
	}
	/**
	 * @param imSingleGroup the imSingleGroup to set
	 */
	public void setImSingleGroup(List<Double> imSingleGroup) {
		this.imSingleGroup = imSingleGroup;
	}
	/**
	 * @return the imSingleTime
	 */
	public List<Double> getImSingleTime() {
		return imSingleTime;
	}
	/**
	 * @param imSingleTime the imSingleTime to set
	 */
	public void setImSingleTime(List<Double> imSingleTime) {
		this.imSingleTime = imSingleTime;
	}
	/**
	 * @return the imSingleWeek
	 */
	public List<Double> getImSingleWeek() {
		return imSingleWeek;
	}
	/**
	 * @param imSingleWeek the imSingleWeek to set
	 */
	public void setImSingleWeek(List<Double> imSingleWeek) {
		this.imSingleWeek = imSingleWeek;
	}
	/**
	 * @return the imMuscles
	 */
	public List<Double> getImMuscles() {
		return imMuscles;
	}
	/**
	 * @param imMuscles the imMuscles to set
	 */
	public void setImMuscles(List<Double> imMuscles) {
		this.imMuscles = imMuscles;
	}
	/**
	 * @return the flexDuration
	 */
	public List<Double> getFlexDuration() {
		
		return flexDuration;
	}
	/**
	 * @param flexDuration the flexDuration to set
	 */
	public void setFlexDuration(List<Double> flexDuration) {
		this.flexDuration = flexDuration;
	}
	/**
	 * @return the flexTargetDuration
	 */
	public List<Double> getFlexTargetDuration() {
		return flexTargetDuration;
	}
	/**
	 * @param flexTargetDuration the flexTargetDuration to set
	 */
	public void setFlexTargetDuration(List<Double> flexTargetDuration) {
		this.flexTargetDuration = flexTargetDuration;
	}
	/**
	 * @return the flexTotalDuration
	 */
	public List<Double> getFlexTotalDuration() {
		return flexTotalDuration;
	}
	/**
	 * @param flexTotalDuration the flexTotalDuration to set
	 */
	public void setFlexTotalDuration(List<Double> flexTotalDuration) {
		this.flexTotalDuration = flexTotalDuration;
	}
	/**
	 * @return the flexSingleWeek
	 */
	public List<Double> getFlexSingleWeek() {
		return flexSingleWeek;
	}
	/**
	 * @param flexSingleWeek the flexSingleWeek to set
	 */
	public void setFlexSingleWeek(List<Double> flexSingleWeek) {
		this.flexSingleWeek = flexSingleWeek;
	}
	/**
	 * @return the oxyStrength
	 */
	public List<Double> getOxyStrength() {
		return oxyStrength;
	}
	/**
	 * @param oxyStrength the oxyStrength to set
	 */
	public void setOxyStrength(List<Double> oxyStrength) {
		this.oxyStrength = oxyStrength;
	}
	/**
	 * @return the oxyDuration
	 */
	public List<Double> getOxyDuration() {
		return oxyDuration;
	}
	/**
	 * @param oxyDuration the oxyDuration to set
	 */
	public void setOxyDuration(List<Double> oxyDuration) {
		this.oxyDuration = oxyDuration;
	}
	/**
	 * @return the oxyTimes
	 */
	public List<Double> getOxyTimes() {
		return oxyTimes;
	}
	/**
	 * @param oxyTimes the oxyTimes to set
	 */
	public void setOxyTimes(List<Double> oxyTimes) {
		this.oxyTimes = oxyTimes;
	}
	/**
	 * @return the oxyTired
	 */
	public List<Double> getOxyTired() {
		return oxyTired;
	}
	/**
	 * @param oxyTired the oxyTired to set
	 */
	public void setOxyTired(List<Double> oxyTired) {
		this.oxyTired = oxyTired;
	}
	
}
