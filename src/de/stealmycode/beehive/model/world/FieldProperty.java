package de.stealmycode.beehive.model.world;

public class FieldProperty {
	private String name = "";
	private float probability = 1.0f;
	
	/**
	 * 
	 * @param name
	 * @param probability
	 */
	public FieldProperty(String name, float probability) {
		this.name = name;
		this.probability = probability;
	}
	
	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return
	 */
	public float getProbability() {
		return probability;
	}
	
	@Override
	protected FieldProperty clone() {
		try {
			return (FieldProperty) super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}
}
