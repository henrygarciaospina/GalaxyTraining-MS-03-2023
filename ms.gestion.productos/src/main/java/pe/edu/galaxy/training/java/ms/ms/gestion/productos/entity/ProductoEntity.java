package pe.edu.galaxy.training.java.ms.ms.gestion.productos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper=true)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "PRODUCTO")
@Entity(name = "ProductoEntity")
public class ProductoEntity extends GenericEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqProducto")
	@SequenceGenerator(sequenceName = "SEQ_PRODUCTO", allocationSize = 1, name = "seqProducto")
	@Column(name = "ID_PRODUCTO")
	private Long id;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "DESCRIPCION")
	private String descripcion;
	
	@Column(name = "PRECIO")
	private Double precio;
	
	@Column(name = "STOCK")
	private Integer stock;
	
	
	
}
