/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.f;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.a.f;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.u.ad;
import net.minecraft.w.a.b;
import net.minecraft.w.f.g;
import net.minecraft.w.j;
import net.minecraft.w.n;

public class q
extends j {
    public g c;

    public q(k k2) {
        super(k2);
    }

    public q(k k2, net.minecraft.u.b.b b2, ad ad2) {
        super(k2, b2);
        ArrayList arrayList = ov.a();
        g[] arrg = g.values();
        int n2 = arrg.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            g g2;
            this.c = g2 = arrg[i2];
            this.a(ad2);
            if (!this.c()) continue;
            arrayList.add(g2);
        }
        if (!arrayList.isEmpty()) {
            this.c = (g)((Object)arrayList.get(this.bx.nextInt(arrayList.size())));
        }
        this.a(ad2);
    }

    public q(k k2, net.minecraft.u.b.b b2, ad ad2, String string) {
        this(k2, b2, ad2);
        for (g g2 : g.values()) {
            if (!g2.B.equals(string)) continue;
            this.c = g2;
            break;
        }
        this.a(ad2);
    }

    @Override
    public void a(e e2) {
        e2.a("Motive", this.c.B);
        super.a(e2);
    }

    @Override
    public void b(e e2) {
        String string = e2.l("Motive");
        for (g g2 : g.values()) {
            if (!g2.B.equals(string)) continue;
            this.c = g2;
        }
        if (this.c == null) {
            this.c = g.a;
        }
        super.b(e2);
    }

    @Override
    public int f() {
        return this.c.C;
    }

    @Override
    public int g() {
        return this.c.D;
    }

    @Override
    public void b(n n2) {
        if (this.aQ.G().b("doEntityDrops")) {
            this.a(f.dT, 1.0f, 1.0f);
            if (n2 instanceof b) {
                b b2 = (b)n2;
                if (b2.J.d) {
                    return;
                }
            }
            this.a(new cu(w.ap), 0.0f);
        }
    }

    @Override
    public void i() {
        this.a(f.dU, 1.0f, 1.0f);
    }

    @Override
    public void b(double d2, double d3, double d4, float f2, float f3) {
        this.e(d2, d3, d4);
    }

    @Override
    public void a(double d2, double d3, double d4, float f2, float f3, int n2, boolean bl2) {
        net.minecraft.u.b.b b2 = this.a.a(d2 - this.aU, d3 - this.aV, d4 - this.aW);
        this.e(b2.cy_(), b2.k(), b2.l());
    }
}

