package cgimmobilier.mb.properties.services;

import cgimmobilier.mb.properties.dto.CaracteristiquesDto;
import cgimmobilier.mb.properties.vo.CaracteristiquesVo;

/**
 * 
 * @author maxime.buttard
 *
 */
public interface CaracteristiquesService {
	
	CaracteristiquesDto findOneById(Integer id);
	
	CaracteristiquesDto findOneByPropertyId(Integer propertyId);
	
	CaracteristiquesDto createCaracteristiques(CaracteristiquesVo caracteristiquesVo);

}
