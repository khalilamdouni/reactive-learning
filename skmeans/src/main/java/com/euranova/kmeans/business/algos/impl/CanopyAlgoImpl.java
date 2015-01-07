package com.euranova.kmeans.business.algos.impl;

import java.util.List;
import java.util.Map;
import java.util.Random;

import com.euranova.kmeans.business.algos.CanopyAlgo;
import com.euranova.kmeans.model.Canopy;
import com.euranova.kmeans.model.CanopyConfig;

public class CanopyAlgoImpl implements CanopyAlgo {

	@Override
	public void updateCanopies(Map<Double[], Canopy> canopies,
			List<Double[]> data, CanopyConfig canopyConfig) {
		
		Double[] canopyCenter = data.get(new Random().nextInt(data.size()));
		
		data.stream().forEach(d -> {
			//1 compare distances with existing canopies 
			//2.1 assign to canopy if distance less than t1
			//2.2 create a new canopy if distance is greater than t1
			//3 remove from data if distance with canopy center is less than t2
		});
		

	}

}
