package ma.xproce.inventoryservice.web;

import ma.xproce.inventoryservice.dao.entities.Creator;
import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import ma.xproce.inventoryservice.dtos.CreatorDto;
import ma.xproce.inventoryservice.metier.ICreatorService;
import ma.xproce.inventoryservice.metier.IVideoService;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class VideoGraphQlController {

    private IVideoService iVideoService;

    private ICreatorService iCreatorService;


    public VideoGraphQlController(IVideoService iVideoService, ICreatorService iCreatorService) {
        this.iVideoService = iVideoService;
        this.iCreatorService = iCreatorService;
    }

    @QueryMapping
    public List<Video> videoList(){
        return iVideoService.videoList();
    }

    @QueryMapping
    public Creator creatorById(@Argument Long id) {
        return iCreatorService.creatorById(id);
    }

    @MutationMapping
    public Video saveVideo(@Argument Video video){
        //...
      return iVideoService.save(video);
    }

    @MutationMapping
    public Creator saveCreator(@Argument CreatorDto creatorDto){

        return iCreatorService.saveCreator(creatorDto);
    }
}
