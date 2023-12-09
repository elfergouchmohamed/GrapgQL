package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Video;
import ma.xproce.inventoryservice.dao.repositories.CreatorRepository;
import ma.xproce.inventoryservice.dao.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class VideoServiceImpl implements IVideoService{
    @Autowired
    CreatorRepository creatorRepository;
    @Autowired
    VideoRepository videoRepository;
    @Override
    public Video save(Video video) {
        creatorRepository.save(video.getCreator());
        return videoRepository.save(video) ;
    }

    @Override
    public List<Video> videoList() {
        return videoRepository.findAll();
    }
}
