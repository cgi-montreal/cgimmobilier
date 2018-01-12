package cgimmobilier.mb.properties.services;

import java.util.List;

import cgimmobilier.mb.properties.entities.Property;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface PropertyService {
	
	List<Property> findAll();
	
	Property findOneById(Integer id);
	
	Property createProperty(Property property);

}
