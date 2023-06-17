/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.ov;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.q.g.c.a.e;
import net.minecraft.q.g.c.a.i;
import net.minecraft.q.g.c.ac;
import net.minecraft.q.g.c.as;
import net.minecraft.q.g.c.au;
import net.minecraft.q.g.c.bv;
import net.minecraft.q.g.c.da;
import net.minecraft.q.g.c.k;
import net.minecraft.q.g.c.p;
import net.minecraft.q.g.c.r;
import net.minecraft.u.b.b;
import net.minecraft.u.bq;
import net.minecraft.u.bz;

public class dt {
    public static final e a = new e("structures");
    private static final i b = new i().a(true);
    private static final i c = new i().a(true).a(net.minecraft.a.p.a);
    private static final as d = new ac();
    private static final List e = ov.a(new bz((Object)bq.a, new b(1, -1, 0)), new bz((Object)bq.b, new b(6, -1, 1)), new bz((Object)bq.d, new b(0, -1, 5)), new bz((Object)bq.c, new b(5, -1, 6)));
    private static final as f = new bv();
    private static final as g = new au();
    private static final List h = ov.a(new bz((Object)bq.a, new b(4, -1, 0)), new bz((Object)bq.b, new b(12, -1, 4)), new bz((Object)bq.d, new b(0, -1, 8)), new bz((Object)bq.c, new b(8, -1, 12)));
    private static final as i = new k();

    public static void a() {
        da.a(p.class, "ECP");
    }

    private static p b(p p2, b b2, String string, bq bq2, boolean bl2) {
        p p3 = new p(string, p2.e, bq2, bl2);
        b b3 = p2.a.a(p2.d, b2, p3.d, net.minecraft.u.b.b.c);
        p3.a(b3.cy_(), b3.k(), b3.l());
        return p3;
    }

    public static void a(b b2, bq bq2, List list, Random random) {
        i.a();
        d.a();
        g.a();
        f.a();
        p p2 = dt.b(list, new p("base_floor", b2, bq2, true));
        p2 = dt.b(list, dt.b(p2, new b(-1, 0, -1), "second_floor", bq2, false));
        p2 = dt.b(list, dt.b(p2, new b(-1, 4, -1), "third_floor", bq2, false));
        p2 = dt.b(list, dt.b(p2, new b(-1, 8, -1), "third_roof", bq2, true));
        dt.b(f, 1, p2, null, list, random);
    }

    private static p b(List list, p p2) {
        list.add(p2);
        return p2;
    }

    private static boolean b(as as2, int n2, p p2, b b2, List list, Random random) {
        if (n2 > 8) {
            return false;
        }
        ArrayList arrayList = ov.a();
        if (as2.a(n2, p2, b2, arrayList, random)) {
            boolean bl2 = false;
            int n3 = random.nextInt();
            for (r r2 : arrayList) {
                r2.c = n3;
                r r3 = r.a(list, r2.f());
                if (r3 == null || r3.c == p2.c) continue;
                bl2 = true;
                break;
            }
            if (!bl2) {
                list.addAll(arrayList);
                return true;
            }
        }
        return false;
    }

    static /* synthetic */ p a(p p2, b b2, String string, bq bq2, boolean bl2) {
        return dt.b(p2, b2, string, bq2, bl2);
    }

    static /* synthetic */ p a(List list, p p2) {
        return dt.b(list, p2);
    }

    static /* synthetic */ as b() {
        return f;
    }

    static /* synthetic */ boolean a(as as2, int n2, p p2, b b2, List list, Random random) {
        return dt.b(as2, n2, p2, b2, list, random);
    }

    static /* synthetic */ List c() {
        return e;
    }

    static /* synthetic */ as d() {
        return g;
    }

    static /* synthetic */ as e() {
        return i;
    }

    static /* synthetic */ as f() {
        return d;
    }

    static /* synthetic */ List g() {
        return h;
    }

    static /* synthetic */ i h() {
        return b;
    }

    static /* synthetic */ i i() {
        return c;
    }
}

