/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.h.af;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.a.g;
import net.minecraft.m.ac;
import net.minecraft.m.ba;
import net.minecraft.m.ca;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.w.a.b;

public class x
extends r {
    private final af a;
    private final b f;
    private int g;

    public x(b b2, af af2, y y2, int n2, int n3, int n4) {
        super(y2, n2, n3, n4);
        this.f = b2;
        this.a = af2;
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    @Override
    public cu a(int n2) {
        if (this.c()) {
            this.g += Math.min(n2, this.b().b);
        }
        return super.a(n2);
    }

    @Override
    protected void a(cu cu2, int n2) {
        this.g += n2;
        this.c(cu2);
    }

    @Override
    protected void c(cu cu2) {
        if (this.g > 0) {
            cu2.a(this.f.aQ, this.f, this.g);
        }
        this.g = 0;
        if (cu2.a() == cg.a(p.ai)) {
            this.f.a((k)j.h);
        }
        if (cu2.a() instanceof ba) {
            this.f.a((k)j.i);
        }
        if (cu2.a() == cg.a(p.al)) {
            this.f.a((k)j.j);
        }
        if (cu2.a() instanceof ac) {
            this.f.a((k)j.l);
        }
        if (cu2.a() == w.R) {
            this.f.a((k)j.m);
        }
        if (cu2.a() == w.bg) {
            this.f.a((k)j.n);
        }
        if (cu2.a() instanceof ba && ((ba)cu2.a()).e() != net.minecraft.m.p.a) {
            this.f.a((k)j.o);
        }
        if (cu2.a() instanceof ca) {
            this.f.a((k)j.r);
        }
        if (cu2.a() == cg.a(p.bC)) {
            this.f.a((k)j.E);
        }
        if (cu2.a() == cg.a(p.X)) {
            this.f.a((k)j.G);
        }
    }

    @Override
    public void a(b b2, cu cu2) {
        this.c(cu2);
        cu[] arrcu = net.minecraft.m.a.g.a().b(this.a, b2.aQ);
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            cu cu3 = this.a.a(i2);
            cu cu4 = arrcu[i2];
            if (cu3 != null) {
                this.a.a(i2, 1);
                cu3 = this.a.a(i2);
            }
            if (cu4 == null) continue;
            if (cu3 == null) {
                this.a.a(i2, cu4);
                continue;
            }
            if (cu.c(cu3, cu4) && cu.a(cu3, cu4)) {
                cu4.b += cu3.b;
                this.a.a(i2, cu4);
                continue;
            }
            if (this.f.q.c(cu4)) continue;
            this.f.a(cu4, false);
        }
    }
}

