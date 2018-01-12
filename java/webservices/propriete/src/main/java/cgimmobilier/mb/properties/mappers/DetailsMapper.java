package cgimmobilier.mb.properties.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;

/**
 * 
 * @author maxime.buttard
 *
 */
@Mapper(componentModel = "spring", uses = { PropertyMapper.class })
public interface DetailsMapper {

	@Mapping(target = "propertyId", source = "property.id")
	DetailsDto mapDetailsToDetailsDto(Details details);
	
}
