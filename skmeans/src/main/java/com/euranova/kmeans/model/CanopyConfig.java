package com.euranova.kmeans.model;

/**
 * Class containing config for Canopy algorithm
 * 
 * @author khalil
 *
 */
public class CanopyConfig {
	private static final String THRESHOLDS_CONDITION = "threshold1 must be greater than threshold2";
	private Double threshold1;
	private Double threshold2;

	public CanopyConfig() {
		super();
	}

	public CanopyConfig(double threshold1, double threshold2) {
		super();
		if (threshold1 <= threshold2)
			throw new IllegalArgumentException(THRESHOLDS_CONDITION);
		this.threshold1 = threshold1;
		this.threshold2 = threshold2;
	}

	public double getThreshold1() {
		return threshold1;
	}

	public void setThreshold1(double threshold1) {
		if (threshold2 != null && threshold1 <= threshold2)
			throw new IllegalArgumentException(THRESHOLDS_CONDITION);
		this.threshold1 = threshold1;
	}

	public double getThreshold2() {
		return threshold2;
	}

	public void setThreshold2(double threshold2) {
		if (threshold1 != null && threshold1 <= threshold2)
			throw new IllegalArgumentException(THRESHOLDS_CONDITION);
		this.threshold2 = threshold2;
	}

}
