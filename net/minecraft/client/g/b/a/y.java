/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.u.ad;
import net.minecraft.u.ae;
import net.minecraft.u.b.n;
import org.lwjgl.util.e.d;
import org.lwjgl.util.e.l;

public enum y {
    a(0, 0),
    b(0, 90),
    c(0, 180),
    d(0, 270),
    e(90, 0),
    f(90, 90),
    g(90, 180),
    h(90, 270),
    i(180, 0),
    j(180, 90),
    k(180, 180),
    l(180, 270),
    m(270, 0),
    n(270, 90),
    o(270, 180),
    p(270, 270);

    private static final Map q;
    private final int r;
    private final d s;
    private final int t;
    private final int u;

    static {
        q = sz.c();
        for (y y2 : y.values()) {
            q.put(y2.r, y2);
        }
    }

    private static int b(int n2, int n3) {
        return n2 * 360 + n3;
    }

    /*
     * WARNING - void declaration
     */
    private y() {
        void var4_2;
        void var3_1;
        this.r = y.b((int)var3_1, (int)var4_2);
        this.s = new d();
        d d2 = new d();
        d2.a();
        org.lwjgl.util.e.d.a((float)(-var3_1) * ((float)Math.PI / 180), new l(1.0f, 0.0f, 0.0f), d2, d2);
        this.t = net.minecraft.u.b.n.a((int)(var3_1 / 90));
        d d3 = new d();
        d3.a();
        org.lwjgl.util.e.d.a((float)(-var4_2) * ((float)Math.PI / 180), new l(0.0f, 1.0f, 0.0f), d3, d3);
        this.u = net.minecraft.u.b.n.a((int)(var4_2 / 90));
        org.lwjgl.util.e.d.c(d3, d2, this.s);
    }

    public d a() {
        return this.s;
    }

    public ad a(ad ad2) {
        int n2;
        ad ad3 = ad2;
        for (n2 = 0; n2 < this.t; ++n2) {
            ad3 = ad3.a(ae.a);
        }
        if (ad3.l() != ae.b) {
            for (n2 = 0; n2 < this.u; ++n2) {
                ad3 = ad3.a(ae.b);
            }
        }
        return ad3;
    }

    public int a(ad ad2, int n2) {
        int n3 = n2;
        if (ad2.l() == ae.a) {
            n3 = (n2 + this.t) % 4;
        }
        ad ad3 = ad2;
        for (int i2 = 0; i2 < this.t; ++i2) {
            ad3 = ad3.a(ae.a);
        }
        if (ad3.l() == ae.b) {
            n3 = (n3 + this.u) % 4;
        }
        return n3;
    }

    public static y a(int n2, int n3) {
        return (y)((Object)q.get(y.b(net.minecraft.u.b.n.b(n2, 360), net.minecraft.u.b.n.b(n3, 360))));
    }
}

