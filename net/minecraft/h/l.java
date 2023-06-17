/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aq;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

public class l
extends aq {
    private final y a;

    public l(y y2, y y3) {
        int n2;
        int n3;
        this.a = y3;
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 3; ++n2) {
                this.a(new r(y3, n2 + n3 * 3, 62 + n2 * 18, 17 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new r(y2, n2 + n3 * 9 + 9, 8 + n2 * 18, 84 + n3 * 18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new r(y2, n3, 8 + n3 * 18, 142));
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
            if (n2 < 9 ? !this.a(cu3, 9, 45, true) : !this.a(cu3, 0, 9, false)) {
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
}

