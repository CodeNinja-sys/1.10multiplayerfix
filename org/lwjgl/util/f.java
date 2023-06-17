/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util;

import java.io.Serializable;
import org.lwjgl.util.i;
import org.lwjgl.util.q;

public final class f
implements Serializable,
i,
q {
    static final long a = 1L;
    private int b;
    private int c;

    public f() {
    }

    public f(int n2, int n3) {
        this.a(n2, n3);
    }

    public f(i i2) {
        this.a(i2);
    }

    public void a(int n2, int n3) {
        this.b = n2;
        this.c = n3;
    }

    public void a(i i2) {
        this.b = i2.cQ_();
        this.c = i2.cR_();
    }

    public void i_(int n2) {
        this.b = n2;
    }

    public void j_(int n2) {
        this.c = n2;
    }

    public void b(int n2, int n3) {
        this.b += n2;
        this.c += n3;
    }

    public void b(i i2) {
        this.b += i2.cQ_();
        this.c += i2.cR_();
    }

    public void c(i i2) {
        this.b -= i2.cQ_();
        this.c -= i2.cR_();
    }

    public boolean equals(Object object) {
        if (object instanceof f) {
            f f2 = (f)object;
            return this.b == f2.b && this.c == f2.c;
        }
        return super.equals(object);
    }

    public String toString() {
        return this.getClass().getName() + "[x=" + this.b + ",y=" + this.c + "]";
    }

    public int hashCode() {
        int n2 = this.b + this.c;
        return n2 * (n2 + 1) / 2 + this.b;
    }

    public int cQ_() {
        return this.b;
    }

    public int cR_() {
        return this.c;
    }

    public void a(q q2) {
        q2.a(this.b, this.c);
    }
}

