/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ak;
import io.netty.b.al;
import io.netty.b.am;
import io.netty.b.an;
import io.netty.b.at;
import io.netty.b.au;
import io.netty.util.c.ad;

abstract class ah {
    static final int a = 32;
    final au b;
    private final int i;
    final int c;
    final int d;
    final int e;
    final int f;
    final int g;
    private final am[] j;
    private final am[] k;
    private final al l;
    private final al m;
    private final al n;
    private final al o;
    private final al p;
    private final al q;

    protected ah(au au2, int n2, int n3, int n4, int n5) {
        int n6;
        this.b = au2;
        this.c = n2;
        this.i = n3;
        this.d = n4;
        this.e = n5;
        this.f = ~(n2 - 1);
        this.j = this.j(32);
        for (n6 = 0; n6 < this.j.length; ++n6) {
            this.j[n6] = this.i(n2);
        }
        this.g = n4 - 9;
        this.k = this.j(this.g);
        for (n6 = 0; n6 < this.k.length; ++n6) {
            this.k[n6] = this.i(n2);
        }
        this.q = new al(this, null, 100, Integer.MAX_VALUE);
        this.p = new al(this, this.q, 75, 100);
        this.l = new al(this, this.p, 50, 100);
        this.m = new al(this, this.l, 25, 75);
        this.n = new al(this, this.m, 1, 50);
        this.o = new al(this, this.n, Integer.MIN_VALUE, 25);
        this.q.a = this.p;
        this.p.a = this.l;
        this.l.a = this.m;
        this.m.a = this.n;
        this.n.a = null;
        this.o.a = this.o;
    }

    private am i(int n2) {
        am am2;
        am2.b = am2 = new am(n2);
        am2.c = am2;
        return am2;
    }

    private am[] j(int n2) {
        return new am[n2];
    }

    abstract boolean a();

    at a(an an2, int n2, int n3) {
        at at2 = this.h(n3);
        this.a(an2, at2, n2);
        return at2;
    }

    static int a(int n2) {
        return n2 >>> 4;
    }

    static int b(int n2) {
        int n3 = 0;
        int n4 = n2 >>> 10;
        while (n4 != 0) {
            n4 >>>= 1;
            ++n3;
        }
        return n3;
    }

    boolean c(int n2) {
        return (n2 & this.f) == 0;
    }

