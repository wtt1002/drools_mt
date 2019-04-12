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
	private int foodSum;
	//淀粉
	private List<Double> starch = new ArrayList<>();
	//谷薯
	private List<Double> grain = new ArrayList<>();
	//蔬菜
	private List<Double> vegetable =  new ArrayList<>();
	//水果
	private List<Double> fruit = new ArrayList<>();
	//油脂
	private List<Double> oil = new ArrayList<>();
	//诊断
	private List<String> diagnose = new ArrayList<>();
}
