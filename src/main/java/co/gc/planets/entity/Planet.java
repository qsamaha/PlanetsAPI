package co.gc.planets.entity;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Planet {
	private String name;
	private List<String> colors;
	@JsonProperty("million-miles-from-sun") private HashMap <String, Integer> milesFromSun;
	public Planet() {
		super();
		colors = new ArrayList<String>();
		milesFromSun = new HashMap <String, Integer>();
		milesFromSun.put("min", 0);
		milesFromSun.put("average", 0);
		milesFromSun.put("max", 0);
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, List<String> colors, HashMap<String, Integer> milesFromSun) {
		super();
		this.name = name;
		this.colors = colors;
		this.milesFromSun = milesFromSun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getColors() {
		return colors;
	}
	public void setColors(List<String> colors) {
		this.colors = colors;
	}
	public HashMap<String, Integer> getMilesFromSun() {
		return milesFromSun;
	}
	public void setMilesFromSun(HashMap<String, Integer> milesFromSun) {
		this.milesFromSun = milesFromSun;
	}
	@Override
	public String toString() {
		return "Planet [name=" + name + ", colors=" + colors + ", milesFromSun=" + milesFromSun + "]";
	}
	
	
}
