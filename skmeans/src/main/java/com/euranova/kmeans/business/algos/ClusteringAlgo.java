package com.euranova.kmeans.business.algos;

import java.util.List;

/**
 * The interface of the hole clustering algo
 * 
 * @author khalil
 *
 */
public interface ClusteringAlgo {
	
	public void cluster(List<Double> data);
	
}
