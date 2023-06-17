/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.a;

import io.netty.util.a.c;
import io.netty.util.a.d;
import io.netty.util.a.e;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;

public class a
implements d,
Iterable {
    private static final int a = 11;
    private static final float b = 0.5f;
    private static final Object c = new Object();
    private int d;
    private final float e;
    private int[] f;
    private Object[] g;
    private int h;

    public a() {
        this(11, 0.5f);
    }

    public a(int n2) {
        this(n2, 0.5f);
    }

    public a(int n2, float f2) {
        if (n2 < 1) {
            throw new IllegalArgumentException("initialCapacity must be >= 1");
        }
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("loadFactor must be > 0 and <= 1");
        }
        this.e = f2;
        int n3 = io.netty.util.a.a.g(n2);
        this.f = new int[n3];
        Object[] arrobject = new Object[n3];
        this.g = arrobject;
        this.d = this.i(n3);
    }

    private static Object d(Object object) {
        return object == c ? null : object;
    }

    private static Object e(Object object) {
        return object == null ? c : object;
    }

    @Override
    public Object a(int n2) {
        int n3 = this.e(n2);
        return n3 == -1 ? null : io.netty.util.a.a.d(this.g[n3]);
    }

    @Override
    public Object a(int n2, Object object) {
        int n3;
        int n4 = n3 = this.f(n2);
        do {
            if (this.g[n4] == null) {
                this.f[n4] = n2;
                this.g[n4] = io.netty.util.a.a.e(object);
                this.f();
                return null;
            }
            if (this.f[n4] != n2) continue;
            Object object2 = this.g[n4];
            this.g[n4] = io.netty.util.a.a.e(object);
            return io.netty.util.a.a.d(object2);
        } while ((n4 = this.d(n4)) != n3);
        throw new IllegalStateException("Unable to insert");
    }

    private int d(int n2) {
        return n2 == this.g.length - 1 ? 0 : n2 + 1;
    }

    @Override
    public void a(d d2) {
        if (d2 instanceof a) {
            a a2 = (a)d2;
            for (int i2 = 0; i2 < a2.g.length; ++i2) {
                Object object = a2.g[i2];
                if (object == null) continue;
                this.a(a2.f[i2], object);
            }
            return;
        }
        for (e e2 : d2.d()) {
            this.a(e2.b(), e2.c());
        }
    }

    @Override
    public Object b(int n2) {
        int n3 = this.e(n2);
        if (n3 == -1) {
            return null;
        }
        Object object = this.g[n3];
        this.h(n3);
        return io.netty.util.a.a.d(object);
    }

    @Override
    public int a() {
        return this.h;
    }

    @Override
    public boolean b() {
        return this.h == 0;
    }

    @Override
    public void c() {
        Arrays.fill(this.f, 0);
        Arrays.fill(this.g, null);
        this.h = 0;
    }

    @Override
    public boolean c(int n2) {
        return this.e(n2) >= 0;
    }

    @Override
    public boolean a(Object object) {
        Object object2 = io.netty.util.a.a.e(object);
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            if (this.g[i2] == null || !this.g[i2].equals(object2)) continue;
            return true;
        }
        return false;
    }

    @Override
    public Iterable d() {
        return this;
    }

    public Iterator iterator() {
        return new c(this, null);
    }

    @Override
    public int[] e() {
        int[] arrn = new int[this.a()];
        int n2 = 0;
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            if (this.g[i2] == null) continue;
            arrn[n2++] = this.f[i2];
        }
        return arrn;
    }

    @Override
    public Object[] a(Class class_) {
        Object[] arrobject = (Object[])Array.newInstance(class_, this.a());
        int n2 = 0;
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            if (this.g[i2] == null) continue;
            arrobject[n2++] = this.g[i2];
        }
        return arrobject;
    }

    public int hashCode() {
        int n2 = this.h;
        for (int i2 = 0; i2 < this.f.length; ++i2) {
            n2 ^= this.f[i2];
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof d)) {
            return false;
        }
        d d2 = (d)object;
        if (this.h != d2.a()) {
            return false;
        }
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            Object object2 = this.g[i2];
            if (object2 == null) continue;
            int n2 = this.f[i2];
            Object object3 = d2.a(n2);
            if (!(object2 == c ? object3 != null : !object2.equals(object3))) continue;
            return false;
        }
        return true;
    }

    private int e(int n2) {
        int n3;
        int n4 = n3 = this.f(n2);
        do {
            if (this.g[n4] == null) {
                return -1;
            }
            if (n2 != this.f[n4]) continue;
            return n4;
        } while ((n4 = this.d(n4)) != n3);
        return -1;
    }

    private int f(int n2) {
        return n2 % this.f.length;
    }

    private void f() {
        ++this.h;
        if (this.h > this.d) {
            this.j(io.netty.util.a.a.g((int)Math.min((double)this.f.length * 2.0, 2.147483639E9)));
        } else if (this.h == this.f.length) {
            this.j(this.f.length);
        }
    }

    private static int g(int n2) {
        return n2 | 1;
    }

    private void h(int n2) {
        --this.h;
        this.f[n2] = 0;
        this.g[n2] = null;
        int n3 = n2;
        int n4 = this.d(n2);
        while (this.g[n4] != null) {
            int n5 = this.f(this.f[n4]);
            if (n4 < n5 && (n5 <= n3 || n3 <= n4) || n5 <= n3 && n3 <= n4) {
                this.f[n3] = this.f[n4];
                this.g[n3] = this.g[n4];
                this.f[n4] = 0;
                this.g[n4] = null;
                n3 = n4;
            }
            n4 = this.d(n4);
        }
    }

    private int i(int n2) {
        int n3 = n2 - 1;
        return Math.min(n3, (int)((float)n2 * this.e));
    }

    private void j(int n2) {
        int[] arrn = this.f;
        Object[] arrobject = this.g;
        this.f = new int[n2];
        Object[] arrobject2 = new Object[n2];
        this.g = arrobject2;
        this.d = this.i(n2);
        block0: for (int i2 = 0; i2 < arrobject.length; ++i2) {
            int n3;
            Object object = arrobject[i2];
            if (object == null) continue;
            int n4 = arrn[i2];
            int n5 = n3 = this.f(n4);
            while (true) {
                if (this.g[n5] == null) {
                    this.f[n5] = n4;
                    this.g[n5] = io.netty.util.a.a.e(object);
                    continue block0;
                }
                n5 = this.d(n5);
            }
        }
    }

    public String toString() {
        if (this.h == 0) {
            return "{}";
        }
        StringBuilder stringBuilder = new StringBuilder(4 * this.h);
        for (int i2 = 0; i2 < this.g.length; ++i2) {
            Object object = this.g[i2];
            if (object == null) continue;
            stringBuilder.append(stringBuilder.length() == 0 ? "{" : ", ");
            stringBuilder.append(this.f[i2]).append('=').append(object == this ? "(this Map)" : object);
        }
        return stringBuilder.append('}').toString();
    }

    static /* synthetic */ Object[] a(a a2) {
        return a2.g;
    }

    static /* synthetic */ int[] b(a a2) {
        return a2.f;
    }

    static /* synthetic */ void a(a a2, int n2) {
        a2.h(n2);
    }

    static /* synthetic */ Object b(Object object) {
        return io.netty.util.a.a.d(object);
    }

    static /* synthetic */ Object c(Object object) {
        return io.netty.util.a.a.e(object);
    }
}

