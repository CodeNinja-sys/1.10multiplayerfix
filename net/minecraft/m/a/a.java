/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.q.k;

public class a
implements u {
    @Override
    public boolean a(af af2, k k2) {
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu2 = af2.a(i2);
            if (cu2 == null) continue;
            arrayList.add(cu2);
            if (arrayList.size() <= 1) continue;
            cu cu3 = (cu)arrayList.get(0);
            if (cu2.a() == cu3.a() && cu3.b == 1 && cu2.b == 1 && cu3.a().l()) continue;
            return false;
        }
        return arrayList.size() == 2;
    }

    @Override
    public cu a(af af2) {
        Object object;
        cu cu2;
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu2 = af2.a(i2);
            if (cu2 == null) continue;
            arrayList.add(cu2);
            if (arrayList.size() <= 1) continue;
            object = (cu)arrayList.get(0);
            if (cu2.a() == ((cu)object).a() && ((cu)object).b == 1 && cu2.b == 1 && ((cu)object).a().l()) continue;
            return null;
        }
        if (arrayList.size() == 2) {
            cu cu3 = (cu)arrayList.get(0);
            cu2 = (cu)arrayList.get(1);
            if (cu3.a() == cu2.a() && cu3.b == 1 && cu2.b == 1 && cu3.a().l()) {
                object = cu3.a();
                int n2 = ((cg)object).k() - cu3.g();
                int n3 = ((cg)object).k() - cu2.g();
                int n4 = n2 + n3 + ((cg)object).k() * 5 / 100;
                int n5 = ((cg)object).k() - n4;
                if (n5 < 0) {
                    n5 = 0;
                }
                return new cu(cu3.a(), 1, n5);
            }
        }
        return null;
    }

    @Override
    public int a() {
        return 4;
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
}

