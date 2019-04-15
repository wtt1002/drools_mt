/**  

* <p>Title: MyTest.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月14日  

* @version 1.0  

*/  
package drools;

import org.junit.Test;

import entity.AccessProblem;
import entity.Assessment;
import entity.Conclusion;
import entity.ExerciseCardiopulmonary;
import entity.ExercisePlan;
import entity.FoodPlan;
import entity.NoninvasiveCardiac;
import entity.OtherTest;
import entity.Patient;
import freemarker.template.Configuration;

/**  

* <p>Title: MyTest</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月14日  

*/
public class MyTest {
    private Configuration configuration = null;
    private ExercisePlan exercisePlan = null;
    private Patient patient = null;
    private NoninvasiveCardiac noninvasiveCardiac = null;
    private FoodPlan foodPlan = null;
    private AccessProblem accessProblem = null;
    private Assessment assessment = null;
    private OtherTest otherTest = null;
    private ExerciseCardiopulmonary exerciseCardiopulmonary = null;
    private Conclusion conclusion = null;
	@Test
	public void test1(){
		//patient
       	patient = new Patient();
    	patient.setAge(45);
    	patient.setSickAge(43);
    	patient.setName("王婷婷");
    	patient.setGender("女");
    	patient.setBmi(8.32);
    	patient.setPci(Patient.HAS_PCI);
    	patient.setPciType(Patient.ELECTIVE_PCI);
    	patient.setHeight(170);
    	patient.setWeight(70);
    	//Assessment
    	assessment = new Assessment();
    	assessment.setSasScore(80);
    	assessment.setSdsScore(44);
    	assessment.setMnaScore(13);
    	assessment.setFrailScore(0);
    	assessment.setFallRiskScore(5);
    	assessment.setGdsScore(4);
    	assessment.setNyha(2);
    	assessment.setCcs(1);
    	assessment.setMrc(0);
    	assessment.setMmseScore(29);
    	assessment.setAdlScore(95);
    	assessment.setIadlScore(15);
    	assessment.setRm(8);
    	//other test
    	otherTest = new OtherTest();
    	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
    	otherTest.setAngina(OtherTest.NO_OCCER);
    	otherTest.setIschemia(OtherTest.OCCER);
    	otherTest.setExerciseEquival(6.0);
    	otherTest.setCtni(0.11);
    	otherTest.setWorkRank(OtherTest.STRONG_WORK);
    	//AccessProblem
    	accessProblem = new AccessProblem();
    	accessProblem.setShock(AccessProblem.NO_OCCER);
    	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
//    	accessProblem.setShock(AccessProblem.OCCER);
    	//无创心功能
    	noninvasiveCardiac = new NoninvasiveCardiac();
    	noninvasiveCardiac.setEf(58.3);
    	noninvasiveCardiac.setHr(110);
    	//运动心肺
    	exerciseCardiopulmonary = new ExerciseCardiopulmonary();
    	//exerciseCardiopulmonary.setPeaceRate(104);
    	exerciseCardiopulmonary.setPeakRate(122);
    	exerciseCardiopulmonary.setVo2Max(23.6);
    	exerciseCardiopulmonary.setEfv1Rate(87);
    	exerciseCardiopulmonary.setAt(18);
    	//exerciseCardiopulmonary.setPeakVo2(22.2);
    	//exerciseCardiopulmonary.setTargetRate(targetRate);

    	initEntrance();
    	
	}
	
