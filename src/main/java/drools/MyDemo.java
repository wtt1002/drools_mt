/**  

* <p>Title: MyDemo.java</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

* @version 1.0  

*/  
package drools;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import entity.Ball;

/**  

* <p>Title: MyDemo</p>  

* <p>Description: </p>  

* @author TingTing W  

* @date 2019年4月2日  

*/
public class MyDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        KieServices ks = KieServices.Factory.get();
	    KieContainer kContainer = ks.getKieClasspathContainer();
    	KieSession kSession = kContainer.newKieSession("ksession-rules");
    	Ball ball = new Ball();
    	ball.a = 0;   
    	ball.b = 0;
    	ball.c = 1;
    	kSession.insert(ball);
    	kSession.fireAllRules();
	}
}
