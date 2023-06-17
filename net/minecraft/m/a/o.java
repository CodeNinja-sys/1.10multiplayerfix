/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.ct;
import net.minecraft.m.cu;
import net.minecraft.q.k;

public class o
implements u {
    @Override
    public boolean a(af af2, k k2) {
        int n2 = 0;
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null) continue;
            if (cu3.a() == w.bX) {
                if (cu2 != null) {
                    return false;
                }
                cu2 = cu3;
                continue;
            }
            if (cu3.a() != w.bW) {
                return false;
            }
            ++n2;
        }
        return cu2 != null && n2 > 0;
    }

    @Override
    public cu a(af af2) {
        int n2 = 0;
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null) continue;
            if (cu3.a() == w.bX) {
                if (cu2 != null) {
                    return null;
                }
                cu2 = cu3;
                continue;
            }
            if (cu3.a() != w.bW) {
                return null;
            }
            ++n2;
        }
        if (cu2 != null && n2 >= 1 && ct.h(cu2) < 2) {
            cu cu4 = new cu(w.bX, n2);
            cu4.d(cu2.o().g());
            cu4.o().a("generation", ct.h(cu2) + 1);
            if (cu2.s()) {
                cu4.a(cu2.q());
            }
            return cu4;
        }
        return null;
    }

    @Override
    public int a() {
        return 9;
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
            if (cu2 == null || !(cu2.a() instanceof ct)) continue;
            arrcu[i2] = cu2.j();
            arrcu[i2].b = 1;
            break;
        }
        return arrcu;
    }
}

