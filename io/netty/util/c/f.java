/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.b.aa;
import io.netty.util.c.ag;
import io.netty.util.c.al;
import io.netty.util.c.e;
import java.util.Arrays;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public final class f
extends al {
    public static final Object a = new Object();
    public long b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;

    public static f a() {
        ThreadLocal threadLocal;
        Thread thread = Thread.currentThread();
        Object object = thread instanceof aa ? ((aa)thread).a() : ((threadLocal = al.k) == null ? null : (f)threadLocal.get());
        return object;
    }

    public static f b() {
        Thread thread = Thread.currentThread();
        if (thread instanceof aa) {
            return io.netty.util.c.f.a((aa)thread);
        }
        return io.netty.util.c.f.r();
    }

    private static f a(aa aa2) {
        f f2 = aa2.a();
        if (f2 == null) {
            f2 = new f();
            aa2.a(f2);
        }
        return f2;
    }

    private static f r() {
        f f2;
        ThreadLocal<f> threadLocal = al.k;
        if (threadLocal == null) {
            al.k = threadLocal = new ThreadLocal<f>();
        }
        if ((f2 = (f)threadLocal.get()) == null) {
            f2 = new f();
            threadLocal.set(f2);
        }
        return f2;
    }

    public static void c() {
        Thread thread = Thread.currentThread();
        if (thread instanceof aa) {
            ((aa)thread).a(null);
        } else {
            ThreadLocal threadLocal = al.k;
            if (threadLocal != null) {
                threadLocal.remove();
            }
        }
    }

    public static void d() {
        k = null;
    }

    public static int e() {
        int n2 = l.getAndIncrement();
        if (n2 < 0) {
            l.decrementAndGet();
            throw new IllegalStateException("too many thread-local indexed variables");
        }
        return n2;
    }

    public static int f() {
        return l.get() - 1;
    }

    private f() {
        super(io.netty.util.c.f.s());
    }

    private static Object[] s() {
        Object[] arrobject = new Object[32];
        Arrays.fill(arrobject, a);
        return arrobject;
    }

    public int g() {
        int n2 = 0;
        if (this.n != 0) {
            ++n2;
        }
        if (this.o != 0) {
            ++n2;
        }
        if (this.p != null) {
            ++n2;
        }
        if (this.q != null) {
            ++n2;
        }
        if (this.r != null) {
            ++n2;
        }
        if (this.s != null) {
            ++n2;
        }
        if (this.t != null) {
            ++n2;
        }
        if (this.u != null) {
            ++n2;
        }
        if (this.v != null) {
            ++n2;
        }
        if (this.w != null) {
            ++n2;
        }
        for (Object object : this.m) {
            if (object == a) continue;
            ++n2;
        }
        return n2 - 1;
    }

    public StringBuilder h() {
        StringBuilder stringBuilder = this.u;
        if (stringBuilder == null) {
            this.u = stringBuilder = new StringBuilder(512);
        } else {
            stringBuilder.setLength(0);
        }
        return stringBuilder;
    }

    public Map i() {
        IdentityHashMap identityHashMap = this.v;
        if (identityHashMap == null) {
            this.v = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public Map j() {
        IdentityHashMap identityHashMap = this.w;
        if (identityHashMap == null) {
            this.w = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public int k() {
        return this.n;
    }

    public void a(int n2) {
        this.n = n2;
    }

    public ag l() {
        ag ag2 = this.r;
        if (ag2 == null) {
            this.r = ag2 = new ag();
        }
        return ag2;
    }

    public Map m() {
        IdentityHashMap identityHashMap = this.s;
        if (identityHashMap == null) {
            this.s = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public Map n() {
        IdentityHashMap identityHashMap = this.t;
        if (identityHashMap == null) {
            this.t = identityHashMap = new IdentityHashMap();
        }
        return identityHashMap;
    }

    public e o() {
        return this.q;
    }

    public void a(e e2) {
        this.q = e2;
    }

    public Map p() {
        WeakHashMap weakHashMap = this.p;
        if (weakHashMap == null) {
            this.p = weakHashMap = new WeakHashMap(4);
        }
        return weakHashMap;
    }

    public int q() {
        return this.o;
    }

    public void b(int n2) {
        this.o = n2;
    }

    public Object c(int n2) {
        Object[] arrobject = this.m;
        return n2 < arrobject.length ? arrobject[n2] : a;
    }

    public boolean a(int n2, Object object) {
        Object[] arrobject = this.m;
        if (n2 < arrobject.length) {
            Object object2 = arrobject[n2];
            arrobject[n2] = object;
            return object2 == a;
        }
        this.b(n2, object);
        return true;
    }

    private void b(int n2, Object object) {
        Object[] arrobject = this.m;
        int n3 = arrobject.length;
        int n4 = n2;
        n4 |= n4 >>> 1;
        n4 |= n4 >>> 2;
        n4 |= n4 >>> 4;
        n4 |= n4 >>> 8;
        n4 |= n4 >>> 16;
        Object[] arrobject2 = Arrays.copyOf(arrobject, ++n4);
        Arrays.fill(arrobject2, n3, arrobject2.length, a);
        arrobject2[n2] = object;
        this.m = arrobject2;
    }

    public Object d(int n2) {
        Object[] arrobject = this.m;
        if (n2 < arrobject.length) {
            Object object = arrobject[n2];
            arrobject[n2] = a;
            return object;
        }
        return a;
    }

    public boolean e(int n2) {
        Object[] arrobject = this.m;
        return n2 < arrobject.length && arrobject[n2] != a;
    }
}

