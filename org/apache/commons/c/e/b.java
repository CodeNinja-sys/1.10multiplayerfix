/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.e;

public class b {
    public static double a(double[] arrd) {
        if (arrd == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrd.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            d2 = b.a(arrd[i2], d2);
        }
        return d2;
    }

    public static float a(float[] arrf) {
        if (arrf == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrf.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = b.a(arrf[i2], f2);
        }
        return f2;
    }

    public static double a(double d2, double d3, double d4) {
        return b.a(b.a(d2, d3), d4);
    }

    public static double a(double d2, double d3) {
        if (Double.isNaN(d2)) {
            return d3;
        }
        if (Double.isNaN(d3)) {
            return d2;
        }
        return Math.min(d2, d3);
    }

    public static float a(float f2, float f3, float f4) {
        return b.a(b.a(f2, f3), f4);
    }

    public static float a(float f2, float f3) {
        if (Float.isNaN(f2)) {
            return f3;
        }
        if (Float.isNaN(f3)) {
            return f2;
        }
        return Math.min(f2, f3);
    }

    public static double b(double[] arrd) {
        if (arrd == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrd.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        double d2 = arrd[0];
        for (int i2 = 1; i2 < arrd.length; ++i2) {
            d2 = b.b(arrd[i2], d2);
        }
        return d2;
    }

    public static float b(float[] arrf) {
        if (arrf == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (arrf.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        float f2 = arrf[0];
        for (int i2 = 1; i2 < arrf.length; ++i2) {
            f2 = b.b(arrf[i2], f2);
        }
        return f2;
    }

    public static double b(double d2, double d3, double d4) {
        return b.b(b.b(d2, d3), d4);
    }

    public static double b(double d2, double d3) {
        if (Double.isNaN(d2)) {
            return d3;
        }
        if (Double.isNaN(d3)) {
            return d2;
        }
        return Math.max(d2, d3);
    }

    public static float b(float f2, float f3, float f4) {
        return b.b(b.b(f2, f3), f4);
    }

    public static float b(float f2, float f3) {
        if (Float.isNaN(f2)) {
            return f3;
        }
        if (Float.isNaN(f3)) {
            return f2;
        }
        return Math.max(f2, f3);
    }
}

