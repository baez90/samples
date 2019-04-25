package com.github.baez90.samples.pecs.model;

import lombok.NonNull;

public class ProjectLead extends Manager {
    private int managedProjects;

    public ProjectLead(@NonNull String firstName, @NonNull String lastName) {
        super(firstName, lastName);
    }
}
