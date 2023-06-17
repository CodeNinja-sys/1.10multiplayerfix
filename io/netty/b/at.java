/*
 * Decompiled with CFR 0.150.
 */
package io.netty.b;

import io.netty.b.ak;
import io.netty.b.e;
import io.netty.b.g;
import io.netty.b.h;
import io.netty.util.p;
import io.netty.util.t;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

abstract class at
extends e {
    private final t k;
    protected ak d;
    protected long e;
    protected Object f;
    protected int g;
    protected int h;
    int i;
    private ByteBuffer l;

    protected at(t t2, int n2) {
        super(n2);
        this.k = t2;
    }

    void a(ak ak2, long l2, int n2, int n3, int n4) {
        assert (l2 >= 0L);
        assert (ak2 != null);
        this.d = ak2;
        this.e = l2;
        this.f = ak2.b;
        this.g = n2;
        this.h = n3;
        this.i = n4;
        this.a(0, 0);
        this.l = null;
    }

    void a(ak ak2, int n2) {
        assert (ak2 != null);
        this.d = ak2;
        this.e = 0L;
        this.f = ak2.b;
        this.g = 0;
        this.h = this.i = n2;
        this.a(0, 0);
        this.l = null;
    }

    @Override
    public final int j() {
        return this.h;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public final g f(int n2) {
        this.b();
        if (this.d.c) {
            if (n2 == this.h) {
                return this;
            }
        } else if (n2 > this.h) {
            if (n2 <= this.i) {
                this.h = n2;
                return this;
            }
        } else {
            if (n2 >= this.h) return this;
            if (n2 > this.i >>> 1) {
                if (this.i <= 512) {
                    if (n2 > this.i - 16) {
                        this.h = n2;
                        this.a(Math.min(this.p(), n2), Math.min(this.q(), n2));
                        return this;
                    }
                } else {
                    this.h = n2;
                    this.a(Math.min(this.p(), n2), Math.min(this.q(), n2));
                    return this;
                }
            }
        }
        this.d.a.a(this, n2, true);
        return this;
    }

    @Override
    public final h l() {
        return this.d.a.b;
    }

    @Override
    public final ByteOrder m() {
        return ByteOrder.BIG_ENDIAN;
    }

    @Override
    public final g n() {
        return null;
    }

    protected final ByteBuffer d() {
        ByteBuffer byteBuffer = this.l;
        if (byteBuffer == null) {
            this.l = byteBuffer = this.a(this.f);
        }
        return byteBuffer;
    }

    protected abstract ByteBuffer a(Object var1);

    @Override
    protected final void c() {
        if (this.e >= 0L) {
            long l2 = this.e;
            this.e = -1L;
            this.f = null;
            this.d.a.a(this.d, l2, this.i);
            this.f();
        }
    }

    private void f() {
        t t2 = this.k;
        if (t2 != null) {
            this.e().a(this, t2);
        }
    }

    protected abstract p e();

    protected final int P(int n2) {
        return this.g + n2;
    }
}

