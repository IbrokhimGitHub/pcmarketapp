package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.pcmarketrestapp.entity.CharacterKey;
import uz.pdp.pcmarketrestapp.entity.CharacterValue;

@RepositoryRestResource(path = "value")
public interface CharacterValueRepository extends JpaRepository<CharacterValue,Integer> {
}
