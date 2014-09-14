package com.t3coode.togg.services.views;

import com.fasterxml.jackson.annotation.JsonProperty;

public interface TaskCreationView {

    String getName();

    @JsonProperty(value = "pid")
    long getProjectId();

    @JsonProperty(value = "wid")
    long getWorkspaceId();

    @JsonProperty(value = "uid")
    long getUserId();

    @JsonProperty(value = "estimated_seconds")
    long getEstimatedSeconds();

    boolean isActive();

}
