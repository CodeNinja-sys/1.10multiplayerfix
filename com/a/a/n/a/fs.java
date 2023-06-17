/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.n.a;

import com.a.a.b.dx;
import com.a.a.d.jl;
import com.a.a.d.mq;
import com.a.a.j.g;
import com.a.a.n.a.ft;
import com.a.a.n.a.fu;
import com.a.a.n.a.fv;
import com.a.a.n.a.fw;
import com.a.a.n.a.fx;
import com.a.a.n.a.fy;
import com.a.a.n.a.fz;
import com.a.a.n.a.gd;
import java.math.RoundingMode;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public abstract class fs {
    private static final int a = 1024;
    private static final dx b = new fx();
    private static final int c = -1;

    private fs() {
    }

    public abstract Object a(Object var1);

    public abstract Object a(int var1);

    abstract int b(Object var1);

    public abstract int a();

    public Iterable a(Iterable iterable) {
        int n2;
        Object[] arrobject = mq.a(iterable, Object.class);
        if (arrobject.length == 0) {
            return jl.d();
        }
        int[] arrn = new int[arrobject.length];
        for (n2 = 0; n2 < arrobject.length; ++n2) {
            arrn[n2] = this.b(arrobject[n2]);
        }
        Arrays.sort(arrn);
        n2 = arrn[0];
        arrobject[0] = this.a(n2);
        for (int i2 = 1; i2 < arrobject.length; ++i2) {
            int n3 = arrn[i2];
            if (n3 == n2) {
                arrobject[i2] = arrobject[i2 - 1];
                continue;
            }
            arrobject[i2] = this.a(n3);
            n2 = n3;
        }
        List<Object> list = Arrays.asList(arrobject);
        return Collections.unmodifiableList(list);
    }

    public static fs b(int n2) {
        return new fy(n2, new ft(), null);
    }

    public static fs c(int n2) {
        return fs.a(n2, new fu());
    }

    private static fs a(int n2, dx dx2) {
        return n2 < 1024 ? new gd(n2, dx2) : new fz(n2, dx2);
    }

    public static fs a(int n2, int n3) {
        return new fy(n2, new fv(n3), null);
    }

    public static fs b(int n2, int n3) {
        return fs.a(n2, new fw(n3));
    }

    public static fs d(int n2) {
        return new fy(n2, b, null);
    }

    public static fs e(int n2) {
        return fs.a(n2, b);
    }

    private static int h(int n2) {
        return 1 << g.a(n2, RoundingMode.CEILING);
    }

    private static int i(int n2) {
        n2 ^= n2 >>> 20 ^ n2 >>> 12;
        return n2 ^ n2 >>> 7 ^ n2 >>> 4;
    }

    /* synthetic */ fs(ft ft2) {
        this();
    }

    static /* synthetic */ int f(int n2) {
        return fs.h(n2);
    }

    static /* synthetic */ int g(int n2) {
        return fs.i(n2);
    }
}

