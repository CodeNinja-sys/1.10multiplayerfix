/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.u.ad;
import net.minecraft.u.b.b;
import net.minecraft.u.b.g;
import net.minecraft.u.b.n;
import net.minecraft.u.b.t;

public final class h
extends g {
    private boolean f;
    private static final List g = ov.a();

    private h(int n2, int n3, int n4) {
        super(n2, n3, n4);
    }

    public static h m() {
        return h.c(0, 0, 0);
    }

    public static h c(double d2, double d3, double d4) {
        return h.c(n.c(d2), n.c(d3), n.c(d4));
    }

    public static h f(t t2) {
        return h.c(t2.cy_(), t2.k(), t2.l());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static h c(int n2, int n3, int n4) {
        List list = g;
        synchronized (list) {
            h h2;
            if (!g.isEmpty() && (h2 = (h)g.remove(g.size() - 1)) != null && h2.f) {
                h2.f = false;
                h2.d(n2, n3, n4);
                return h2;
            }
        }
        return new h(n2, n3, n4);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void n() {
        List list = g;
        synchronized (list) {
            if (g.size() < 100) {
                g.add(this);
            }
            this.f = true;
        }
    }

    public h d(int n2, int n3, int n4) {
        if (this.f) {
            net.minecraft.u.b.b.j().b("PooledMutableBlockPosition modified after it was released.", new Throwable());
            this.f = false;
        }
        return (h)super.b(n2, n3, n4);
    }

    public h b(net.minecraft.w.n n2) {
        return (h)super.a(n2);
    }

    public h d(double d2, double d3, double d4) {
        return (h)super.b(d2, d3, d4);
    }

    public h g(t t2) {
        return (h)super.e(t2);
    }

    public h c(ad ad2) {
        return (h)super.b(ad2);
    }

    public h c(ad ad2, int n2) {
        return (h)super.b(ad2, n2);
    }

    @Override
    public /* synthetic */ g b(int n2, int n3, int n4) {
        return this.d(n2, n3, n4);
    }

    @Override
    public /* synthetic */ g b(ad ad2) {
        return this.c(ad2);
    }

    @Override
    public /* synthetic */ g b(double d2, double d3, double d4) {
        return this.d(d2, d3, d4);
    }

    @Override
    public /* synthetic */ g e(t t2) {
        return this.g(t2);
    }

    @Override
    public /* synthetic */ g b(ad ad2, int n2) {
        return this.c(ad2, n2);
    }

    @Override
    public /* synthetic */ g a(net.minecraft.w.n n2) {
        return this.b(n2);
    }
}

