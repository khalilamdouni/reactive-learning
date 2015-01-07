package com.euranova.kmeans.model;

/**
 * Class containing config for the k-means algo
 * 
 * @author khalil
 *
 */
public class KMeansConfig {

	private static final String K_MEANS_PARAM_VONDITION = "the K param of the K-Means algo must be greater than 1";
	private Long k;

	public KMeansConfig() {
		super();
	}

	public KMeansConfig(Long k) {
		super();
		if (k < 1)
			throw new IllegalArgumentException(K_MEANS_PARAM_VONDITION);
		this.k = k;
	}

	public Long getK() {
		return k;
	}

	public void setK(Long k) {
		if (k < 1)
			throw new IllegalArgumentException(K_MEANS_PARAM_VONDITION);
		this.k = k;
	}
}
