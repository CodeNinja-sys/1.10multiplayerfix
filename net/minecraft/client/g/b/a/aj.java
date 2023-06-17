/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.a.f;
import net.minecraft.client.g.b.a.ak;
import net.minecraft.client.g.b.a.an;
import net.minecraft.client.g.b.a.as;
import net.minecraft.client.g.b.a.aw;
import net.minecraft.client.g.b.a.b;
import net.minecraft.client.g.b.a.r;
import net.minecraft.u.ad;
import net.minecraft.u.bp;
import org.lwjgl.util.e.l;

public class aj {
    public static final List a = ov.a("layer0", "layer1", "layer2", "layer3", "layer4");
    private static /* synthetic */ int[] b;

    public r a(f f2, r r2) {
        HashMap hashMap = sz.c();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < a.size(); ++i2) {
            String string = (String)a.get(i2);
            if (!r2.b(string)) break;
            String string2 = r2.c(string);
            hashMap.put(string, string2);
            d d2 = f2.a(new bp(string2).toString());
            arrayList.addAll(this.a(i2, string, d2));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        hashMap.put("particle", r2.b("particle") ? r2.c("particle") : (String)hashMap.get("layer0"));
        return new r(null, arrayList, hashMap, false, false, r2.j(), r2.f());
    }

    private List a(int n2, String string, d d2) {
        HashMap hashMap = sz.c();
        hashMap.put(ad.d, new b(null, n2, string, new aw(new float[]{0.0f, 0.0f, 16.0f, 16.0f}, 0)));
        hashMap.put(ad.c, new b(null, n2, string, new aw(new float[]{16.0f, 0.0f, 0.0f, 16.0f}, 0)));
        ArrayList arrayList = ov.a();
        arrayList.add(new ak(new l(0.0f, 0.0f, 7.5f), new l(16.0f, 16.0f, 8.5f), hashMap, null, true));
        arrayList.addAll(this.a(d2, string, n2));
        return arrayList;
    }

    private List a(d d2, String string, int n2) {
        float f2 = d2.c();
        float f3 = d2.d();
        ArrayList arrayList = ov.a();
        for (an an2 : this.a(d2)) {
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
            float f14 = an2.b();
            float f15 = an2.c();
            float f16 = an2.d();
            as as2 = an2.a();
            switch (aj.a()[as2.ordinal()]) {
                case 1: {
                    f8 = f14;
                    f4 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f10 = f16;
                    f5 = f16;
                    f11 = f16;
                    f7 = f16;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case 2: {
                    f11 = f16;
                    f10 = f16;
                    f8 = f14;
                    f4 = f14;
                    f6 = f9 = f15 + 1.0f;
                    f5 = f16 + 1.0f;
                    f7 = f16 + 1.0f;
                    f12 = 16.0f / f2;
                    f13 = 16.0f / (f3 - 1.0f);
                    break;
                }
                case 3: {
                    f8 = f16;
                    f4 = f16;
                    f9 = f16;
                    f6 = f16;
                    f11 = f14;
                    f5 = f14;
                    f7 = f10 = f15 + 1.0f;
                    f12 = 16.0f / (f2 - 1.0f);
                    f13 = 16.0f / f3;
                    break;
                }
                case 4: {
                    f9 = f16;
                    f8 = f16;
                    f4 = f16 + 1.0f;
                    f6 = f16 + 1.0f;
                    f11 = f14;
                    f5 = f14;
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
            hashMap.put(as2.a(), new b(null, n2, string, new aw(new float[]{f8 *= f12, f10 *= f13, f9 *= f12, f11 *= f13}, 0)));
            switch (aj.a()[as2.ordinal()]) {
                case 1: {
                    arrayList.add(new ak(new l(f4, f5, 7.5f), new l(f6, f5, 8.5f), hashMap, null, true));
                    break;
                }
                case 2: {
                    arrayList.add(new ak(new l(f4, f7, 7.5f), new l(f6, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case 3: {
                    arrayList.add(new ak(new l(f4, f5, 7.5f), new l(f4, f7, 8.5f), hashMap, null, true));
                    break;
                }
                case 4: {
                    arrayList.add(new ak(new l(f6, f5, 7.5f), new l(f6, f7, 8.5f), hashMap, null, true));
                }
            }
        }
        return arrayList;
    }

    private List a(d d2) {
        int n2 = d2.c();
        int n3 = d2.d();
        ArrayList arrayList = ov.a();
        for (int i2 = 0; i2 < d2.k(); ++i2) {
            int[] arrn = d2.a(i2)[0];
            for (int i3 = 0; i3 < n3; ++i3) {
                for (int i4 = 0; i4 < n2; ++i4) {
                    boolean bl2 = !this.a(arrn, i4, i3, n2, n3);
                    this.a(as.a, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(as.b, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(as.c, arrayList, arrn, i4, i3, n2, n3, bl2);
                    this.a(as.d, arrayList, arrn, i4, i3, n2, n3, bl2);
                }
            }
        }
        return arrayList;
    }

    private void a(as as2, List list, int[] arrn, int n2, int n3, int n4, int n5, boolean bl2) {
        boolean bl3;
        boolean bl4 = bl3 = this.a(arrn, n2 + as2.b(), n3 + as2.c(), n4, n5) && bl2;
        if (bl3) {
            this.a(list, as2, n2, n3);
        }
    }

    private void a(List list, as as2, int n2, int n3) {
        int n4;
        an an2 = null;
        for (an an3 : list) {
            int n5;
            if (an3.a() != as2) continue;
            int n6 = n5 = as.a(as2) ? n3 : n2;
            if (an3.d() != n5) continue;
            an2 = an3;
            break;
        }
        int n7 = as.a(as2) ? n3 : n2;
        int n8 = n4 = as.a(as2) ? n2 : n3;
        if (an2 == null) {
            list.add(new an(as2, n4, n7));
        } else {
            an2.a(n4);
        }
    }

    private boolean a(int[] arrn, int n2, int n3, int n4, int n5) {
        return n2 >= 0 && n3 >= 0 && n2 < n4 && n3 < n5 ? (arrn[n3 * n4 + n2] >> 24 & 0xFF) == 0 : true;
    }

    static /* synthetic */ int[] a() {
        if (b != null) {
            return b;
        }
        int[] arrn = new int[as.values().length];
        try {
            arrn[as.b.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[as.c.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[as.d.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            arrn[as.a.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = arrn;
        return arrn;
    }
}

