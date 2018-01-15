package cgimmobilier.mb.properties.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cgimmobilier.mb.properties.dto.CaracteristiquesDto;
import cgimmobilier.mb.properties.entities.Caracteristiques;
import cgimmobilier.mb.properties.entities.Property;
import cgimmobilier.mb.properties.mappers.CaracteristiquesMapper;
import cgimmobilier.mb.properties.repository.CaracteristiquesRepository;
import cgimmobilier.mb.properties.repository.PropertyRepository;
import cgimmobilier.mb.properties.services.CaracteristiquesService;
import cgimmobilier.mb.properties.vo.CaracteristiquesVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@Service
public class CaracteristiquesServiceImpl implements CaracteristiquesService {
	
	@Autowired
	private CaracteristiquesRepository caracteristiquesRepository;
	
	@Autowired
	private PropertyRepository propertyRepository;
	
	@Autowired
	private CaracteristiquesMapper caracteristiquesMapper;

	@Override
	public CaracteristiquesDto findOneById(Integer id) {

		Caracteristiques caracteristiques = this.caracteristiquesRepository.findOneById(id);
		
		return this.caracteristiquesMapper.mapCaracteristiquesToCaracteristiquesDto(caracteristiques);
	}

	@Override
	public CaracteristiquesDto findOneByPropertyId(Integer propertyId) {

		Caracteristiques caracteristiques = this.caracteristiquesRepository.findOneByPropertyId(propertyId);
		
		return this.caracteristiquesMapper.mapCaracteristiquesToCaracteristiquesDto(caracteristiques);
	}

	@Override
	public CaracteristiquesDto createCaracteristiques(CaracteristiquesVo caracteristiquesVo) {
		
		Property property = this.propertyRepository.findOneById(caracteristiquesVo.getPropertyId());
		
		Caracteristiques caracteristiques = this.caracteristiquesMapper.mapCaracteristiquesVoToCaracteristiques(caracteristiquesVo);
		
		caracteristiques.setProperty(property);
		
		Caracteristiques caracteristiquesCreated = this.caracteristiquesRepository.save(caracteristiques);
		
		return this.caracteristiquesMapper.mapCaracteristiquesToCaracteristiquesDto(caracteristiquesCreated);
	}

}
