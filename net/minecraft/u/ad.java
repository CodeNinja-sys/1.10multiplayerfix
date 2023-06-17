/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u;

import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;
import net.minecraft.u.ae;
import net.minecraft.u.af;
import net.minecraft.u.at;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;

public enum ad implements at
{
    a(0, 1, -1, "down", af.b, ae.b, new t(0, -1, 0)),
    b(1, 0, -1, "up", af.a, ae.b, new t(0, 1, 0)),
    c(2, 3, 2, "north", af.b, ae.c, new t(0, 0, -1)),
    d(3, 2, 0, "south", af.a, ae.c, new t(0, 0, 1)),
    e(4, 5, 1, "west", af.b, ae.a, new t(-1, 0, 0)),
    f(5, 4, 3, "east", af.a, ae.a, new t(1, 0, 0));

    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final ae k;
    private final af l;
    private final t m;
    private static final ad[] n;
    private static final ad[] o;
    private static final Map p;

    static {
        n = new ad[6];
        o = new ad[4];
        p = sz.c();
        ad[] arrad = ad.values();
        int n2 = arrad.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            ad ad2;
            ad.n[ad2.g] = ad2 = arrad[i2];
            if (ad2.l().d()) {
                ad.o[ad2.i] = ad2;
            }
            p.put(ad2.k().toLowerCase(), ad2);
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ad(int n3, String string, af af2, ae ae2, t t2) {
        void var9_7;
        void var8_6;
        this.g = n3;
        this.i = (int)af2;
        this.h = (int)string;
        this.j = ae2;
        this.k = var8_6;
        this.l = t2;
        this.m = var9_7;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.i;
    }

    public af d() {
        return this.l;
    }

    public ad e() {
        return ad.a(this.h);
    }

    public ad a(ae ae2) {
        switch (ae2) {
            case a: {
                if (this != e && this != f) {
                    return this.q();
                }
                return this;
            }
            case b: {
                if (this != b && this != a) {
                    return this.f();
                }
                return this;
            }
            case c: {
                if (this != c && this != d) {
                    return this.r();
                }
                return this;
            }
        }
        throw new IllegalStateException("Unable to get CW facing for axis " + ae2);
    }

    public ad f() {
        switch (this) {
            case c: {
                return f;
            }
            case f: {
                return d;
            }
            case d: {
                return e;
            }
            case e: {
                return c;
            }
        }
        throw new IllegalStateException("Unable to get Y-rotated facing of " + this);
    }

    private ad q() {
        switch (this) {
            case c: {
                return a;
            }
            default: {
                throw new IllegalStateException("Unable to get X-rotated facing of " + this);
            }
            case d: {
                return b;
            }
            case b: {
                return c;
            }
            case a: 
        }
        return d;
    }

    private ad r() {
        switch (this) {
            case f: {
                return a;
            }
            default: {
                throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
            }
            case e: {
                return b;
            }
            case b: {
                return f;
            }
            case a: 
        }
        return e;
    }

    public ad g() {
        switch (this) {
            case c: {
                return e;
            }
            case f: {
                return c;
            }
            case d: {
                return f;
            }
            case e: {
                return d;
            }
        }
        throw new IllegalStateException("Unable to get CCW facing of " + this);
    }

    public int h() {
        return this.k == ae.a ? this.l.a() : 0;
    }

    public int i() {
        return this.k == ae.b ? this.l.a() : 0;
    }

    public int j() {
        return this.k == ae.c ? this.l.a() : 0;
    }

    public String k() {
        return this.j;
    }

    public ae l() {
        return this.k;
    }

    public static ad a(String string) {
        return string == null ? null : (ad)p.get(string.toLowerCase());
    }

    public static ad a(int n2) {
        return n[net.minecraft.u.b.n.a(n2 % n.length)];
    }

    public static ad b(int n2) {
        return o[net.minecraft.u.b.n.a(n2 % o.length)];
    }

    public static ad a(double d2) {
        return ad.b(net.minecraft.u.b.n.c(d2 / 90.0 + 0.5) & 3);
    }

    public float m() {
        return (this.i & 3) * 90;
    }

    public static ad a(Random random) {
        return ad.values()[random.nextInt(ad.values().length)];
    }

    public static ad a(float f2, float f3, float f4) {
        ad ad2 = c;
        float f5 = Float.MIN_VALUE;
        for (ad ad3 : ad.values()) {
            float f6 = f2 * (float)ad3.m.cy_() + f3 * (float)ad3.m.k() + f4 * (float)ad3.m.l();
            if (!(f6 > f5)) continue;
            f5 = f6;
            ad2 = ad3;
        }
        return ad2;
    }

    public String toString() {
        return this.j;
    }

    @Override
    public String a() {
        return this.j;
    }

    public static ad a(af af2, ae ae2) {
        for (ad ad2 : ad.values()) {
            if (ad2.d() != af2 || ad2.l() != ae2) continue;
            return ad2;
        }
        throw new IllegalArgumentException("No such direction: " + (Object)((Object)af2) + " " + ae2);
    }

    public t n() {
        return this.m;
    }
}

