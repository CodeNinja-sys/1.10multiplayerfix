/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.i;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.a.h;
import net.minecraft.client.g.bd;
import net.minecraft.client.g.i.f;
import net.minecraft.client.g.i.n;
import net.minecraft.client.j.be;
import net.minecraft.client.r;
import net.minecraft.u.bp;
import net.minecraft.w.h.al;
import net.minecraft.w.h.p;

public class k
extends n {
    private static final Map a = sz.c();

    public k(f f2, be be2, float f3) {
        super(f2, be2, f3);
    }

    protected void a(al al2, float f2) {
        float f3 = 1.0f;
        p p2 = al2.p();
        if (p2 == p.b) {
            f3 *= 0.87f;
        } else if (p2 == p.c) {
            f3 *= 0.92f;
        }
        bd.b(f3, f3, f3);
        super.a(al2, f2);
    }

    protected bp a(al al2) {
        return !al2.dC() ? al2.p().e() : this.b(al2);
    }

    private bp b(al al2) {
        String string = al2.dE();
        if (!al2.dD()) {
            return null;
        }
        bp bp2 = (bp)a.get(string);
        if (bp2 == null) {
            bp2 = new bp(string);
            r.z().N().a(bp2, new h(al2.dF()));
            a.put(string, bp2);
        }
        return bp2;
    }

    @Override
    protected /* synthetic */ bp a(net.minecraft.w.n n2) {
        return this.a((al)n2);
    }
}

