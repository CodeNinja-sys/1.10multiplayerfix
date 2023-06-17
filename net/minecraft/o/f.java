/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.o;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.a.aa;
import net.minecraft.a.w;
import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.o.b;
import net.minecraft.o.d;
import net.minecraft.o.i;
import net.minecraft.o.j;
import net.minecraft.o.k;
import net.minecraft.o.m;
import net.minecraft.o.v;
import net.minecraft.u.b.n;
import net.minecraft.u.cb;
import net.minecraft.u.cd;
import net.minecraft.w.ae;
import net.minecraft.w.l;

public class f {
    private static final Random a = new Random();
    private static final i b = new i(null);
    private static final b c = new b(null);
    private static final d d = new d(null);
    private static final m e = new m(null);

    public static int a(j j2, cu cu2) {
        if (cu2 == null) {
            return 0;
        }
        q q2 = cu2.p();
        if (q2 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            j j3 = j.c(q2.b(i2).g("id"));
            short s2 = q2.b(i2).g("lvl");
            if (j3 != j2) continue;
            return s2;
        }
        return 0;
    }

    public static Map a(cu cu2) {
        q q2;
        LinkedHashMap linkedHashMap = sz.d();
        q q3 = q2 = cu2.a() == w.cn ? w.cn.h(cu2) : cu2.p();
        if (q2 != null) {
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                j j2 = j.c(q2.b(i2).g("id"));
                short s2 = q2.b(i2).g("lvl");
                linkedHashMap.put(j2, Integer.valueOf(s2));
            }
        }
        return linkedHashMap;
    }

    public static void a(Map map, cu cu2) {
        q q2 = new q();
        for (Map.Entry entry : map.entrySet()) {
            j j2 = (j)entry.getKey();
            if (j2 == null) continue;
            int n2 = (Integer)entry.getValue();
            e e2 = new e();
            e2.a("id", (short)j.b(j2));
            e2.a("lvl", (short)n2);
            q2.a(e2);
            if (cu2.a() != w.cn) continue;
            w.cn.a(cu2, new k(j2, n2));
        }
        if (q2.c()) {
            if (cu2.n()) {
                cu2.o().q("ench");
            }
        } else if (cu2.a() != w.cn) {
            cu2.a("ench", q2);
        }
    }

    private static void a(v v2, cu cu2) {
        q q2;
        if (cu2 != null && (q2 = cu2.p()) != null) {
            for (int i2 = 0; i2 < q2.e(); ++i2) {
                short s2 = q2.b(i2).g("id");
                short s3 = q2.b(i2).g("lvl");
                if (j.c(s2) == null) continue;
                v2.a(j.c(s2), s3);
            }
        }
    }

    private static void a(v v2, Iterable iterable) {
        for (cu cu2 : iterable) {
            f.a(v2, cu2);
        }
    }

    public static int a(Iterable iterable, net.minecraft.u.n n2) {
        f.b.a = 0;
        f.b.b = n2;
        f.a((v)b, iterable);
        return f.b.a;
    }

    public static float a(cu cu2, ae ae2) {
        f.c.a = 0.0f;
        f.c.b = ae2;
        f.a((v)c, cu2);
        return f.c.a;
    }

    public static void a(l l2, net.minecraft.w.n n2) {
        f.d.b = n2;
        f.d.a = l2;
        if (l2 != null) {
            f.a((v)d, l2.cx());
        }
        if (n2 instanceof net.minecraft.w.a.b) {
            f.a((v)d, l2.bC());
        }
    }

    public static void b(l l2, net.minecraft.w.n n2) {
        f.e.a = l2;
        f.e.b = n2;
        if (l2 != null) {
            f.a((v)e, l2.cx());
        }
        if (l2 instanceof net.minecraft.w.a.b) {
            f.a((v)e, l2.bC());
        }
    }

    public static int a(j j2, l l2) {
        Iterable iterable = j2.a(l2);
        if (iterable == null) {
            return 0;
        }
        int n2 = 0;
        for (cu cu2 : iterable) {
            int n3 = f.a(j2, cu2);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public static int a(l l2) {
        return f.a(aa.n, l2);
    }

    public static int b(l l2) {
        return f.a(aa.o, l2);
    }

    public static int c(l l2) {
        return f.a(aa.f, l2);
    }

    public static int d(l l2) {
        return f.a(aa.i, l2);
    }

    public static int e(l l2) {
        return f.a(aa.q, l2);
    }

    public static int f(l l2) {
        return f.a(aa.y, l2);
    }

    public static int g(l l2) {
        return f.a(aa.z, l2);
    }

    public static int h(l l2) {
        return f.a(aa.p, l2);
    }

    public static boolean i(l l2) {
        return f.a(aa.g, l2) > 0;
    }

    public static boolean j(l l2) {
        return f.a(aa.j, l2) > 0;
    }

    public static cu b(j j2, l l2) {
        Iterable iterable = j2.a(l2);
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = ov.a();
        for (cu cu2 : iterable) {
            if (cu2 == null || f.a(j2, cu2) <= 0) continue;
            arrayList.add(cu2);
        }
        return arrayList.isEmpty() ? null : (cu)arrayList.get(l2.bd().nextInt(arrayList.size()));
    }

    public static int a(Random random, int n2, int n3, cu cu2) {
        cg cg2 = cu2.a();
        int n4 = cg2.cx_();
        if (n4 <= 0) {
            return 0;
        }
        if (n3 > 15) {
            n3 = 15;
        }
        int n5 = random.nextInt(8) + 1 + (n3 >> 1) + random.nextInt(n3 + 1);
        return n2 == 0 ? Math.max(n5 / 3, 1) : (n2 == 1 ? n5 * 2 / 3 + 1 : Math.max(n5, n3 * 2));
    }

    public static cu a(Random random, cu cu2, int n2, boolean bl2) {
        boolean bl3 = cu2.a() == w.aS;
        List list = f.b(random, cu2, n2, bl2);
        if (bl3) {
            cu2.a(w.cn);
        }
        for (k k2 : list) {
            if (bl3) {
                w.cn.a(cu2, k2);
                continue;
            }
            cu2.a(k2.a, k2.b);
        }
        return cu2;
    }

    public static List b(Random random, cu cu2, int n2, boolean bl2) {
        ArrayList arrayList = ov.a();
        cg cg2 = cu2.a();
        int n3 = cg2.cx_();
        if (n3 <= 0) {
            return arrayList;
        }
        n2 = n2 + 1 + random.nextInt(n3 / 4 + 1) + random.nextInt(n3 / 4 + 1);
        float f2 = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f;
        List list = f.a(n2 = n.a(Math.round((float)n2 + (float)n2 * f2), 1, Integer.MAX_VALUE), cu2, bl2);
        if (!list.isEmpty()) {
            arrayList.add((k)cd.a(random, list));
            while (random.nextInt(50) <= n2) {
                f.a(list, (k)cb.a(arrayList));
                if (list.isEmpty()) break;
                arrayList.add((k)cd.a(random, list));
                n2 /= 2;
            }
        }
        return arrayList;
    }

    public static void a(List list, k k2) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (k2.a.a(((k)iterator.next()).a)) continue;
            iterator.remove();
        }
    }

    public static List a(int n2, cu cu2, boolean bl2) {
        ArrayList arrayList = ov.a();
        cg cg2 = cu2.a();
        boolean bl3 = cu2.a() == w.aS;
        block0: for (j j2 : j.b) {
            if (j2.e() && !bl2 || !j2.c.a(cg2) && !bl3) continue;
            for (int i2 = j2.a(); i2 > j2.d() - 1; --i2) {
                if (n2 < j2.a(i2) || n2 > j2.b(i2)) continue;
                arrayList.add(new k(j2, i2));
                continue block0;
            }
        }
        return arrayList;
    }
}

