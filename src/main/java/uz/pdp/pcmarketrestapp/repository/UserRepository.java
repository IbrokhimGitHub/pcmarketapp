package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.User;


@RepositoryRestResource(path = "user")
public interface UserRepository extends JpaRepository<User,Integer> {
}
