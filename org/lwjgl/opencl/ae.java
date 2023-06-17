/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.as;
import org.lwjgl.opencl.au;
import org.lwjgl.opencl.bj;
import org.lwjgl.x;

public final class ae
extends ar {
    private static final bj b = au.a(ae.class, "CL_DEVICE_UTIL");
    private final au c;
    private final as d;
    private Object e;

    ae(long l2, au au2) {
        this(l2, null, au2);
    }

    ae(long l2, ae ae2) {
        this(l2, ae2, ae2.d());
    }

    ae(long l2, ae ae2, au au2) {
        super(l2, ae2);
        if (this.b()) {
            this.c = au2;
            au2.f().a(this);
            this.d = new as();
            if (ae2 != null) {
                ae2.d.a(this);
            }
        } else {
            this.c = null;
            this.d = null;
        }
    }

    public au d() {
        return this.c;
    }

    public ae a(long l2) {
        return (ae)this.d.a(l2);
    }

    public String a(int n2) {
        return b.e(this, n2);
    }

    public int b(int n2) {
        return b.a(this, n2);
    }

    public boolean c(int n2) {
        return b.a(this, n2) != 0;
    }

    public long d(int n2) {
        return b.b(this, n2);
    }

    public long[] e(int n2) {
        return b.c(this, n2);
    }

    public long f(int n2) {
        return b.d(this, n2);
    }

    void a(Object object) {
        this.e = object;
    }

    Object e() {
        return this.e;
    }

    @Override
    int cP_() {
        if (this.m() == null) {
            return this.n();
        }
        return super.cP_();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    int f() {
        if (this.m() == null) {
            return this.n();
        }
        try {
            int n2 = super.f();
            return n2;
        }
        finally {
            if (!this.b()) {
                ((ae)this.m()).d.b(this);
            }
        }
    }

    as h() {
        return this.d;
    }

    void a(x x2) {
        for (int i2 = x2.e(); i2 < x2.g(); ++i2) {
            long l2 = x2.d(i2);
            if (l2 == 0L) continue;
            new ae(l2, this);
        }
    }
}

