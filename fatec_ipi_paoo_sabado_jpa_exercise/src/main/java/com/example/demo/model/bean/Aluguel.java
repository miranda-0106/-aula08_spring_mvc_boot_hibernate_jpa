package com.example.demo.model.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "tb_aluguel")
public class Aluguel {
	
	@Id
	@GeneratedValue
	private Long id;
	private Date dataHora;
	
	@ManyToOne
	private Veiculo veiculo;
			
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	@ManyToOne
	private Reboque reboque;
	
	public Reboque getReboque() {
		return reboque;
	}
	public void setReboque(Reboque reboque) {
		this.reboque = reboque;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDataHora() {
		return dataHora;
	}
	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
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
		Aluguel other = (Aluguel) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Aluguel [id=" + id + ", dataHora=" + dataHora + ", veiculo=" + veiculo + ", reboque=" + reboque + "]";
	}
		
}
