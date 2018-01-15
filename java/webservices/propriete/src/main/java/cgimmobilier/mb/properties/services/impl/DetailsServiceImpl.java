package cgimmobilier.mb.properties.services.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;
import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.mappers.DetailsMapper;
import cgimmobilier.mb.properties.repository.DetailsRepository;
import cgimmobilier.mb.properties.repository.PropertyRepository;
import cgimmobilier.mb.properties.services.DetailsService;
import cgimmobilier.mb.properties.vo.DetailsVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@Service
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
	public DetailsDto createDetails(DetailsVo detailsVo) {
		
		Property property = this.propertyRepository.findOneById(detailsVo.getPropertyId());
		
		Details details = this.detailsMapper.mapDetailsVoToDetails(detailsVo);
		
		details.setProperty(property);
		
		Details detailsCreated = this.detailsRepository.save(details);
		
		return this.detailsMapper.mapDetailsToDetailsDto(detailsCreated);	
		
	}

}
