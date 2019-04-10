/**  

* <p>Title: NoninvasiveCardiac.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: NoninvasiveCardiac</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class NoninvasiveCardiac {
	//心率
	private double hr;
	//每搏输出量
	private double sv;
	//每搏指数
	private double svi;
	//心输出量
	private double co;
	//心指数
	private double ci;
	//心收缩指数
	private double cti;
	//左心做功指数
	private double lcwi;
	//左心收缩时间
	private double lvet;
	//射血分数
	private double ef;
	//外周血管阻力
	private double svr;
	//外周血管阻力指数
	private double svri;
	//前负荷率
	private double edfr;
	//左室舒张末期容积
	private double edv;
	//结论
	private String conclusion;
	//

	/**
	 * @return the sv
	 */
	public double getSv() {
		return sv;
	}
	/**
	 * @return the hr
	 */
	public double getHr() {
		return hr;
	}
	/**
	 * @param hr the hr to set
	 */
	public void setHr(double hr) {
		this.hr = hr;
	}
	/**
	 * @param sv the sv to set
	 */
	public void setSv(double sv) {
		this.sv = sv;
	}
	/**
	 * @return the svi
	 */
	public double getSvi() {
		return svi;
	}
	/**
	 * @param svi the svi to set
	 */
	public void setSvi(double svi) {
		this.svi = svi;
	}
	/**
	 * @return the co
	 */
	public double getCo() {
		return co;
	}
	/**
	 * @param co the co to set
	 */
	public void setCo(double co) {
		this.co = co;
	}
	/**
	 * @return the ci
	 */
	public double getCi() {
		return ci;
	}
	/**
	 * @param ci the ci to set
	 */
	public void setCi(double ci) {
		this.ci = ci;
	}
	/**
	 * @return the cti
	 */
	public double getCti() {
		return cti;
	}
	/**
	 * @param cti the cti to set
	 */
	public void setCti(double cti) {
		this.cti = cti;
	}
	/**
	 * @return the lcwi
	 */
	public double getLcwi() {
		return lcwi;
	}
	/**
	 * @param lcwi the lcwi to set
	 */
	public void setLcwi(double lcwi) {
		this.lcwi = lcwi;
	}
	/**
	 * @return the lvet
	 */
	public double getLvet() {
		return lvet;
	}
	/**
	 * @param lvet the lvet to set
	 */
	public void setLvet(double lvet) {
		this.lvet = lvet;
	}
	/**
	 * @return the ef
	 */
	public double getEf() {
		return ef;
	}
	/**
	 * @param ef the ef to set
	 */
	public void setEf(double ef) {
		this.ef = ef;
	}
	/**
	 * @return the svr
	 */
	public double getSvr() {
		return svr;
	}
	/**
	 * @param svr the svr to set
	 */
	public void setSvr(double svr) {
		this.svr = svr;
	}
	/**
	 * @return the svri
	 */
	public double getSvri() {
		return svri;
	}
	/**
	 * @param svri the svri to set
	 */
	public void setSvri(double svri) {
		this.svri = svri;
	}
	/**
	 * @return the edfr
	 */
	public double getEdfr() {
		return edfr;
	}
	/**
	 * @param edfr the edfr to set
	 */
	public void setEdfr(double edfr) {
		this.edfr = edfr;
	}
	/**
	 * @return the edv
	 */
	public double getEdv() {
		return edv;
	}
	/**
	 * @param edv the edv to set
	 */
	public void setEdv(double edv) {
		this.edv = edv;
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
