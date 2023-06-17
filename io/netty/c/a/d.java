/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a;

import io.netty.b.bi;
import io.netty.c.a.g;
import io.netty.channel.bd;
import io.netty.channel.bf;
import io.netty.util.c.aa;
import io.netty.util.c.ad;
import java.util.List;

public abstract class d
extends bf {
    io.netty.b.g b;
    private boolean a;
    private boolean c;
    private boolean d;

    protected d() {
        if (this.k()) {
            throw new IllegalStateException("@Sharable annotation is not allowed");
        }
    }

    public void a(boolean bl2) {
        this.a = bl2;
    }

    public boolean a() {
        return this.a;
    }

    protected int b() {
        return this.c().r();
    }

    protected io.netty.b.g c() {
        if (this.b != null) {
            return this.b;
        }
        return bi.c;
    }

    @Override
    public final void f(bd bd2) {
        io.netty.b.g g2 = this.c();
        int n2 = g2.r();
        if (g2.u()) {
            io.netty.b.g g3 = g2.y(n2);
            g2.ad();
            bd2.b(g3);
        } else {
            g2.ad();
        }
        this.b = null;
        bd2.k();
        this.k(bd2);
    }

    protected void k(bd bd2) {
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a_(bd bd2, Object object) {
        int n2;
        if (!(object instanceof io.netty.b.g)) {
            bd2.b(object);
            return;
        }
        aa aa2 = aa.a();
        try {
            io.netty.b.g g2 = (io.netty.b.g)object;
            boolean bl2 = this.d = this.b == null;
            if (this.d) {
                this.b = g2;
            } else {
                if (this.b.q() > this.b.k() - g2.r() || this.b.ac() > 1) {
                    this.a(bd2, g2.r());
                }
                this.b.b(g2);
                g2.ad();
            }
            this.c(bd2, this.b, aa2);
        }
        catch (g g3) {
            try {
                throw g3;
                catch (Throwable throwable) {
                    throw new g(throwable);
                }
            }
            catch (Throwable throwable) {
                int n3;
                if (this.b != null && !this.b.u()) {
                    this.b.ad();
                    this.b = null;
                }
                this.c = (n3 = aa2.size()) == 0;
                int n4 = 0;
                while (true) {
                    if (n4 >= n3) {
                        aa2.b();
                        throw throwable;
                    }
                    bd2.b(aa2.get(n4));
                    ++n4;
                }
            }
        }
        if (this.b != null && !this.b.u()) {
            this.b.ad();
            this.b = null;
        }
        this.c = (n2 = aa2.size()) == 0;
        int n5 = 0;
        while (true) {
            if (n5 >= n2) {
                aa2.b();
                return;
            }
            bd2.b(aa2.get(n5));
            ++n5;
        }
    }

    private void a(bd bd2, int n2) {
        io.netty.b.g g2 = this.b;
        this.b = bd2.d().a(g2.r() + n2);
        this.b.b(g2);
        g2.ad();
    }

    @Override
    public void i(bd bd2) {
        if (this.b != null && !this.d && this.b.ac() == 1) {
            this.b.C();
        }
        if (this.c) {
            this.c = false;
            if (!bd2.b().G().g()) {
                bd2.p();
            }
        }
        bd2.k();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void b(bd bd2) {
        aa aa2 = aa.a();
        try {
            if (this.b != null) {
                this.c(bd2, this.b, aa2);
                this.b(bd2, this.b, aa2);
            } else {
                this.b(bd2, bi.c, aa2);
            }
        }
        catch (g g2) {
            throw g2;
        }
        catch (Exception exception) {
            throw new g(exception);
        }
        finally {
            try {
                if (this.b != null) {
                    this.b.ad();
                    this.b = null;
                }
                int n2 = aa2.size();
                for (int i2 = 0; i2 < n2; ++i2) {
                    bd2.b(aa2.get(i2));
                }
                if (n2 > 0) {
                    bd2.k();
                }
                bd2.j();
            }
            finally {
                aa2.b();
            }
        }
    }

    protected void c(bd bd2, io.netty.b.g g2, List list) {
        try {
            while (g2.u()) {
                int n2 = list.size();
                int n3 = g2.r();
                this.a(bd2, g2, list);
                if (!bd2.w()) {
                    if (n2 == list.size()) {
                        if (n3 != g2.r()) continue;
                    } else {
                        if (n3 == g2.r()) {
                            throw new g(ad.a(this.getClass()) + ".decode() did not read anything but decoded a message.");
                        }
                        if (!this.a()) continue;
                    }
                }
                break;
            }
        }
        catch (g g3) {
            throw g3;
        }
        catch (Throwable throwable) {
            throw new g(throwable);
        }
    }

    protected abstract void a(bd var1, io.netty.b.g var2, List var3);

    protected void b(bd bd2, io.netty.b.g g2, List list) {
        this.a(bd2, g2, list);
    }
}

