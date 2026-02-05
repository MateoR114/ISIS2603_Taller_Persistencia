package co.edu.uniandes.dse.TallerPersistencia.entities;
import uk.co.jemos.podam.common.PodamExclude;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.Data;

@Data
@Entity
public class DesarrolladorEntity extends BaseEntity {
    private String nombre;
    private String correo;

    @PodamExclude
    @ManyToMany(mappedBy = "desarrollador")

    private List<TareaEntity> tareas =new ArrayList<>();



}
