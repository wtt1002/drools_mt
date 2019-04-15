/**  

* <p>Title: Conclusion.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月13日  

* @version 1.0  

*/  
package entity;

/**  

* <p>Title: Conclusion</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月13日  

*/
public class Conclusion {
	public static final int FIT = 1;
	public static final int THIN_LITTLE = 2;
	public static final int THIN_MORE = 3;
	public static final int FAT_LITTLE = 4;
	public static final int FAT_MORE = 5;
	//患者胖瘦状态
	private int fitStatus = -1;
	//标准体重
	private int ideaWeight = -1;
	/**
	 * @return the fitStatus
	 */
	public int getFitStatus() {
		return fitStatus;
	}

	/**
	 * @param fitStatus the fitStatus to set
	 */
	public void setFitStatus(int fitStatus) {
		this.fitStatus = fitStatus;
	}

	/**
	 * @return the ideaWeight
	 */
	public int getIdeaWeight() {
		return ideaWeight;
	}

	/**
	 * @param ideaWeight the ideaWeight to set
	 */
	public void setIdeaWeight(int ideaWeight) {
		this.ideaWeight = ideaWeight;
	}
	
}
