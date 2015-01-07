package com.euranova.kmeans.business.algos;

import java.util.List;
import java.util.Map;

import com.euranova.kmeans.model.Canopy;
import com.euranova.kmeans.model.CanopyConfig;

/**
 * Canopy algo is used for pre-clustering
 * 
 * @author khalil
 *
 */
public interface CanopyAlgo {
	public void updateCanopies(Map<Double[], Canopy> canopies, List<Double[]> data, CanopyConfig canopyConfig);
}
