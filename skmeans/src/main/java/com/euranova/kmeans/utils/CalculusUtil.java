package com.euranova.kmeans.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class providing calculus methods
 * 
 * @author khalil
 *
 */
public class CalculusUtil {

	public static Double euclidianDistance(Double[] v1, Double[] v2) {
		List<Double> results = new ArrayList<Double>(v1.length);
		for (int i = 0; i < v1.length; i++) {
			results.add(Math.pow(v1[i] - v2[i], 2));
		}
		return (Double) Math.sqrt(results.stream().mapToDouble((s) -> {
			return s;
		}).sum());
	}
}
