package edu.hm.hafner.util;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

/**
 * Integer utilities.
 *
 * @author Ullrich Hafner
 */
public final class Integers {
    /**
     * Shuffles the specified array values.
     *
     * @param values the array values to shuffle
     * @see Collections#shuffle(List)
     */
    public static void shuffle(final int[] values) {
        Ensure.that(values).isNotNull();

        List<Integer> list = Arrays.asList(ArrayUtils.toObject(values));
        Collections.shuffle(list, new SecureRandom());
        int[] copy = ArrayUtils.toPrimitive(list.toArray(new Integer[values.length]));
        System.arraycopy(copy, 0, values, 0, values.length);
    }

    private Integers() {
        // prevents instantiation
    }
}
