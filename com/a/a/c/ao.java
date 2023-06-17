/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.c;

import com.a.a.b.cl;
import com.a.a.b.eh;
import com.a.a.c.ab;
import com.a.a.c.af;
import com.a.a.c.ah;
import com.a.a.c.ap;
import com.a.a.c.aq;
import com.a.a.c.aw;
import com.a.a.c.bg;
import com.a.a.c.bj;
import com.a.a.c.br;
import com.a.a.c.bs;
import com.a.a.c.bt;
import com.a.a.c.bw;
import com.a.a.c.c;
import com.a.a.c.cg;
import com.a.a.c.ch;
import com.a.a.c.dg;
import com.a.a.c.dk;
import com.a.a.c.dq;
import com.a.a.c.f;
import com.a.a.c.j;
import com.a.a.c.k;
import com.a.a.d.aad;
import com.a.a.d.jt;
import com.a.a.d.sz;
import com.a.a.l.q;
import com.a.a.n.a.du;
import com.a.a.n.a.gk;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

class ao
extends AbstractMap
implements ConcurrentMap {
    static final int a = 0x40000000;
    static final int b = 65536;
    static final int c = 3;
    static final int d = 63;
    static final int e = 16;
    static final Logger f = Logger.getLogger(ao.class.getName());
    static final com.a.a.n.a.dq g = du.a();
    final int h;
    final int i;
    final bt[] j;
    final int k;
    final com.a.a.b.aw l;
    final com.a.a.b.aw m;
    final bw n;
    final bw o;
    final long p;
    final dq q;
    final long r;
    final long s;
    final long t;
    final Queue u;
    final dg v;
    final eh w;
    final aw x;
    final c y;
    final ab z;
    static final cg A = new ap();
    static final Queue B = new aq();
    Set C;
    Collection D;
    Set E;

    ao(f f2, ab ab2) {
        int n2;
        int n3;
        this.k = Math.min(f2.f(), 65536);
        this.n = f2.j();
        this.o = f2.m();
        this.l = f2.c();
        this.m = f2.d();
        this.p = f2.g();
        this.q = f2.h();
        this.r = f2.o();
        this.s = f2.n();
        this.t = f2.p();
        this.v = f2.q();
        this.u = this.v == com.a.a.c.j.a ? ao.r() : new ConcurrentLinkedQueue();
        this.w = f2.a(this.k());
        this.x = aw.a(this.n, this.m(), this.l());
        this.y = (c)f2.t().a();
        this.z = ab2;
        int n4 = Math.min(f2.e(), 0x40000000);
        if (this.a() && !this.b()) {
            n4 = Math.min(n4, (int)this.p);
        }
        int n5 = 0;
        for (n3 = 1; !(n3 >= this.k || this.a() && (long)(n3 * 20) > this.p); n3 <<= 1) {
            ++n5;
        }
        this.i = 32 - n5;
        this.h = n3 - 1;
        this.j = this.c(n3);
        int n6 = n4 / n3;
        if (n6 * n3 < n4) {
            ++n6;
        }
        for (n2 = 1; n2 < n6; n2 <<= 1) {
        }
        if (this.a()) {
            long l2 = this.p / (long)n3 + 1L;
            long l3 = this.p % (long)n3;
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                if ((long)i2 == l3) {
                    --l2;
                }
                this.j[i2] = this.a(n2, l2, (c)f2.t().a());
            }
        } else {
            for (int i3 = 0; i3 < this.j.length; ++i3) {
                this.j[i3] = this.a(n2, -1L, (c)f2.t().a());
            }
        }
    }

    boolean a() {
        return this.p >= 0L;
    }

    boolean b() {
        return this.q != com.a.a.c.k.a;
    }

    boolean c() {
        return this.d() || this.e();
    }

    boolean d() {
        return this.s > 0L;
    }

    boolean e() {
        return this.r > 0L;
    }

    boolean f() {
        return this.t > 0L;
    }

    boolean g() {
        return this.e() || this.a();
    }

    boolean h() {
        return this.d();
    }

    boolean i() {
        return this.d() || this.f();
    }

    boolean j() {
        return this.e();
    }

    boolean k() {
        return this.i() || this.j();
    }

    boolean l() {
        return this.h() || this.i();
    }

    boolean m() {
        return this.g() || this.j();
    }

    boolean n() {
        return this.n != bw.a;
    }

    boolean o() {
        return this.o != bw.a;
    }

    static cg p() {
        return A;
    }

    static bs q() {
        return br.a;
    }

    static Queue r() {
        return B;
    }

    static int a(int n2) {
        n2 += n2 << 15 ^ 0xFFFFCD7D;
        n2 ^= n2 >>> 10;
        n2 += n2 << 3;
        n2 ^= n2 >>> 6;
        n2 += (n2 << 2) + (n2 << 14);
        return n2 ^ n2 >>> 16;
    }

    bs a(Object object, int n2, bs bs2) {
        return this.b(n2).a(object, n2, bs2);
    }

    bs a(bs bs2, bs bs3) {
        int n2 = bs2.c();
        return this.b(n2).a(bs2, bs3);
    }

    cg a(bs bs2, Object object, int n2) {
        int n3 = bs2.c();
        return this.o.a(this.b(n3), bs2, cl.a(object), n2);
    }

    int a(Object object) {
        int n2 = this.l.a(object);
        return ao.a(n2);
    }

    void a(cg cg2) {
        bs bs2 = cg2.b();
        int n2 = bs2.c();
        this.b(n2).a(bs2.d(), n2, cg2);
    }

    void a(bs bs2) {
        int n2 = bs2.c();
        this.b(n2).a(bs2, n2);
    }

    boolean a(bs bs2, long l2) {
        return this.b(bs2.c()).c(bs2, l2) != null;
    }

    bt b(int n2) {
        return this.j[n2 >>> this.i & this.h];
    }

    bt a(int n2, long l2, c c2) {
        return new bt(this, n2, l2, c2);
    }

    Object b(bs bs2, long l2) {
        if (bs2.d() == null) {
            return null;
        }
        Object object = bs2.a().get();
        if (object == null) {
            return null;
        }
        if (this.c(bs2, l2)) {
            return null;
        }
        return object;
    }

    boolean c(bs bs2, long l2) {
        cl.a(bs2);
        if (this.e() && l2 - bs2.e() >= this.r) {
            return true;
        }
        return this.d() && l2 - bs2.h() >= this.s;
    }

    static void b(bs bs2, bs bs3) {
        bs2.a(bs3);
        bs3.b(bs2);
    }

    static void b(bs bs2) {
        bs bs3 = ao.q();
        bs2.a(bs3);
        bs2.b(bs3);
    }

    static void c(bs bs2, bs bs3) {
        bs2.c(bs3);
        bs3.d(bs2);
    }

    static void c(bs bs2) {
        bs bs3 = ao.q();
        bs2.c(bs3);
        bs2.d(bs3);
    }

    void s() {
        dk dk2;
        while ((dk2 = (dk)this.u.poll()) != null) {
            try {
                this.v.a(dk2);
            }
            catch (Throwable throwable) {
                f.log(Level.WARNING, "Exception thrown by removal listener", throwable);
            }
        }
    }

    final bt[] c(int n2) {
        return new bt[n2];
    }

    public void t() {
        for (bt bt2 : this.j) {
            bt2.o();
        }
    }

    @Override
    public boolean isEmpty() {
        int n2;
        long l2 = 0L;
        bt[] arrbt = this.j;
        for (n2 = 0; n2 < arrbt.length; ++n2) {
            if (arrbt[n2].b != 0) {
                return false;
            }
            l2 += (long)arrbt[n2].d;
        }
        if (l2 != 0L) {
            for (n2 = 0; n2 < arrbt.length; ++n2) {
                if (arrbt[n2].b != 0) {
                    return false;
                }
                l2 -= (long)arrbt[n2].d;
            }
            if (l2 != 0L) {
                return false;
            }
        }
        return true;
    }

    long u() {
        bt[] arrbt = this.j;
        long l2 = 0L;
        for (int i2 = 0; i2 < arrbt.length; ++i2) {
            l2 += (long)arrbt[i2].b;
        }
        return l2;
    }

    @Override
    public int size() {
        return com.a.a.l.q.b(this.u());
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).b(object, n2);
    }

    public Object b(Object object) {
        int n2 = this.a(cl.a(object));
        Object object2 = this.b(n2).b(object, n2);
        if (object2 == null) {
            this.y.b(1);
        } else {
            this.y.a(1);
        }
        return object2;
    }

    Object a(Object object, ab ab2) {
        int n2 = this.a(cl.a(object));
        return this.b(n2).a(object, n2, ab2);
    }

    Object c(Object object) {
        return this.a(object, this.z);
    }

    jt a(Iterable iterable) {
        int n2 = 0;
        int n3 = 0;
        LinkedHashMap linkedHashMap = sz.d();
        for (Object t2 : iterable) {
            Object object = this.get(t2);
            if (object == null) {
                ++n3;
                continue;
            }
            Object t3 = t2;
            linkedHashMap.put(t3, object);
            ++n2;
        }
        this.y.a(n2);
        this.y.b(n3);
        return jt.b(linkedHashMap);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    jt b(Iterable iterable) {
        int n2 = 0;
        int n3 = 0;
        LinkedHashMap linkedHashMap = sz.d();
        LinkedHashSet linkedHashSet = aad.c();
        for (Object object : iterable) {
            Object object2 = this.get(object);
            if (linkedHashMap.containsKey(object)) continue;
            linkedHashMap.put(object, object2);
            if (object2 == null) {
                ++n3;
                linkedHashSet.add(object);
                continue;
            }
            ++n2;
        }
        try {
            Object object;
            if (!linkedHashSet.isEmpty()) {
                try {
                    object = this.a(linkedHashSet, this.z);
                    for (Object object2 : linkedHashSet) {
                        Object v2 = object.get(object2);
                        if (v2 == null) {
                            throw new af("loadAll failed to return a value for " + object2);
                        }
                        linkedHashMap.put(object2, v2);
                    }
                }
                catch (ah ah2) {
                    for (Object object2 : linkedHashSet) {
                        --n3;
                        linkedHashMap.put(object2, this.a(object2, this.z));
                    }
                }
            }
            object = jt.b(linkedHashMap);
            return object;
        }
        finally {
            this.y.a(n2);
            this.y.b(n3);
        }
    }

    Map a(Set set, ab ab2) {
        Map map;
        cl.a(ab2);
        cl.a(set);
        com.a.a.b.du du2 = com.a.a.b.du.b();
        boolean bl2 = false;
        try {
            Map map2;
            map = map2 = ab2.a(set);
            bl2 = true;
        }
        catch (ah ah2) {
            bl2 = true;
            throw ah2;
        }
        catch (InterruptedException interruptedException) {
            Thread.currentThread().interrupt();
            throw new ExecutionException(interruptedException);
        }
        catch (RuntimeException runtimeException) {
            throw new gk(runtimeException);
        }
        catch (Exception exception) {
            throw new ExecutionException(exception);
        }
        catch (Error error) {
            throw new com.a.a.n.a.bt(error);
        }
        finally {
            if (!bl2) {
                this.y.b(du2.a(TimeUnit.NANOSECONDS));
            }
        }
        if (map == null) {
            this.y.b(du2.a(TimeUnit.NANOSECONDS));
            throw new af(ab2 + " returned null map from loadAll");
        }
        du2.e();
        boolean bl3 = false;
        for (Map.Entry entry : map.entrySet()) {
            Object k2 = entry.getKey();
            Object v2 = entry.getValue();
            if (k2 == null || v2 == null) {
                bl3 = true;
                continue;
            }
            this.put(k2, v2);
        }
        if (bl3) {
            this.y.b(du2.a(TimeUnit.NANOSECONDS));
            throw new af(ab2 + " returned null keys or values from loadAll");
        }
        this.y.a(du2.a(TimeUnit.NANOSECONDS));
        return map;
    }

    bs d(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).a(object, n2);
    }

    void e(Object object) {
        int n2 = this.a(cl.a(object));
        this.b(n2).a(object, n2, this.z, false);
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        int n2 = this.a(object);
        return this.b(n2).c(object, n2);
    }

    @Override
    public boolean containsValue(Object object) {
        if (object == null) {
            return false;
        }
        long l2 = this.w.a();
        bt[] arrbt = this.j;
        long l3 = -1L;
        for (int i2 = 0; i2 < 3; ++i2) {
            long l4 = 0L;
            for (bt bt2 : arrbt) {
                int n2 = bt2.b;
                AtomicReferenceArray atomicReferenceArray = bt2.f;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); ++i3) {
                    for (bs bs2 = (bs)atomicReferenceArray.get(i3); bs2 != null; bs2 = bs2.b()) {
                        Object object2 = bt2.c(bs2, l2);
                        if (object2 == null || !this.m.a(object, object2)) continue;
                        return true;
                    }
                }
                l4 += (long)bt2.d;
            }
            if (l4 == l3) break;
            l3 = l4;
        }
        return false;
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.a(object);
        return this.b(n2).a(object, n2, object2, false);
    }

    @Override
    public Object putIfAbsent(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.a(object);
        return this.b(n2).a(object, n2, object2, true);
    }

    @Override
    public void putAll(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            this.put(entry.getKey(), entry.getValue());
        }
    }

    @Override
    public Object remove(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.a(object);
        return this.b(n2).d(object, n2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        if (object == null || object2 == null) {
            return false;
        }
        int n2 = this.a(object);
        return this.b(n2).b(object, n2, object2);
    }

    @Override
    public boolean replace(Object object, Object object2, Object object3) {
        cl.a(object);
        cl.a(object3);
        if (object2 == null) {
            return false;
        }
        int n2 = this.a(object);
        return this.b(n2).a(object, n2, object2, object3);
    }

    @Override
    public Object replace(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.a(object);
        return this.b(n2).a(object, n2, object2);
    }

    @Override
    public void clear() {
        for (bt bt2 : this.j) {
            bt2.l();
        }
    }

    void c(Iterable iterable) {
        for (Object t2 : iterable) {
            this.remove(t2);
        }
    }

    @Override
    public Set keySet() {
        Set set = this.C;
        return set != null ? set : (this.C = new bj(this, this));
    }

    @Override
    public Collection values() {
        Collection collection = this.D;
        return collection != null ? collection : (this.D = new ch(this, this));
    }

    @Override
    public Set entrySet() {
        Set set = this.E;
        return set != null ? set : (this.E = new bg(this, this));
    }
}

