package uz.pdp.pcmarketrestapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import uz.pdp.pcmarketrestapp.entity.Key;

@RepositoryRestResource(path = "key")
public interface CharacterKeyRepository extends JpaRepository<Key,Integer> {
}
