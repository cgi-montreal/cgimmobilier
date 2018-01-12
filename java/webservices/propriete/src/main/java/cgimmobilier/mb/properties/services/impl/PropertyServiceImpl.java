package cgimmobilier.mb.properties.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgimmobilier.mb.properties.dto.PropertyDto;
import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.mappers.PropertyMapper;
import cgimmobilier.mb.properties.repository.PropertyRepository;
import cgimmobilier.mb.properties.services.PropertyService;

/**
 * 
 * @author maxime.buttard
 *
 */

@Service
public class PropertyServiceImpl implements PropertyService {

	@Autowired
	private PropertyRepository propertyRepository;
	
	@Autowired
	private PropertyMapper propertyMapper;
	
	@Override
	public List<PropertyDto> findAll() {

		List<Property> propertyList = this.propertyRepository.findAll();
		
		return this.propertyMapper.mapPropertyListToPropertyDtoList(propertyList);
	}

	@Override
	public PropertyDto findOneById(Integer id) {
		
		Property property = this.propertyRepository.findOneById(id);
		
		return this.propertyMapper.mapPropertyToPropertyDto(property);
	}

	@Override
	public PropertyDto createProperty(Property property) {
		
		Property propertyCreated = this.propertyRepository.save(property); 
		
		return this.propertyMapper.mapPropertyToPropertyDto(propertyCreated);
	}

}
