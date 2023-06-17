/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.d;

import com.a.a.b.aw;
import com.a.a.b.cl;
import com.a.a.b.eh;
import com.a.a.d.hu;
import com.a.a.d.ql;
import com.a.a.d.qw;
import com.a.a.d.qx;
import com.a.a.d.qz;
import com.a.a.d.ra;
import com.a.a.d.re;
import com.a.a.d.ro;
import com.a.a.d.rx;
import com.a.a.d.ry;
import com.a.a.d.rz;
import com.a.a.d.sa;
import com.a.a.d.sb;
import com.a.a.d.sh;
import com.a.a.d.sr;
import com.a.a.d.ss;
import com.a.a.l.q;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.logging.Level;
import java.util.logging.Logger;

class qy
extends AbstractMap
implements Serializable,
ConcurrentMap {
    static final int b = 0x40000000;
    static final int c = 65536;
    static final int d = 3;
    static final int e = 63;
    static final int f = 16;
    static final long g = 60L;
    private static final Logger a = Logger.getLogger(qy.class.getName());
    final transient int h;
    final transient int i;
    final transient sa[] j;
    final int k;
    final aw l;
    final aw m;
    final sh n;
    final sh o;
    final int p;
    final long q;
    final long r;
    final Queue s;
    final qw t;
    final transient re u;
    final eh v;
    static final sr w = new qz();
    static final Queue x = new ra();
    transient Set y;
    transient Collection z;
    transient Set A;
    private static final long B = 5L;

    qy(ql ql2) {
        int n2;
        int n3;
        this.k = Math.min(ql2.i(), 65536);
        this.n = ql2.k();
        this.o = ql2.n();
        this.l = ql2.g();
        this.m = this.o.a();
        this.p = ql2.f;
        this.q = ql2.p();
        this.r = ql2.o();
        this.u = re.a(this.n, this.c(), this.b());
        this.v = ql2.q();
        this.t = ql2.d();
        this.s = this.t == hu.a ? qy.j() : new ConcurrentLinkedQueue();
        int n4 = Math.min(ql2.h(), 0x40000000);
        if (this.b()) {
            n4 = Math.min(n4, this.p);
        }
        int n5 = 0;
        for (n3 = 1; !(n3 >= this.k || this.b() && n3 * 2 > this.p); n3 <<= 1) {
            ++n5;
        }
        this.i = 32 - n5;
        this.h = n3 - 1;
        this.j = this.d(n3);
        int n6 = n4 / n3;
        if (n6 * n3 < n4) {
            ++n6;
        }
        for (n2 = 1; n2 < n6; n2 <<= 1) {
        }
        if (this.b()) {
            int n7 = this.p / n3 + 1;
            int n8 = this.p % n3;
            for (int i2 = 0; i2 < this.j.length; ++i2) {
                if (i2 == n8) {
                    --n7;
                }
                this.j[i2] = this.a(n2, n7);
            }
        } else {
            for (int i3 = 0; i3 < this.j.length; ++i3) {
                this.j[i3] = this.a(n2, -1);
            }
        }
    }

    boolean b() {
        return this.p != -1;
    }

    boolean c() {
        return this.d() || this.e();
    }

    boolean d() {
        return this.r > 0L;
    }

    boolean e() {
        return this.q > 0L;
    }

    boolean f() {
        return this.n != sh.a;
    }

    boolean g() {
        return this.o != sh.a;
    }

    static sr h() {
        return w;
    }

    static rz i() {
        return ry.a;
    }

    static Queue j() {
        return x;
    }

    static int c(int n2) {
        n2 += n2 << 15 ^ 0xFFFFCD7D;
        n2 ^= n2 >>> 10;
        n2 += n2 << 3;
        n2 ^= n2 >>> 6;
        n2 += (n2 << 2) + (n2 << 14);
        return n2 ^ n2 >>> 16;
    }

    rz a(Object object, int n2, rz rz2) {
        return this.b(n2).a(object, n2, rz2);
    }

    rz a(rz rz2, rz rz3) {
        int n2 = rz2.c();
        return this.b(n2).a(rz2, rz3);
    }

    sr a(rz rz2, Object object) {
        int n2 = rz2.c();
        return this.o.a(this.b(n2), rz2, object);
    }

    int b(Object object) {
        int n2 = this.l.a(object);
        return qy.c(n2);
    }

    void a(sr sr2) {
        rz rz2 = sr2.a();
        int n2 = rz2.c();
        this.b(n2).a(rz2.d(), n2, sr2);
    }

    void a(rz rz2) {
        int n2 = rz2.c();
        this.b(n2).a(rz2, n2);
    }

    boolean b(rz rz2) {
        return this.b(rz2.c()).e(rz2) != null;
    }

    sa b(int n2) {
        return this.j[n2 >>> this.i & this.h];
    }

    sa a(int n2, int n3) {
        return new sa(this, n2, n3);
    }

    Object c(rz rz2) {
        if (rz2.d() == null) {
            return null;
        }
        Object object = rz2.a().get();
        if (object == null) {
            return null;
        }
        if (this.c() && this.d(rz2)) {
            return null;
        }
        return object;
    }

    boolean d(rz rz2) {
        return this.a(rz2, this.v.a());
    }

    boolean a(rz rz2, long l2) {
        return l2 - rz2.e() > 0L;
    }

    static void b(rz rz2, rz rz3) {
        rz2.a(rz3);
        rz3.b(rz2);
    }

    static void e(rz rz2) {
        rz rz3 = qy.i();
        rz2.a(rz3);
        rz2.b(rz3);
    }

    void k() {
        qx qx2;
        while ((qx2 = (qx)this.s.poll()) != null) {
            try {
                this.t.a(qx2);
            }
            catch (Exception exception) {
                a.log(Level.WARNING, "Exception thrown by removal listener", exception);
            }
        }
    }

    static void c(rz rz2, rz rz3) {
        rz2.c(rz3);
        rz3.d(rz2);
    }

    static void f(rz rz2) {
        rz rz3 = qy.i();
        rz2.c(rz3);
        rz2.d(rz3);
    }

    final sa[] d(int n2) {
        return new sa[n2];
    }

    @Override
    public boolean isEmpty() {
        int n2;
        long l2 = 0L;
        sa[] arrsa = this.j;
        for (n2 = 0; n2 < arrsa.length; ++n2) {
            if (arrsa[n2].b != 0) {
                return false;
            }
            l2 += (long)arrsa[n2].c;
        }
        if (l2 != 0L) {
            for (n2 = 0; n2 < arrsa.length; ++n2) {
                if (arrsa[n2].b != 0) {
                    return false;
                }
                l2 -= (long)arrsa[n2].c;
            }
            if (l2 != 0L) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        sa[] arrsa = this.j;
        long l2 = 0L;
        for (int i2 = 0; i2 < arrsa.length; ++i2) {
            l2 += (long)arrsa[i2].b;
        }
        return com.a.a.l.q.b(l2);
    }

    @Override
    public Object get(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.b(object);
        return this.b(n2).c(object, n2);
    }

    rz c(Object object) {
        if (object == null) {
            return null;
        }
        int n2 = this.b(object);
        return this.b(n2).a(object, n2);
    }

    @Override
    public boolean containsKey(Object object) {
        if (object == null) {
            return false;
        }
        int n2 = this.b(object);
        return this.b(n2).d(object, n2);
    }

    @Override
    public boolean containsValue(Object object) {
        if (object == null) {
            return false;
        }
        sa[] arrsa = this.j;
        long l2 = -1L;
        for (int i2 = 0; i2 < 3; ++i2) {
            long l3 = 0L;
            for (sa sa2 : arrsa) {
                int n2 = sa2.b;
                AtomicReferenceArray atomicReferenceArray = sa2.e;
                for (int i3 = 0; i3 < atomicReferenceArray.length(); ++i3) {
                    for (rz rz2 = (rz)atomicReferenceArray.get(i3); rz2 != null; rz2 = rz2.b()) {
                        Object object2 = sa2.e(rz2);
                        if (object2 == null || !this.m.a(object, object2)) continue;
                        return true;
                    }
                }
                l3 += (long)sa2.c;
            }
            if (l3 == l2) break;
            l2 = l3;
        }
        return false;
    }

    @Override
    public Object put(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.b(object);
        return this.b(n2).a(object, n2, object2, false);
    }

    @Override
    public Object putIfAbsent(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.b(object);
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
        int n2 = this.b(object);
        return this.b(n2).e(object, n2);
    }

    @Override
    public boolean remove(Object object, Object object2) {
        if (object == null || object2 == null) {
            return false;
        }
        int n2 = this.b(object);
        return this.b(n2).b(object, n2, object2);
    }

    @Override
    public boolean replace(Object object, Object object2, Object object3) {
        cl.a(object);
        cl.a(object3);
        if (object2 == null) {
            return false;
        }
        int n2 = this.b(object);
        return this.b(n2).a(object, n2, object2, object3);
    }

    @Override
    public Object replace(Object object, Object object2) {
        cl.a(object);
        cl.a(object2);
        int n2 = this.b(object);
        return this.b(n2).a(object, n2, object2);
    }

    @Override
    public void clear() {
        for (sa sa2 : this.j) {
            sa2.m();
        }
    }

    @Override
    public Set keySet() {
        Set set = this.y;
        return set != null ? set : (this.y = new rx(this));
    }

    @Override
    public Collection values() {
        Collection collection = this.z;
        return collection != null ? collection : (this.z = new ss(this));
    }

    @Override
    public Set entrySet() {
        Set set = this.A;
        return set != null ? set : (this.A = new ro(this));
    }

    Object a() {
        return new sb(this.n, this.o, this.l, this.m, this.r, this.q, this.p, this.k, this.t, this);
    }
}

