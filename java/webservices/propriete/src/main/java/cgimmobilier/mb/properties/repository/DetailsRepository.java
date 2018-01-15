package cgimmobilier.mb.properties.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cgimmobilier.mb.properties.entities.Details;

/**
 * 
 * @author maxime.buttard
 *
 */
@Repository
public interface DetailsRepository extends JpaRepository<Details, Integer> {
	
	Details findOneById(Integer id);

	Details findOneByPropertyId(Integer propertyId);
	
}
