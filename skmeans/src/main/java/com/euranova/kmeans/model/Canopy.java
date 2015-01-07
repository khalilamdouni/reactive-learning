package com.euranova.kmeans.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Model class used to represent a canopy
 * 
 * @author khalil
 *
 */
public class Canopy {
	private Double[] center = null;
 	private List<Double[]> points = new ArrayList<Double[]>();
	private boolean isLaunched = false;
	
	public Double[] getCenter() {
		return center;
	}

	public void setCenter(Double[] center) {
		this.center = center;
	}

	public List<Double[]> getPoints() {
		return points;
	}

	public void setPoints(List<Double[]> points) {
		this.points = points;
	}

	public boolean isLaunched() {
		return isLaunched;
	}

	public void setLaunched(boolean isLaunched) {
		this.isLaunched = isLaunched;
	}

}
