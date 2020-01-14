package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Application {
//public class Application {
	
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
    
  /* @Override
    public void run(String... args) throws Exception {
    	
    	System.out.println("Calling circle update");
    	
    	CircleMaster circle=getCircle();
    	System.out.println("Return ID"+cir.getCircleById(circle));
    }
    
    
    private CircleMaster getCircle() {
    	CircleMaster circle=new CircleMaster();
    	circle.setDESCRIPTION("OLA");
        circle.setNAME("MO");
        
        return circle;
    }*/
}
