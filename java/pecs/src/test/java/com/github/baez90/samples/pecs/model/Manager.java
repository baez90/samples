package com.github.baez90.samples.pecs.model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
public class Manager extends Person {

    private List<Person> subordinates = new LinkedList<>();

    public Manager(@NonNull String firstName, @NonNull String lastName) {
        super(firstName, lastName);
    }
}
