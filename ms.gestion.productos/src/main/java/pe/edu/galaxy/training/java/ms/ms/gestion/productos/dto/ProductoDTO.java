package pe.edu.galaxy.training.java.ms.ms.gestion.productos.dto;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode(callSuper=false)
@JsonPropertyOrder(value = {"id","nombre","descripcion","precio","stock"})
public class ProductoDTO extends GenericDTO{
	
	private Long id;
	private String nombre;
	private String descripcion;
    private Double precio;
	private Integer stock;
}
