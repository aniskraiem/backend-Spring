package tn.esprit.spring.repository;

import org.springframework.stereotype.Repository;

import tn.esprit.spring.entity.Rayon;

import org.springframework.data.repository.CrudRepository;
@Repository
public interface RayonRepository extends CrudRepository<Rayon,Long>{

}
