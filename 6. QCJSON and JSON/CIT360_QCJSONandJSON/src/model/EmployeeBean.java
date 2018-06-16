package model;

import java.io.Serializable;

/*JavaBeans is a regular java class.  It is not a specific object or program.
*/

public class EmployeeBean implements Serializable {
	
	private String firstName;  // employee first name
	private String lastName;   // employee last name
	private int startYear;     // year of starting employment
	private double payRate;    // hourly pay rate
	
	public EmployeeBean() {
		super();
	}

	public EmployeeBean(String firstName, String lastName, int startYear, double payRate) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.startYear = startYear;
		this.payRate = payRate;
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
	 * @return the startYear
	 */
	public int getStartYear() {
		return startYear;
	}

	/**
	 * @param startYear the startYear to set
	 */
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}

	/**
	 * @return the payRate
	 */
	public double getPayRate() {
		return payRate;
	}

	/**
	 * @param payRate the payRate to set
	 */
	public void setPayRate(double payRate) {
		this.payRate = payRate;
	}
		
}
