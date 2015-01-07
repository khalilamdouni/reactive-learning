package com.euranova.kmeans.business.algos;

import java.util.List;

import com.euranova.kmeans.model.Cluster;
import com.euranova.kmeans.model.KMeansConfig;

/**
 * K-means algorithm 
 * @author khalil
 *
 */
public interface KMeansAlgo {
	
	public List<Cluster> run(List<Double[]> data, KMeansConfig kmeansConfig);
	
}