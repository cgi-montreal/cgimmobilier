package cgimmobilier.mb.properties.services;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface DetailsService {
	
	DetailsDto findOneById(Integer id);
	
	DetailsDto findOneByPropertyId(Integer propertyId);
	
	DetailsDto createDetails(Details details, Integer propertyId);
}
