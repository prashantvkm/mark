package mark.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mark.models.User;
import mark.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> findAll(){
		return userRepo.findAll();
	}
	
	public User save(User user){
		return userRepo.save(user);
	}

}
