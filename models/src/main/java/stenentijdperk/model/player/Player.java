package stenentijdperk.model.player;

import com.pietervaneeckhout.stenentijdperk.model.core.UUIDEntity;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Player extends UUIDEntity {

	@Column(unique = true, nullable = false)
	private String name;

	@Column(nullable = false)
	private String password;


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
