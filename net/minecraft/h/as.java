/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.b;
import net.minecraft.h.i;
import net.minecraft.h.r;
import net.minecraft.h.s;
import net.minecraft.h.y;
import net.minecraft.h.z;
import net.minecraft.m.cu;
import net.minecraft.w.a.a;

public class as
extends aq {
    private final y a;
    private final r b;
    private int c;
    private int h;

    public as(a a2, y y2) {
        int n2;
        this.a = y2;
        this.a(new z(a2.e, y2, 0, 56, 51));
        this.a(new z(a2.e, y2, 1, 79, 58));
        this.a(new z(a2.e, y2, 2, 102, 51));
        this.b = this.a(new s(y2, 3, 79, 17));
        this.a(new b(y2, 4, 17, 17));
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(a2, i2 + n2 * 9 + 9, 8 + i2 * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 142));
        }
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        i2.a((aq)this, this.a);
    }

    @Override
    public void a() {
        super.a();
        for (int i2 = 0; i2 < this.g.size(); ++i2) {
            i i3 = (i)this.g.get(i2);
            if (this.c != this.a.c(0)) {
                i3.a((aq)this, 0, this.a.c(0));
            }
            if (this.h == this.a.c(1)) continue;
            i3.a((aq)this, 1, this.a.c(1));
        }
        this.c = this.a.c(0);
        this.h = this.a.c(1);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.b(n2, n3);
    }

    @Override
    public boolean a(net.minecraft.w.a.b b2) {
        return this.a.a_(b2);
    }

    @Override
    public cu a(net.minecraft.w.a.b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if ((n2 < 0 || n2 > 2) && n2 != 3 && n2 != 4) {
                if (!this.b.c() && this.b.a(cu3) ? !this.a(cu3, 3, 4, false) : (z.b(cu2) ? !this.a(cu3, 0, 3, false) : (net.minecraft.h.b.b(cu2) ? !this.a(cu3, 4, 5, false) : (n2 >= 5 && n2 < 32 ? !this.a(cu3, 32, 41, false) : (n2 >= 32 && n2 < 41 ? !this.a(cu3, 5, 32, false) : !this.a(cu3, 5, 41, false)))))) {
                    return null;
                }
            } else {
                if (!this.a(cu3, 5, 41, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
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
}

