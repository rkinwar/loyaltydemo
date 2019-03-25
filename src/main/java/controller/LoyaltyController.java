package controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import model.Shopper;
import repo.ShopperRepository;
import java.net.InetAddress;
import java.net.UnknownHostException;

/*
 * This is a simple controller to find, save and retrieve shoppers
 */



@RestController
@RequestMapping("/shopper")
public class LoyaltyController {
	
	@Autowired
	public LoyaltyController(ShopperRepository shopperRepository) {
		super();
		this.shopperRepository = shopperRepository;
	}

	private static final Logger log = LoggerFactory.getLogger(LoyaltyController.class);
	private ShopperRepository shopperRepository;	
	
	@RequestMapping(method=RequestMethod.GET)
	public @ResponseBody String replySameText(@RequestParam(value = "nickName") String name) throws UnknownHostException {		
			        return "Hello! Welcome to Spring Boot Sample. " + name.toUpperCase() + "from " + InetAddress.getLocalHost().getHostAddress();		
    }	
	
	@RequestMapping(method=RequestMethod.POST, value = "/persist")
	public @ResponseBody String myFirstMilestone(@RequestParam(value = "firstName") String name,@RequestParam(value = "lastName") String lname,@RequestParam(value = "age") int age) {	
		
		Shopper shopper = new Shopper();
		shopper.setAge(age);
		shopper.setFirstName(name);
		shopper.setLastName(lname);
		shopperRepository.save(shopper);		
		
		return "Hello Welcome to the shopping " + shopper.getFirstName();		
    }
	
	@RequestMapping(value = { "/hello**" }, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.addObject("title", "Spring Security Example");
        model.addObject("message", "This is Hello World!");
        model.setViewName("hello");
        System.out.println("° ° ° ° welcomePage running. model = " + model);
        return model;
	}
	
}
