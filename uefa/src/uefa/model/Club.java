package uefa.model;

/**
 * Club entity. @author MyEclipse Persistence Tools
 */

public class Club implements java.io.Serializable {

	// Fields

	private Integer clubId;
	private String name;
	private String icon;
	private String city;
	private String stadium;
	private Integer estyr;
	private Integer capacity;
	private String country;
	private String countryIcon;

	// Constructors

	/** default constructor */
	public Club() {
	}

	/** full constructor */
	public Club(String name, String icon, String city, String stadium,
			Integer estyr, Integer capacity, String country,
			String countryIcon) {
		this.name = name;
		this.icon = icon;
		this.city = city;
		this.stadium = stadium;
		this.estyr = estyr;
		this.capacity = capacity;
		this.country = country;
		this.countryIcon = countryIcon;
	}

	// Property accessors

	public Integer getClubId() {
		return this.clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIcon() {
		return this.icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStadium() {
		return this.stadium;
	}

	public void setStadium(String stadium) {
		this.stadium = stadium;
	}

	public Integer getEstyr() {
		return this.estyr;
	}

	public void setEstyr(Integer estyr) {
		this.estyr = estyr;
	}

	public Integer getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Integer capacity) {
		this.capacity = capacity;
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