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
        	patient.setAge(65);
        	patient.setName("王婷婷");
        	patient.setGender("女");
        	patient.setBmi(8.32);
        	patient.setPci(Patient.NO_PCI);
        	//Assessment
        	Assessment assessment = new Assessment();
        	assessment.setSasScore(70);
        	assessment.setSdsScore(63);
        	//other test
        	OtherTest otherTest = new OtherTest();
        	otherTest.setIsArrhythmia(OtherTest.NO_OCCER);
        	otherTest.setAngina(OtherTest.NO_OCCER);
        	otherTest.setIschemia(OtherTest.NO_OCCER);
        	otherTest.setExerciseEquival(6.0);
        	//accessProblem
        	AccessProblem accessProblem = new AccessProblem();
        	accessProblem.setShock(AccessProblem.NO_OCCER);
        	accessProblem.setVascularObstruction(AccessProblem.NO_OCCER);
//        	accessProblem.setShock(AccessProblem.OCCER);
        	//无创心功能
        	NoninvasiveCardiac noninvasiveCardiac = new NoninvasiveCardiac();
        	noninvasiveCardiac.setEf(58.3);
        	
        	//
        	ExercisePlan exercisePlan = new ExercisePlan();
        	
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
            kSession.insert(exercisePlan);
            int j = kSession.fireAllRules();
            System.out.println(i+"....."+ j);
            
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}

}
