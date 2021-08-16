package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.pcmarketrestapp.entity.Value;

@RepositoryRestResource(path = "value")
public interface CharacterValueRepository extends JpaRepository<Value,Integer> {
}
