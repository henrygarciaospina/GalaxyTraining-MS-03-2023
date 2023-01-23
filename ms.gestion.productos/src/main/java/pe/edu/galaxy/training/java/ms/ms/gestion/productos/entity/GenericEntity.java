package pe.edu.galaxy.training.java.ms.ms.gestion.productos.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
public class GenericEntity {

	@Column(name = "ESTADO")
	@Builder.Default
	private String estado = "1";
}
