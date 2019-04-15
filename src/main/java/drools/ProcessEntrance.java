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
import entity.Conclusion;
import entity.ExerciseCardiopulmonary;
import entity.ExercisePlan;
import entity.FoodPlan;
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
    private Patient patient = null;
    private NoninvasiveCardiac noninvasiveCardiac = null;
    private FoodPlan foodPlan = null;
    private AccessProblem accessProblem = null;
    private Assessment assessment = null;
    private OtherTest otherTest = null;
    private ExerciseCardiopulmonary exerciseCardiopulmonary = null;
    private Conclusion conclusion = null;
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
		entrance.printToDoc();

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
            t = configuration.getTemplate("all2.ftl"); //获取模板文件
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
    	System.out.println(exercisePlan.getOxyStrength().toString());
        if (exercisePlan.getStrenghVo2() > 0) {
        	dataMap.put("youyangstrength", "运动摄氧量为"+String.format("%.2f", exercisePlan.getStrenghVo2())+"vo2/kg");
		}else if (exercisePlan.getOxyStrength().size() > 1) {
			dataMap.put("youyangstrength", "运动心率控制在"+assemleData(exercisePlan.getOxyStrength()) + "bpm之间");
		}else if (exercisePlan.getStrength() > 0) {
			dataMap.put("youyangstrength", "运动心率控制在"+exercisePlan.getStrength() + "bpm左右");
		}else {
			dataMap.put("youyangstrength", "运动心率控制在比静息心率高20~30bpm");
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
        
        //患者信息
        dataMap.put("name", patient.getName());
        dataMap.put("gender", patient.getGender());
        dataMap.put("age", patient.getAge());
        dataMap.put("sickAge", patient.getSickAge());
        dataMap.put("height", patient.getHeight());
        dataMap.put("weight", patient.getWeight());
        //dataMap.put("patientType", "我没有测试");
        if (patient.getPatientType() == Patient.ORDINARY_PATIENT) {
        	dataMap.put("patientType", "普通冠心病患者");
		}else if (patient.getPatientType() == Patient.PCI_PATIENT) {
			dataMap.put("patientType", "近期PCI冠心病患者");
			dataMap.put("otherInfo", "近期进行急诊PCI的冠心病患者，进行阻抗训练的时机应在PCI手术三周之后，且应在连续2周有医学监护的有氧训练之后。");
		}else if (patient.getPatientType() == Patient.OLD_PATIENT) {
			dataMap.put("patientType", "高龄冠心病患者");
		}else {
			dataMap.put("patientType", "未定");
		}
        
        //心率
        dataMap.put("heartRate", noninvasiveCardiac.getHr());
        
        //基本分析结果
        dataMap.put("highRisk", patient.getHighList().toString());
        dataMap.put("midRisk", patient.getMidList().toString());
        //dataMap.put("otherRisk", patient.getHighList().toString());
        
        //饮食
        //淀粉
        if (foodPlan.getStarch().size() == 4) {
			dataMap.put("dianfen0", (double)foodPlan.getStarch().get(0)/2);
			dataMap.put("dianfen1", (double)foodPlan.getStarch().get(1)/2);
			dataMap.put("dianfen2", (double)foodPlan.getStarch().get(2)/2);
			dataMap.put("dianfen3", (double)foodPlan.getStarch().get(3)/2);
		}
        //谷薯
        if (foodPlan.getGrain().size() == 4) {
			dataMap.put("gushu0", (double)foodPlan.getGrain().get(0)/2);
			dataMap.put("gushu1", (double)foodPlan.getGrain().get(1)/2);
			dataMap.put("gushu2", (double)foodPlan.getGrain().get(2)/2);
			dataMap.put("gushu3", (double)foodPlan.getGrain().get(3)/2);
		}
        //蔬菜
        if (foodPlan.getVegetable().size() == 4) {
			dataMap.put("shucai0", (double)foodPlan.getVegetable().get(0)/2);
			dataMap.put("shucai1", (double)foodPlan.getVegetable().get(1)/2);
			dataMap.put("shucai2", (double)foodPlan.getVegetable().get(2)/2);
			dataMap.put("shucai3", (double)foodPlan.getVegetable().get(3)/2);
		}
        //水果
        if (foodPlan.getFruit().size() == 4) {
			dataMap.put("shuiguo0", (double)foodPlan.getFruit().get(0)/2);
			dataMap.put("shuiguo1", (double)foodPlan.getFruit().get(1)/2);
			dataMap.put("shuiguo2", (double)foodPlan.getFruit().get(2)/2);
			dataMap.put("shuiguo3", (double)foodPlan.getFruit().get(3)/2);
		}
        //肉蛋
        if (foodPlan.getProtein().size() == 4) {
			dataMap.put("roudan0", (double)foodPlan.getProtein().get(0)/2);
			dataMap.put("roudan1", (double)foodPlan.getProtein().get(1)/2);
			dataMap.put("roudan2", (double)foodPlan.getProtein().get(2)/2);
			dataMap.put("roudan3", (double)foodPlan.getProtein().get(3)/2);
		}
        //油脂
        if (foodPlan.getOil().size() == 4) {
			dataMap.put("youzhi0", (double)foodPlan.getOil().get(0)/2);
			dataMap.put("youzhi1", (double)foodPlan.getOil().get(1)/2);
			dataMap.put("youzhi2", (double)foodPlan.getOil().get(2)/2);
			dataMap.put("youzhi3", (double)foodPlan.getOil().get(3)/2);
		}
    }
    /**
     * 范围数据整理
     * @param list
     * @return
     */
    private String assemleData(List<Double> list){
        if (list != null && list.size() > 1) {
        	if (Math.abs(list.get(0) - list.get(1)) < 0.00001) {
        		if (list.get(0) - list.get(0).intValue() > 0.1) {
        			return String.format("%.2f", list.get(0));
				}else {
					return ""+list.get(0).intValue();
				}
        		
			}else {
        		if (list.get(0) - list.get(0).intValue() > 0.1 || list.get(1) - list.get(1).intValue() > 0.1) {
        			return String.format("%.2f", list.get(0))+ "~" + String.format("%.2f", list.get(1));
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
        	
        	kSession.insert(foodPlan);
        	kSession.insert(conclusion);
        	kSession.insert(exercisePlan);
        	kSession.insert(exerciseCardiopulmonary);
        	kSession.insert(noninvasiveCardiac);
        	kSession.insert(accessProblem);
        	kSession.insert(otherTest);
        	kSession.insert(assessment);
            kSession.insert(patient);
            
            int i = kSession.fireAllRules();
       
            System.out.println(exercisePlan.toString());
            
		} catch (Exception e) {
			// TODO: handle exception
			 e.printStackTrace();
		}
	}
	/**
	 * @return the configuration
	 */
	public Configuration getConfiguration() {
		return configuration;
	}
	/**
	 * @param configuration the configuration to set
	 */
	public void setConfiguration(Configuration configuration) {
		this.configuration = configuration;
	}
	/**
	 * @return the exercisePlan
	 */
	public ExercisePlan getExercisePlan() {
		return exercisePlan;
	}
	/**
	 * @param exercisePlan the exercisePlan to set
	 */
	public void setExercisePlan(ExercisePlan exercisePlan) {
		this.exercisePlan = exercisePlan;
	}
	/**
	 * @return the patient
	 */
	public Patient getPatient() {
		return patient;
	}
	/**
	 * @param patient the patient to set
	 */
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	/**
	 * @return the noninvasiveCardiac
	 */
	public NoninvasiveCardiac getNoninvasiveCardiac() {
		return noninvasiveCardiac;
	}
	/**
	 * @param noninvasiveCardiac the noninvasiveCardiac to set
	 */
	public void setNoninvasiveCardiac(NoninvasiveCardiac noninvasiveCardiac) {
		this.noninvasiveCardiac = noninvasiveCardiac;
	}
	/**
	 * @return the foodPlan
	 */
	public FoodPlan getFoodPlan() {
		return foodPlan;
	}
	/**
	 * @param foodPlan the foodPlan to set
	 */
	public void setFoodPlan(FoodPlan foodPlan) {
		this.foodPlan = foodPlan;
	}
	/**
	 * @return the accessProblem
	 */
	public AccessProblem getAccessProblem() {
		return accessProblem;
	}
	/**
	 * @param accessProblem the accessProblem to set
	 */
	public void setAccessProblem(AccessProblem accessProblem) {
		this.accessProblem = accessProblem;
	}
	/**
	 * @return the assessment
	 */
	public Assessment getAssessment() {
		return assessment;
	}
	/**
	 * @param assessment the assessment to set
	 */
	public void setAssessment(Assessment assessment) {
		this.assessment = assessment;
	}
	/**
	 * @return the otherTest
	 */
	public OtherTest getOtherTest() {
		return otherTest;
	}
	/**
	 * @param otherTest the otherTest to set
	 */
	public void setOtherTest(OtherTest otherTest) {
		this.otherTest = otherTest;
	}
	/**
	 * @return the exerciseCardiopulmonary
	 */
	public ExerciseCardiopulmonary getExerciseCardiopulmonary() {
		return exerciseCardiopulmonary;
	}
	/**
	 * @param exerciseCardiopulmonary the exerciseCardiopulmonary to set
	 */
	public void setExerciseCardiopulmonary(ExerciseCardiopulmonary exerciseCardiopulmonary) {
		this.exerciseCardiopulmonary = exerciseCardiopulmonary;
	}
	/**
	 * @return the conclusion
	 */
	public Conclusion getConclusion() {
		return conclusion;
	}
	/**
	 * @param conclusion the conclusion to set
	 */
	public void setConclusion(Conclusion conclusion) {
		this.conclusion = conclusion;
	}
	
}
