package cgimmobilier.mb.properties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cgimmobilier.mb.properties.entities.Caracteristiques;

/**
 * 
 * @author maxime.buttard
 *
 */
@Repository
public interface CaracteristiquesRepository extends JpaRepository<Caracteristiques, Integer> {
	
	Caracteristiques findOneById(Integer id);
	
	Caracteristiques findOneByPropertyId(Integer propertyId);

}
