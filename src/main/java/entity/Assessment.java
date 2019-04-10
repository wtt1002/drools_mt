/**  

* <p>Title: Assessment.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: Assessment</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class Assessment {
	//焦虑自评 分
    private double sasScore = -1;
	//抑郁自评 分
    private double sdsScore = -1;
	//营养评分 分
    private double mnaScore = -1;
	//睡眠质量指数 分
    private double psqiScore = -1;
	//运动当量 分
    private double ipqaScore = -1;
	//烟碱依赖评估 分
    private double fagerstormScore = -1;
	//左手握力kg
    private double leftGrip = -1;
	//右手握力kg
    private double rightGrip = -1;
	//3m往返试验s
    private double threeMeterTest = -1;
	//4m往返试验s
    private double fourMeterTest = -1;
	//椅子站起试验s
    private double standUpTest = -1;
	//左平衡s
    private double leftBalanceTest = -1;
	//右平衡s
    private double rightBalanceTest = -1;
	//坐位前伸cm
    private double sitReach = -1;
	//上臂围
    private double upperarmCircumference = -1;
	//体脂比
    private double bmi = -1;
	//三头肌皮褶试验mm
    private double tricepsSkinfoldThickness = -1;
    //衰弱
    private double frailScore = -1;
    //跌倒风险
    private double fallRiskScore = -1;
    //心功能评级
    private double nyha = -1;
    //心绞痛分级
    private double ccs = -1;
    //呼吸功能
    private double mrc = -1;
    //认知功能
    private double mmseScore = -1;
    //日常生活能力评估
    private double adlScore = -1;
    //工具性日常生活功能评估
    private double iadlScore = -1;
    //老年抑郁评估
    private double gdsScore = -1;
	/**
	 * @return the sasScore
	 */
	public double getSasScore() {
		return sasScore;
	}

	/**
	 * @param sasScore the sasScore to set
	 */
	public void setSasScore(double sasScore) {
		this.sasScore = sasScore;
	}

	/**
	 * @return the sdsScore
	 */
	public double getSdsScore() {
		return sdsScore;
	}

	/**
	 * @param sdsScore the sdsScore to set
	 */
	public void setSdsScore(double sdsScore) {
		this.sdsScore = sdsScore;
	}

	/**
	 * @return the naScore
	 */
	public double getMnaScore() {
		return mnaScore;
	}

	/**
	 * @param naScore the naScore to set
	 */
	public void setMnaScore(double mnaScore) {
		this.mnaScore = mnaScore;
	}

	/**
	 * @return the psqiScore
	 */
	public double getPsqiScore() {
		return psqiScore;
	}

	/**
	 * @param psqiScore the psqiScore to set
	 */
	public void setPsqiScore(double psqiScore) {
		this.psqiScore = psqiScore;
	}

	/**
	 * @return the ipqaScore
	 */
	public double getIpqaScore() {
		return ipqaScore;
	}

	/**
	 * @param ipqaScore the ipqaScore to set
	 */
	public void setIpqaScore(double ipqaScore) {
		this.ipqaScore = ipqaScore;
	}

	/**
	 * @return the fagerstormScore
	 */
	public double getFagerstormScore() {
		return fagerstormScore;
	}

	/**
	 * @param fagerstormScore the fagerstormScore to set
	 */
	public void setFagerstormScore(double fagerstormScore) {
		this.fagerstormScore = fagerstormScore;
	}

	/**
	 * @return the leftGrip
	 */
	public double getLeftGrip() {
		return leftGrip;
	}

	/**
	 * @param leftGrip the leftGrip to set
	 */
	public void setLeftGrip(double leftGrip) {
		this.leftGrip = leftGrip;
	}

	/**
	 * @return the rightGrip
	 */
	public double getRightGrip() {
		return rightGrip;
	}

	/**
	 * @param rightGrip the rightGrip to set
	 */
	public void setRightGrip(double rightGrip) {
		this.rightGrip = rightGrip;
	}

	/**
	 * @return the threeMeterTest
	 */
	public double getThreeMeterTest() {
		return threeMeterTest;
	}

	/**
	 * @param threeMeterTest the threeMeterTest to set
	 */
	public void setThreeMeterTest(double threeMeterTest) {
		this.threeMeterTest = threeMeterTest;
	}

	/**
	 * @return the fourMeterTest
	 */
	public double getFourMeterTest() {
		return fourMeterTest;
	}

	/**
	 * @param fourMeterTest the fourMeterTest to set
	 */
	public void setFourMeterTest(double fourMeterTest) {
		this.fourMeterTest = fourMeterTest;
	}

	/**
	 * @return the standUpTest
	 */
	public double getStandUpTest() {
		return standUpTest;
	}

	/**
	 * @param standUpTest the standUpTest to set
	 */
	public void setStandUpTest(double standUpTest) {
		this.standUpTest = standUpTest;
	}

	/**
	 * @return the leftBalanceTest
	 */
	public double getLeftBalanceTest() {
		return leftBalanceTest;
	}

	/**
	 * @param leftBalanceTest the leftBalanceTest to set
	 */
	public void setLeftBalanceTest(double leftBalanceTest) {
		this.leftBalanceTest = leftBalanceTest;
	}

	/**
	 * @return the rightBalanceTest
	 */
	public double getRightBalanceTest() {
		return rightBalanceTest;
	}

	/**
	 * @param rightBalanceTest the rightBalanceTest to set
	 */
	public void setRightBalanceTest(double rightBalanceTest) {
		this.rightBalanceTest = rightBalanceTest;
	}

	/**
	 * @return the sitReach
	 */
	public double getSitReach() {
		return sitReach;
	}

	/**
	 * @param sitReach the sitReach to set
	 */
	public void setSitReach(double sitReach) {
		this.sitReach = sitReach;
	}

	/**
	 * @return the upperarmCircumference
	 */
	public double getUpperarmCircumference() {
		return upperarmCircumference;
	}

	/**
	 * @param upperarmCircumference the upperarmCircumference to set
	 */
	public void setUpperarmCircumference(double upperarmCircumference) {
		this.upperarmCircumference = upperarmCircumference;
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
	 * @return the tricepsSkinfoldThickness
	 */
	public double getTricepsSkinfoldThickness() {
		return tricepsSkinfoldThickness;
	}

	/**
	 * @param tricepsSkinfoldThickness the tricepsSkinfoldThickness to set
	 */
	public void setTricepsSkinfoldThickness(double tricepsSkinfoldThickness) {
		this.tricepsSkinfoldThickness = tricepsSkinfoldThickness;
	}

	/**
	 * @return the frailScore
	 */
	public double getFrailScore() {
		return frailScore;
	}

	/**
	 * @param frailScore the frailScore to set
	 */
	public void setFrailScore(double frailScore) {
		this.frailScore = frailScore;
	}

	/**
	 * @return the fallRiskScore
	 */
	public double getFallRiskScore() {
		return fallRiskScore;
	}

	/**
	 * @param fallRiskScore the fallRiskScore to set
	 */
	public void setFallRiskScore(double fallRiskScore) {
		this.fallRiskScore = fallRiskScore;
	}

	/**
	 * @return the nyha
	 */
	public double getNyha() {
		return nyha;
	}

	/**
	 * @param nyha the nyha to set
	 */
	public void setNyha(double nyha) {
		this.nyha = nyha;
	}

	/**
	 * @return the ccs
	 */
	public double getCcs() {
		return ccs;
	}

	/**
	 * @param ccs the ccs to set
	 */
	public void setCcs(double ccs) {
		this.ccs = ccs;
	}

	/**
	 * @return the mrc
	 */
	public double getMrc() {
		return mrc;
	}

	/**
	 * @param mrc the mrc to set
	 */
	public void setMrc(double mrc) {
		this.mrc = mrc;
	}

	/**
	 * @return the mmseScore
	 */
	public double getMmseScore() {
		return mmseScore;
	}

	/**
	 * @param mmseScore the mmseScore to set
	 */
	public void setMmseScore(double mmseScore) {
		this.mmseScore = mmseScore;
	}

	/**
	 * @return the adlScore
	 */
	public double getAdlScore() {
		return adlScore;
	}

	/**
	 * @param adlScore the adlScore to set
	 */
	public void setAdlScore(double adlScore) {
		this.adlScore = adlScore;
	}

	/**
	 * @return the iadlScore
	 */
	public double getIadlScore() {
		return iadlScore;
	}

	/**
	 * @param iadlScore the iadlScore to set
	 */
	public void setIadlScore(double iadlScore) {
		this.iadlScore = iadlScore;
	}

	/**
	 * @return the gdsScore
	 */
	public double getGdsScore() {
		return gdsScore;
	}

	/**
	 * @param gdsScore the gdsScore to set
	 */
	public void setGdsScore(double gdsScore) {
		this.gdsScore = gdsScore;
	}
    
}