    static boolean d(int n2) {
        return (n2 & 0xFFFFFE00) == 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void a(an an2, at at2, int n2) {
        int n3 = this.f(n2);
        if (this.c(n3)) {
            am[] arram;
            int n4;
            if (ah.d(n3)) {
                if (an2.a(this, at2, n2, n3)) {
                    return;
                }
                n4 = ah.a(n3);
                arram = this.j;
            } else {
                if (an2.b(this, at2, n2, n3)) {
                    return;
                }
                n4 = ah.b(n3);
                arram = this.k;
            }
            ah ah2 = this;
            synchronized (ah2) {
                am am2 = arram[n4];
                am am3 = am2.c;
                if (am3 != am2) {
                    assert (am3.d && am3.e == n3);
                    long l2 = am3.a();
                    assert (l2 >= 0L);
                    am3.a.b(at2, l2, n2);
                    return;
                }
            }
        } else if (n3 <= this.e) {
            if (an2.c(this, at2, n2, n3)) {
                return;
            }
        } else {
            this.a(at2, n2);
            return;
        }
        this.a(at2, n2, n3);
    }

    private synchronized void a(at at2, int n2, int n3) {
        if (this.l.a(at2, n2, n3) || this.m.a(at2, n2, n3) || this.n.a(at2, n2, n3) || this.o.a(at2, n2, n3) || this.p.a(at2, n2, n3) || this.q.a(at2, n2, n3)) {
            return;
        }
        ak ak2 = this.a(this.c, this.i, this.d, this.e);
        long l2 = ak2.a(n3);
        assert (l2 > 0L);
        ak2.a(at2, l2, n2);
        this.o.a(ak2);
    }

    private void a(at at2, int n2) {
        at2.a(this.g(n2), n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void a(ak ak2, long l2, int n2) {
        if (ak2.c) {
            this.a(ak2);
        } else {
            an an2 = (an)this.b.c.f();
            if (an2.a(this, ak2, l2, n2)) {
                return;
            }
            ah ah2 = this;
            synchronized (ah2) {
                ak2.d.a(ak2, l2);
            }
        }
    }

    am e(int n2) {
        am[] arram;
        int n3;
        if (ah.d(n2)) {
            n3 = n2 >>> 4;
            arram = this.j;
        } else {
            n3 = 0;
            n2 >>>= 10;
            while (n2 != 0) {
                n2 >>>= 1;
                ++n3;
            }
            arram = this.k;
        }
        return arram[n3];
    }

    int f(int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("capacity: " + n2 + " (expected: 0+)");
        }
        if (n2 >= this.e) {
            return n2;
        }
        if (!ah.d(n2)) {
            int n3 = n2;
            --n3;
            n3 |= n3 >>> 1;
            n3 |= n3 >>> 2;
            n3 |= n3 >>> 4;
            n3 |= n3 >>> 8;
            n3 |= n3 >>> 16;
            if (++n3 < 0) {
                n3 >>>= 1;
            }
            return n3;
        }
        if ((n2 & 0xF) == 0) {
            return n2;
        }
        return (n2 & 0xFFFFFFF0) + 16;
    }

    void a(at at2, int n2, boolean bl2) {
        if (n2 < 0 || n2 > at2.k()) {
            throw new IllegalArgumentException("newCapacity: " + n2);
        }
        int n3 = at2.h;
        if (n3 == n2) {
            return;
        }
        ak ak2 = at2.d;
        long l2 = at2.e;
        Object object = at2.f;
        int n4 = at2.g;
        int n5 = at2.i;
        int n6 = at2.p();
        int n7 = at2.q();
        this.a((an)this.b.c.f(), at2, n2);
        if (n2 > n3) {
            this.a(object, n4, at2.f, at2.g, n3);
        } else if (n2 < n3) {
            if (n6 < n2) {
                if (n7 > n2) {
                    n7 = n2;
                }
                this.a(object, n4 + n6, at2.f, at2.g + n6, n7 - n6);
            } else {
                n6 = n7 = n2;
            }
        }
        at2.a(n6, n7);
        if (bl2) {
            this.a(ak2, l2, n5);
        }
    }

    protected abstract ak a(int var1, int var2, int var3, int var4);

    protected abstract ak g(int var1);

    protected abstract at h(int var1);

    protected abstract void a(Object var1, int var2, Object var3, int var4, int var5);

    protected abstract void a(ak var1);

    public synchronized String toString() {
        am am2;
        am am3;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Chunk(s) at 0~25%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.o);
        stringBuilder.append(ad.a);
        stringBuilder.append("Chunk(s) at 0~50%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.n);
        stringBuilder.append(ad.a);
        stringBuilder.append("Chunk(s) at 25~75%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.m);
        stringBuilder.append(ad.a);
        stringBuilder.append("Chunk(s) at 50~100%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.l);
        stringBuilder.append(ad.a);
        stringBuilder.append("Chunk(s) at 75~100%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.p);
        stringBuilder.append(ad.a);
        stringBuilder.append("Chunk(s) at 100%:");
        stringBuilder.append(ad.a);
        stringBuilder.append(this.q);
        stringBuilder.append(ad.a);
        stringBuilder.append("tiny subpages:");
        for (n2 = 1; n2 < this.j.length; ++n2) {
            am3 = this.j[n2];
            if (am3.c == am3) continue;
            stringBuilder.append(ad.a);
            stringBuilder.append(n2);
            stringBuilder.append(": ");
            am2 = am3.c;
            do {
                stringBuilder.append(am2);
            } while ((am2 = am2.c) != am3);
        }
        stringBuilder.append(ad.a);
        stringBuilder.append("small subpages:");
        for (n2 = 1; n2 < this.k.length; ++n2) {
            am3 = this.k[n2];
            if (am3.c == am3) continue;
            stringBuilder.append(ad.a);
            stringBuilder.append(n2);
            stringBuilder.append(": ");
            am2 = am3.c;
            do {
                stringBuilder.append(am2);
            } while ((am2 = am2.c) != am3);
        }
        stringBuilder.append(ad.a);
        return stringBuilder.toString();
    }
}

