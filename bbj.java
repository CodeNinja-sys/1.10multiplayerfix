/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.List;
import java.util.Random;

public class bbj {
    private static final bul[] b = new bul[]{new bul(aba.class, 40, 0), new bul(alp.class, 5, 5), new bul(cdi.class, 20, 0), new bul(awl.class, 20, 0), new bul(ajg.class, 10, 6), new bul(arh.class, 5, 5), new bul(apr.class, 5, 5), new bul(daj.class, 5, 4), new bul(bmp.class, 5, 4), new ckx(bgl.class, 10, 2), new sc(mf.class, 20, 1)};
    private static List c;
    private static Class d;
    static int a;
    private static final aab e;

    public static void a() {
        mb.a(bmp.class, "SHCC");
        mb.a(bwb.class, "SHFC");
        mb.a(daj.class, "SH5C");
        mb.a(cdi.class, "SHLT");
        mb.a(bgl.class, "SHLi");
        mb.a(mf.class, "SHPR");
        mb.a(alp.class, "SHPH");
        mb.a(awl.class, "SHRT");
        mb.a(ajg.class, "SHRC");
        mb.a(apr.class, "SHSD");
        mb.a(afk.class, "SHStart");
        mb.a(aba.class, "SHS");
        mb.a(arh.class, "SHSSD");
    }

    public static void b() {
        c = ov.a();
        for (bul bul2 : b) {
            bul2.c = 0;
            c.add(bul2);
        }
        d = null;
    }

    private static boolean d() {
        boolean bl2 = false;
        a = 0;
        for (bul bul2 : c) {
            if (bul2.d > 0 && bul2.c < bul2.d) {
                bl2 = true;
            }
            a += bul2.b;
        }
        return bl2;
    }

    private static aue a(Class class_, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        aue aue2 = null;
        if (class_ == aba.class) {
            aue2 = aba.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == alp.class) {
            aue2 = alp.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == cdi.class) {
            aue2 = cdi.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == awl.class) {
            aue2 = awl.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == ajg.class) {
            aue2 = ajg.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == arh.class) {
            aue2 = arh.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == apr.class) {
            aue2 = apr.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == daj.class) {
            aue2 = daj.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bmp.class) {
            aue2 = bmp.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == bgl.class) {
            aue2 = bgl.a(list, random, n2, n3, n4, bqk2, n5);
        } else if (class_ == mf.class) {
            aue2 = mf.a(list, random, n2, n3, n4, bqk2, n5);
        }
        return aue2;
    }

    private static aue b(afk afk2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        if (!bbj.d()) {
            return null;
        }
        if (d != null) {
            aue aue2 = bbj.a(d, list, random, n2, n3, n4, bqk2, n5);
            d = null;
            if (aue2 != null) {
                return aue2;
            }
        }
        int n6 = 0;
        block0: while (n6 < 5) {
            ++n6;
            int n7 = random.nextInt(a);
            for (bul bul2 : c) {
                if ((n7 -= bul2.b) >= 0) continue;
                if (!bul2.a(n5) || bul2 == afk2.a) continue block0;
                aue aue3 = bbj.a(bul2.a, list, random, n2, n3, n4, bqk2, n5);
                if (aue3 == null) continue;
                ++bul2.c;
                afk2.a = bul2;
                if (!bul2.a()) {
                    c.remove(bul2);
                }
                return aue3;
            }
        }
        awx awx2 = bwb.a(list, random, n2, n3, n4, bqk2);
        if (awx2 != null && awx2.b > 1) {
            return new bwb(n5, random, awx2, bqk2);
        }
        return null;
    }

    private static pc c(afk afk2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n2 - afk2.b().a) > 112 || Math.abs(n4 - afk2.b().c) > 112) {
            return null;
        }
        aue aue2 = bbj.b(afk2, list, random, n2, n3, n4, bqk2, n5 + 1);
        if (aue2 != null) {
            list.add(aue2);
            afk2.c.add(aue2);
        }
        return aue2;
    }

    static /* synthetic */ pc a(afk afk2, List list, Random random, int n2, int n3, int n4, bqk bqk2, int n5) {
        return bbj.c(afk2, list, random, n2, n3, n4, bqk2, n5);
    }

    static /* synthetic */ Class a(Class class_) {
        d = class_;
        return d;
    }

    static /* synthetic */ aab c() {
        return e;
    }

    static {
        e = new aab(null);
    }
}

