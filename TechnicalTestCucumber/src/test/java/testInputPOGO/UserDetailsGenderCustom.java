package testInputPOGO;

public class UserDetailsGenderCustom {

	private String firstName;

	private String lastName;

	private String username;

	private String password;

	private Dob dob;

	private String gender;

	private String preference;

	private String customGender;

	public String getPreference() {
		return preference;
	}

	public void setPreference(String preference) {
		this.preference = preference;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void setDob(Dob dob) {
		this.dob = dob;
	}

	public Dob getDob() {
		return this.dob;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return this.gender;
	}

	public String getCustomGender() {
		return customGender;
	}

	public void setCustomGender(String customGender) {
		this.customGender = customGender;
	}

}
