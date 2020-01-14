package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import beans.CircleMaster;

@RestController
@RequestMapping(value="/rest/users",method = RequestMethod.GET)
public class UserResource {
	
	@Autowired
	UsersRepository usersrepo;
	
	
	
	
		
	@GetMapping("/all")
	public List<CircleMaster> getAll(){
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Inside Get ALL method>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		return usersrepo.findAll();
	}

}
