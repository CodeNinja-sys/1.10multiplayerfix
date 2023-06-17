/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import org.apache.a.b.d;
import org.apache.a.b.o;
import org.apache.a.o.a;

public final class b {
    private final d a;
    private final o b;

    public b(d d2, o o2) {
        org.apache.a.o.a.a(d2, "Auth scheme");
        org.apache.a.o.a.a(o2, "User credentials");
        this.a = d2;
        this.b = o2;
    }

    public d a() {
        return this.a;
    }

    public o b() {
        return this.b;
    }

    public String toString() {
        return this.a.toString();
    }
}

