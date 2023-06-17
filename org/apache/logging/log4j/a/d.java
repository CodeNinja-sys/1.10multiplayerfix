/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

class d {
    static final /* synthetic */ int[] a;

    static {
        a = new int[Thread.State.values().length];
        try {
            d.a[Thread.State.BLOCKED.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            d.a[Thread.State.WAITING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            d.a[Thread.State.TIMED_WAITING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

