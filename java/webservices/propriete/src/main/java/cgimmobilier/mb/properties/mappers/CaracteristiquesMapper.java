package cgimmobilier.mb.properties.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import cgimmobilier.mb.properties.dto.CaracteristiquesDto;
import cgimmobilier.mb.properties.entities.Caracteristiques;
import cgimmobilier.mb.properties.vo.CaracteristiquesVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@Mapper(componentModel = "spring", uses = { PropertyMapper.class })
public interface CaracteristiquesMapper {
	
	@Mapping(target = "propertyId", source = "property.id")
	CaracteristiquesDto mapCaracteristiquesToCaracteristiquesDto(Caracteristiques caracteristiques);
	
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "property", ignore = true)
	})
	Caracteristiques mapCaracteristiquesVoToCaracteristiques(CaracteristiquesVo caracteristiquesVo);

}
