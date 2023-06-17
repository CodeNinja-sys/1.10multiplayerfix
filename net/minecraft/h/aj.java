/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.af;
import net.minecraft.h.am;
import net.minecraft.h.ap;
import net.minecraft.h.aq;
import net.minecraft.h.au;
import net.minecraft.h.k;
import net.minecraft.h.m;
import net.minecraft.h.r;
import net.minecraft.h.x;
import net.minecraft.h.y;
import net.minecraft.m.a.g;
import net.minecraft.m.cu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;
import net.minecraft.w.f;

public class aj
extends aq {
    private static final k[] h = new k[]{k.f, k.e, k.d, k.c};
    public af a = new af(this, 2, 2);
    public y b = new m();
    public boolean c;
    private final b i;

    public aj(a a2, boolean bl2, b b2) {
        int n2;
        this.c = bl2;
        this.i = b2;
        this.a(new x(a2.e, this.a, this.b, 0, 154, 28));
        for (n2 = 0; n2 < 2; ++n2) {
            for (int i2 = 0; i2 < 2; ++i2) {
                this.a(new r(this.a, i2 + n2 * 2, 98 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            k k2 = h[n2];
            this.a(new am(this, a2, 36 + (3 - n2), 8, 8 + n2 * 18, k2));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                this.a(new r(a2, i3 + (n2 + 1) * 9, 8 + i3 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 142));
        }
        this.a(new ap(this, a2, 40, 77, 62));
        this.a(this.a);
    }

    @Override
    public void a(y y2) {
        this.b.a(0, net.minecraft.m.a.g.a().a(this.a, this.i.aQ));
    }

    @Override
    public void b(b b2) {
        super.b(b2);
        for (int i2 = 0; i2 < 4; ++i2) {
            cu cu2 = this.a.b(i2);
            if (cu2 == null) continue;
            b2.a(cu2, false);
        }
        this.b.a(0, null);
    }

    @Override
    public boolean a(b b2) {
        return true;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            int n3;
            cu cu3 = r2.b();
            cu2 = cu3.j();
            k k2 = net.minecraft.w.f.c(cu2);
            if (n2 == 0) {
                if (!this.a(cu3, 9, 45, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (n2 >= 1 && n2 < 5 ? !this.a(cu3, 9, 45, false) : (n2 >= 5 && n2 < 9 ? !this.a(cu3, 9, 45, false) : (k2.a() == au.b && !((r)this.e.get(8 - k2.b())).c() ? !this.a(cu3, n3 = 8 - k2.b(), n3 + 1, false) : (k2 == k.b && !((r)this.e.get(45)).c() ? !this.a(cu3, 45, 46, false) : (n2 >= 9 && n2 < 36 ? !this.a(cu3, 36, 45, false) : (n2 >= 36 && n2 < 45 ? !this.a(cu3, 9, 36, false) : !this.a(cu3, 9, 45, false))))))) {
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

