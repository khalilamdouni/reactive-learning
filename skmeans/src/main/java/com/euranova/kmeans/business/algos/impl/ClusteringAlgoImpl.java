package com.euranova.kmeans.business.algos.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import rx.Observable;

import com.euranova.kmeans.business.algos.ClusteringAlgo;
import com.euranova.kmeans.model.Canopy;
import com.euranova.kmeans.model.Cluster;

public class ClusteringAlgoImpl implements ClusteringAlgo {

	private Map<Double[], Observable<Canopy>> canopies = new HashMap<Double[], Observable<Canopy>>();
	private List<Cluster> clusters = new ArrayList<Cluster>();

	@Override
	public void cluster(List<Double> data) {
		// TODO Auto-generated method stub
	}

	public Map<Double[], Observable<Canopy>> getCanopies() {
		return canopies;
	}

	public void setCanopies(Map<Double[], Observable<Canopy>> canopies) {
		this.canopies = canopies;
	}

	public List<Cluster> getClusters() {
		return clusters;
	}

	public void setClusters(List<Cluster> clusters) {
		this.clusters = clusters;
	}

}
