package com.github.electiva3final.entities.pk;

import com.github.electiva3final.entities.Hospital;
import com.github.electiva3final.entities.Medico;
import com.github.electiva3final.entities.Servicio;
import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
@Data
public class ServicioMedicoPK implements Serializable {

    @JoinColumn(name = "ID_SERVICIO", referencedColumnName = "ID_SERVICIO", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Servicio servicio;
    @JoinColumn(name = "CI_MEDICO", referencedColumnName = "CI", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Medico medico;
}
