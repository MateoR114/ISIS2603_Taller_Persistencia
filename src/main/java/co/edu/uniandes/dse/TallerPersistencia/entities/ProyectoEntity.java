package co.edu.uniandes.dse.TallerPersistencia.entities;
import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import uk.co.jemos.podam.common.PodamExclude;
import jakarta.persistence.Entity;

@Data
@Entity
public class ProyectoEntity extends BaseEntity {
    private String nombre;
    private String descripcion;


    @PodamExclude
    @OneToMany(mappedBy= "proyecto", cascade = CascadeType.PERSIST, orphanRemoval = true)
    private List<TareaEntity> tareas = new ArrayList<>();



}
