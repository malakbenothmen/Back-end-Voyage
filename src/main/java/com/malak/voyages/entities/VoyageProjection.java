package com.malak.voyages.entities;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "destinations", types = { Voyage.class })
public interface VoyageProjection {

	public String getDestination();

}
