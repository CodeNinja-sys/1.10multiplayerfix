/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.lwjgl.util.e.l;

public class uy {
    public static final List a = ov.a("layer0", "layer1", "layer2", "layer3", "layer4");

    public bfg a(dam dam2, bfg bfg2) {
        String string;
        HashMap hashMap = sz.c();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < a.size() && bfg2.b(string = (String)a.get(i2)); ++i2) {
            String string2 = bfg2.c(string);
            hashMap.put(string, string2);
            ars ars2 = dam2.a(new bpx(string2).toString());
            arrayList.addAll(this.a(i2, string, ars2));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", bfg2.b("particle") ? bfg2.c("particle") : (String)hashMap.get("layer0"));
        return new bfg(null, arrayList, hashMap, false, false, bfg2.j(), bfg2.f());
    }

    private List a(int n2, String string, ars ars2) {
        HashMap hashMap = sz.c();
        hashMap.put(bqk.d, new cvf(null, n2, string, new bnx(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put(bqk.c, new cvf(null, n2, string, new bnx(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = ov.a();
        arrayList.add(new vo(new l(0.0f, 0.0f, 7.5f), new l(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.a(ars2, string, n2));
        return arrayList;
    }

    private List a(ars ars2, String string, int n2) {
        float f2 = ars2.c();
        float f3 = ars2.d();
        ArrayList arrayList = ov.a();
        for (agi agi2 : this.a(ars2)) {
            float f4 = 0.0f;
            float f5 = 0.0f;
            float f6 = 0.0f;
            float f7 = 0.0f;
            float f8 = 0.0f;
            float f9 = 0.0f;
            float f10 = 0.0f;
            float f11 = 0.0f;
            float f12 = 0.0f;
            float f13 = 0.0f;
            float f14 = agi2.b();
            float f15 = agi2.c();
            float f16 = agi2.d();
            bpw bpw2 = agi2.a();
            switch (bpw2) {
                case a: {
                    f4 = f8 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f5 = f10 = f16;
                    f7 = f11 = f16;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case b: {
                    f10 = f11 = f16;
                    f4 = f8 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f5 = f16 + 1.0f;
                    f7 = f16 + 1.0f;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case c: {
                    f4 = f8 = f16;
                    f6 = f9 = f16;
                    f5 = f11 = f14;
                    f7 = f10 = f15 + 1.0f;
                    f12 = 16.0f / (f2 - 1.0f);
                    f13 = 16.0f / f3;
                    break;
                }
                case d: {
                    f8 = f9 = f16;
                    f4 = f16 + 1.0f;
                    f6 = f16 + 1.0f;
                    f5 = f11 = f14;
                    f7 = f10 = f15 + 1.0f;
                    f12 = 16.0f / (f2 - 1.0f);
                    f13 = 16.0f / f3;
                }
            }
            float f17 = 16.0f / f2;
            float f18 = 16.0f / f3;
            f4 *= f17;
            f6 *= f17;
            f5 *= f18;
            f7 *= f18;
            f5 = 16.0f - f5;
            f7 = 16.0f - f7;
            HashMap hashMap = sz.c();
            hashMap.put(bpw2.a(), new cvf(null, n2, string, new bnx(new float[]{f8 *= f12, f10 *= f13, f9 *= f12, f11 *= f13}, 0)));
            switch (bpw2) {
                case a: {
                    arrayList.add(new vo(new l(f4, f5, 7.5f), new l(f6, f5, 8.5f), hashMap, null, true));
                    break;
                }
                case b: {
                    arrayList.add(new vo(new l(f4, f7, 7.5f), new l(f6, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case c: {
                    arrayList.add(new vo(new l(f4, f5, 7.5f), new l(f4, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case d: {
                    arrayList.add(new vo(new l(f6, f5, 7.5f), new l(f6, f7, 8.5f), hashMap, null, true));
                }
            }
        }
        return arrayList;
    }

    private List a(ars ars2) {
        int n2 = ars2.c();
        int n3 = ars2.d();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < ars2.k(); ++i2) {
            int[] arrn = ars2.a(i2)[0];
            for (int i3 = 0; i3 < n3; ++i3) {
                for (int i4 = 0; i4 < n2; ++i4) {
                    boolean bl2 = !this.a(arrn, i4, i3, n2, n3);
                    this.a(bpw.a, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(bpw.b, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(bpw.c, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(bpw.d, arrayList, arrn, i4, i3, n2, n3, bl2);
                }
            }
        }
        return arrayList;
    }

    private void a(bpw bpw2, List list, int[] arrn, int n2, int n3, int n4, int n5, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = this.a(arrn, n2 + bpw2.b(), n3 + bpw2.c(), n4, n5) && bl2;
        if (bl3) {
            this.a(list, bpw2, n2, n3);
        }
    }

    private void a(List list, bpw bpw2, int n2, int n3) {
        int n4;
        agi agi2 = null;
        for (agi agi3 : list) {
            int n5;
            if (agi3.a() != bpw2) continue;
            int n6 = n5 = bpw.a(bpw2) ? n3 : n2;
            if (agi3.d() != n5) continue;
            agi2 = agi3;
            break;
        }
        int n7 = bpw.a(bpw2) ? n3 : n2;
        int n8 = n4 = bpw.a(bpw2) ? n2 : n3;
        if (agi2 == null) {
            list.add(new agi(bpw2, n4, n7));
        } else {
            agi2.a(n4);
        }
    }

    private boolean a(int[] arrn, int n2, int n3, int n4, int n5) {
        if (n2 < 0 || n3 < 0 || n2 >= n4 || n3 >= n5) {
            return true;
        }
        return (arrn[n3 * n4 + n2] >> 24 & 0xFF) == 0;
    }
}

