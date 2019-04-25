package com.github.baez90.samples.pecs.model;

import lombok.*;
import lombok.experimental.Accessors;
import org.junit.experimental.categories.Categories;

import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@Accessors(fluent = true)
@EqualsAndHashCode(callSuper = true)
public class Manager extends Person {

    @EqualsAndHashCode.Exclude
    private List<Person> subordinates = new LinkedList<>();

    public Manager(@NonNull String firstName, @NonNull String lastName) {
        super(firstName, lastName);
    }
}
