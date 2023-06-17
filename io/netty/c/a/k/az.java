/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.k.ba;
import io.netty.c.a.k.bb;
import io.netty.c.a.k.bc;
import io.netty.util.c.u;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

final class az {
    private final AtomicInteger a = new AtomicInteger();
    private final AtomicInteger b = new AtomicInteger();
    private final Map c = u.m();
    private final bb d = new bb(this);
    private final AtomicInteger e;
    private final AtomicInteger f;

    az(int n2, int n3) {
        this.e = new AtomicInteger(n2);
        this.f = new AtomicInteger(n3);
    }

    int a(boolean bl2) {
        if (bl2) {
            return this.b.get();
        }
        return this.a.get();
    }

    boolean a() {
        return this.c.isEmpty();
    }

    boolean a(int n2) {
        return this.c.containsKey(n2);
    }

    Map b() {
        TreeMap treeMap = new TreeMap(this.d);
        treeMap.putAll(this.c);
        return treeMap;
    }

    void a(int n2, byte by2, boolean bl2, boolean bl3, int n3, int n4, boolean bl4) {
        bc bc2;
        if (!(bl2 && bl3 || (bc2 = this.c.put(n2, new bc(by2, bl2, bl3, n3, n4))) != null)) {
            if (bl4) {
                this.b.incrementAndGet();
            } else {
                this.a.incrementAndGet();
            }
        }
    }

    private bc c(int n2, boolean bl2) {
        bc bc2 = (bc)this.c.remove(n2);
        if (bc2 != null) {
            if (bl2) {
                this.b.decrementAndGet();
            } else {
                this.a.decrementAndGet();
            }
        }
        return bc2;
    }

    void a(int n2, Throwable throwable, boolean bl2) {
        bc bc2 = this.c(n2, bl2);
        if (bc2 != null) {
            bc2.a(throwable);
        }
    }

    boolean b(int n2) {
        bc bc2 = (bc)this.c.get(n2);
        return bc2 == null || bc2.b();
    }

    void a(int n2, boolean bl2) {
        bc bc2 = (bc)this.c.get(n2);
        if (bc2 != null) {
            bc2.c();
            if (bc2.d()) {
                this.c(n2, bl2);
            }
        }
    }

    boolean c(int n2) {
        bc bc2 = (bc)this.c.get(n2);
        return bc2 == null || bc2.d();
    }

    void b(int n2, boolean bl2) {
        bc bc2 = (bc)this.c.get(n2);
        if (bc2 != null) {
            bc2.e();
            if (bc2.b()) {
                this.c(n2, bl2);
            }
        }
    }

    boolean d(int n2) {
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null && bc2.f();
    }

    void e(int n2) {
        bc bc2 = (bc)this.c.get(n2);
        if (bc2 != null) {
            bc2.g();
        }
    }

    int f(int n2) {
        if (n2 == 0) {
            return this.e.get();
        }
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null ? bc2.h() : -1;
    }

    int a(int n2, int n3) {
        if (n2 == 0) {
            return this.e.addAndGet(n3);
        }
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null ? bc2.a(n3) : -1;
    }

    int b(int n2, int n3) {
        if (n2 == 0) {
            return this.f.addAndGet(n3);
        }
        bc bc2 = (bc)this.c.get(n2);
        if (bc2 == null) {
            return -1;
        }
        if (n3 > 0) {
            bc2.c(0);
        }
        return bc2.b(n3);
    }

    int g(int n2) {
        if (n2 == 0) {
            return 0;
        }
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null ? bc2.i() : 0;
    }

    void h(int n2) {
        for (bc bc2 : this.c.values()) {
            bc2.a(n2);
        }
    }

    void i(int n2) {
        for (bc bc2 : this.c.values()) {
            bc2.b(n2);
            if (n2 >= 0) continue;
            bc2.c(n2);
        }
    }

    boolean a(int n2, ba ba2) {
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null && bc2.a(ba2);
    }

    ba j(int n2) {
        if (n2 == 0) {
            for (Map.Entry entry : this.b().entrySet()) {
                ba ba2;
                bc bc2 = (bc)entry.getValue();
                if (bc2.h() <= 0 || (ba2 = bc2.j()) == null) continue;
                return ba2;
            }
            return null;
        }
        bc bc3 = (bc)this.c.get(n2);
        return bc3 != null ? bc3.j() : null;
    }

    ba k(int n2) {
        bc bc2 = (bc)this.c.get(n2);
        return bc2 != null ? bc2.k() : null;
    }

    static /* synthetic */ Map a(az az2) {
        return az2.c;
    }
}

