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
