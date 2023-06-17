/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k.b;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.k.b.k;
import net.minecraft.h.aq;
import net.minecraft.h.r;
import net.minecraft.m.cu;
import net.minecraft.w.a.a;
import net.minecraft.w.a.b;

class e
extends aq {
    public List a = ov.a();

    public e(b b2) {
        int n2;
        a a2 = b2.q;
        for (n2 = 0; n2 < 5; ++n2) {
            for (int i2 = 0; i2 < 9; ++i2) {
                this.a(new r(k.g(), n2 * 9 + i2, 9 + i2 * 18, 18 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.a(new r(a2, n2, 9 + n2 * 18, 112));
        }
        this.a(0.0f);
    }

    @Override
    public boolean a(b b2) {
        return true;
    }

    public void a(float f2) {
        int n2 = (this.a.size() + 9 - 1) / 9 - 5;
        int n3 = (int)((double)(f2 * (float)n2) + 0.5);
        if (n3 < 0) {
            n3 = 0;
        }
        for (int i2 = 0; i2 < 5; ++i2) {
            for (int i3 = 0; i3 < 9; ++i3) {
                int n4 = i3 + (i2 + n3) * 9;
                if (n4 >= 0 && n4 < this.a.size()) {
                    k.g().a(i3 + i2 * 9, (cu)this.a.get(n4));
                    continue;
                }
                k.g().a(i3 + i2 * 9, null);
            }
        }
    }

    public boolean b() {
        return this.a.size() > 45;
    }

    @Override
    protected void a(int n2, int n3, boolean bl2, b b2) {
    }

    @Override
    public cu a(b b2, int n2) {
        r r2;
        if (n2 >= this.e.size() - 9 && n2 < this.e.size() && (r2 = (r)this.e.get(n2)) != null && r2.c()) {
            r2.d(null);
        }
        return null;
    }

    @Override
    public boolean a(cu cu2, r r2) {
        return r2.e > 90;
    }

    @Override
    public boolean b(r r2) {
        return r2.b instanceof a || r2.e > 90 && r2.d <= 162;
    }
}

