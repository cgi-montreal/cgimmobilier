package cgimmobilier.mb.properties.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgimmobilier.mb.properties.entities.Property;
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
	
	@Override
	public List<Property> findAll() {
		return this.propertyRepository.findAll();
	}

	@Override
	public Property findOneById(Integer id) {
		return this.propertyRepository.findOneById(id);
	}

	@Override
	public Property createProperty(Property property) {
		return this.propertyRepository.save(property);
	}

}
