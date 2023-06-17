/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.io.Serializable;
import org.lwjgl.util.h;
import org.lwjgl.util.p;

public final class b
implements Serializable,
h,
p {
    static final long a = 1L;
    private int b;
    private int c;

    public b() {
    }

    public b(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public b(h h2) {
        this.a(h2);
    }

    public void b_(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public void a(h h2) {
        this.b = h2.b();
        this.c = h2.a();
    }

    public void a(p p2) {
        p2.a(this);
    }

    public boolean equals(Object object) {
        if (object instanceof h) {
            h h2 = (h)object;
            return this.b == h2.b() && this.c == h2.a();
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b + this.c;
        return n2 * (n2 + 1) / 2 + this.b;
    }

    public String toString() {
        return this.getClass().getName() + "[width=" + this.b + ",height=" + this.c + "]";
    }

    public int a() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public int b() {
        return this.b;
    }

    public void b(int n2) {
        this.b = n2;
    }
}

