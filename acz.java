/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class acz {
    private static final Random a = new Random();
    private static final abf b = new abf(null);
    private static final ls c = new ls(null);
    private static final ctc d = new ctc(null);
    private static final apn e = new apn(null);

    public static int a(dad dad2, bhl bhl2) {
        if (bhl2 == null) {
            return 0;
        }
        bmh bmh2 = bhl2.p();
        if (bmh2 == null) {
            return 0;
        }
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            dad dad3 = dad.c(bmh2.b(i2).g("id"));
            short s2 = bmh2.b(i2).g("lvl");
            if (dad3 != dad2) continue;
            return s2;
        }
        return 0;
    }

    public static Map a(bhl bhl2) {
        bmh bmh2;
        LinkedHashMap linkedHashMap = sz.d();
        bmh bmh3 = bmh2 = bhl2.a() == hp.cn ? hp.cn.h(bhl2) : bhl2.p();
        if (bmh2 != null) {
            for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                dad dad2 = dad.c(bmh2.b(i2).g("id"));
                short s2 = bmh2.b(i2).g("lvl");
                linkedHashMap.put(dad2, Integer.valueOf(s2));
            }
        }
        return linkedHashMap;
    }

    public static void a(Map map, bhl bhl2) {
        bmh bmh2 = new bmh();
        for (Map.Entry entry : map.entrySet()) {
            dad dad2 = (dad)entry.getKey();
            if (dad2 == null) continue;
            int n2 = (Integer)entry.getValue();
            bvp bvp2 = new bvp();
            bvp2.a("id", (short)dad.b(dad2));
            bvp2.a("lvl", (short)n2);
            bmh2.a(bvp2);
            if (bhl2.a() != hp.cn) continue;
            hp.cn.a(bhl2, new bc(dad2, n2));
        }
        if (bmh2.j()) {
            if (bhl2.n()) {
                bhl2.o().q("ench");
            }
        } else if (bhl2.a() != hp.cn) {
            bhl2.a("ench", bmh2);
        }
    }

    private static void a(auk auk2, bhl bhl2) {
        if (bhl2 == null) {
            return;
        }
        bmh bmh2 = bhl2.p();
        if (bmh2 == null) {
            return;
        }
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            short s2 = bmh2.b(i2).g("id");
            short s3 = bmh2.b(i2).g("lvl");
            if (dad.c(s2) == null) continue;
            auk2.a(dad.c(s2), s3);
        }
    }

    private static void a(auk auk2, Iterable iterable) {
        for (bhl bhl2 : iterable) {
            acz.a(auk2, bhl2);
        }
    }

    public static int a(Iterable iterable, ahy ahy2) {
        acz.b.a = 0;
        acz.b.b = ahy2;
        acz.a((auk)b, iterable);
        return acz.b.a;
    }

    public static float a(bhl bhl2, agh agh2) {
        acz.c.a = 0.0f;
        acz.c.b = agh2;
        acz.a((auk)c, bhl2);
        return acz.c.a;
    }

    public static void a(bga bga2, cpk cpk2) {
        acz.d.b = cpk2;
        acz.d.a = bga2;
        if (bga2 != null) {
            acz.a((auk)d, bga2.co());
        }
        if (cpk2 instanceof bdl) {
            acz.a((auk)d, bga2.bt());
        }
    }

    public static void b(bga bga2, cpk cpk2) {
        acz.e.a = bga2;
        acz.e.b = cpk2;
        if (bga2 != null) {
            acz.a((auk)e, bga2.co());
        }
        if (bga2 instanceof bdl) {
            acz.a((auk)e, bga2.bt());
        }
    }

    public static int a(dad dad2, bga bga2) {
        Iterable iterable = dad2.a(bga2);
        if (iterable == null) {
            return 0;
        }
        int n2 = 0;
        for (bhl bhl2 : iterable) {
            int n3 = acz.a(dad2, bhl2);
            if (n3 <= n2) continue;
            n2 = n3;
        }
        return n2;
    }

    public static int a(bga bga2) {
        return acz.a(bbh.n, bga2);
    }

    public static int b(bga bga2) {
        return acz.a(bbh.o, bga2);
    }

    public static int c(bga bga2) {
        return acz.a(bbh.f, bga2);
    }

    public static int d(bga bga2) {
        return acz.a(bbh.i, bga2);
    }

    public static int e(bga bga2) {
        return acz.a(bbh.q, bga2);
    }

    public static int f(bga bga2) {
        return acz.a(bbh.y, bga2);
    }

    public static int g(bga bga2) {
        return acz.a(bbh.z, bga2);
    }

    public static int h(bga bga2) {
        return acz.a(bbh.p, bga2);
    }

    public static boolean i(bga bga2) {
        return acz.a(bbh.g, bga2) > 0;
    }

    public static boolean j(bga bga2) {
        return acz.a(bbh.j, bga2) > 0;
    }

    public static bhl b(dad dad2, bga bga2) {
        Iterable iterable = dad2.a(bga2);
        if (iterable == null) {
            return null;
        }
        ArrayList arrayList = ov.a();
        for (bhl bhl2 : iterable) {
            if (bhl2 == null || acz.a(dad2, bhl2) <= 0) continue;
            arrayList.add(bhl2);
        }
        return arrayList.isEmpty() ? null : (bhl)arrayList.get(bga2.aW().nextInt(arrayList.size()));
    }

    public static int a(Random random, int n2, int n3, bhl bhl2) {
        azg azg2 = bhl2.a();
        int n4 = azg2.d();
        if (n4 <= 0) {
            return 0;
        }
        if (n3 > 15) {
            n3 = 15;
        }
        int n5 = random.nextInt(8) + 1 + (n3 >> 1) + random.nextInt(n3 + 1);
        if (n2 == 0) {
            return Math.max(n5 / 3, 1);
        }
        if (n2 == 1) {
            return n5 * 2 / 3 + 1;
        }
        return Math.max(n5, n3 * 2);
    }

    public static bhl a(Random random, bhl bhl2, int n2, boolean bl2) {
        boolean bl3 = bhl2.a() == hp.aS;
        List list = acz.b(random, bhl2, n2, bl2);
        if (bl3) {
            bhl2.a(hp.cn);
        }
        for (bc bc2 : list) {
            if (bl3) {
                hp.cn.a(bhl2, bc2);
                continue;
            }
            bhl2.a(bc2.a, bc2.b);
        }
        return bhl2;
    }

    public static List b(Random random, bhl bhl2, int n2, boolean bl2) {
        ArrayList arrayList = ov.a();
        azg azg2 = bhl2.a();
        int n3 = azg2.d();
        if (n3 <= 0) {
            return arrayList;
        }
        n2 += 1 + random.nextInt(n3 / 4 + 1) + random.nextInt(n3 / 4 + 1);
        float f2 = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f;
        List list = acz.a(n2 = cmk.a(Math.round((float)n2 + (float)n2 * f2), 1, Integer.MAX_VALUE), bhl2, bl2);
        if (!list.isEmpty()) {
            arrayList.add(ctt.a(random, list));
            while (random.nextInt(50) <= n2) {
                acz.a(list, (bc)asj.a(arrayList));
                if (list.isEmpty()) break;
                arrayList.add(ctt.a(random, list));
                n2 /= 2;
            }
        }
        return arrayList;
    }

    public static void a(List list, bc bc2) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (bc2.a.a(((bc)iterator.next()).a)) continue;
            iterator.remove();
        }
    }

    public static List a(int n2, bhl bhl2, boolean bl2) {
        ArrayList arrayList = ov.a();
        azg azg2 = bhl2.a();
        boolean bl3 = bhl2.a() == hp.aS;
        block0: for (dad dad2 : dad.b) {
            if (dad2.b() && !bl2 || !dad2.c.a(azg2) && !bl3) continue;
            for (int i2 = dad2.a(); i2 > dad2.e() - 1; --i2) {
                if (n2 < dad2.a(i2) || n2 > dad2.b(i2)) continue;
                arrayList.add(new bc(dad2, i2));
                continue block0;
            }
        }
        return arrayList;
    }
}

