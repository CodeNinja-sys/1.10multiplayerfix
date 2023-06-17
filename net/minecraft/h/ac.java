/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.a.p;
import net.minecraft.h.af;
import net.minecraft.h.aq;
import net.minecraft.h.m;
import net.minecraft.h.r;
import net.minecraft.h.x;
import net.minecraft.h.y;
import net.minecraft.m.a.g;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class ac
extends aq {
    public af a = new af(this, 3, 3);
    public y b = new m();
    private final k c;
    private final net.minecraft.u.b.b h;

    public ac(a a2, k k2, net.minecraft.u.b.b b2) {
        int n2;
        int n3;
        this.c = k2;
        this.h = b2;
        this.a(new x(a2.e, this.a, this.b, 0, 124, 35));
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(new r(this.a, n2 + n3 * 3, 30 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new r(a2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new r(a2, n3, 8 + n3 * 18, 142));
        }
        this.a(this.a);
    }

    @Override
    public void a(y y2) {
        this.b.a(0, net.minecraft.m.a.g.a().a(this.a, this.c));
    }

    @Override
    public void b(b b2) {
        super.b(b2);
        if (!this.c.C) {
            for (int i2 = 0; i2 < 9; ++i2) {
                cu cu2 = this.a.b(i2);
                if (cu2 == null) continue;
                b2.a(cu2, false);
            }
        }
    }

    @Override
    public boolean a(b b2) {
        return this.c.n(this.h).c() != p.ai ? false : b2.h((double)this.h.cy_() + 0.5, (double)this.h.k() + 0.5, (double)this.h.l() + 0.5) <= 64.0;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 == 0) {
                if (!this.a(cu3, 10, 46, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (n2 >= 10 && n2 < 37 ? !this.a(cu3, 37, 46, false) : (n2 >= 37 && n2 < 46 ? !this.a(cu3, 10, 37, false) : !this.a(cu3, 10, 46, false))) {
                return null;
            }
            if (cu3.b == 0) {
                r2.d(null);
            } else {
                r2.d();
            }
            if (cu3.b == cu2.b) {
                return null;
            }
            r2.a(b2, cu3);
        }
        return cu2;
    }

    @Override
    public boolean a(cu cu2, r r2) {
        return r2.b != this.b && super.a(cu2, r2);
    }
}

