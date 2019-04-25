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
        var srcIt = src.listIterator();
        var destIt = dest.listIterator();

        for(int i =0; i < src.size(); i++) {
            destIt.next();
            destIt.set(srcIt.next());
        }
    }

    public static <R, T extends R> void copyIf(List<? extends T> src, List<? super T> dest, Predicate<? super T> filter) {
        for(var elem : src) {
            if (filter.test(elem)) {
                dest.add(elem);
            }
        }
    }

    @SuppressWarnings("unchecked")
    private static <T> List<T> newInstance(Class<? extends List> clazz) {
        List<T> result;
        try {
            var constructor = clazz.getConstructor();
            result = constructor.newInstance();
        } catch (NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            result = new ArrayList<T>();
        }
        return result;
    }
}
