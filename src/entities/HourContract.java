package entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Integer hours;
	private Double valuePerHours;

	public HourContract() {}

	public HourContract(Date date, Integer hours, Double valuePerHours) {
		this.date = date;
		this.hours = hours;
		this.valuePerHours = valuePerHours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Double getValuePerHours() {
		return valuePerHours;
	}

	public void setValuePerHours(Double valuePerHours) {
		this.valuePerHours = valuePerHours;
	}
	public double totalValue () {
		return valuePerHours * hours;
	}

}
