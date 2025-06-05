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

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "tbl_dentista")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@DynamicInsert
@Getter @Setter
public class DentistaJasonVC {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_dentista")
	@EqualsAndHashCode.Include
	private int id_dentista;
	
	@Column(name = "cop", nullable = false)
	private String cop;

	@Column(name = "nombre_completo", nullable = false)
	private String nombre_completo;

	@Column(name = "fecha_inicio_contrato", nullable = false)
	private LocalDate fecha_inicio_contrato;
	
	@Column(name = "turno", nullable = false)
	private char turno;

	@Column(name = "correo", nullable = false, unique = true)
	private String correo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_especialidad", nullable = false)
	private EspecialidadJasonVC especialidad;
	
	@Override
	public String toString() {
		return nombre_completo;
	}
}
