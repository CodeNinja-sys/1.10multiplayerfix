/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.cc;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class anl {
    public static List a(bhl bhl2) {
        return anl.a(bhl2.o());
    }

    public static List a(hy hy2, Collection collection) {
        ArrayList arrayList = ov.a();
        arrayList.addAll(hy2.a());
        arrayList.addAll(collection);
        return arrayList;
    }

    public static List a(bvp bvp2) {
        ArrayList arrayList = ov.a();
        arrayList.addAll(anl.c(bvp2).a());
        anl.a(bvp2, arrayList);
        return arrayList;
    }

    public static List b(bhl bhl2) {
        return anl.b(bhl2.o());
    }

    public static List b(bvp bvp2) {
        ArrayList arrayList = ov.a();
        anl.a(bvp2, arrayList);
        return arrayList;
    }

    public static void a(bvp bvp2, List list) {
        if (bvp2 != null && bvp2.b("CustomPotionEffects", 9)) {
            bmh bmh2 = bvp2.c("CustomPotionEffects", 10);
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                bvp bvp3 = bmh2.b(i2);
                cko cko2 = cko.b(bvp3);
                if (cko2 == null) continue;
                list.add(cko2);
            }
        }
    }

    public static int a(hy hy2) {
        return anl.a(hy2.a());
    }

    public static int a(Collection collection) {
        int n2 = 3694022;
        if (collection.isEmpty()) {
            return 3694022;
        }
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int n3 = 0;
        for (cko cko2 : collection) {
            if (!cko2.e()) continue;
            int n4 = cko2.a().f();
            int n5 = cko2.c() + 1;
            f2 += (float)(n5 * (n4 >> 16 & 0xFF)) / 255.0f;
            f3 += (float)(n5 * (n4 >> 8 & 0xFF)) / 255.0f;
            f4 += (float)(n5 * (n4 >> 0 & 0xFF)) / 255.0f;
            n3 += n5;
        }
        if (n3 == 0) {
            return 0;
        }
        f2 = f2 / (float)n3 * 255.0f;
        f3 = f3 / (float)n3 * 255.0f;
        f4 = f4 / (float)n3 * 255.0f;
        return (int)f2 << 16 | (int)f3 << 8 | (int)f4;
    }

    public static hy c(bhl bhl2) {
        return anl.c(bhl2.o());
    }

    public static hy c(bvp bvp2) {
        if (bvp2 == null) {
            return im.b;
        }
        return hy.a(bvp2.l("Potion"));
    }

    public static bhl a(bhl bhl2, hy hy2) {
        bpx bpx2 = (bpx)hy.a.b(hy2);
        if (bpx2 != null) {
            bvp bvp2 = bhl2.n() ? bhl2.o() : new bvp();
            bvp2.a("Potion", bpx2.toString());
            bhl2.d(bvp2);
        }
        return bhl2;
    }

    public static bhl a(bhl bhl2, Collection collection) {
        if (collection.isEmpty()) {
            return bhl2;
        }
        bvp bvp2 = (bvp)cc.b(bhl2.o(), new bvp());
        bmh bmh2 = bvp2.c("CustomPotionEffects", 9);
        for (cko cko2 : collection) {
            bmh2.a(cko2.a(new bvp()));
        }
        bvp2.a("CustomPotionEffects", bmh2);
        bhl2.d(bvp2);
        return bhl2;
    }

    public static void a(bhl bhl2, List list, float f2) {
        Object object;
        List list2 = anl.a(bhl2);
        ArrayList arrayList = ov.a();
        if (list2.isEmpty()) {
            Iterator iterator = caf.a("effect.none").trim();
            list.add((Object)((Object)aug.h) + (String)((Object)iterator));
        } else {
            for (Object object2 : list2) {
                object = caf.a(((cko)object2).f()).trim();
                bfv bfv2 = ((cko)object2).a();
                Map map = bfv2.g();
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        cs cs2 = (cs)entry.getValue();
                        cs cs3 = new cs(cs2.b(), bfv2.a(((cko)object2).c(), cs2), cs2.c());
                        arrayList.add(new cam(((cmb)entry.getKey()).b(), cs3));
                    }
                }
                if (((cko)object2).c() > 0) {
                    object = (String)object + " " + caf.a("potion.potency." + ((cko)object2).c()).trim();
                }
                if (((cko)object2).b() > 20) {
                    object = (String)object + " (" + bfv.a((cko)object2, f2) + ")";
                }
                if (bfv2.e()) {
                    list.add((Object)((Object)aug.m) + (String)object);
                    continue;
                }
                list.add((Object)((Object)aug.j) + (String)object);
            }
        }
        if (!arrayList.isEmpty()) {
            list.add("");
            list.add((Object)((Object)aug.f) + caf.a("potion.whenDrank"));
            for (Object object2 : arrayList) {
                object = (cs)((cam)object2).b();
                double d2 = ((cs)object).d();
                double d3 = ((cs)object).c() == 1 || ((cs)object).c() == 2 ? ((cs)object).d() * 100.0 : ((cs)object).d();
                if (d2 > 0.0) {
                    list.add((Object)((Object)aug.j) + caf.a("attribute.modifier.plus." + ((cs)object).c(), bhl.a.format(d3), caf.a("attribute.name." + (String)((cam)object2).a())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                list.add((Object)((Object)aug.m) + caf.a("attribute.modifier.take." + ((cs)object).c(), bhl.a.format(d3 *= -1.0), caf.a("attribute.name." + (String)((cam)object2).a())));
            }
        }
    }
}

