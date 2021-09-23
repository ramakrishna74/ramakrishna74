package com.geekbull.app.com;


	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;

	@Entity
	@Table(name = "users")
	public class UserModel {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		@Column(name = "id")
		
		Long id;
		
		@Column(name="about")
		String about;
		
		@Column(name = "blood_group")
		String blood_group;
		
		@Column(name = "consultation_fees")
		Long consultation_fees;
		
		@Column(name = "country_code")
		String country_code;
		
		@Column(name = "current_weight")
		Float current_weight;
		
		@Column(name = "designation")
		String designation;
		
		@Column(name = "dob")
		String dob;
		
		@Column(name = "email")
		String email;
		
		@Column(name = "experience")
		Long experience;
		
		@Column(name = "first_name")
		String first_name;
		
		@Column(name = "gender")
		String gender;
		
		@Column(name = "height")
		Long height;
		
		@Column(name = "height_type")
		String height_type;

		@Column(name = "last_name")
		String last_name;

		@Column(name = "mobile")
		Long mobile;

		@Column(name = "qualification")
		String qualification;

		@Column(name = "registration_number")
		String registration_number;

		@Column(name = "specialization")
		String specialization;

		@Column(name = "street_address")
		String street_address;

		@Column(name = "uhid")
		String uhid;

		@Column(name = "username")
		String username;
		
		@Column(name = "weight_type")
		String weight_type;
		
		@Column(name = "zip_code")
		Long zip_code;

		@Column(name = "state_id")
		Long state_id;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}
		
		public String getAbout() {
			return about;
		}

		public void setAbout(String about) {
			this.about = about;
		}
		
		public String getBlood_group() {
			return blood_group;
		}

		public void setBlood_group(String blood_group) {
			this.blood_group = blood_group;
		}

		public Long getConsultation_fees() {
			return consultation_fees;
		}

		public void setConsultation_fees(Long consultation_fees) {
			this.consultation_fees = consultation_fees;
		}

		public String getCountry_code() {
			return country_code;
		}

		public void setCountry_code(String country_code) {
			this.country_code = country_code;
		}
		public Float getCurrent_weight() {
			return current_weight;
		}

		public void setCurrent_weight(Float current_weight) {
			this.current_weight = current_weight;
		}


		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}
		
		public String getDob() {
			return dob;
		}

		public void setDob(String dob) {
			this.dob = dob;
		}
		
		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Long getExperience() {
			return experience;
		}

		public void setExperience(Long experience) {
			this.experience = experience;
		}

		public String getFirst_name() {
			return first_name;
		}

		public void setFirst_name(String first_name) {
			this.first_name = first_name;
		}

		public String getGender() {
			return gender;
		}

		public void setGender(String gender) {
			this.gender = gender;
		}

		public Long getHeight() {
			return height;
		}

		public void setHeight(Long height) {
			this.height = height;
		}

		public String getHeight_type() {
			return height_type;
		}

		public void setHeight_type(String height_type) {
			this.height_type = height_type;
		}

		public String getLast_name() {
			return last_name;
		}

		public void setLast_name(String last_name) {
			this.last_name = last_name;
		}

		public Long getMobile() {
			return mobile;
		}

		public void setMobile(Long mobile) {
			this.mobile = mobile;
		}

		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public String getRegistration_number() {
			return registration_number;
		}

		public void setRegistration_number(String registration_number) {
			this.registration_number = registration_number;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getStreet_address() {
			return street_address;
		}

		public void setStreet_address(String street_address) {
			this.street_address = street_address;
		}

		public String getUhid() {
			return uhid;
		}

		public void setUhid(String uhid) {
			this.uhid = uhid;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getWeight_type() {
			return weight_type;
		}

		public void setWeight_type(String weight_type) {
			this.weight_type = weight_type;
		}

		public Long getZip_code() {
			return zip_code;
		}

		public void setZip_code(Long zip_code) {
			this.zip_code = zip_code;
		}

		public Long getState_id() {
			return state_id;
		}

		public void setState_id(Long state_id) {
			this.state_id = state_id;
		}

		
		
		
		
}
