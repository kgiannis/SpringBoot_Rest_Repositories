package yk.tut.Rest_Repositories.person;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * 
 * @author Karavasilis Ioannis
 *
 */
@RepositoryRestResource(collectionResourceRel="person", path="person")
public interface PersonRepository extends JpaRepository<Person, Long> {

	public Optional<Person> findById(@Param("id") Long id);
	public List<Person> findAll();
}
