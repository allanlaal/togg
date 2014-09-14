package com.t3coode.togg.services.views;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface TaskUpdateView {

    String getName();

    @JsonProperty(value = "uid")
    long getUserId();

    @JsonProperty(value = "estimated_seconds")
    long getEstimatedSeconds();

    boolean isActive();

}
