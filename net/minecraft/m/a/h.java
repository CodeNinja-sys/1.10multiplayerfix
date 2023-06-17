/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import java.util.Collection;
import net.minecraft.a.w;
import net.minecraft.d.m;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;

class h
implements u {
    private static final cu[] a = new cu[9];

    h() {
    }

    @Override
    public boolean a(af af2, k k2) {
        if (af2.c() == 3 && af2.a() == 3) {
            for (int i2 = 0; i2 < af2.c(); ++i2) {
                for (int i3 = 0; i3 < af2.a(); ++i3) {
                    cu cu2 = af2.c(i2, i3);
                    if (cu2 == null) {
                        return false;
                    }
                    cg cg2 = cu2.a();
                    if (!(i2 == 1 && i3 == 1 ? cg2 != w.bI : cg2 != w.g)) continue;
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public cu a(af af2) {
        cu cu2 = af2.c(1, 1);
        if (cu2 != null && cu2.a() == w.bI) {
            cu cu3 = new cu(w.i, 8);
            m.a(cu3, m.c(cu2));
            m.a(cu3, (Collection)m.b(cu2));
            return cu3;
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
        return a;
    }
}

