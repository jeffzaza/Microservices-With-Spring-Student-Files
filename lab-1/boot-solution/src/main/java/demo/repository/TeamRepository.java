package demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import demo.domain.Team;

//CrudRepository第一個參數決定這個CRUD是針對哪個data type，第二個是參數是PK的型態
@RestResource(path="teams", rel="team")
public interface TeamRepository extends CrudRepository<Team,Long>{

}
