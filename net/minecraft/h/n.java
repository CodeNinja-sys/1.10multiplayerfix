/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.ak;
import net.minecraft.h.aq;
import net.minecraft.h.d;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;
import net.minecraft.w.h.al;

public class n
extends aq {
    private final y a;
    private final al b;

    public n(y y2, y y3, al al2, b b2) {
        int n2;
        int n3;
        this.a = y3;
        this.b = al2;
        int n4 = 3;
        y3.b(b2);
        int n5 = -18;
        this.a(new d(this, y3, 0, 8, 18));
        this.a(new ak(this, y3, 1, 8, 36, al2));
        if (al2.dp()) {
            for (n3 = 0; n3 < 3; ++n3) {
                for (n2 = 0; n2 < 5; ++n2) {
                    this.a(new r(y3, 2 + n2 + n3 * 5, 80 + n2 * 18, 18 + n3 * 18));
                }
            }
        }
        for (n3 = 0; n3 < 3; ++n3) {
            for (n2 = 0; n2 < 9; ++n2) {
                this.a(new r(y2, n2 + n3 * 9 + 9, 8 + n2 * 18, 102 + n3 * 18 + -18));
            }
        }
        for (n3 = 0; n3 < 9; ++n3) {
            this.a(new r(y2, n3, 8 + n3 * 18, 142));
        }
    }

    @Override
    public boolean a(b b2) {
        return this.a.a_(b2) && this.b.br() && this.b.m(b2) < 8.0f;
    }

    @Override
    public cu a(b b2, int n2) {
        cu cu2 = null;
        r r2 = (r)this.e.get(n2);
        if (r2 != null && r2.c()) {
            cu cu3 = r2.b();
            cu2 = cu3.j();
            if (n2 < this.a.e() ? !this.a(cu3, this.a.e(), this.e.size(), true) : (this.b(1).a(cu3) && !this.b(1).c() ? !this.a(cu3, 1, 2, false) : (this.b(0).a(cu3) ? !this.a(cu3, 0, 1, false) : this.a.e() <= 2 || !this.a(cu3, 2, this.a.e(), false)))) {
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

