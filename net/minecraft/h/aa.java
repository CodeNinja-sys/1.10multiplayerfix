/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.w;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.r.j;
import net.minecraft.r.k;
import net.minecraft.u.b.n;
import net.minecraft.w.a.b;
import net.minecraft.w.f.e;

public class aa
extends r {
    private final b a;
    private int f;

    public aa(b b2, y y2, int n2, int n3, int n4) {
        super(y2, n2, n3, n4);
        this.a = b2;
    }

    @Override
    public boolean a(cu cu2) {
        return false;
    }

    @Override
    public cu a(int n2) {
        if (this.c()) {
            this.f += Math.min(n2, this.b().b);
        }
        return super.a(n2);
    }

    @Override
    public void a(b b2, cu cu2) {
        this.c(cu2);
        super.a(b2, cu2);
    }

    @Override
    protected void a(cu cu2, int n2) {
        this.f += n2;
        this.c(cu2);
    }

    @Override
    protected void c(cu cu2) {
        cu2.a(this.a.aQ, this.a, this.f);
        if (!this.a.aQ.C) {
            int n2;
            int n3 = this.f;
            float f2 = net.minecraft.m.a.w.a().b(cu2);
            if (f2 == 0.0f) {
                n3 = 0;
            } else if (f2 < 1.0f) {
                n2 = n.d((float)n3 * f2);
                if (n2 < n.f((float)n3 * f2) && Math.random() < (double)((float)n3 * f2 - (float)n2)) {
                    ++n2;
                }
                n3 = n2;
            }
            while (n3 > 0) {
                n2 = net.minecraft.w.f.e.b(n3);
                n3 -= n2;
                this.a.aQ.a(new e(this.a.aQ, this.a.aU, this.a.aV + 0.5, this.a.aW + 0.5, n2));
            }
        }
        this.f = 0;
        if (cu2.a() == w.l) {
            this.a.a((k)j.k);
        }
        if (cu2.a() == w.bc) {
            this.a.a((k)j.p);
        }
    }
}

