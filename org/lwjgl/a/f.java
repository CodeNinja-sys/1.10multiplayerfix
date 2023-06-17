/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.util.ArrayList;
import net.java.games.input.ar;
import net.java.games.input.as;
import net.java.games.input.dj;
import net.java.games.input.k;
import net.java.games.input.m;
import net.java.games.input.n;
import net.java.games.input.q;
import org.lwjgl.a.a;
import org.lwjgl.a.b;
import org.lwjgl.a.c;

class f
implements a {
    private q a;
    private int b;
    private ArrayList c = new ArrayList();
    private ArrayList d = new ArrayList();
    private ArrayList e = new ArrayList();
    private dj[] f;
    private boolean[] g;
    private float[] h;
    private float[] i;
    private float[] j;
    private float[] k;
    private int l = -1;
    private int m = -1;
    private int n = -1;
    private int o = -1;
    private int p = -1;
    private int q = -1;

    f(int n2, q q2) {
        k[] arrk;
        this.a = q2;
        this.b = n2;
        for (k k2 : arrk = q2.c()) {
            if (k2.d() instanceof n) {
                this.c.add(k2);
                continue;
            }
            if (k2.d().equals(net.java.games.input.m.C)) {
                this.e.add(k2);
                continue;
            }
            this.d.add(k2);
        }
        this.g = new boolean[this.c.size()];
        this.h = new float[this.e.size()];
        this.i = new float[this.d.size()];
        int n3 = 0;
        int n4 = 0;
        for (k k3 : arrk) {
            if (k3.d() instanceof n) {
                this.g[n3] = k3.f() != 0.0f;
                ++n3;
                continue;
            }
            if (k3.d().equals(net.java.games.input.m.C)) continue;
            this.i[n4] = k3.f();
            if (k3.d().equals(net.java.games.input.m.a)) {
                this.l = n4;
            }
            if (k3.d().equals(net.java.games.input.m.b)) {
                this.m = n4;
            }
            if (k3.d().equals(net.java.games.input.m.c)) {
                this.n = n4;
            }
            if (k3.d().equals(net.java.games.input.m.d)) {
                this.o = n4;
            }
            if (k3.d().equals(net.java.games.input.m.e)) {
                this.p = n4;
            }
            if (k3.d().equals(net.java.games.input.m.f)) {
                this.q = n4;
            }
            ++n4;
        }
        this.j = new float[this.d.size()];
        this.k = new float[this.d.size()];
        for (int i2 = 0; i2 < this.j.length; ++i2) {
            this.j[i2] = 1.0f;
            this.k[i2] = 0.05f;
        }
        this.f = q2.d();
    }

    public String a() {
        String string = this.a.g();
        return string;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c.size();
    }

    public String a(int n2) {
        return ((k)this.c.get(n2)).i();
    }

    public boolean b(int n2) {
        return this.g[n2];
    }

    public void d() {
        this.a.j();
        ar ar2 = new ar();
        as as2 = this.a.i();
        while (as2.b(ar2)) {
            float f2;
            float f3;
            int n2;
            k k2;
            if (this.c.contains(ar2.a())) {
                k2 = ar2.a();
                n2 = this.c.indexOf(k2);
                this.g[n2] = ar2.b() != 0.0f;
                org.lwjgl.a.c.a(new b(this, ar2.c(), 1, n2, this.g[n2], false, false, 0.0f, 0.0f));
            }
            if (this.e.contains(ar2.a())) {
                k2 = ar2.a();
                n2 = this.e.indexOf(k2);
                f3 = this.e();
                f2 = this.f();
                this.h[n2] = ar2.b();
                if (f3 != this.e()) {
                    org.lwjgl.a.c.a(new b(this, ar2.c(), 3, 0, false, false));
                }
                if (f2 != this.f()) {
                    org.lwjgl.a.c.a(new b(this, ar2.c(), 4, 0, false, false));
                }
            }
            if (!this.d.contains(ar2.a())) continue;
            k2 = ar2.a();
            n2 = this.d.indexOf(k2);
            f3 = k2.f();
            f2 = 0.0f;
            float f4 = 0.0f;
            if (Math.abs(f3) < this.k[n2]) {
                f3 = 0.0f;
            }
            if (Math.abs(f3) < k2.e()) {
                f3 = 0.0f;
            }
            if (Math.abs(f3) > this.j[n2]) {
                this.j[n2] = Math.abs(f3);
            }
            f3 /= this.j[n2];
            if (n2 == this.l) {
                f2 = f3;
            }
            if (n2 == this.m) {
                f4 = f3;
            }
            org.lwjgl.a.c.a(new b(this, ar2.c(), 2, n2, false, n2 == this.l, n2 == this.m, f2, f4));
            this.i[n2] = f3;
        }
    }

    public int g() {
        return this.d.size();
    }

    public String d(int n2) {
        return ((k)this.d.get(n2)).i();
    }

    public float e(int n2) {
        return this.i[n2];
    }

    public float h() {
        if (this.l == -1) {
            return 0.0f;
        }
        return this.e(this.l);
    }

    public float j() {
        if (this.m == -1) {
            return 0.0f;
        }
        return this.e(this.m);
    }

    public float i() {
        if (this.l == -1) {
            return 0.0f;
        }
        return this.c(this.l);
    }

    public float k() {
        if (this.m == -1) {
            return 0.0f;
        }
        return this.c(this.m);
    }

    public void a(float f2) {
        this.a(this.l, f2);
    }

    public void b(float f2) {
        this.a(this.m, f2);
    }

    public float c(int n2) {
        return this.k[n2];
    }

    public void a(int n2, float f2) {
        this.k[n2] = f2;
    }

    public float l() {
        if (this.n == -1) {
            return 0.0f;
        }
        return this.e(this.n);
    }

    public float m() {
        if (this.n == -1) {
            return 0.0f;
        }
        return this.c(this.n);
    }

    public void c(float f2) {
        this.a(this.n, f2);
    }

    public float n() {
        if (this.o == -1) {
            return 0.0f;
        }
        return this.e(this.o);
    }

    public float o() {
        if (this.o == -1) {
            return 0.0f;
        }
        return this.c(this.o);
    }

    public void d(float f2) {
        this.a(this.o, f2);
    }

    public float p() {
        if (this.p == -1) {
            return 0.0f;
        }
        return this.e(this.p);
    }

    public float q() {
        if (this.p == -1) {
            return 0.0f;
        }
        return this.c(this.p);
    }

    public void e(float f2) {
        this.a(this.p, f2);
    }

    public float r() {
        if (this.q == -1) {
            return 0.0f;
        }
        return this.e(this.q);
    }

    public float s() {
        if (this.q == -1) {
            return 0.0f;
        }
        return this.c(this.q);
    }

    public void f(float f2) {
        this.a(this.q, f2);
    }

    public float e() {
        if (this.e.size() == 0) {
            return 0.0f;
        }
        float f2 = this.h[0];
        if (f2 == 0.875f || f2 == 0.125f || f2 == 1.0f) {
            return -1.0f;
        }
        if (f2 == 0.625f || f2 == 0.375f || f2 == 0.5f) {
            return 1.0f;
        }
        return 0.0f;
    }

    public float f() {
        if (this.e.size() == 0) {
            return 0.0f;
        }
        float f2 = this.h[0];
        if (f2 == 0.875f || f2 == 0.625f || f2 == 0.75f) {
            return 1.0f;
        }
        if (f2 == 0.125f || f2 == 0.375f || f2 == 0.25f) {
            return -1.0f;
        }
        return 0.0f;
    }

    public int t() {
        return this.f.length;
    }

    public String f(int n2) {
        return this.f[n2].b();
    }

    public void b(int n2, float f2) {
        this.f[n2].a(f2);
    }
}

