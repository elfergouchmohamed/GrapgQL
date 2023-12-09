package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import ma.xproce.inventoryservice.mapper.CreatorMapper;
import ma.xproce.inventoryservice.mapper.VideoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreatorServiceImpl implements ICreatorService{
    @Autowired
    CreatorMapper creatorMapper ;
    @Autowired
    CreatorRepository creatorRepository;
    @Override
    public Creator creatorById(Long id) {
        return creatorRepository.findById(id)
                .orElseThrow(()->new RuntimeException(String.format("Creator %s not found",id)));
    }

    @Override
    public Creator saveCreator(CreatorDto creatorDto) {
        System.out.println(creatorDto);
        return creatorRepository.save(creatorMapper.fromCreatorDtoToCreator(creatorDto));
    }

}
