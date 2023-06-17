/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.h.aa;
import net.minecraft.h.aq;
import net.minecraft.h.av;
import net.minecraft.h.i;
import net.minecraft.h.r;
import net.minecraft.h.y;
import net.minecraft.m.a.w;
import net.minecraft.m.cu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

public class h
extends aq {
    private final y a;
    private int b;
    private int c;
    private int h;
    private int i;

    public h(a a2, y y2) {
        int n2;
        this.a = y2;
        this.a(new r(y2, 0, 56, 17));
        this.a(new av(y2, 1, 56, 53));
        this.a(new aa(a2.e, y2, 2, 116, 35));
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
            if (this.b != this.a.c(2)) {
                i3.a((aq)this, 2, this.a.c(2));
            }
            if (this.h != this.a.c(0)) {
                i3.a((aq)this, 0, this.a.c(0));
            }
            if (this.i != this.a.c(1)) {
                i3.a((aq)this, 1, this.a.c(1));
            }
            if (this.c == this.a.c(3)) continue;
            i3.a((aq)this, 3, this.a.c(3));
        }
        this.b = this.a.c(2);
        this.h = this.a.c(0);
        this.i = this.a.c(1);
        this.c = this.a.c(3);
    }

    @Override
    public void a(int n2, int n3) {
        this.a.b(n2, n3);
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
            if (n2 == 2) {
                if (!this.a(cu3, 3, 39, true)) {
                    return null;
                }
                r2.a(cu3, cu2);
            } else if (n2 != 1 && n2 != 0 ? (w.a().a(cu3) != null ? !this.a(cu3, 0, 1, false) : (net.minecraft.f.aa.c(cu3) ? !this.a(cu3, 1, 2, false) : (n2 >= 3 && n2 < 30 ? !this.a(cu3, 30, 39, false) : n2 >= 30 && n2 < 39 && !this.a(cu3, 3, 30, false)))) : !this.a(cu3, 3, 39, false)) {
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

