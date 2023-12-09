package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import org.springframework.graphql.data.method.annotation.Argument;


public interface ICreatorService {
    Creator creatorById(Long id);
    Creator saveCreator( CreatorDto creatorDto);
}
