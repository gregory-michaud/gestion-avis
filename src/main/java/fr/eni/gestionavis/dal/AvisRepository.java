package fr.eni.gestionavis.dal;

import fr.eni.gestionavis.bo.Avis;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;
import java.util.List;

@RepositoryRestResource(collectionResourceRel = "avis", path = "avis")
public interface AvisRepository extends MongoRepository<Avis, String> {

    List<Avis> findByNoteLessThan(int note);
    
    List<Avis> findByNoteGreaterThan(int note);

    //List<Avis> findByBouteille(Bouteille bouteille);
    List<Avis> findByBouteilleIdBouteille(Integer idBouteille);

    List<Avis> findByClientPseudo(String pseudo);

    List<Avis> findByClientQuantiteCommandeeGreaterThan(int quantiteCommandee);

    List<Avis> findByDateBetween(@Param("deb") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime debut,
                                 @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME) LocalDateTime fin);
    
}
