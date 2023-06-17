/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ah;
import io.netty.b.ak;
import io.netty.b.aq;
import io.netty.b.at;

abstract class ap {
    private final aq[] a;
    private final int b;
    private int c;
    private int d;
    private int e;
    private int f;

    ap(int n2) {
        this.a = new aq[ap.a(n2)];
        for (int i2 = 0; i2 < this.a.length; ++i2) {
            this.a[i2] = new aq(null);
        }
        this.b = n2 / 2;
    }

    private static int a(int n2) {
        if (n2 <= 2) {
            return 2;
        }
        --n2;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return ++n2;
    }

    protected abstract void a(ak var1, long var2, at var4, int var5);

    public boolean a(ak ak2, long l2) {
        aq aq2 = this.a[this.d];
        if (aq2.a != null) {
            return false;
        }
        --this.f;
        aq2.a = ak2;
        aq2.b = l2;
        this.d = this.b(this.d);
        return true;
    }

    public boolean a(at at2, int n2) {
        aq aq2 = this.a[this.c];
        if (aq2.a == null) {
            return false;
        }
        ++this.f;
        if (this.e < this.f) {
            this.e = this.f;
        }
        this.a(aq2.a, aq2.b, at2, n2);
        aq2.a = null;
        this.c = this.b(this.c);
        return true;
    }

    public int a() {
        int n2 = 0;
        this.f = 0;
        this.e = 0;
        int n3 = this.c;
        while (true) {
            if (ap.a(this.a[n3])) {
                ++n2;
            } else {
                return n2;
            }
            n3 = this.b(n3);
        }
    }

    private void b() {
        int n2;
        this.f = 0;
        this.e = 0;
        if (n2 <= this.b) {
            return;
        }
        int n3 = this.c;
        for (n2 = this.c() - this.e; n2 > 0; --n2) {
            if (!ap.a(this.a[n3])) {
                return;
            }
            n3 = this.b(n3);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean a(aq aq2) {
        ak ak2 = aq2.a;
        if (ak2 == null) {
            return false;
        }
        ah ah2 = ak2.a;
        synchronized (ah2) {
            ak2.d.a(ak2, aq2.b);
        }
        aq2.a = null;
        return true;
    }

    private int c() {
        return this.d - this.c & this.a.length - 1;
    }

    private int b(int n2) {
        return n2 + 1 & this.a.length - 1;
    }

    static /* synthetic */ void a(ap ap2) {
        ap2.b();
    }
}

