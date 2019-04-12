/**  

* <p>Title: MyDoc.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019��4��12��  

* @version 1.0  

*/  
package com.sample;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

/**  

* <p>Title: MyDoc</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019��4��12��  

*/
public class MyDoc {
    private Configuration configuration = null;  
    
    
    public MyDoc(){  
        configuration = new Configuration();  
        configuration.setDefaultEncoding("UTF-8");  
        //configuration.setEncoding(Locale.getDefault(), "UTF-8");
    }  
      
    public static void main(String[] args) {  
    	MyDoc test = new MyDoc();  
        test.createWord();  
    }  
      
    public void createWord(){  
        Map<String,Object> dataMap=new HashMap<String,Object>();  
        getData(dataMap);  
        configuration.setClassForTemplateLoading(this.getClass(), "");//ģ���ļ�����·��
        Template t=null;  
        try {  
            t = configuration.getTemplate("test.ftl"); //��ȡģ���ļ�
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
        File outFile = new File("D:/outFile"+Math.random()*10000+".doc"); //�����ļ�
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
            t.process(dataMap, out); //�������������ģ���ļ��������Ŀ���ļ� 
        } catch (TemplateException e) {  
            e.printStackTrace();  
        } catch (IOException e) {  
            e.printStackTrace();  
        }  
    }  
  
    private void getData(Map<String, Object> dataMap) {  
        dataMap.put("youyangstrength", "125");  
        dataMap.put("youyangmin", "30");  
        dataMap.put("youyangtime", "3");  
        dataMap.put("zukanggroup", "3");   
        dataMap.put("zukangunit", "5");
        dataMap.put("zukangmuscls", "5-10");   
        dataMap.put("zukangtime", "3");
          
//        List<Map<String,Object>> list = new ArrayList<Map<String,Object>>();  
//        for (int i = 0; i < 10; i++) {  
//            Map<String,Object> map = new HashMap<String,Object>();  
//            map.put("xuehao", i);  
//            map.put("neirong", "����"+i);  
//            list.add(map);  
//        }  
//          
//          
//        dataMap.put("list", list);  
    }  
}