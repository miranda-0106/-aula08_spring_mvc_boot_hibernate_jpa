package com.example.demo.model.bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name= "tb_reboque")
public class Reboque {
	
	@Id
	@GeneratedValue
	private Long id;
	@Column (nullable = false, length = 30)
	private String modelo;
	
	@OneToOne(optional = false)
	@JoinColumn (name = "id_reboque")
	private Placa placa;
	
	@ManyToMany (mappedBy= "reboques")
	private List<Veiculo> veiculos;
	
	@OneToMany (mappedBy = "reboque")
	private List <Aluguel> alugueis;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reboque other = (Reboque) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
}
