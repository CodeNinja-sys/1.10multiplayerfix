/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.apache.commons.c.a.a;
import org.apache.commons.c.a.af;
import org.apache.commons.c.a.e;
import org.apache.commons.c.a.f;
import org.apache.commons.c.a.g;
import org.apache.commons.c.a.h;
import org.apache.commons.c.a.i;
import org.apache.commons.c.a.j;
import org.apache.commons.c.a.k;
import org.apache.commons.c.a.l;
import org.apache.commons.c.a.m;
import org.apache.commons.c.a.n;
import org.apache.commons.c.a.o;
import org.apache.commons.c.a.p;
import org.apache.commons.c.a.q;
import org.apache.commons.c.a.r;
import org.apache.commons.c.a.s;
import org.apache.commons.c.a.t;
import org.apache.commons.c.a.u;
import org.apache.commons.c.a.v;
import org.apache.commons.c.a.w;

public class d
implements a {
    private final List a;
    private final boolean b;
    private final Object c;
    private final Object d;
    private final af e;

    public d(Object object, Object object2, af af2) {
        if (object == null) {
            throw new IllegalArgumentException("lhs cannot be null");
        }
        if (object2 == null) {
            throw new IllegalArgumentException("rhs cannot be null");
        }
        this.a = new ArrayList();
        this.c = object;
        this.d = object2;
        this.e = af2;
        this.b = object == object2 || object.equals(object2);
    }

    public d a(String string, boolean bl2, boolean bl3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (bl2 != bl3) {
            this.a.add(new e(this, string, bl2, bl3));
        }
        return this;
    }

    public d a(String string, boolean[] arrbl, boolean[] arrbl2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrbl, arrbl2)) {
            this.a.add(new o(this, string, arrbl, arrbl2));
        }
        return this;
    }

    public d a(String string, byte by2, byte by3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (by2 != by3) {
            this.a.add(new p(this, string, by2, by3));
        }
        return this;
    }

    public d a(String string, byte[] arrby, byte[] arrby2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrby, arrby2)) {
            this.a.add(new q(this, string, arrby, arrby2));
        }
        return this;
    }

    public d a(String string, char c2, char c3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (c2 != c3) {
            this.a.add(new r(this, string, c2, c3));
        }
        return this;
    }

    public d a(String string, char[] arrc, char[] arrc2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrc, arrc2)) {
            this.a.add(new s(this, string, arrc, arrc2));
        }
        return this;
    }

    public d a(String string, double d2, double d3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (Double.doubleToLongBits(d2) != Double.doubleToLongBits(d3)) {
            this.a.add(new t(this, string, d2, d3));
        }
        return this;
    }

    public d a(String string, double[] arrd, double[] arrd2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrd, arrd2)) {
            this.a.add(new u(this, string, arrd, arrd2));
        }
        return this;
    }

    public d a(String string, float f2, float f3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (Float.floatToIntBits(f2) != Float.floatToIntBits(f3)) {
            this.a.add(new v(this, string, f2, f3));
        }
        return this;
    }

    public d a(String string, float[] arrf, float[] arrf2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrf, arrf2)) {
            this.a.add(new f(this, string, arrf, arrf2));
        }
        return this;
    }

    public d a(String string, int n2, int n3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (n2 != n3) {
            this.a.add(new g(this, string, n2, n3));
        }
        return this;
    }

    public d a(String string, int[] arrn, int[] arrn2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrn, arrn2)) {
            this.a.add(new h(this, string, arrn, arrn2));
        }
        return this;
    }

    public d a(String string, long l2, long l3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (l2 != l3) {
            this.a.add(new i(this, string, l2, l3));
        }
        return this;
    }

    public d a(String string, long[] arrl, long[] arrl2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrl, arrl2)) {
            this.a.add(new j(this, string, arrl, arrl2));
        }
        return this;
    }

    public d a(String string, short s2, short s3) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (s2 != s3) {
            this.a.add(new k(this, string, s2, s3));
        }
        return this;
    }

    public d a(String string, short[] arrs, short[] arrs2) {
        if (string == null) {
            throw new IllegalArgumentException("Field name cannot be null");
        }
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrs, arrs2)) {
            this.a.add(new l(this, string, arrs, arrs2));
        }
        return this;
    }

    public d a(String string, Object object, Object object2) {
        if (this.b) {
            return this;
        }
        if (object == object2) {
            return this;
        }
        Object object3 = object != null ? object : object2;
        if (object3.getClass().isArray()) {
            if (object3 instanceof boolean[]) {
                return this.a(string, (boolean[])object, (boolean[])object2);
            }
            if (object3 instanceof byte[]) {
                return this.a(string, (byte[])object, (byte[])object2);
            }
            if (object3 instanceof char[]) {
                return this.a(string, (char[])object, (char[])object2);
            }
            if (object3 instanceof double[]) {
                return this.a(string, (double[])object, (double[])object2);
            }
            if (object3 instanceof float[]) {
                return this.a(string, (float[])object, (float[])object2);
            }
            if (object3 instanceof int[]) {
                return this.a(string, (int[])object, (int[])object2);
            }
            if (object3 instanceof long[]) {
                return this.a(string, (long[])object, (long[])object2);
            }
            if (object3 instanceof short[]) {
                return this.a(string, (short[])object, (short[])object2);
            }
            return this.a(string, (Object[])object, (Object[])object2);
        }
        this.a.add(new m(this, string, object, object2));
        return this;
    }

    public d a(String string, Object[] arrobject, Object[] arrobject2) {
        if (this.b) {
            return this;
        }
        if (!Arrays.equals(arrobject, arrobject2)) {
            this.a.add(new n(this, string, arrobject, arrobject2));
        }
        return this;
    }

    public w b() {
        return new w(this.c, this.d, this.a, this.e);
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

