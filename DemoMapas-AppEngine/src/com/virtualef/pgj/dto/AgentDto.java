package com.virtualef.pgj.dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class AgentDto implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Long id;
	private String tuition;
	private String alias;
	private String aliasP;
	private Long idUser;
	@Transient
	private UserDto user;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTuition() {
		return tuition;
	}

	public void setTuition(String tuition) {
		this.tuition = tuition;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getAliasP() {
		return aliasP;
	}

	public void setAliasP(String aliasP) {
		this.aliasP = aliasP;
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public UserDto getUser() {
		return user;
	}

	public void setUser(UserDto user) {
		this.user = user;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((alias == null) ? 0 : alias.hashCode());
		result = prime * result + ((aliasP == null) ? 0 : aliasP.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((idUser == null) ? 0 : idUser.hashCode());
		result = prime * result + ((tuition == null) ? 0 : tuition.hashCode());
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
		AgentDto other = (AgentDto) obj;
		if (alias == null) {
			if (other.alias != null)
				return false;
		} else if (!alias.equals(other.alias))
			return false;
		if (aliasP == null) {
			if (other.aliasP != null)
				return false;
		} else if (!aliasP.equals(other.aliasP))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (idUser == null) {
			if (other.idUser != null)
				return false;
		} else if (!idUser.equals(other.idUser))
			return false;
		if (tuition == null) {
			if (other.tuition != null)
				return false;
		} else if (!tuition.equals(other.tuition))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "AgentDto [id=" + id + ", tuition=" + tuition + ", alias="
				+ alias + ", aliasP=" + aliasP + ", idUser=" + idUser
				+ ", user=" + user + "]";
	}
}
