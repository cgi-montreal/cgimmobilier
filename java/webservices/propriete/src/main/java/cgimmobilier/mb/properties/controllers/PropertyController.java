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

import cgimmobilier.mb.properties.dto.PropertyDto;
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
	public ResponseEntity<List<PropertyDto>> findAll() {
		
		List<PropertyDto> propertyDtoList = propertyService.findAll();
		
		return new ResponseEntity<List<PropertyDto>>(propertyDtoList, HttpStatus.FOUND);
		
	}
	
	@RequestMapping(value="properties/{id}", method=RequestMethod.GET)
	public ResponseEntity<PropertyDto> findOneById(@PathVariable Integer id) {
		
		PropertyDto propertyDto = propertyService.findOneById(id);
		
		return new ResponseEntity<PropertyDto>(propertyDto, HttpStatus.FOUND);
	}
	
	@RequestMapping(value="/properties", method=RequestMethod.POST)
	public ResponseEntity<PropertyDto> createProperty(@RequestBody Property property) {
		
		PropertyDto propertyDto = this.propertyService.createProperty(property);
		
		return new ResponseEntity<PropertyDto>(propertyDto, HttpStatus.CREATED);
	}
	
	
}
