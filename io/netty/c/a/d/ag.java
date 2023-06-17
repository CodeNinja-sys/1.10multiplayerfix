/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.b.g;
import io.netty.c.a.d.ad;
import io.netty.c.a.d.ar;
import io.netty.c.a.d.av;
import io.netty.c.a.d.ax;
import io.netty.c.a.d.b;
import io.netty.c.a.d.bm;
import io.netty.c.a.d.bs;
import io.netty.c.a.d.j;
import io.netty.c.a.t;
import io.netty.channel.a.a;
import io.netty.channel.bd;
import io.netty.util.x;
import java.util.List;

public abstract class ag
extends t {
    private a b;
    private av c;
    private boolean d;
    private boolean e;

    protected void a(bd bd2, ax ax2, List list) {
        if (ax2 instanceof bm && ((bm)ax2).s().a() == 100) {
            if (!(ax2 instanceof bs)) {
                this.e = true;
            }
            list.add(x.a(ax2));
            return;
        }
        if (this.e) {
            if (ax2 instanceof bs) {
                this.e = false;
            }
            list.add(x.a(ax2));
            return;
        }
        if (ax2 instanceof av) {
            assert (this.c == null);
            this.c = (av)ax2;
            this.d = false;
            this.a();
        }
        if (ax2 instanceof ad) {
            ad ad2 = (ad)ax2;
            if (!this.d) {
                this.d = true;
                av av2 = this.c;
                ar ar2 = av2.q();
                this.c = null;
                String string = ar2.b("Content-Encoding");
                string = string != null ? string.trim() : "identity";
                this.b = this.a(string);
                if (this.b != null) {
                    String string2 = this.b(string);
                    if ("identity".equals(string2)) {
                        ar2.a("Content-Encoding");
                    } else {
                        ar2.b("Content-Encoding", (Object)string2);
                    }
                    list.add(av2);
                    this.a(ad2, list);
                    if (ar2.d("Content-Length")) {
                        int n2 = 0;
                        int n3 = list.size();
                        for (int i2 = 0; i2 < n3; ++i2) {
                            Object e2 = list.get(i2);
                            if (!(e2 instanceof ad)) continue;
                            n2 += ((ad)e2).a().r();
                        }
                        ar2.b("Content-Length", (Object)Integer.toString(n2));
                    }
                    return;
                }
                if (ad2 instanceof bs) {
                    this.d = false;
                }
                list.add(av2);
                list.add(ad2.j());
                return;
            }
            if (this.b != null) {
                this.a(ad2, list);
            } else {
                if (ad2 instanceof bs) {
                    this.d = false;
                }
                list.add(ad2.j());
            }
        }
    }

    private void a(ad ad2, List list) {
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
        }
    }

    protected abstract a a(String var1);

    protected String b(String string) {
        return "identity";
    }

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
        if (this.b != null) {
            if (this.b.P()) {
                g g2;
                while ((g2 = (g)this.b.O()) != null) {
                    g2.ad();
                }
            }
            this.b = null;
        }
    }

    private void a(g g2, List list) {
        this.b.a(new Object[]{g2.ab()});
        this.b(list);
    }

    private void a(List list) {
        if (this.b.P()) {
            this.b(list);
        }
        this.d = false;
        this.b = null;
    }

    private void b(List list) {
        g g2;
        while ((g2 = (g)this.b.N()) != null) {
            if (!g2.u()) {
                g2.ad();
                continue;
            }
            list.add(new j(g2));
        }
    }
}

