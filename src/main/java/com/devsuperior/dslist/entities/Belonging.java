package com.devsuperior.dslist.entities;

import java.util.Objects;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
 public class Belonging {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@EmbeddedId
	
   private BelonginPK id = new BelonginPK();
	
	private Integer position;
	
	public Belonging() {
		
	}

	public Belonging(Game game, GameList list, Integer position) {
	
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}

	public BelonginPK getId() {
		return id;
	}

	public void setId(BelonginPK id) {
		this.id = id;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Belonging other = (Belonging) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
