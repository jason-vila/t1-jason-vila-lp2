package model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tbl_equipo_dental")
@DynamicInsert
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class EquipoDentalJasonVC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "nro_equipo")
	private int nro_equipo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "costo", nullable = false)
	private Double costo;

	@Column(name = "fecha_adquisicion")
	private LocalDate fecha_adquisicion;
	
	@Column(name = "estado", nullable = false)
	private char estado;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_dentista")
	private DentistaJasonVC dentista;
}
