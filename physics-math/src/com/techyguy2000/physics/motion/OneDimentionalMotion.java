/**
 * 
 */
package com.techyguy2000.physics.motion;

/**
 * @author gregbolton
 *
 */
class OneDimentionalMotion {
	private Double initial_velocity = null;
	private Double final_velocity = null;
	private Double acceleration = null;
	private Double time = null;
	private Double displacement = null;

	/**
	 * 
	 */
	public OneDimentionalMotion() {
		super();
	}
	
	public OneDimentionalMotion(Double initial_velocity, Double final_velocity, Double acceleration, Double time, Double displacement) {
		super();
		this.initial_velocity = initial_velocity;
		this.final_velocity = final_velocity;
		this.acceleration = acceleration;
		this.time = time;
		this.displacement = displacement;
	}
	
	public Double getInitialVelocity() {
		if (initial_velocity != null) {
		return initial_velocity;
		} else if (displacement == null) {
			initial_velocity = final_velocity - (acceleration * time);
			return initial_velocity;
		} else if (acceleration == null) {
			initial_velocity = ((2 * displacement)/time)-final_velocity;
			return initial_velocity;
		} else if (final_velocity == null) {
			initial_velocity = (displacement/time)-(acceleration*time/2);
			return initial_velocity;
		} else {
			initial_velocity = Math.sqrt((final_velocity*final_velocity-(2*acceleration*displacement)));
			return initial_velocity;
		}

	}
	
	public Double getFinalVelocity() {
		if (final_velocity != null) {
		return final_velocity;
		} else if (displacement == null) {
			final_velocity =  initial_velocity + (acceleration * time);
			return final_velocity;
		} else if (acceleration == null) {
			final_velocity = ((2 * displacement)/time) - initial_velocity;
			return final_velocity;
		} else if (initial_velocity == null) {
			final_velocity = (displacement/time)+(acceleration*time/2);
			return final_velocity;
		} else {
			final_velocity = Math.sqrt((initial_velocity*initial_velocity+(2*acceleration*displacement)));
			return final_velocity;
		} 
	}
	
	public Double getAcceleration() {
		return this.acceleration;
	}
	
	public Double getTime() {
		return this.time;
	}
	
	public Double getDisplacement() {
		return this.displacement;
	}
	
	public void setInitialVelocity(Double initial_velocity) {
		this.initial_velocity = initial_velocity;
	}
	
	public void setFinalVelocity(Double final_velocity) {
		this.final_velocity = final_velocity;
	}
	
	public void setAcceleration(Double acceleration) {
		this.acceleration = acceleration;
	}
	
	public void setTime(Double time) {
		this.time = time;
	}
	
	public void setDisplacement(Double displacement) {
		this.displacement = displacement;
	}

}
