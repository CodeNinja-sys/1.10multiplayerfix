/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.ArrayList;

public class boh
implements aho {
    @Override
    public boolean a(yo yo2, iu iu2) {
        bhl bhl2 = null;
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < yo2.aI_(); ++i2) {
            bhl bhl3 = yo2.a(i2);
            if (bhl3 == null) continue;
            if (bhl3.a() instanceof uh) {
                uh uh2 = (uh)bhl3.a();
                if (uh2.f() == in.a && bhl2 == null) {
                    bhl2 = bhl3;
                    continue;
                }
                return false;
            }
            if (bhl3.a() == hp.bd) {
                arrayList.add(bhl3);
                continue;
            }
            return false;
        }
        return bhl2 != null && !arrayList.isEmpty();
    }

    @Override
    public bhl a(yo yo2) {
        float f2;
        float f3;
        int n2;
        int n3;
        bhl bhl2 = null;
        int[] arrn = new int[3];
        int n4 = 0;
        int n5 = 0;
        uh uh2 = null;
        for (n3 = 0; n3 < yo2.aI_(); ++n3) {
            bhl bhl3 = yo2.a(n3);
            if (bhl3 == null) continue;
            if (bhl3.a() instanceof uh) {
                uh2 = (uh)bhl3.a();
                if (uh2.f() == in.a && bhl2 == null) {
                    bhl2 = bhl3.j();
                    bhl2.b = 1;
                    if (!uh2.e(bhl3)) continue;
                    n2 = uh2.f(bhl2);
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
                return null;
            }
            if (bhl3.a() == hp.bd) {
                float[] arrf = ne.a(dck.a(bhl3.h()));
                int n6 = (int)(arrf[0] * 255.0f);
                int n7 = (int)(arrf[1] * 255.0f);
                int n8 = (int)(arrf[2] * 255.0f);
                n4 += Math.max(n6, Math.max(n7, n8));
                arrn[0] = arrn[0] + n6;
                arrn[1] = arrn[1] + n7;
                arrn[2] = arrn[2] + n8;
                ++n5;
                continue;
            }
            return null;
        }
        if (uh2 == null) {
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
        int n10 = n3;
        n10 = (n10 << 8) + n9;
        n10 = (n10 << 8) + n2;
        uh2.a(bhl2, n10);
        return bhl2;
    }

    @Override
    public int a() {
        return 10;
    }

    @Override
    public bhl b() {
        return null;
    }

    @Override
    public bhl[] b(yo yo2) {
        bhl[] arrbhl = new bhl[yo2.aI_()];
        for (int i2 = 0; i2 < arrbhl.length; ++i2) {
            bhl bhl2 = yo2.a(i2);
            if (bhl2 == null || !bhl2.a().q()) continue;
            arrbhl[i2] = new bhl(bhl2.a().p());
        }
        return arrbhl;
    }
}

