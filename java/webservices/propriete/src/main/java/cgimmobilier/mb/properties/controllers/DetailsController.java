package cgimmobilier.mb.properties.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;
import cgimmobilier.mb.properties.services.DetailsService;

/**
 * 
 * @author maxime.buttard
 *
 */
@RestController
public class DetailsController {
	
	@Autowired
	private DetailsService detailsService;
	
	@RequestMapping(value="details/{id}", method=RequestMethod.GET)
	public ResponseEntity<DetailsDto> findOneById(@PathVariable Integer id) {
		
		DetailsDto detailsDto = detailsService.findOneById(id);
		
		return new ResponseEntity<DetailsDto>(detailsDto, HttpStatus.FOUND);
		
	}
	
//	public ResponseEntity<Details> createDetails(@RequestBody Details details) {
//		
//		Details detailsCreated = this.detailsService.createDetails(details, propertyId)
//		
//	}
	
	

}
