/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.b.i;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ak;
import io.netty.c.a.d.al;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.ax;
import io.netty.c.a.d.b;
import io.netty.c.a.d.bj;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.j;
import io.netty.c.a.d.r;
import io.netty.c.a.q;
import io.netty.channel.a.a;
import io.netty.channel.bd;
import io.netty.util.x;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;

public abstract class ai
extends q {
    private final Queue b = new ArrayDeque();
    private String c;
    private a d;
    private al e = al.b;

    @Override
    public boolean b(Object object) {
        return object instanceof ad || object instanceof bm;
    }

    protected void a(bd bd2, bj bj2, List list) {
        String string = bj2.q().b("Accept-Encoding");
        if (string == null) {
            string = "identity";
        }
        this.b.add(string);
        list.add(x.a(bj2));
    }

    protected void a(bd bd2, ax ax2, List list) {
        boolean bl2 = ax2 instanceof bm && ax2 instanceof bs;
        switch (this.e) {
            case b: {
                ai.a(ax2);
                assert (this.d == null);
                bm bm2 = (bm)ax2;
                if (bm2.s().a() == 100) {
                    if (bl2) {
                        list.add(x.a(bm2));
                        break;
                    }
                    list.add(bm2);
                    this.e = al.a;
                    break;
                }
                this.c = (String)this.b.poll();
                if (this.c == null) {
                    throw new IllegalStateException("cannot send more responses than requests");
                }
                if (bl2 && !((i)((Object)bm2)).a().u()) {
                    list.add(x.a(bm2));
                    break;
                }
                ak ak2 = this.a(bm2, this.c);
                if (ak2 == null) {
                    if (bl2) {
                        list.add(x.a(bm2));
                        break;
                    }
                    list.add(bm2);
                    this.e = al.a;
                    break;
                }
                this.d = ak2.b();
                bm2.q().b("Content-Encoding", (Object)ak2.a());
                bm2.q().a("Content-Length");
                bm2.q().b("Transfer-Encoding", (Object)"chunked");
                if (bl2) {
                    r r2 = new r(bm2.r(), bm2.s());
                    r2.q().b(bm2.q());
                    list.add(r2);
                } else {
                    list.add(bm2);
                    this.e = al.c;
                    if (!(ax2 instanceof ad)) break;
                }
            }
            case c: {
                ai.b(ax2);
                if (!this.a((ad)ax2, list)) break;
                this.e = al.b;
                break;
            }
            case a: {
                ai.b(ax2);
                list.add(x.a(ax2));
                if (!(ax2 instanceof bs)) break;
                this.e = al.b;
            }
        }
    }

    private static void a(ax ax2) {
        if (!(ax2 instanceof bm)) {
            throw new IllegalStateException("unexpected message type: " + ax2.getClass().getName() + " (expected: " + bm.class.getSimpleName() + ')');
        }
    }

    private static void b(ax ax2) {
        if (!(ax2 instanceof ad)) {
            throw new IllegalStateException("unexpected message type: " + ax2.getClass().getName() + " (expected: " + ad.class.getSimpleName() + ')');
        }
    }

    private boolean a(ad ad2, List list) {
        g g2 = ad2.a();
        this.a(g2, list);
        if (ad2 instanceof bs) {
            this.a(list);
            bs bs2 = (bs)ad2;
            ar ar2 = bs2.e();
            if (ar2.c()) {
                list.add(bs.b);
            } else {
                list.add(new b(ar2));
            }
            return true;
        }
        return false;
    }

    protected abstract ak a(bm var1, String var2);

    @Override
    public void f(bd bd2) {
        this.a();
        super.f(bd2);
    }

    @Override
    public void b(bd bd2) {
        this.a();
        super.b(bd2);
    }

    private void a() {
        if (this.d != null) {
            if (this.d.P()) {
                g g2;
                while ((g2 = (g)this.d.O()) != null) {
                    g2.ad();
                }
            }
            this.d = null;
        }
    }

    private void a(g g2, List list) {
        this.d.b(new Object[]{g2.ab()});
        this.b(list);
    }

    private void a(List list) {
        if (this.d.P()) {
            this.b(list);
        }
        this.d = null;
    }

    private void b(List list) {
        g g2;
        while ((g2 = (g)this.d.O()) != null) {
            if (!g2.u()) {
                g2.ad();
                continue;
            }
            list.add(new j(g2));
        }
    }

    @Override
    protected /* synthetic */ void b(bd bd2, Object object, List list) {
        this.a(bd2, (bj)object, list);
    }
}

