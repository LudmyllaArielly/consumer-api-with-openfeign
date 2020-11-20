package com.ludmylla.model.dto;

// Exemplo Hero 71
public class HeroFindPowerstatsDto {

	private Long id;
	private String name;
	private String intelligence;
	private Integer strength;
	private String speed;
	private String durability;
	private String power;
	private String combat;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(String intelligence) {
		this.intelligence = intelligence;
	}

	public Integer getStrength() {
		return strength;
	}

	public void setStrength(Integer strength) {
		this.strength = strength;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	public String getDurability() {
		return durability;
	}

	public void setDurability(String durability) {
		this.durability = durability;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getCombat() {
		return combat;
	}

	public void setCombat(String combat) {
		this.combat = combat;
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
		HeroFindPowerstatsDto other = (HeroFindPowerstatsDto) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HeroFindPowerstatsDto [id=" + id + ", name=" + name + ", intelligence=" + intelligence + ", strength="
				+ strength + ", speed=" + speed + ", durability=" + durability + ", power=" + power + ", combat="
				+ combat + "]";
	}

}
