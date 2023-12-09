package ma.xproce.inventoryservice.metier;

import ma.xproce.inventoryservice.dao.entities.Video;

import java.util.List;

public interface IVideoService {
    Video save(Video video);
    List<Video> videoList();
}
