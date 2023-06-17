/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import java.io.Serializable;

public final class at
implements Serializable {
    private static final long a = 1L;
    private final long b;
    private final long c;

    public at(long l2, long l3) {
        this.b = l2;
        this.c = l3;
    }

    public long a() {
        return this.b;
    }

    public long b() {
        return this.c;
    }

    public boolean equals(Object object) {
        if (object instanceof at) {
            at at2 = (at)object;
            return this.b == at2.b && this.c == at2.c;
        }
        return false;
    }

    public int hashCode() {
        return (int)(this.b + this.c);
    }

    public String toString() {
        return String.valueOf(this.b) + " " + String.valueOf(this.c);
    }
}

