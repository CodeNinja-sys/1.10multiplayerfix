/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.e;

import io.netty.b.g;
import io.netty.channel.an;
import io.netty.channel.ap;
import io.netty.channel.bh;
import io.netty.channel.bi;
import io.netty.channel.bj;
import io.netty.channel.br;
import io.netty.channel.cv;
import io.netty.channel.dg;
import io.netty.channel.e.b;
import io.netty.util.c.ad;
import io.netty.util.z;
import java.io.IOException;

public abstract class a
extends b {
    private static final bh d = new bh(false);
    private static final String e = " (expected: " + ad.a(g.class) + ", " + ad.a(cv.class) + ')';
    private dg f;
    private volatile boolean g;

    protected a(an an2) {
        super(an2);
    }

    protected boolean Q() {
        return this.g;
    }

    @Override
    public bh F() {
        return d;
    }

    protected boolean L() {
        if (this.g) {
            try {
                Thread.sleep(1000L);
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    protected void M() {
        if (this.L()) {
            return;
        }
        ap ap2 = this.G();
        br br2 = this.c();
        dg dg2 = this.f;
        if (dg2 == null) {
            this.f = dg2 = ap2.f().a();
        }
        g g2 = dg2.a(this.d());
        boolean bl2 = false;
        boolean bl3 = false;
        Throwable throwable = null;
        int n2 = 0;
        try {
            int n3 = 0;
            do {
                if ((n2 = this.a(g2)) > 0) {
                    bl3 = true;
                } else if (n2 < 0) {
                    bl2 = true;
                }
                int n4 = this.N();
                if (n4 <= 0) break;
                if (!g2.v()) {
                    int n5;
                    int n6 = g2.j();
                    if (n6 == (n5 = g2.k())) {
                        if (bl3) {
                            bl3 = false;
                            br2.b(g2);
                            g2 = this.d().a();
                        }
                    } else {
                        int n7 = g2.q();
                        if (n7 + n4 > n5) {
                            g2.f(n5);
                        } else {
                            g2.k(n4);
                        }
                    }
                }
                if (n3 >= Integer.MAX_VALUE - n2) {
                    n3 = Integer.MAX_VALUE;
                    break;
                }
                n3 += n2;
            } while (ap2.g());
            dg2.a(n3);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
        }
        finally {
            if (bl3) {
                br2.b(g2);
            } else {
                g2.ad();
            }
            br2.n();
            if (throwable != null) {
                if (throwable instanceof IOException) {
                    bl2 = true;
                    this.c().a(throwable);
                } else {
                    br2.a(throwable);
                    this.t().b(this.v());
                }
            }
            if (bl2) {
                this.g = true;
                if (this.H()) {
                    if (Boolean.TRUE.equals(this.G().a(bi.i))) {
                        br2.a(io.netty.channel.h.a.a);
                    } else {
                        this.t().b(this.t().h());
                    }
                }
            }
            if (n2 == 0 && this.I()) {
                this.o();
            }
        }
    }

    @Override
    protected void a(bj bj2) {
        Object object;
        while ((object = bj2.b()) != null) {
            z z2;
            if (object instanceof g) {
                z2 = (g)object;
                int n2 = ((g)z2).r();
                while (n2 > 0) {
                    this.b((g)z2);
                    int n3 = ((g)z2).r();
                    bj2.c(n2 - n3);
                    n2 = n3;
                }
                bj2.c();
                continue;
            }
            if (object instanceof cv) {
                z2 = (cv)object;
                long l2 = z2.c();
                this.a((cv)z2);
                bj2.c(z2.c() - l2);
                bj2.c();
                continue;
            }
            bj2.a(new UnsupportedOperationException("unsupported message type: " + ad.a(object)));
        }
    }

    @Override
    protected final Object c(Object object) {
        if (object instanceof g || object instanceof cv) {
            return object;
        }
        throw new UnsupportedOperationException("unsupported message type: " + ad.a(object) + e);
    }

    protected abstract int N();

    protected abstract int a(g var1);

    protected abstract void b(g var1);

    protected abstract void a(cv var1);
}

