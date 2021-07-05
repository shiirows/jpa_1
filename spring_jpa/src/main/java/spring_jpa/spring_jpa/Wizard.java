package spring_jpa.spring_jpa;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Wizard {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
	

	    private Long id;
	    private String firstName;
	    private String lastName;
	    private Date birthday;
	    private String birthPlace;
	    private String biography;
	    private boolean muggle;

	    public Wizard() {
	        
	    }

		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the birthday
		 */
		public Date getBirthday() {
			return birthday;
		}

		/**
		 * @param birthday the birthday to set
		 */
		public void setBirthday(Date birthday) {
			this.birthday = birthday;
		}

		/**
		 * @return the birthPlace
		 */
		public String getBirthPlace() {
			return birthPlace;
		}

		/**
		 * @param birthPlace the birthPlace to set
		 */
		public void setBirthPlace(String birthPlace) {
			this.birthPlace = birthPlace;
		}

		/**
		 * @return the biography
		 */
		public String getBiography() {
			return biography;
		}

		/**
		 * @param biography the biography to set
		 */
		public void setBiography(String biography) {
			this.biography = biography;
		}

		/**
		 * @return the muggle
		 */
		public boolean isMuggle() {
			return muggle;
		}

		/**
		 * @param muggle the muggle to set
		 */
		public void setMuggle(boolean muggle) {
			this.muggle = muggle;
		}
	    
	    
	}


