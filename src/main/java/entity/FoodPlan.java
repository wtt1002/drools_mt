/**  

* <p>Title: FoodPlan.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019��4��12��  

* @version 1.0  

*/  
package entity;

import java.util.ArrayList;
import java.util.List;

/**  

* <p>Title: FoodPlan</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019��4��12��  

*/
public class FoodPlan {
	private int foodSum;
	//����
	private List<Double> starch = new ArrayList<>();
	//����
	private List<Double> grain = new ArrayList<>();
	//�߲�
	private List<Double> vegetable =  new ArrayList<>();
	//ˮ��
	private List<Double> fruit = new ArrayList<>();
	//��֬
	private List<Double> oil = new ArrayList<>();
	//���
	private List<String> diagnose = new ArrayList<>();
}