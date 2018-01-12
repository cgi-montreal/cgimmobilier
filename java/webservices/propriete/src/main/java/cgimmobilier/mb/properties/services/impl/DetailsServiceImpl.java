package cgimmobilier.mb.properties.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;
import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.mappers.DetailsMapper;
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
	
	@Autowired
	private DetailsMapper detailsMapper;
	
	@Override
	public DetailsDto findOneById(Integer id) {
		Details details = this.detailsRepository.findOneById(id);
		
		return this.detailsMapper.mapDetailsToDetailsDto(details);
	}
	
	@Override
	public DetailsDto findOneByPropertyId(Integer propertyId) {
		Details details = this.detailsRepository.findOneByPropertyId(propertyId);
		
		return this.detailsMapper.mapDetailsToDetailsDto(details);
	}

	@Override
	public DetailsDto createDetails(Details details, Integer propertyId) {
		
		Property property = this.propertyRepository.findOneById(propertyId);
		
		details.setProperty(property);
		
		Details detailsCreated = this.detailsRepository.save(details);
		
		return this.detailsMapper.mapDetailsToDetailsDto(detailsCreated);	
		
	}

}
