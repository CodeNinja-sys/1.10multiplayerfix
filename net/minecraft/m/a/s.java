/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cu;
import net.minecraft.q.k;

public class s
implements u {
    private final cu a;
    private final List b;

    public s(cu cu2, List list) {
        this.a = cu2;
        this.b = list;
    }

    @Override
    public cu b() {
        return this.a;
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

    @Override
    public boolean a(af af2, k k2) {
        ArrayList arrayList = ov.a((Iterable)this.b);
        for (int i2 = 0; i2 < af2.a(); ++i2) {
            for (int i3 = 0; i3 < af2.c(); ++i3) {
                cu cu2 = af2.c(i3, i2);
                if (cu2 == null) continue;
                boolean bl2 = false;
                for (cu cu3 : arrayList) {
                    if (cu2.a() != cu3.a() || cu3.h() != 32767 && cu2.h() != cu3.h()) continue;
                    bl2 = true;
                    arrayList.remove(cu3);
                    break;
                }
                if (bl2) continue;
                return false;
            }
        }
        return arrayList.isEmpty();
    }

    @Override
    public cu a(af af2) {
        return this.a.j();
    }

    @Override
    public int a() {
        return this.b.size();
    }
}

