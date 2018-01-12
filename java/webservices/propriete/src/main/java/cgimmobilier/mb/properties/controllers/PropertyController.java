package cgimmobilier.mb.properties.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.services.PropertyService;

/**
 * 
 * @author maxime.buttard
 *
 */
@RestController
public class PropertyController {

	@Autowired
	private PropertyService propertyService;
	
	
	@RequestMapping(value="properties", method=RequestMethod.GET)
	public ResponseEntity<List<Property>> findAll() {
		
		List<Property> properties = propertyService.findAll();
		
		return new ResponseEntity<List<Property>>(properties, HttpStatus.FOUND);
		
	}
	
	@RequestMapping(value="properties/{id}", method=RequestMethod.GET)
	public ResponseEntity<Property> findOneById(@PathVariable Integer id) {
		
		Property property = propertyService.findOneById(id);
		
		return new ResponseEntity<Property>(property, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/properties", method=RequestMethod.POST)
	public ResponseEntity<Property> createProperty(@RequestBody Property property) {
		
		Property propertyCreated = this.propertyService.createProperty(property);
		
		return new ResponseEntity<Property>(propertyCreated, HttpStatus.CREATED);
	}
	
	
}
