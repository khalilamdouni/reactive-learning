package com.euranova.kmeans.model;

import java.util.List;

/**
 * Model class for data cluster
 * 
 * @author khalil
 *
 */
public class Cluster {

	private List<Double[]> points;
	private Double[] centroide;

	public Cluster() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cluster(List<Double[]> points, Double[] centroide) {
		super();
		this.points = points;
		this.centroide = centroide;
	}

	public List<Double[]> getPoints() {
		return points;
	}

	public void setPoints(List<Double[]> points) {
		this.points = points;
	}

	public Double[] getCentroide() {
		return centroide;
	}

	public void setCentroide(Double[] centroide) {
		this.centroide = centroide;
	}

}
