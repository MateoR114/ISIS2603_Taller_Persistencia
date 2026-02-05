package co.edu.uniandes.dse.TallerPersistencia.entities;



import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class TareaEntity extends BaseEntity {
    private String titulo;
    private String estado;
    private int duracionEstimada;
    
    @PodamExclude
    @ManyToOne
    private ProyectoEntity proyecto;


    @PodamExclude
    @ManyToMany

    private List<DesarrolladorEntity> desarollador = new ArrayList<>();

}
