package cgimmobilier.mb.properties.services;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.vo.DetailsVo;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface DetailsService {
	
	DetailsDto findOneById(Integer id);
	
	DetailsDto findOneByPropertyId(Integer propertyId);
	
	DetailsDto createDetails(DetailsVo detailsVo);
}
