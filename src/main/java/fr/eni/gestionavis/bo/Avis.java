package fr.eni.gestionavis.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder

@Document(collection = "reviews" )
public class Avis {

    @Id
    private String id;

    @Field
    private int note;

    @Field(name = "commentary")
    private String commentaire;

    @Field
    private LocalDateTime date;
}