	@Test 
	public void test2(){
       	patient = new Patient();
    	patient.setAge(78);
    	patient.setSickAge(66);
    	patient.setName("张强");
    	patient.setGender("男");
    	patient.setBmi(8.32);
    	patient.setPci(Patient.NO_PCI);
    	patient.setPciType(Patient.ELECTIVE_PCI);
    	patient.setHeight(174);
    	patient.setWeight(55);
    	//Assessment
    	assessment = new Assessment();
    	assessment.setSasScore(80);
    	assessment.setSdsScore(44);
    	assessment.setMnaScore(13);
    	assessment.setFrailScore(0);
    	assessment.setFallRiskScore(5);
    	assessment.setGdsScore(4);
    	assessment.setNyha(2);
    	assessment.setCcs(1);
    	assessment.setMrc(0);
    	assessment.setMmseScore(29);
    	assessment.setAdlScore(95);
    	assessment.setIadlScore(15);
    	assessment.setRm(6);
    	//other test
    	otherTest = new OtherTest();
    	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
    	otherTest.setAngina(OtherTest.NO_OCCER);
    	otherTest.setIschemia(OtherTest.OCCER);
    	otherTest.setExerciseEquival(6.0);
    	otherTest.setCtni(0.11);
    	otherTest.setWorkRank(OtherTest.NO_WORK);
    	//AccessProblem
    	accessProblem = new AccessProblem();
    	accessProblem.setShock(AccessProblem.NO_OCCER);
    	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
//    	accessProblem.setShock(AccessProblem.OCCER);
    	//无创心功能
    	noninvasiveCardiac = new NoninvasiveCardiac();
    	noninvasiveCardiac.setEf(58.3);
    	noninvasiveCardiac.setHr(145);
    	//运动心肺
    	exerciseCardiopulmonary = new ExerciseCardiopulmonary();
    	//exerciseCardiopulmonary.setPeaceRate(104);
    	exerciseCardiopulmonary.setPeakRate(122);
//    	exerciseCardiopulmonary.setVo2Max(23.6);
    	exerciseCardiopulmonary.setEfv1Rate(87);
    	exerciseCardiopulmonary.setAt(22);
    	//exerciseCardiopulmonary.setPeakVo2(22.2);
    	//exerciseCardiopulmonary.setTargetRate(targetRate);

    	initEntrance();
	}
	@Test 
	public void test3(){
       	patient = new Patient();
    	patient.setAge(74);
    	patient.setSickAge(66);
    	patient.setName("郑勇拓");
    	patient.setGender("男");
    	patient.setBmi(8.32);
    	patient.setPci(Patient.NO_PCI);
    	patient.setPciType(Patient.URGENT_PCI);
    	patient.setHeight(175);
    	patient.setWeight(60);
    	//Assessment
    	
    	assessment = new Assessment();
    	//焦虑自评 分
    	assessment.setSasScore(80);
    	//抑郁自评 分
    	assessment.setSdsScore(44);
    	//营养评分 分
    	assessment.setMnaScore(13);
    	//衰弱
    	assessment.setFrailScore(0);
    	//跌倒评估
    	assessment.setFallRiskScore(5);
    	//老年抑郁评估
    	assessment.setGdsScore(4);
    	//心功能评级
    	assessment.setNyha(1);
    	//心绞痛分级
    	assessment.setCcs(1);
    	 //呼吸功能
    	assessment.setMrc(0);
    	//认知功能
    	assessment.setMmseScore(29);
    	//日常生活能力评估
    	assessment.setAdlScore(95);
    	//工具性日常生活功能评估
    	assessment.setIadlScore(15);
    	 //仅一次重复所能完成的最大重量单位
    	assessment.setRm(15);
    	
    	
    	//other test
    	otherTest = new OtherTest();
    	//心律失常
    	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
    	//心绞痛
    	otherTest.setAngina(OtherTest.NO_OCCER);
    	//心电图缺血改变
    	otherTest.setIschemia(OtherTest.NO_OCCER);
    	//运动当量
    	otherTest.setExerciseEquival(6.8);
    	//心肌钙蛋白浓度
    	otherTest.setCtni(0.11);
    	//劳动强度
    	otherTest.setWorkRank(OtherTest.MEDIUM_WORK);
    	
    	//AccessProblem
    	accessProblem = new AccessProblem();
    	//合并心原性休克
    	accessProblem.setShock(AccessProblem.NO_OCCER);
    	//血管阻塞
    	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
    	//血肿
    	accessProblem.setHematoma(AccessProblem.NO_OCCER);
    	//出血
    	accessProblem.setHemorrhage(AccessProblem.NO_OCCER);
    	//假性动脉瘤
    	accessProblem.setPseudoaneurysm(AccessProblem.NO_OCCER);
    	//动静脉瘘
    	accessProblem.setFistula(AccessProblem.NO_OCCER);
    	//心力衰竭
    	accessProblem.setHeartFailure(AccessProblem.NO_OCCER);
    	
    	//无创心功能
    	noninvasiveCardiac = new NoninvasiveCardiac();
    	noninvasiveCardiac.setEf(58.3);
    	//心率
    	noninvasiveCardiac.setHr(88);
    	
    	
    	//运动心肺
    	exerciseCardiopulmonary = new ExerciseCardiopulmonary();
    	//静息心率
    	exerciseCardiopulmonary.setPeaceRate(88);
    	//峰值心率
    	exerciseCardiopulmonary.setPeakRate(153);
    	//最大摄氧量
    	exerciseCardiopulmonary.setVo2Max(23.8);
    	//fev1占预计值百分比
    	exerciseCardiopulmonary.setEfv1Rate(94);
    	//无氧阈
    	exerciseCardiopulmonary.setAt(22);

    	initEntrance();
	}
	
