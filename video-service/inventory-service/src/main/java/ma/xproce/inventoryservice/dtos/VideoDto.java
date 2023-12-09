package ma.xproce.inventoryservice.dtos;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import ma.xproce.inventoryservice.dao.entities.Creator;

import java.util.Date;
@Data
public class VideoDto {
    private String name;
    private String url;
    private String description;
    private Date datePublication;

    private CreatorDto creatorDto;
}
