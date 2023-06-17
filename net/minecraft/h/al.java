/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class al
extends aq {
    private final y a;

    public al(a a2, y y2, b b2) {
        int n2;
        this.a = y2;
        y2.b(b2);
        int n3 = 51;
        for (n2 = 0; n2 < y2.e(); ++n2) {
            this.a(new r(y2, n2, 44 + n2 * 18, 20));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(a2, i2 + n2 * 9 + 9, 8 + i2 * 18, n2 * 18 + 51));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 8 + n2 * 18, 109));
        }
    }

    @Override
    public boolean a(b b2) {
        return this.a.a_(b2);
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 < this.a.e() ? !this.a(cu3, this.a.e(), this.e.size(), true) : !this.a(cu3, 0, this.a.e(), false)) {
                return null;
            }
            if (cu3.b == 0) {
                r2.d(null);
            } else {
                r2.d();
            }
        }
        return cu2;
    }

    @Override
    public void b(b b2) {
        super.b(b2);
        this.a.c(b2);
    }
}