	@Test 
	public void test4(){
       	patient = new Patient();
    	patient.setAge(58);
    	patient.setSickAge(58);
    	patient.setName("刘成龙");
    	patient.setGender("女");
    	patient.setBmi(8.32);
    	patient.setPci(Patient.NO_PCI);
    	patient.setPciType(Patient.URGENT_PCI);
    	patient.setHeight(160);
    	patient.setWeight(60);
    	//Assessment
    	
    	assessment = new Assessment();
    	//焦虑自评 分
    	assessment.setSasScore(48);
    	//抑郁自评 分
    	assessment.setSdsScore(46);
    	//营养评分 分
    	assessment.setMnaScore(10);
    	//衰弱
    	assessment.setFrailScore(1);
    	//跌倒评估
    	assessment.setFallRiskScore(5);
    	//老年抑郁评估
    	assessment.setGdsScore(4);
    	//心功能评级
    	assessment.setNyha(1);
    	//心绞痛分级
    	assessment.setCcs(0);
    	 //呼吸功能
    	assessment.setMrc(0);
    	//认知功能
    	assessment.setMmseScore(33);
    	//日常生活能力评估
    	assessment.setAdlScore(95);
    	//工具性日常生活功能评估
    	assessment.setIadlScore(12);
    	 //仅一次重复所能完成的最大重量单位
    	assessment.setRm(11.5);
    	
    	
    	//other test
    	otherTest = new OtherTest();
    	//心律失常
    	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
    	//心绞痛
    	otherTest.setAngina(OtherTest.NO_OCCER);
    	//心电图缺血改变
    	otherTest.setIschemia(OtherTest.NO_OCCER);
    	//运动当量
    	otherTest.setExerciseEquival(8.0);
    	//心肌钙蛋白浓度
    	otherTest.setCtni(0.12);
    	//劳动强度
    	otherTest.setWorkRank(OtherTest.MEDIUM_WORK);
    	
    	//AccessProblem
    	accessProblem = new AccessProblem();
    	//合并心原性休克
    	accessProblem.setShock(AccessProblem.NO_OCCER);
    	//血管阻塞
    	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
    	//血肿
    	accessProblem.setHematoma(AccessProblem.NO_OCCER);
    	//出血
    	accessProblem.setHemorrhage(AccessProblem.NO_OCCER);
    	//假性动脉瘤
    	accessProblem.setPseudoaneurysm(AccessProblem.NO_OCCER);
    	//动静脉瘘
    	accessProblem.setFistula(AccessProblem.NO_OCCER);
    	//心力衰竭
    	accessProblem.setHeartFailure(AccessProblem.NO_OCCER);
    	
    	//无创心功能
    	noninvasiveCardiac = new NoninvasiveCardiac();
    	noninvasiveCardiac.setEf(60.3);
    	//心率
    	noninvasiveCardiac.setHr(90);
    	
    	
    	//运动心肺
    	exerciseCardiopulmonary = new ExerciseCardiopulmonary();
    	//静息心率
    	exerciseCardiopulmonary.setPeaceRate(90);
    	//峰值心率
    	exerciseCardiopulmonary.setPeakRate(103);
    	//最大摄氧量
    	exerciseCardiopulmonary.setVo2Max(11.9);
    	//fev1占预计值百分比
    	exerciseCardiopulmonary.setEfv1Rate(65);
    	//无氧阈
    	exerciseCardiopulmonary.setAt(18.3);

    	initEntrance();
	}
	private ProcessEntrance initEntrance(){
    	//运动方案
    	exercisePlan = new ExercisePlan();
    	//饮食方案
    	foodPlan = new FoodPlan();
    	//结论
    	conclusion = new Conclusion();
		ProcessEntrance entrance = new ProcessEntrance();
    	entrance.setExercisePlan(exercisePlan);
    	entrance.setPatient(patient);
    	entrance.setNoninvasiveCardiac(noninvasiveCardiac);
    	entrance.setFoodPlan(foodPlan);
    	entrance.setAccessProblem(accessProblem);
    	entrance.setAssessment(assessment);
    	entrance.setOtherTest(otherTest);
    	entrance.setExerciseCardiopulmonary(exerciseCardiopulmonary);
    	entrance.setConclusion(conclusion);
    	
    	entrance.initPlan();
    	entrance.printToDoc();
		return entrance;
	}
}
