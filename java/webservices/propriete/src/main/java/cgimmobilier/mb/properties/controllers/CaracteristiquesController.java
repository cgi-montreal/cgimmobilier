package cgimmobilier.mb.properties.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cgimmobilier.mb.properties.dto.CaracteristiquesDto;
import cgimmobilier.mb.properties.services.CaracteristiquesService;
import cgimmobilier.mb.properties.vo.CaracteristiquesVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@RestController
public class CaracteristiquesController {

	@Autowired
	private CaracteristiquesService caracteristiquesService;
	
	@RequestMapping(value="/caracteristiques/{id}", method=RequestMethod.GET)
	public ResponseEntity<CaracteristiquesDto> findOneById(@PathVariable Integer id) {
		
		CaracteristiquesDto caracteristiquesDto = caracteristiquesService.findOneById(id);
		
		return new ResponseEntity<CaracteristiquesDto>(caracteristiquesDto, HttpStatus.FOUND);
		
	}
	
	@RequestMapping(value="/caracteristiques", method=RequestMethod.POST)
	public ResponseEntity<CaracteristiquesDto> createCaracteristiques(@RequestBody CaracteristiquesVo caracteristiquesVo) {
		
		CaracteristiquesDto caracteristiquesCreated = this.caracteristiquesService.createCaracteristiques(caracteristiquesVo);
		
		return new ResponseEntity<CaracteristiquesDto>(caracteristiquesCreated, HttpStatus.CREATED);
		
	}
	
}
