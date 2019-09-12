package uefa.model;

/**
 * Clubplayer entity. @author MyEclipse Persistence Tools
 */

public class Clubplayer implements java.io.Serializable {

	// Fields

	private Integer cpId;
	private Integer clubId;
	private Integer playerId;

	// Constructors

	/** default constructor */
	public Clubplayer() {
	}

	/** full constructor */
	public Clubplayer(Integer clubId, Integer playerId) {
		this.clubId = clubId;
		this.playerId = playerId;
	}

	// Property accessors

	public Integer getCpId() {
		return this.cpId;
	}

	public void setCpId(Integer cpId) {
		this.cpId = cpId;
	}

	public Integer getClubId() {
		return this.clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

}