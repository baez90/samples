package com.github.baez90.samples.pecs.model;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(fluent = true)
@RequiredArgsConstructor
public abstract class Person {
    @NonNull
    private String firstName;

    @NonNull
    private String lastName;
}
