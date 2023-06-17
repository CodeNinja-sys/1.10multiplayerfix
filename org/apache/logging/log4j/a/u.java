/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.a;

import org.apache.logging.log4j.a.m;

public class u
implements m {
    private static final long a = -8398002534962715992L;
    private final String b;

    public u() {
        this(null);
    }

    public u(String string) {
        this.b = string;
    }

    @Override
    public String a() {
        return this.b;
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public Object[] c() {
        return null;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        u u2 = (u)object;
        return !(this.b == null ? u2.b != null : !this.b.equals(u2.b));
    }

    public int hashCode() {
        return this.b != null ? this.b.hashCode() : 0;
    }

    public String toString() {
        return "SimpleMessage[message=" + this.b + "]";
    }

    @Override
    public Throwable d() {
        return null;
    }
}

