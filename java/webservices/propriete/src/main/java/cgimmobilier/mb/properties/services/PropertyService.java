package cgimmobilier.mb.properties.services;

import java.util.List;

import cgimmobilier.mb.properties.dto.PropertyDto;
import cgimmobilier.mb.properties.entities.Property;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface PropertyService {
	
	List<PropertyDto> findAll();
	
	PropertyDto findOneById(Integer id);
	
	PropertyDto createProperty(Property property);

}
