/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.d;

import com.a.a.b.cc;
import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import net.minecraft.d.b;
import net.minecraft.d.c;
import net.minecraft.d.j;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cu;
import net.minecraft.u.bp;
import net.minecraft.u.bz;
import net.minecraft.u.d.b.a;
import net.minecraft.u.d.o;
import net.minecraft.w.b.a.f;
import net.minecraft.w.b.a.h;

public class m {
    public static List a(cu cu2) {
        return m.a(cu2.o());
    }

    public static List a(b b2, Collection collection) {
        ArrayList arrayList = ov.a();
        arrayList.addAll(b2.a());
        arrayList.addAll(collection);
        return arrayList;
    }

    public static List a(e e2) {
        ArrayList arrayList = ov.a();
        arrayList.addAll(m.c(e2).a());
        m.a(e2, arrayList);
        return arrayList;
    }

    public static List b(cu cu2) {
        return m.b(cu2.o());
    }

    public static List b(e e2) {
        ArrayList arrayList = ov.a();
        m.a(e2, arrayList);
        return arrayList;
    }

    public static void a(e e2, List list) {
        if (e2 != null && e2.b("CustomPotionEffects", 9)) {
            q q2 = e2.c("CustomPotionEffects", 10);
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                e e3 = q2.b(i2);
                j j2 = j.b(e3);
                if (j2 == null) continue;
                list.add(j2);
            }
        }
    }

    public static int a(b b2) {
        return m.a(b2.a());
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
        for (j j2 : collection) {
            if (!j2.e()) continue;
            int n4 = j2.a().f();
            int n5 = j2.c() + 1;
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

    public static b c(cu cu2) {
        return m.c(cu2.o());
    }

    public static b c(e e2) {
        return e2 == null ? net.minecraft.a.o.b : b.a(e2.l("Potion"));
    }

    public static cu a(cu cu2, b b2) {
        bp bp2 = (bp)b.a.b(b2);
        if (bp2 != null) {
            e e2 = cu2.n() ? cu2.o() : new e();
            e2.a("Potion", bp2.toString());
            cu2.d(e2);
        }
        return cu2;
    }

    public static cu a(cu cu2, Collection collection) {
        if (collection.isEmpty()) {
            return cu2;
        }
        e e2 = (e)cc.b(cu2.o(), new e());
        q q2 = e2.c("CustomPotionEffects", 9);
        for (j j2 : collection) {
            q2.a(j2.a(new e()));
        }
        e2.a("CustomPotionEffects", q2);
        cu2.d(e2);
        return cu2;
    }

    public static void a(cu cu2, List list, float f2) {
        Object object;
        List list2 = m.a(cu2);
        ArrayList arrayList = ov.a();
        if (list2.isEmpty()) {
            Object object2 = a.a("effect.none").trim();
            list.add((Object)((Object)o.h) + (String)object2);
        } else {
            for (Object object2 : list2) {
                object = a.a(((j)object2).f()).trim();
                c c2 = ((j)object2).a();
                Map map = c2.g();
                if (!map.isEmpty()) {
                    for (Map.Entry entry : map.entrySet()) {
                        h h2 = (h)entry.getValue();
                        h h3 = new h(h2.b(), c2.a(((j)object2).c(), h2), h2.c());
                        arrayList.add(new bz(((f)entry.getKey()).b(), h3));
                    }
                }
                if (((j)object2).c() > 0) {
                    object = String.valueOf(object) + " " + a.a("potion.potency." + ((j)object2).c()).trim();
                }
                if (((j)object2).b() > 20) {
                    object = String.valueOf(object) + " (" + c.a((j)object2, f2) + ")";
                }
                if (c2.e()) {
                    list.add((Object)((Object)o.m) + (String)object);
                    continue;
                }
                list.add((Object)((Object)o.j) + (String)object);
            }
        }
        if (!arrayList.isEmpty()) {
            list.add("");
            list.add((Object)((Object)o.f) + a.a("potion.whenDrank"));
            for (Object object2 : arrayList) {
                object = (h)((bz)object2).b();
                double d2 = ((h)object).d();
                double d3 = ((h)object).c() != 1 && ((h)object).c() != 2 ? ((h)object).d() : ((h)object).d() * 100.0;
                if (d2 > 0.0) {
                    list.add((Object)((Object)o.j) + a.a("attribute.modifier.plus." + ((h)object).c(), cu.a.format(d3), a.a("attribute.name." + (String)((bz)object2).a())));
                    continue;
                }
                if (!(d2 < 0.0)) continue;
                list.add((Object)((Object)o.m) + a.a("attribute.modifier.take." + ((h)object).c(), cu.a.format(d3 *= -1.0), a.a("attribute.name." + (String)((bz)object2).a())));
            }
        }
    }
}

