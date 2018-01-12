package cgimmobilier.mb.properties.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import cgimmobilier.mb.properties.dto.PropertyDto;
import cgimmobilier.mb.properties.entities.Property;

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

}
