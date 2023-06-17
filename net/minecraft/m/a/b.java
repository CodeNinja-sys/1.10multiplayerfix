/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.h.af;
import net.minecraft.m.a.p;
import net.minecraft.m.cu;
import net.minecraft.q.a.y;
import net.minecraft.q.k;

public class b
extends p {
    public b() {
        super(3, 3, new cu[]{new cu(w.aR), new cu(w.aR), new cu(w.aR), new cu(w.aR), new cu(w.bk, 0, 32767), new cu(w.aR), new cu(w.aR), new cu(w.aR), new cu(w.aR)}, new cu(w.cf, 0, 0));
    }

    @Override
    public boolean a(af af2, k k2) {
        if (!super.a(af2, k2)) {
            return false;
        }
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e() && cu2 == null; ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null || cu3.a() != w.bk) continue;
            cu2 = cu3;
        }
        if (cu2 == null) {
            return false;
        }
        y y2 = w.bk.a(cu2, k2);
        return y2 == null ? false : y2.e < 4;
    }

    @Override
    public cu a(af af2) {
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e() && cu2 == null; ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null || cu3.a() != w.bk) continue;
            cu2 = cu3;
        }
        cu2 = cu2.j();
        cu2.b = 1;
        if (cu2.o() == null) {
            cu2.d(new e());
        }
        cu2.o().a("map_scale_direction", 1);
        return cu2;
    }
}

