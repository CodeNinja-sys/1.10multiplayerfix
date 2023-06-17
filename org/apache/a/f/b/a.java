/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.b;

import org.apache.a.f.b.c;
import org.apache.a.f.b.e;

public class a
implements c {
    public int a(e e2, e e3) {
        org.apache.a.o.a.a(e2, "Planned route");
        int n2 = -1;
        n2 = e3 == null || e3.d() < 1 ? this.a(e2) : (e2.d() > 1 ? this.c(e2, e3) : this.b(e2, e3));
        return n2;
    }

    protected int a(e e2) {
        return e2.d() > 1 ? 2 : 1;
    }

    protected int b(e e2, e e3) {
        if (e3.d() > 1) {
            return -1;
        }
        if (!e2.a().equals(e3.a())) {
            return -1;
        }
        if (e2.j() != e3.j()) {
            return -1;
        }
        if (e2.b() != null && !e2.b().equals(e3.b())) {
            return -1;
        }
        return 0;
    }

    protected int c(e e2, e e3) {
        int n2;
        if (e3.d() <= 1) {
            return -1;
        }
        if (!e2.a().equals(e3.a())) {
            return -1;
        }
        int n3 = e2.d();
        if (n3 < (n2 = e3.d())) {
            return -1;
        }
        for (int i2 = 0; i2 < n2 - 1; ++i2) {
            if (e2.a(i2).equals(e3.a(i2))) continue;
            return -1;
        }
        if (n3 > n2) {
            return 4;
        }
        if (e3.g() && !e2.g() || e3.i() && !e2.i()) {
            return -1;
        }
        if (e2.g() && !e3.g()) {
            return 3;
        }
        if (e2.i() && !e3.i()) {
            return 5;
        }
        if (e2.j() != e3.j()) {
            return -1;
        }
        return 0;
    }
}

