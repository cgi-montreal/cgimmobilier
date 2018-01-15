package cgimmobilier.mb.properties.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import cgimmobilier.mb.properties.dto.DetailsDto;
import cgimmobilier.mb.properties.entities.Details;
import cgimmobilier.mb.properties.vo.DetailsVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@Mapper(componentModel = "spring", uses = { PropertyMapper.class })
public interface DetailsMapper {

	@Mapping(target = "propertyId", source = "property.id")
	DetailsDto mapDetailsToDetailsDto(Details details);
	
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "property", ignore = true)
	})
	Details mapDetailsVoToDetails(DetailsVo detailsVo);
}
