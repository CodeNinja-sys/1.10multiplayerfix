/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.ac;
import io.netty.b.bi;
import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.ax;
import io.netty.c.a.d.az;
import io.netty.c.a.d.ba;
import io.netty.c.a.d.bb;
import io.netty.c.a.d.bc;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.i;
import io.netty.c.a.d.k;
import io.netty.c.a.d.u;
import io.netty.c.a.d.w;
import io.netty.c.a.h;
import io.netty.c.a.t;
import io.netty.c.a.y;
import io.netty.channel.bd;
import java.util.List;

public class ay
extends t {
    public static final int a = 1024;
    private static final w c = new i(br.b, bp.a, bi.c);
    private final int d;
    private ba e;
    private boolean f;
    private int h = 1024;
    private bd i;

    public ay(int n2) {
        if (n2 <= 0) {
            throw new IllegalArgumentException("maxContentLength must be a positive integer: " + n2);
        }
        this.d = n2;
    }

    public final int a() {
        return this.h;
    }

    public final void a(int n2) {
        if (n2 < 2) {
            throw new IllegalArgumentException("maxCumulationBufferComponents: " + n2 + " (expected: >= 2)");
        }
        if (this.i != null) {
            throw new IllegalStateException("decoder properties cannot be changed once the decoder is added to a pipeline.");
        }
        this.h = n2;
    }

    protected void a(bd bd2, ax ax2, List list) {
        ba ba2 = this.e;
        if (ax2 instanceof av) {
            this.f = false;
            assert (ba2 == null);
            av av2 = (av)ax2;
            if (ar.f(av2)) {
                bd2.d(c).a((io.netty.util.b.ad)new az(this, bd2));
            }
            if (!av2.i().b()) {
                ar.i(av2);
                list.add(ay.a(av2));
                this.e = null;
                return;
            }
            if (ax2 instanceof bj) {
                bj bj2 = (bj)ax2;
                this.e = ba2 = new bb(bj2, (g)bd2.d().e(this.h), null, null);
            } else if (ax2 instanceof bm) {
                bm bm2 = (bm)ax2;
                this.e = ba2 = new bc(bm2, (g)bi.c(this.h), null, null);
            } else {
                throw new Error();
            }
            ar.i(ba2);
        } else if (ax2 instanceof ad) {
            boolean bl2;
            if (this.f) {
                if (ax2 instanceof bs) {
                    this.e = null;
                }
                return;
            }
            assert (ba2 != null);
            ad ad2 = (ad)ax2;
            ac ac2 = (ac)ba2.a();
            if (ac2.r() > this.d - ad2.a().r()) {
                this.f = true;
                ba2.ad();
                this.e = null;
                throw new y("HTTP content length exceeded " + this.d + " bytes.");
            }
            if (ad2.a().u()) {
                ad2.j();
                ac2.d(ad2.a());
                ac2.Y(ac2.q() + ad2.a().r());
            }
            if (!ad2.i().b()) {
                ba2.a(io.netty.c.a.h.a(ad2.i().d()));
                bl2 = true;
            } else {
                bl2 = ad2 instanceof bs;
            }
            if (bl2) {
                this.e = null;
                if (ad2 instanceof bs) {
                    bs bs2 = (bs)ad2;
                    ba2.a(bs2.e());
                } else {
                    ba2.a(new k());
                }
                ba2.q().b("Content-Length", (Object)String.valueOf(ac2.r()));
                list.add(ba2);
            }
        } else {
            throw new Error();
        }
    }

    @Override
    public void b(bd bd2) {
        super.b(bd2);
        if (this.e != null) {
            this.e.ad();
            this.e = null;
        }
    }

    @Override
    public void e(bd bd2) {
        this.i = bd2;
    }

    @Override
    public void f(bd bd2) {
        super.f(bd2);
        if (this.e != null) {
            this.e.ad();
            this.e = null;
        }
    }

    private static u a(av av2) {
        ba ba2;
        if (av2 instanceof u) {
            return ((u)av2).o();
        }
        if (av2 instanceof bj) {
            ba2 = new bb((bj)av2, bi.c, (ar)new k(), null);
        } else if (av2 instanceof bm) {
            ba2 = new bc((bm)av2, bi.c, (ar)new k(), null);
        } else {
            throw new IllegalStateException();
        }
        return ba2;
    }
}

