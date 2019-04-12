/**  

* <p>Title: ProcessEntrance.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

* @version 1.0  

*/  
package drools;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**  

* <p>Title: ProcessEntrance</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年3月27日  

*/
public class ProcessEntrance {
    private Configuration configuration = null;
    private ExercisePlan exercisePlan = null;
    
	/**
	 * @param 
	 */
	public ProcessEntrance() {
        configuration = new Configuration();  
        configuration.setDefaultEncoding("UTF-8"); 
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProcessEntrance entrance = new ProcessEntrance();
		entrance.initPlan();
		//entrance.printToDoc();

	}
	/**
	 * 输出到文档
	 */
	public void printToDoc(){
        Map<String,Object> dataMap=new HashMap<String,Object>();  
        getData(dataMap);  
        configuration.setClassForTemplateLoading(this.getClass(), "");//模板文件所在路径
        Template t=null;  
        try {  
            t = configuration.getTemplate("ExerciseTest.ftl"); //获取模板文件
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        File outFile = new File("D:/outFile"+Math.random()*10000+".doc"); //导出文件
        Writer out = null;  
        try {  
            //out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outFile)));  
            FileOutputStream fos = new FileOutputStream(outFile);
            OutputStreamWriter oWriter = new OutputStreamWriter(fos,"UTF-8");
            out = new BufferedWriter(oWriter);
        } catch (FileNotFoundException e1) {  
            e1.printStackTrace();  
        } catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
           
        try {  
            t.process(dataMap, out); //将填充数据填入模板文件并输出到目标文件 
        } catch (TemplateException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }
	}
	/**
	 * 数据封装
	 * @param dataMap
	 */
    private void getData(Map<String, Object> dataMap) { 
        dataMap.put("youyangstrength", exercisePlan.getStrenghVo2());  
        dataMap.put("youyangmin", exercisePlan.getOxyDuration().get(0));  
        dataMap.put("youyangtime", exercisePlan.getOxyTimes().get(0));  
        dataMap.put("zukanggroup", exercisePlan.getImSingleTime().get(0));   
        dataMap.put("zukangunit", exercisePlan.getImSingleGroup().get(0));
        dataMap.put("zukangmuscls", 2222);   
        dataMap.put("zukangtime", exercisePlan.getImSingleWeek().get(0));
        if (exercisePlan.getStrenghVo2() != -1) {
        	dataMap.put("youyangstrength", "运动强度为"+exercisePlan.getStrenghVo2()+"vo2/kg");
		}
        //劳累程度
        dataMap.put("oxyrpe", assemleData(exercisePlan.getOxyRpe()));
        //有氧运动时长
        dataMap.put("youyangmin", assemleData(exercisePlan.getOxyDuration()));
        //有氧运动频率
        dataMap.put("youyangtime", assemleData(exercisePlan.getOxyTimes()));
        //阻抗训练上肢强度
        dataMap.put("zukangstrenup", assemleData(exercisePlan.getUpImStrength()));
        //阻抗训练下肢强度
        dataMap.put("zukangstrendn", assemleData(exercisePlan.getDownImStrength()));
        //阻抗训练疲劳程度
        dataMap.put("imrpe", assemleData(exercisePlan.getImRpe()));
        //阻抗训练训练组数
        dataMap.put("zukanggroup", assemleData(exercisePlan.getImSingleTime()));
        //阻抗训练每组单元数
        dataMap.put("zukangunit", assemleData(exercisePlan.getImSingleGroup()));
        //阻抗训练每单元肌群数
        dataMap.put("zukangmuscls", assemleData(exercisePlan.getImMuscles()));
        //阻抗训练频率
        dataMap.put("zukangtime", assemleData(exercisePlan.getImSingleWeek()));
        //柔韧训练初始秒数
        dataMap.put("rourenpre", assemleData(exercisePlan.getFlexDuration()));
        //柔韧训练目标秒数
        dataMap.put("rourentarget", assemleData(exercisePlan.getFlexTargetDuration()));
        //柔韧训练时长
        dataMap.put("rourentotal", assemleData(exercisePlan.getFlexTotalDuration()));
        //柔韧训练频率
        dataMap.put("rourentime", assemleData(exercisePlan.getFlexSingleWeek()));
//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();  
//        for (int i = 0; i < 10; i++) {  
//            Map<String,Object> map = new HashMap<String,Object>();  
//            map.put("xuehao", i);  
//            map.put("neirong", "内容"+i);  
//            list.add(map);  
//        }  
//          
//          
//        dataMap.put("list", list);  
    }
    
    private String assemleData(List<Double> list){
        if (list != null && list.size() > 1) {
        	if (Math.abs(list.get(0) - list.get(1)) < 0.00001) {
        		if (list.get(0) - list.get(0).intValue() > 0.1) {
        			return ""+list.get(0);
				}else {
					return ""+list.get(0).intValue();
				}
        		
			}else {
        		if (list.get(0) - list.get(0).intValue() > 0.1 || list.get(1) - list.get(1).intValue() > 0.1) {
        			return list.get(0)+ "~" + list.get(1);
				}else {
					return list.get(0).intValue()+ "~" + list.get(1).intValue();
				}
				
			}
		}
    	return "";
    }
    
    /**
     * 规则匹配
     */
	public void initPlan(){
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
        	patient.setHeight(170);
        	patient.setWeight(70);
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
        	exercisePlan = new ExercisePlan();
        	kSession.insert(exercisePlan);
        	kSession.insert(exerciseCardiopulmonary);
        	kSession.insert(noninvasiveCardiac);
        	kSession.insert(accessProblem);
        	kSession.insert(otherTest);
        	kSession.insert(assessment);
            kSession.insert(patient);
            int i = kSession.fireAllRules();
       
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
            System.out.println(exercisePlan.toString());
            
//            int j = kSession.fireAllRules();
//            System.out.println(i+"....."+ j);
            
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}

}
