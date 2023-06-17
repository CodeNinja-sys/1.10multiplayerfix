/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cu;
import net.minecraft.q.k;

class i
implements u {
    private i() {
    }

    @Override
    public boolean a(af af2, k k2) {
        cu cu2 = null;
        cu cu3 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            boolean bl2;
            cu cu4 = af2.a(i2);
            if (cu4 == null) continue;
            if (cu4.a() != w.cO) {
                return false;
            }
            if (cu2 != null && cu3 != null) {
                return false;
            }
            int n2 = net.minecraft.f.w.b(cu4);
            boolean bl3 = bl2 = net.minecraft.f.w.c(cu4) > 0;
            if (cu2 != null) {
                if (bl2) {
                    return false;
                }
                if (n2 != net.minecraft.f.w.b(cu2)) {
                    return false;
                }
                cu3 = cu4;
                continue;
            }
            if (cu3 != null) {
                if (!bl2) {
                    return false;
                }
                if (n2 != net.minecraft.f.w.b(cu3)) {
                    return false;
                }
                cu2 = cu4;
                continue;
            }
            if (bl2) {
                cu2 = cu4;
                continue;
            }
            cu3 = cu4;
        }
        return cu2 != null && cu3 != null;
    }

    @Override
    public cu a(af af2) {
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null || net.minecraft.f.w.c(cu2) <= 0) continue;
            cu cu3 = cu2.j();
            cu3.b = 1;
            return cu3;
        }
        return null;
    }

    @Override
    public int a() {
        return 2;
    }

    @Override
    public cu b() {
        return null;
    }

    @Override
    public cu[] b(af af2) {
        cu[] arrcu = new cu[af2.e()];
        for (int i2 = 0; i2 < arrcu.length; ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null) continue;
            if (cu2.a().q()) {
                arrcu[i2] = new cu(cu2.a().p());
                continue;
            }
            if (!cu2.n() || net.minecraft.f.w.c(cu2) <= 0) continue;
            arrcu[i2] = cu2.j();
            arrcu[i2].b = 1;
        }
        return arrcu;
    }

    /* synthetic */ i(i i2) {
        this();
    }
}

