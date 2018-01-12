package cgimmobilier.mb.properties.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

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

}
