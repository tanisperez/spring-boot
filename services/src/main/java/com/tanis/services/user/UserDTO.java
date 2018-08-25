package com.tanis.services.user;

import java.io.Serializable;

/**
 * User DTO.
 *
 */
public class UserDTO implements Serializable {

	private static final long serialVersionUID = -3189165323636315811L;

	private long userId;
	private String name;

	public long getUserId() {
		return this.userId;
	}

	public void setUserId(final long userId) {
		this.userId = userId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = (prime * result) + (int) (this.userId ^ (this.userId >>> 32));
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		final UserDTO other = (UserDTO) obj;
		if (this.userId != other.userId) {
			return false;
		}
		return true;
	}

}
