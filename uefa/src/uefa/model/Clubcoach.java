package uefa.model;

/**
 * Clubcoach entity. @author MyEclipse Persistence Tools
 */

public class Clubcoach implements java.io.Serializable {

	// Fields

	private Integer ccId;
	private Integer clubId;
	private Integer coachId;

	// Constructors

	/** default constructor */
	public Clubcoach() {
	}

	/** full constructor */
	public Clubcoach(Integer clubId, Integer coachId) {
		this.clubId = clubId;
		this.coachId = coachId;
	}

	// Property accessors

	public Integer getCcId() {
		return this.ccId;
	}

	public void setCcId(Integer ccId) {
		this.ccId = ccId;
	}

	public Integer getClubId() {
		return this.clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getCoachId() {
		return this.coachId;
	}

	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}

}