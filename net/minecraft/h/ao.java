/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.ah;
import net.minecraft.h.aq;
import net.minecraft.h.i;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.cu;
import net.minecraft.w.a.b;

public class ao
extends aq {
    private final y a;
    private final ah b;

    public ao(y y2, y y3) {
        int n2;
        this.a = y3;
        this.b = new ah(this, y3, 0, 136, 110);
        this.a(this.b);
        int n3 = 36;
        int n4 = 137;
        for (n2 = 0; n2 < 3; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(y2, i2 + n2 * 9 + 9, 36 + i2 * 18, 137 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(y2, n2, 36 + n2 * 18, 195));
        }
    }

    @Override
    public void a(i i2) {
        super.a(i2);
        i2.a((aq)this, this.a);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.b(n2, n3);
    }

    public y b() {
        return this.a;
    }

    @Override
    public void b(b b2) {
        cu cu2;
        super.b(b2);
        if (b2 != null && !b2.aQ.C && (cu2 = this.b.a(this.b.a())) != null) {
            b2.a(cu2, false);
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
            if (n2 == 0) {
                if (!this.a(cu3, 1, 37, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (!this.b.c() && this.b.a(cu3) && cu3.b == 1 ? !this.a(cu3, 0, 1, false) : (n2 >= 1 && n2 < 28 ? !this.a(cu3, 28, 37, false) : (n2 >= 28 && n2 < 37 ? !this.a(cu3, 1, 28, false) : !this.a(cu3, 1, 37, false)))) {
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

