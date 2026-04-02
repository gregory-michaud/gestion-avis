package fr.eni.gestionavis.bo.vin;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

@Document(collection = "bottles")
public class Bouteille {

    @Id
    @Field(name = "bottle_id")
    private Integer idBouteille;

    @Field(name = "region_id")
    private int idRegion;

    @Field(name = "color_id")
    private int idCouleur;

    @Field(name = "name")
    private String nom;
}
