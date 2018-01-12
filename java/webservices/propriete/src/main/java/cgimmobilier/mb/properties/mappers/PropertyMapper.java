package cgimmobilier.mb.properties.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import cgimmobilier.mb.properties.dto.PropertyDto;
import cgimmobilier.mb.properties.entities.Property;
import vo.PropertyVo;

/**
 * 
 * @author maxime.buttard
 *
 */
@Mapper(componentModel = "spring", uses = { DetailsMapper.class })
public interface PropertyMapper {
	
	@Mapping(target = "detailsDTO", source = "details")
	PropertyDto mapPropertyToPropertyDto(Property property);
	
	List<PropertyDto> mapPropertyListToPropertyDtoList(List<Property> propertyList);
	
	@Mappings({
		@Mapping(target = "id", ignore = true),
		@Mapping(target = "details", ignore = true)
	})
	Property mapPropertyVoToProperty(PropertyVo propertyVo);

}
