/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.q.k;

class x
implements u {
    private x() {
    }

    @Override
    public boolean a(af af2, k k2) {
        cu cu2 = null;
        cu cu3 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu4 = af2.a(i2);
            if (cu4 == null) continue;
            if (cu4.a() == w.cO) {
                if (cu3 != null) {
                    return false;
                }
                cu3 = cu4;
                continue;
            }
            if (cu4.a() != w.cQ) {
                return false;
            }
            if (cu2 != null) {
                return false;
            }
            if (cu4.a("BlockEntityTag", false) != null) {
                return false;
            }
            cu2 = cu4;
        }
        return cu2 != null && cu3 != null;
    }

    @Override
    public cu a(af af2) {
        e e2;
        Object object;
        cu cu2 = null;
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            object = af2.a(i2);
            if (object == null || ((cu)object).a() != w.cO) continue;
            cu2 = object;
        }
        cu cu3 = new cu(w.cQ, 1, 0);
        if (cu2.n()) {
            e2 = cu2.o().g();
            object = cd.a(net.minecraft.f.w.b(cu2));
        } else {
            e2 = new e();
            object = cd.a(cu2.g());
        }
        cu3.d(e2);
        net.minecraft.f.w.a(cu3, (cd)object);
        return cu3;
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
            if (cu2 == null || !cu2.a().q()) continue;
            arrcu[i2] = new cu(cu2.a().p());
        }
        return arrcu;
    }

    /* synthetic */ x(x x2) {
        this();
    }
}

