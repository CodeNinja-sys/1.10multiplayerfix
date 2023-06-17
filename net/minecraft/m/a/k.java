/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m.a;

import com.a.a.d.ov;
import java.util.ArrayList;
import net.minecraft.a.w;
import net.minecraft.h.af;
import net.minecraft.m.a.u;
import net.minecraft.m.br;
import net.minecraft.m.cd;
import net.minecraft.m.cu;
import net.minecraft.m.dn;
import net.minecraft.w.h.ad;

public class k
implements u {
    @Override
    public boolean a(af af2, net.minecraft.q.k k2) {
        cu cu2 = null;
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < af2.e(); ++i2) {
            cu cu3 = af2.a(i2);
            if (cu3 == null) continue;
            if (cu3.a() instanceof dn) {
                dn dn2 = (dn)cu3.a();
                if (dn2.g() != br.a || cu2 != null) {
                    return false;
                }
                cu2 = cu3;
                continue;
            }
            if (cu3.a() != w.bd) {
                return false;
            }
            arrayList.add(cu3);
        }
        return cu2 != null && !arrayList.isEmpty();
    }

    @Override
    public cu a(af af2) {
        float f2;
        float f3;
        int n2;
        int n3;
        cu cu2 = null;
        int[] arrn = new int[3];
        int n4 = 0;
        int n5 = 0;
        dn dn2 = null;
        for (n3 = 0; n3 < af2.e(); ++n3) {
            cu cu3 = af2.a(n3);
            if (cu3 == null) continue;
            if (cu3.a() instanceof dn) {
                dn2 = (dn)cu3.a();
                if (dn2.g() != br.a || cu2 != null) {
                    return null;
                }
                cu2 = cu3.j();
                cu2.b = 1;
                if (!dn2.h(cu3)) continue;
                n2 = dn2.i(cu2);
                f3 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                f2 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                float f4 = (float)(n2 & 0xFF) / 255.0f;
                n4 = (int)((float)n4 + Math.max(f3, Math.max(f2, f4)) * 255.0f);
                arrn[0] = (int)((float)arrn[0] + f3 * 255.0f);
                arrn[1] = (int)((float)arrn[1] + f2 * 255.0f);
                arrn[2] = (int)((float)arrn[2] + f4 * 255.0f);
                ++n5;
                continue;
            }
            if (cu3.a() != w.bd) {
                return null;
            }
            float[] arrf = ad.a(cd.a(cu3.h()));
            int n6 = (int)(arrf[0] * 255.0f);
            int n7 = (int)(arrf[1] * 255.0f);
            int n8 = (int)(arrf[2] * 255.0f);
            n4 += Math.max(n6, Math.max(n7, n8));
            arrn[0] = arrn[0] + n6;
            arrn[1] = arrn[1] + n7;
            arrn[2] = arrn[2] + n8;
            ++n5;
        }
        if (dn2 == null) {
            return null;
        }
        n3 = arrn[0] / n5;
        int n9 = arrn[1] / n5;
        n2 = arrn[2] / n5;
        f3 = (float)n4 / (float)n5;
        f2 = Math.max(n3, Math.max(n9, n2));
        n3 = (int)((float)n3 * f3 / f2);
        n9 = (int)((float)n9 * f3 / f2);
        n2 = (int)((float)n2 * f3 / f2);
        int n10 = (n3 << 8) + n9;
        n10 = (n10 << 8) + n2;
        dn2.a(cu2, n10);
        return cu2;
    }

    @Override
    public int a() {
        return 10;
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

