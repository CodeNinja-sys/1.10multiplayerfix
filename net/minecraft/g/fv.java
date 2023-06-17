/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;

public class fv
extends cn {
    private final boolean a;

    public fv(boolean bl2) {
        super(h.t);
        this.a = bl2;
        if (bl2) {
            this.a(1.0f);
        }
    }

    @Override
    public void b(k k2, net.minecraft.u.b.b b2, b b3) {
        if (!k2.C) {
            if (this.a && !k2.x(b2)) {
                k2.a(b2, p.bJ.v(), 2);
            } else if (!this.a && k2.x(b2)) {
                k2.a(b2, p.bK.v(), 2);
            }
        }
    }

    @Override
    public void a(b b2, k k2, net.minecraft.u.b.b b3, cn cn2) {
        if (!k2.C) {
            if (this.a && !k2.x(b3)) {
                k2.a(b3, (cn)this, 4);
            } else if (!this.a && k2.x(b3)) {
                k2.a(b3, p.bK.v(), 2);
            }
        }
    }

    @Override
    public void a(k k2, net.minecraft.u.b.b b2, b b3, Random random) {
        if (!k2.C && this.a && !k2.x(b2)) {
            k2.a(b2, p.bJ.v(), 2);
        }
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return cg.a(p.bJ);
    }

    @Override
    public cu c(k k2, net.minecraft.u.b.b b2, b b3) {
        return new cu(p.bJ);
    }

    @Override
    protected cu j(b b2) {
        return new cu(p.bJ);
    }
}

