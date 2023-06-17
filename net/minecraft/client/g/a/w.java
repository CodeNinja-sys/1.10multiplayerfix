/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.a;

import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.e;

public class w
implements Comparable {
    private final d a;
    private final int b;
    private final int c;
    private final int d;
    private boolean e;
    private float f = 1.0f;

    public w(d d2, int n2) {
        this.a = d2;
        this.b = d2.c();
        this.c = d2.d();
        this.d = n2;
        this.e = net.minecraft.client.g.a.e.a(this.c, n2) > net.minecraft.client.g.a.e.a(this.b, n2);
    }

    public d a() {
        return this.a;
    }

    public int b() {
        int n2 = this.e ? this.c : this.b;
        return net.minecraft.client.g.a.e.a((int)((float)n2 * this.f), this.d);
    }

    public int c() {
        int n2 = this.e ? this.b : this.c;
        return net.minecraft.client.g.a.e.a((int)((float)n2 * this.f), this.d);
    }

    public void d() {
        this.e = !this.e;
    }

    public boolean e() {
        return this.e;
    }

    public void a(int n2) {
        if (this.b > n2 && this.c > n2) {
            this.f = (float)n2 / (float)Math.min(this.b, this.c);
        }
    }

    public String toString() {
        return "Holder{width=" + this.b + ", height=" + this.c + '}';
    }

    public int a(w w2) {
        int n2;
        if (this.c() == w2.c()) {
            if (this.b() == w2.b()) {
                if (this.a.i() == null) {
                    return w2.a.i() == null ? 0 : -1;
                }
                return this.a.i().compareTo(w2.a.i());
            }
            n2 = this.b() < w2.b() ? 1 : -1;
        } else {
            n2 = this.c() < w2.c() ? 1 : -1;
        }
        return n2;
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((w)object);
    }
}

