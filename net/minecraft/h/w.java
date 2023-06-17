/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

public class w
extends aq {
    private final y a;
    private final int b;

    public w(y y2, y y3, b b2) {
        int n2;
        int n3;
        this.a = y3;
        this.b = y3.e() / 9;
        y3.b(b2);
        int n4 = (this.b - 4) * 18;
        for (n3 = 0; n3 < this.b; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new r(y3, n2 + n3 * 9, 8 + n2 * 18, 18 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new r(y2, n2 + n3 * 9 + 9, 8 + n2 * 18, 103 + n3 * 18 + n4));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new r(y2, n3, 8 + n3 * 18, 161 + n4));
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
            if (n2 < this.b * 9 ? !this.a(cu3, this.b * 9, this.e.size(), true) : !this.a(cu3, 0, this.b * 9, false)) {
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

    public y b() {
        return this.a;
    }
}

