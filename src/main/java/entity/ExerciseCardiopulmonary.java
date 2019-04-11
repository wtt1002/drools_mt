/**  

* <p>Title: ExerciseCardiopulmonary.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: ExerciseCardiopulmonary</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class ExerciseCardiopulmonary {
	//峰值负荷
	private double peakLoad = -1;
	//峰值mets
	private double peakMets = -1;
	//峰值vo2
	private double peakVo2 = -1;
	//最大摄氧量
	private double vo2Max = -1;
	//无氧阈
	private double at = -1;
	//静息心率
	private double peaceRate = -1;
	//峰值心率
	private double peakRate = -1;
	//靶心率
	private double targetRate = -1;
	//1秒用力呼气量
	private double efv1 = -1;
	//fev1占预计值百分比
	private double efv1Rate = -1;
	//用力呼气占用力肺活量百分比
	private double efv1DivEvc = -1;
	//结论
	private String conclusion;
	/**
	 * @return the peakLoad
	 */
	public double getPeakLoad() {
		return peakLoad;
	}
	/**
	 * @param peakLoad the peakLoad to set
	 */
	public void setPeakLoad(double peakLoad) {
		this.peakLoad = peakLoad;
	}
	/**
	 * @return the peakMets
	 */
	public double getPeakMets() {
		return peakMets;
	}
	/**
	 * @param peakMets the peakMets to set
	 */
	public void setPeakMets(double peakMets) {
		this.peakMets = peakMets;
	}
	/**
	 * @return the peakVo2
	 */
	public double getPeakVo2() {
		return peakVo2;
	}
	/**
	 * @param peakVo2 the peakVo2 to set
	 */
	public void setPeakVo2(double peakVo2) {
		this.peakVo2 = peakVo2;
	}
	/**
	 * @return the vo2Max
	 */
	public double getVo2Max() {
		return vo2Max;
	}
	/**
	 * @param vo2Max the vo2Max to set
	 */
	public void setVo2Max(double vo2Max) {
		this.vo2Max = vo2Max;
	}
	/**
	 * @return the at
	 */
	public double getAt() {
		return at;
	}
	/**
	 * @param at the at to set
	 */
	public void setAt(double at) {
		this.at = at;
	}
	/**
	 * @return the peaceRate
	 */
	public double getPeaceRate() {
		return peaceRate;
	}
	/**
	 * @param peaceRate the peaceRate to set
	 */
	public void setPeaceRate(double peaceRate) {
		this.peaceRate = peaceRate;
	}
	/**
	 * @return the peakRate
	 */
	public double getPeakRate() {
		return peakRate;
	}
	/**
	 * @param peakRate the peakRate to set
	 */
	public void setPeakRate(double peakRate) {
		this.peakRate = peakRate;
	}
	/**
	 * @return the targetRate
	 */
	public double getTargetRate() {
		return targetRate;
	}
	/**
	 * @param targetRate the targetRate to set
	 */
	public void setTargetRate(double targetRate) {
		this.targetRate = targetRate;
	}
	/**
	 * @return the efv1
	 */
	public double getEfv1() {
		return efv1;
	}
	/**
	 * @param efv1 the efv1 to set
	 */
	public void setEfv1(double efv1) {
		this.efv1 = efv1;
	}
	/**
	 * @return the efv1Rate
	 */
	public double getEfv1Rate() {
		return efv1Rate;
	}
	/**
	 * @param efv1Rate the efv1Rate to set
	 */
	public void setEfv1Rate(double efv1Rate) {
		this.efv1Rate = efv1Rate;
	}
	/**
	 * @return the efv1DivEvc
	 */
	public double getEfv1DivEvc() {
		return efv1DivEvc;
	}
	/**
	 * @param efv1DivEvc the efv1DivEvc to set
	 */
	public void setEfv1DivEvc(double efv1DivEvc) {
		this.efv1DivEvc = efv1DivEvc;
	}
	/**
	 * @return the conclusion
	 */
	public String getConclusion() {
		return conclusion;
	}
	/**
	 * @param conclusion the conclusion to set
	 */
	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}
	
	
	
}
