/**  

* <p>Title: FoodPlan.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月12日  

* @version 1.0  

*/  
package entity;

import java.util.ArrayList;
import java.util.List;

/**  

* <p>Title: FoodPlan</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月12日  

*/
public class FoodPlan {
	private int foodSum = -1;
	//淀粉
	private List<Integer> starch = new ArrayList<>();
	//谷薯
	private List<Integer> grain = new ArrayList<>();
	//蔬菜
	private List<Integer> vegetable =  new ArrayList<>();
	//水果
	private List<Integer> fruit = new ArrayList<>();
	//肉蛋
	private List<Integer> protein = new ArrayList<>();
	//油脂
	private List<Integer> oil = new ArrayList<>();
	//诊断
	private List<String> diagnose = new ArrayList<>();
	/**
	 * @return the foodSum
	 */
	public int getFoodSum() {
		return foodSum;
	}
	/**
	 * @param foodSum the foodSum to set
	 */
	public void setFoodSum(int foodSum) {
		this.foodSum = foodSum;
	}
	/**
	 * @return the starch
	 */
	public List<Integer> getStarch() {
		return starch;
	}
	/**
	 * @param starch the starch to set
	 */
	public void setStarch(List<Integer> starch) {
		this.starch = starch;
	}
	/**
	 * @return the grain
	 */
	public List<Integer> getGrain() {
		return grain;
	}
	/**
	 * @param grain the grain to set
	 */
	public void setGrain(List<Integer> grain) {
		this.grain = grain;
	}
	/**
	 * @return the vegetable
	 */
	public List<Integer> getVegetable() {
		return vegetable;
	}
	/**
	 * @param vegetable the vegetable to set
	 */
	public void setVegetable(List<Integer> vegetable) {
		this.vegetable = vegetable;
	}
	/**
	 * @return the fruit
	 */
	public List<Integer> getFruit() {
		return fruit;
	}
	/**
	 * @param fruit the fruit to set
	 */
	public void setFruit(List<Integer> fruit) {
		this.fruit = fruit;
	}
	/**
	 * @return the protein
	 */
	public List<Integer> getProtein() {
		return protein;
	}
	/**
	 * @param protein the protein to set
	 */
	public void setProtein(List<Integer> protein) {
		this.protein = protein;
	}
	/**
	 * @return the oil
	 */
	public List<Integer> getOil() {
		return oil;
	}
	/**
	 * @param oil the oil to set
	 */
	public void setOil(List<Integer> oil) {
		this.oil = oil;
	}
	/**
	 * @return the diagnose
	 */
	public List<String> getDiagnose() {
		return diagnose;
	}
	/**
	 * @param diagnose the diagnose to set
	 */
	public void setDiagnose(List<String> diagnose) {
		this.diagnose = diagnose;
	}

	
	
}
