/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.i;

import com.a.a.d.aad;
import java.util.Set;
import net.minecraft.i.d;
import net.minecraft.i.g;
import net.minecraft.i.i;
import net.minecraft.i.k;
import net.minecraft.u.b.b;
import net.minecraft.w.f;
import net.minecraft.w.n;

public class l {
    private final k a = new k();
    private final Set b = aad.a();
    private final g[] c = new g[32];
    private final d d;

    public l(d d2) {
        this.d = d2;
    }

    public i a(net.minecraft.q.n n2, f f2, n n3, float f3) {
        return this.a(n2, f2, n3.aU, n3.cT().b, n3.aW, f3);
    }

    public i a(net.minecraft.q.n n2, f f2, b b2, float f3) {
        return this.a(n2, f2, (float)b2.cy_() + 0.5f, (float)b2.k() + 0.5f, (float)b2.l() + 0.5f, f3);
    }

    private i a(net.minecraft.q.n n2, f f2, double d2, double d3, double d4, float f3) {
        this.a.a();
        this.d.a(n2, f2);
        g g2 = this.d.b();
        g g3 = this.d.a(d2, d3, d4);
        i i2 = this.a(g2, g3, f3);
        this.d.a();
        return i2;
    }

    private i a(g g2, g g3, float f2) {
        Object object;
        g2.e = 0.0f;
        g2.g = g2.f = g2.c(g3);
        this.a.a();
        this.b.clear();
        this.a.a(g2);
        Object object2 = g2;
        int n2 = 0;
        while (!this.a.c()) {
            if (++n2 >= 200) break;
            object = this.a.b();
            if (((g)object).equals(g3)) {
                object2 = g3;
                break;
            }
            if (((g)object).c(g3) < ((g)object2).c(g3)) {
                object2 = object;
            }
            ((g)object).i = true;
            int n3 = this.d.a(this.c, (g)object, g3, f2);
            for (int i2 = 0; i2 < n3; ++i2) {
                g g4 = this.c[i2];
                float f3 = ((g)object).c(g4);
                g4.j = ((g)object).j + f3;
                g4.k = f3 + g4.l;
                float f4 = ((g)object).e + g4.k;
                if (!(g4.j < f2) || g4.a() && !(f4 < g4.e)) continue;
                g4.h = object;
                g4.e = f4;
                g4.f = g4.c(g3) + g4.l;
                if (g4.a()) {
                    this.a.a(g4, g4.e + g4.f);
                    continue;
                }
                g4.g = g4.e + g4.f;
                this.a.a(g4);
            }
        }
        if (object2 == g2) {
            return null;
        }
        object = this.a(g2, (g)object2);
        return object;
    }

    private i a(g g2, g arrg) {
        int n2 = 1;
        g[] arrg2 = arrg;
        while (arrg2.h != null) {
            ++n2;
            arrg2 = arrg2.h;
        }
        arrg2 = new g[n2];
        Object object = arrg;
        arrg2[--n2] = arrg;
        while (object.h != null) {
            object = object.h;
            arrg2[--n2] = object;
        }
        return new i(arrg2);
    }
}

