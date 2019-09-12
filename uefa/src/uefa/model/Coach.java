package uefa.model;

/**
 * Coach entity. @author MyEclipse Persistence Tools
 */

public class Coach implements java.io.Serializable {

	// Fields

	private Integer coachId;
	private String name;
	private String club;
	private String country;
	private String countryIcon;

	// Constructors

	/** default constructor */
	public Coach() {
	}

	/** full constructor */
	public Coach(String name, String club, String country, String countryIcon) {
		this.name = name;
		this.club = club;
		this.country = country;
		this.countryIcon = countryIcon;
	}

	// Property accessors

	public Integer getCoachId() {
		return this.coachId;
	}

	public void setCoachId(Integer coachId) {
		this.coachId = coachId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClub() {
		return this.club;
	}

	public void setClub(String club) {
		this.club = club;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryIcon() {
		return this.countryIcon;
	}

	public void setCountryIcon(String countryIcon) {
		this.countryIcon = countryIcon;
	}

}