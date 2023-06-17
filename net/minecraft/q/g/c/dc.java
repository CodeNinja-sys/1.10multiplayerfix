/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.b.cc;
import net.minecraft.e.o;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.t;

public class dc {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public dc() {
    }

    public dc(int[] arrn) {
        if (arrn.length == 6) {
            this.a = arrn[0];
            this.b = arrn[1];
            this.c = arrn[2];
            this.d = arrn[3];
            this.e = arrn[4];
            this.f = arrn[5];
        }
    }

    public static dc a() {
        return new dc(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    public static dc a(int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, ad ad2) {
        switch (ad2) {
            case c: {
                return new dc(n2 + n5, n3 + n6, n4 - n10 + 1 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n7);
            }
            case d: {
                return new dc(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
            }
            case e: {
                return new dc(n2 - n10 + 1 + n7, n3 + n6, n4 + n5, n2 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
            case f: {
                return new dc(n2 + n7, n3 + n6, n4 + n5, n2 + n10 - 1 + n7, n3 + n9 - 1 + n6, n4 + n8 - 1 + n5);
            }
        }
        return new dc(n2 + n5, n3 + n6, n4 + n7, n2 + n8 - 1 + n5, n3 + n9 - 1 + n6, n4 + n10 - 1 + n7);
    }

    public static dc a(int n2, int n3, int n4, int n5, int n6, int n7) {
        return new dc(Math.min(n2, n5), Math.min(n3, n6), Math.min(n4, n7), Math.max(n2, n5), Math.max(n3, n6), Math.max(n4, n7));
    }

    public dc(dc dc2) {
        this.a = dc2.a;
        this.b = dc2.b;
        this.c = dc2.c;
        this.d = dc2.d;
        this.e = dc2.e;
        this.f = dc2.f;
    }

    public dc(int n2, int n3, int n4, int n5, int n6, int n7) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
        this.d = n5;
        this.e = n6;
        this.f = n7;
    }

    public dc(t t2, t t3) {
        this.a = Math.min(t2.cy_(), t3.cy_());
        this.b = Math.min(t2.k(), t3.k());
        this.c = Math.min(t2.l(), t3.l());
        this.d = Math.max(t2.cy_(), t3.cy_());
        this.e = Math.max(t2.k(), t3.k());
        this.f = Math.max(t2.l(), t3.l());
    }

    public dc(int n2, int n3, int n4, int n5) {
        this.a = n2;
        this.c = n3;
        this.d = n4;
        this.f = n5;
        this.b = 1;
        this.e = 512;
    }

    public boolean a(dc dc2) {
        return this.d >= dc2.a && this.a <= dc2.d && this.f >= dc2.c && this.c <= dc2.f && this.e >= dc2.b && this.b <= dc2.e;
    }

    public boolean a(int n2, int n3, int n4, int n5) {
        return this.d >= n2 && this.a <= n4 && this.f >= n3 && this.c <= n5;
    }

    public void b(dc dc2) {
        this.a = Math.min(this.a, dc2.a);
        this.b = Math.min(this.b, dc2.b);
        this.c = Math.min(this.c, dc2.c);
        this.d = Math.max(this.d, dc2.d);
        this.e = Math.max(this.e, dc2.e);
        this.f = Math.max(this.f, dc2.f);
    }

    public void a(int n2, int n3, int n4) {
        this.a += n2;
        this.b += n3;
        this.c += n4;
        this.d += n2;
        this.e += n3;
        this.f += n4;
    }

    public boolean a(t t2) {
        return t2.cy_() >= this.a && t2.cy_() <= this.d && t2.l() >= this.c && t2.l() <= this.f && t2.k() >= this.b && t2.k() <= this.e;
    }

    public t b() {
        return new t(this.d - this.a, this.e - this.b, this.f - this.c);
    }

    public int c() {
        return this.d - this.a + 1;
    }

    public int d() {
        return this.e - this.b + 1;
    }

    public int e() {
        return this.f - this.c + 1;
    }

    public t f() {
        return new b(this.a + (this.d - this.a + 1) / 2, this.b + (this.e - this.b + 1) / 2, this.c + (this.f - this.c + 1) / 2);
    }

    public String toString() {
        return cc.a((Object)this).a("x0", this.a).a("y0", this.b).a("z0", this.c).a("x1", this.d).a("y1", this.e).a("z1", this.f).toString();
    }

    public o g() {
        return new o(new int[]{this.a, this.b, this.c, this.d, this.e, this.f});
    }
}

