package uefa.model;

/**
 * Player entity. @author MyEclipse Persistence Tools
 */

public class Player implements java.io.Serializable {

	// Fields

	private Integer playerId;
	private String name;
	private String club;
	private Integer clubId;
	private Integer number;
	private String birthday;
	private Integer height;
	private Long weight;
	private String custfoot;
	private Integer rate;
	private String country;
	private String countryIcon;

	// Constructors

	/** default constructor */
	public Player() {
	}

	/** full constructor */
	public Player(String name, String club, Integer clubId, Integer number,
			String birthday, Integer height, Long weight, String custfoot,
			Integer rate, String country, String countryIcon) {
		this.name = name;
		this.club = club;
		this.clubId = clubId;
		this.number = number;
		this.birthday = birthday;
		this.height = height;
		this.weight = weight;
		this.custfoot = custfoot;
		this.rate = rate;
		this.country = country;
		this.countryIcon = countryIcon;
	}

	// Property accessors

	public Integer getPlayerId() {
		return this.playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
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

	public Integer getClubId() {
		return this.clubId;
	}

	public void setClubId(Integer clubId) {
		this.clubId = clubId;
	}

	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getBirthday() {
		return this.birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public Integer getHeight() {
		return this.height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Long getWeight() {
		return this.weight;
	}

	public void setWeight(Long weight) {
		this.weight = weight;
	}

	public String getCustfoot() {
		return this.custfoot;
	}

	public void setCustfoot(String custfoot) {
		this.custfoot = custfoot;
	}

	public Integer getRate() {
		return this.rate;
	}

	public void setRate(Integer rate) {
		this.rate = rate;
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