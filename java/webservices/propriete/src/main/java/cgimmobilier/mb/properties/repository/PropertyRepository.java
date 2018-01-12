package cgimmobilier.mb.properties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cgimmobilier.mb.properties.entities.Property;

/**
 * 
 * @author maxime.buttard
 *
 */
@Repository
public interface PropertyRepository extends JpaRepository<Property, Integer> {
	
	Property findOneById(Integer id);

}
