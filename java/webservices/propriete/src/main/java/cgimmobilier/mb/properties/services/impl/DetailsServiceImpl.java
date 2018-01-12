package cgimmobilier.mb.properties.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cgimmobilier.mb.properties.entities.Details;
import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.repository.DetailsRepository;
import cgimmobilier.mb.properties.repository.PropertyRepository;
import cgimmobilier.mb.properties.services.DetailsService;

/**
 * 
 * @author maxime.buttard
 *
 */
@Repository
public class DetailsServiceImpl implements DetailsService {

	@Autowired
	private PropertyRepository propertyRepository;
	
	@Autowired
	private DetailsRepository detailsRepository;
	
	@Override
	public Details findOneById(Integer id) {
		return this.detailsRepository.findOneById(id);
	}
	
	@Override
	public Details findOneByPropertyId(Integer propertyId) {
		return this.detailsRepository.findOneByPropertyId(propertyId);
	}

	@Override
	public Details createDetails(Details details, Integer propertyId) {
		
		Property property = this.propertyRepository.findOneById(propertyId);
		
		details.setProperty(property);
		
		return this.detailsRepository.save(details);
	}

}
