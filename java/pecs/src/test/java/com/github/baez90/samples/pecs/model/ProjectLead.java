package com.github.baez90.samples.pecs.model;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
public class ProjectLead extends Manager {
    private int managedProjects;

    public ProjectLead(@NonNull String firstName, @NonNull String lastName) {
        super(firstName, lastName);
    }
}
