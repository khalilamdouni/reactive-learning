package com.euranova.kmeans.business.algos.impl;

import java.util.List;

import com.euranova.kmeans.business.algos.KMeansAlgo;
import com.euranova.kmeans.model.Cluster;

public class KMeansLloydAlgo implements KMeansAlgo {

	private List<Double[]> startingCentroids = null;
	
	@Override
	public List<Cluster> run(List<Double[]> data) {
		
		if (startingCentroids == null) {
			
		}
		
		return null;
	}

	public List<Double[]> getStartingCentroids() {
		return startingCentroids;
	}

	public void setStartingCentroids(List<Double[]> startingCentroids) {
		this.startingCentroids = startingCentroids;
	}
	
	

}
