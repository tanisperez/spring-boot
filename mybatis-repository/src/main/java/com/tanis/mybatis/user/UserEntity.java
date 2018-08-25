package com.tanis.mybatis.user;

/**
 * User Entity.
 */
public class UserEntity {

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
		result = (prime * result) + ((this.name == null) ? 0 : this.name.hashCode());
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
		final UserEntity other = (UserEntity) obj;
		if (this.name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!this.name.equals(other.name)) {
			return false;
		}
		if (this.userId != other.userId) {
			return false;
		}
		return true;
	}

}
