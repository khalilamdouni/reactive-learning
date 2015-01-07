package com.euranova.kmeans.business.algos.impl;

import java.util.List;

import com.euranova.kmeans.business.algos.KMeansAlgo;
import com.euranova.kmeans.model.Cluster;
import com.euranova.kmeans.model.KMeansConfig;

public class KMeansPPAlgo implements KMeansAlgo {

	@Override
	public List<Cluster> run(List<Double[]> data, KMeansConfig kmeansConfig) {
		//1 calculating centroids with the D(x) probabilities
		KMeansAlgo lloydKMeansAlgo = new KMeansLloydAlgo();
		//2 assign calculated centroids to the Lloyd's algo to get clusters
		return null;
	}

}
