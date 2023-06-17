/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.b.e;
import net.minecraft.g.bo;
import net.minecraft.g.bp;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.db;
import net.minecraft.g.fd;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.v.d;
import net.minecraft.w.e.aj;

public class dc
extends cn {
    public static final e a = e.a("variant", bp.class);

    public dc() {
        super(h.B);
        this.z(this.O.b().a(a, (Comparable)((Object)bp.a)));
        this.c(0.0f);
        this.a(d.c);
    }

    @Override
    public int a(Random random) {
        return 0;
    }

    public static boolean l(b b2) {
        cn cn2 = b2.c();
        return b2 == p.b.v().a(bo.a, (Comparable)((Object)db.a)) || cn2 == p.e || cn2 == p.bf;
    }

    @Override
    protected cu j(b b2) {
        switch ((bp)((Object)b2.a(a))) {
            case b: {
                return new cu(p.e);
            }
            case c: {
                return new cu(p.bf);
            }
            case d: {
                return new cu(p.bf, 1, fd.b.b());
            }
            case e: {
                return new cu(p.bf, 1, fd.c.b());
            }
            case f: {
                return new cu(p.bf, 1, fd.d.b());
            }
        }
        return new cu(p.b);
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, float f2, int n2) {
        if (!k2.C && k2.G().b("doTileDrops")) {
            aj aj2 = new aj(k2);
            aj2.b((double)b2.cy_() + 0.5, b2.k(), (double)b2.l() + 0.5, 0.0f, 0.0f);
            k2.a(aj2);
            aj2.ag();
        }
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(this, 1, b3.c().b(b3));
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (bp bp2 : bp.values()) {
            list.add(new cu(cg2, 1, bp2.c()));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)bp.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((bp)((Object)b2.a(a))).c();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

