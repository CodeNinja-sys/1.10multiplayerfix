/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ax;
import com.a.a.i.s;
import com.a.a.i.t;
import com.a.a.i.z;
import java.io.InputStream;

final class y
extends s {
    private final long b;
    private final long c;
    final /* synthetic */ s a;

    private y(s s2, long l2, long l3) {
        this.a = s2;
        cl.a(l2 >= 0L, "offset (%s) may not be negative", new Object[]{l2});
        cl.a(l3 >= 0L, "length (%s) may not be negative", new Object[]{l3});
        this.b = l2;
        this.c = l3;
    }

    @Override
    public InputStream a() {
        return this.a(this.a.a());
    }

    @Override
    public InputStream c() {
        return this.a(this.a.c());
    }

    private InputStream a(InputStream inputStream) {
        if (this.b > 0L) {
            try {
                z.b(inputStream, this.b);
            }
            catch (Throwable throwable) {
                ax ax2 = ax.a();
                ax2.a(inputStream);
                try {
                    throw ax2.a(throwable);
                }
                catch (Throwable throwable2) {
                    ax2.close();
                    throw throwable2;
                }
            }
        }
        return z.a(inputStream, this.c);
    }

    @Override
    public s a(long l2, long l3) {
        cl.a(l2 >= 0L, "offset (%s) may not be negative", new Object[]{l2});
        cl.a(l3 >= 0L, "length (%s) may not be negative", new Object[]{l3});
        long l4 = this.c - l2;
        return this.a.a(this.b + l2, Math.min(l3, l4));
    }

    @Override
    public boolean d() {
        return this.c == 0L || super.d();
    }

    public String toString() {
        return this.a.toString() + ".slice(" + this.b + ", " + this.c + ")";
    }

    @Override
    public /* synthetic */ Object h() {
        return super.b();
    }

    /* synthetic */ y(s s2, long l2, long l3, t t2) {
        this(s2, l2, l3);
    }
}

