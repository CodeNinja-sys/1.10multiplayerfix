/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.ad;
import net.minecraft.h.ai;
import net.minecraft.h.aq;
import net.minecraft.h.i;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;
import net.minecraft.w.aj;

public class ag
extends aq {
    private final aj a;
    private final ad b;
    private final k c;

    public ag(a a2, aj aj2, k k2) {
        int n2;
        this.a = aj2;
        this.c = k2;
        this.b = new ad(a2.e, aj2);
        this.a(new r(this.b, 0, 36, 53));
        this.a(new r(this.b, 1, 62, 53));
        this.a(new ai(a2.e, aj2, this.b, 2, 120, 53));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(a2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 142));
        }
    }

    public ad b() {
        return this.b;
    }

    @Override
    public void a(i i2) {
        super.a(i2);
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void a(y y2) {
        this.b.a();
        super.a(y2);
    }

    public void a(int n2) {
        this.b.d(n2);
    }

    @Override
    public void a(int n2, int n3) {
    }

    @Override
    public boolean a(b b2) {
        return this.a.s() == b2;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 == 2) {
                if (!this.a(cu3, 3, 39, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (n2 != 0 && n2 != 1 ? (n2 >= 3 && n2 < 30 ? !this.a(cu3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(cu3, 3, 30, false)) : !this.a(cu3, 3, 39, false)) {
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
    public void b(b b2) {
        super.b(b2);
        this.a.a((b)null);
        super.b(b2);
        if (!this.c.C) {
            cu cu2 = this.b.b(0);
            if (cu2 != null) {
                b2.a(cu2, false);
            }
            if ((cu2 = this.b.b(1)) != null) {
                b2.a(cu2, false);
            }
        }
    }
}

