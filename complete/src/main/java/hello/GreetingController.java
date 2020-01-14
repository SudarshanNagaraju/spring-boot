package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.dto.PersonDTO;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping(value = "/greeting",method = RequestMethod.POST)
    public String greeting(@RequestParam(value="featureId", defaultValue="World") String featureId, @RequestBody PersonDTO person) {
    	
    	
    	System.out.println("First Request reached Feature Name:"+featureId);
    	System.out.println("First Request reached here:"+person.toString());
    	System.out.println("FirstName"+person.getFirstName());
    	System.out.println("Inner Json"+person.getInnerJson());
    	
    	System.out.println("Inner Json"+person.getInnerJson());
    	
    	/*System.out.println("Calling Circle ");
    	
    	CircleDAO dao=new CircleDAO();
    	
    	CircleMaster circle=new CircleMaster();
    	
    	 circle=dao.getCircleById(1);
    	
    	
    	System.out.println("circle Name"+circle.getNAME());
    	System.out.println("circle Name"+circle.getDESCRIPTION());
    	*/
    	
    	return (String) person.getFirstName();
    	
        /*return new Greeting(counter.incrementAndGet(),
                            String.format(template, person.getFirstName()));*/
    }
}
