/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import java.util.Random;

public enum bqk implements hn
{
    a(0, 1, -1, "down", yy.b, ctv.b, new cjx(0, -1, 0)),
    b(1, 0, -1, "up", yy.a, ctv.b, new cjx(0, 1, 0)),
    c(2, 3, 2, "north", yy.b, ctv.c, new cjx(0, 0, -1)),
    d(3, 2, 0, "south", yy.a, ctv.c, new cjx(0, 0, 1)),
    e(4, 5, 1, "west", yy.b, ctv.a, new cjx(-1, 0, 0)),
    f(5, 4, 3, "east", yy.a, ctv.a, new cjx(1, 0, 0));

    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final ctv k;
    private final yy l;
    private final cjx m;
    private static final bqk[] n;
    private static final bqk[] o;
    private static final Map p;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bqk(int n3, String string, yy yy2, ctv ctv2, cjx cjx2) {
        void var9_7;
        void var8_6;
        this.g = n3;
        this.i = (int)yy2;
        this.h = (int)string;
        this.j = ctv2;
        this.k = var8_6;
        this.l = cjx2;
        this.m = var9_7;
    }

    public int b() {
        return this.g;
    }

    public int c() {
        return this.i;
    }

    public yy d() {
        return this.l;
    }

    public bqk e() {
        return bqk.a(this.h);
    }

    public bqk a(ctv ctv2) {
        switch (ctv2) {
            case a: {
                if (this == e || this == f) {
                    return this;
                }
                return this.o();
            }
            case b: {
                if (this == b || this == a) {
                    return this;
                }
                return this.f();
            }
            case c: {
                if (this == c || this == d) {
                    return this;
                }
                return this.p();
            }
        }
        throw new IllegalStateException("Unable to get CW facing for axis " + ctv2);
    }

    public bqk f() {
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

    private bqk o() {
        switch (this) {
            case b: {
                return c;
            }
            case c: {
                return a;
            }
            case a: {
                return d;
            }
            case d: {
                return b;
            }
        }
        throw new IllegalStateException("Unable to get X-rotated facing of " + this);
    }

    private bqk p() {
        switch (this) {
            case b: {
                return f;
            }
            case f: {
                return a;
            }
            case a: {
                return e;
            }
            case e: {
                return b;
            }
        }
        throw new IllegalStateException("Unable to get Z-rotated facing of " + this);
    }

    public bqk g() {
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
        if (this.k == ctv.a) {
            return this.l.a();
        }
        return 0;
    }

    public int i() {
        if (this.k == ctv.b) {
            return this.l.a();
        }
        return 0;
    }

    public int j() {
        if (this.k == ctv.c) {
            return this.l.a();
        }
        return 0;
    }

    public String k() {
        return this.j;
    }

    public ctv l() {
        return this.k;
    }

    public static bqk a(String string) {
        if (string == null) {
            return null;
        }
        return (bqk)p.get(string.toLowerCase());
    }

    public static bqk a(int n2) {
        return n[cmk.a(n2 % n.length)];
    }

    public static bqk b(int n2) {
        return o[cmk.a(n2 % o.length)];
    }

    public static bqk a(double d2) {
        return bqk.b(cmk.c(d2 / 90.0 + 0.5) & 3);
    }

    public float m() {
        return (this.i & 3) * 90;
    }

    public static bqk a(Random random) {
        return bqk.values()[random.nextInt(bqk.values().length)];
    }

    public static bqk a(float f2, float f3, float f4) {
        bqk bqk2 = c;
        float f5 = Float.MIN_VALUE;
        for (bqk bqk3 : bqk.values()) {
            float f6 = f2 * (float)bqk3.m.a() + f3 * (float)bqk3.m.b() + f4 * (float)bqk3.m.c();
            if (!(f6 > f5)) continue;
            f5 = f6;
            bqk2 = bqk3;
        }
        return bqk2;
    }

    public String toString() {
        return this.j;
    }

    @Override
    public String a() {
        return this.j;
    }

    public static bqk a(yy yy2, ctv ctv2) {
        for (bqk bqk2 : bqk.values()) {
            if (bqk2.d() != yy2 || bqk2.l() != ctv2) continue;
            return bqk2;
        }
        throw new IllegalArgumentException("No such direction: " + (Object)((Object)yy2) + " " + ctv2);
    }

    public cjx n() {
        return this.m;
    }

    static {
        n = new bqk[6];
        o = new bqk[4];
        p = sz.c();
        bqk[] arrbqk = bqk.values();
        int n2 = arrbqk.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            bqk bqk2;
            bqk.n[bqk2.g] = bqk2 = arrbqk[i2];
            if (bqk2.l().d()) {
                bqk.o[bqk2.i] = bqk2;
            }
            p.put(bqk2.k().toLowerCase(), bqk2);
        }
    }
}

