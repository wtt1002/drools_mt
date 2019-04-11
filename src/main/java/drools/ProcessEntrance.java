/**  

* <p>Title: ProcessEntrance.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package drools;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.kie.api.KieServices;
import org.kie.api.cdi.KSession;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import entity.AccessProblem;
import entity.Assessment;
import entity.ExerciseCardiopulmonary;
import entity.ExercisePlan;
import entity.NoninvasiveCardiac;
import entity.OtherTest;
import entity.Patient;

/**  

* <p>Title: ProcessEntrance</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class ProcessEntrance {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
	        KieServices ks = KieServices.Factory.get();
    	    KieContainer kContainer = ks.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");
        	
        	//test demo
        	List<String> highList = new ArrayList<>();
        	List<String> midList = new ArrayList<>();
        	kSession.setGlobal("highList", highList);
        	kSession.setGlobal("midList", midList);
        	//patient
        	Patient patient = new Patient();
        	patient.setAge(45);
        	patient.setName("王婷婷");
        	patient.setGender("女");
        	patient.setBmi(8.32);
        	patient.setPci(Patient.HAS_PCI);
        	patient.setPciType(Patient.ELECTIVE_PCI);
        	//Assessment
        	Assessment assessment = new Assessment();
        	assessment.setSasScore(80);
        	assessment.setSdsScore(44);
        	assessment.setMnaScore(13);
        	assessment.setFrailScore(0);
        	assessment.setFallRiskScore(5);
        	assessment.setGdsScore(4);
        	assessment.setNyha(1);
        	assessment.setCcs(1);
        	assessment.setMrc(0);
        	assessment.setMmseScore(29);
        	assessment.setAdlScore(95);
        	assessment.setIadlScore(15);
        	assessment.setRm(8);
        	//other test
        	OtherTest otherTest = new OtherTest();
        	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
        	otherTest.setAngina(OtherTest.NO_OCCER);
        	otherTest.setIschemia(OtherTest.NO_OCCER);
        	otherTest.setExerciseEquival(6.0);
        	otherTest.setCtni(0.11);
        	//accessProblem
        	AccessProblem accessProblem = new AccessProblem();
        	accessProblem.setShock(AccessProblem.NO_OCCER);
        	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
//        	accessProblem.setShock(AccessProblem.OCCER);
        	//无创心功能
        	NoninvasiveCardiac noninvasiveCardiac = new NoninvasiveCardiac();
        	noninvasiveCardiac.setEf(58.3);
        	noninvasiveCardiac.setHr(110);
        	//运动心肺
        	ExerciseCardiopulmonary exerciseCardiopulmonary = new ExerciseCardiopulmonary();
        	//exerciseCardiopulmonary.setPeaceRate(104);
        	exerciseCardiopulmonary.setPeakRate(122);
        	exerciseCardiopulmonary.setVo2Max(23.6);
        	exerciseCardiopulmonary.setEfv1Rate(87);
        	exerciseCardiopulmonary.setAt(18);
        	//exerciseCardiopulmonary.setPeakVo2(22.2);
        	//exerciseCardiopulmonary.setTargetRate(targetRate);
        	//运动方案
        	ExercisePlan exercisePlan = new ExercisePlan();
        	kSession.insert(exercisePlan);
        	kSession.insert(exerciseCardiopulmonary);
        	kSession.insert(noninvasiveCardiac);
        	kSession.insert(accessProblem);
        	kSession.insert(otherTest);
        	kSession.insert(assessment);
            kSession.insert(patient);
            int i = kSession.fireAllRules();
//            List<String> midArr = (List<String>)patient.getHighList();
//            for (String string : midArr) {
//				System.out.println("333"+string);
//			}
//            
            List<String> highArr = patient.getHighList();
            System.out.println(highArr.size()+ "条数据");
            if (highArr.size() > 0) {
				patient.setRiskRank(Patient.HIGHRISK);
				for(int k = 0; k < highArr.size(); k++){
					System.out.println("==="+highArr.get(k));
				}
			}
            
            List<String> midArr = patient.getMidList();
            System.out.println(midArr.size()+ "条数据");
            if (midArr.size() > 0) {
				patient.setRiskRank(Patient.HIGHRISK);
				for(int k = 0; k < midArr.size(); k++){
					System.out.println("==="+midArr.get(k));
				}
			}
            
//            int j = kSession.fireAllRules();
//            System.out.println(i+"....."+ j);
            
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}

}
