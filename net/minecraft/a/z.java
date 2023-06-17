/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.a;

import java.io.PrintStream;
import net.minecraft.a.a;
import net.minecraft.a.ab;
import net.minecraft.a.ac;
import net.minecraft.a.b;
import net.minecraft.a.d;
import net.minecraft.a.e;
import net.minecraft.a.g;
import net.minecraft.a.h;
import net.minecraft.a.j;
import net.minecraft.a.k;
import net.minecraft.a.l;
import net.minecraft.a.m;
import net.minecraft.a.n;
import net.minecraft.a.p;
import net.minecraft.a.q;
import net.minecraft.a.r;
import net.minecraft.a.u;
import net.minecraft.a.v;
import net.minecraft.a.w;
import net.minecraft.a.x;
import net.minecraft.a.y;
import net.minecraft.g.cn;
import net.minecraft.g.en;
import net.minecraft.g.hp;
import net.minecraft.m.cg;
import net.minecraft.r.o;
import net.minecraft.u.be;
import net.minecraft.u.bv;
import net.minecraft.w.f.t;
import org.apache.logging.log4j.c;

public class z {
    public static final PrintStream a = System.out;
    private static boolean b;
    private static final org.apache.logging.log4j.d c;

    static {
        c = org.apache.logging.log4j.c.c();
    }

    public static boolean a() {
        return b;
    }

    static void b() {
        en.c.a(w.g, new x());
        en.c.a(w.i, new e());
        en.c.a(w.h, new l());
        en.c.a(w.aW, new d());
        en.c.a(w.aF, new u());
        en.c.a(w.bU, new h());
        en.c.a(w.bH, new b());
        en.c.a(w.bI, new q());
        en.c.a(w.bT, new v());
        en.c.a(w.cl, new r());
        en.c.a(w.bV, new ab());
        en.c.a(w.aG, new y(t.a));
        en.c.a(w.aH, new y(t.b));
        en.c.a(w.aI, new y(t.c));
        en.c.a(w.aJ, new y(t.d));
        en.c.a(w.aL, new y(t.f));
        en.c.a(w.aK, new y(t.e));
        a a2 = new a();
        en.c.a(w.aA, a2);
        en.c.a(w.az, a2);
        en.c.a(w.ay, new j());
        en.c.a(w.d, new n());
        en.c.a(w.bd, new m());
        en.c.a(cg.a(p.W), new g());
        en.c.a(w.ch, new ac());
        en.c.a(cg.a(p.aU), new k());
    }

    public static void c() {
        if (!b) {
            b = true;
            if (c.e()) {
                z.d();
            }
            bv.b();
            cn.x();
            hp.h();
            net.minecraft.d.c.j();
            net.minecraft.o.j.f();
            cg.s();
            net.minecraft.d.b.b();
            net.minecraft.d.a.a();
            o.a();
            net.minecraft.q.b.q.q();
            z.b();
        }
    }

    private static void d() {
        System.setErr(new be("STDERR", System.err));
        System.setOut(new be("STDOUT", a));
    }

    public static void a(String string) {
        a.println(string);
    }
}

