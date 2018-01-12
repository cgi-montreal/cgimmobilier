package cgimmobilier.mb.properties.services;

import cgimmobilier.mb.properties.entities.Details;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface DetailsService {
	
	Details findOneById(Integer id);
	
	Details findOneByPropertyId(Integer propertyId);
	
	Details createDetails(Details details, Integer propertyId);
}
