package mark.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import mark.models.User;

@RepositoryRestResource
public interface UserRepo extends JpaRepository<User, Long>{

}
