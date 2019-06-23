package com.github.baez90.samples.pecs;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;

public abstract class CollectionsUtils {
    private CollectionsUtils() {

    }

    public static <T> void copy(List<? extends T> src, List<? super T> dest) {
        for (var it = src.iterator(); it.hasNext(); ) {
            dest.add(it.next());
        }
    }

    public static <R, T extends R> void copyIf(List<? extends T> src, List<? super T> dest, Predicate<? super T> filter) {
        for (var elem : src) {
            if (filter.test(elem)) {
                dest.add(elem);
            }
        }
    }
}
