package mark.controllers;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mark.models.User;
import mark.services.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userServices;
	
	@GetMapping("/users")
	public List<User> findAll(){
		return userServices.findAll();
	}
	
	@PostMapping("/user/save")
	public ResponseEntity<User> save(@Valid @RequestBody User user) throws URISyntaxException {
		System.out.println(user.toString());
		User result = userServices.save(user);
		return ResponseEntity
				.created(new URI("/user/save" + result.getId()))
                .body(result);
	}

}
