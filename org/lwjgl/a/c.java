/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.a;

import java.util.ArrayList;
import net.java.games.input.q;
import net.java.games.input.s;
import net.java.games.input.t;
import org.lwjgl.a.a;
import org.lwjgl.a.b;
import org.lwjgl.a.f;

public class c {
    private static ArrayList a = new ArrayList();
    private static int b;
    private static ArrayList c;
    private static b d;
    private static boolean e;

    public static void a() {
        if (e) {
            return;
        }
        try {
            t t2 = t.c();
            q[] arrq = t2.a();
            ArrayList<q> arrayList = new ArrayList<q>();
            for (q q2 : arrq) {
                if (q2.h().equals(s.c) || q2.h().equals(s.b)) continue;
                arrayList.add(q2);
            }
            for (q q3 : arrayList) {
                org.lwjgl.a.c.a(q3);
            }
            e = true;
        }
        catch (Throwable throwable) {
            throw new org.lwjgl.c("Failed to initialise controllers", throwable);
        }
    }

    private static void a(q q2) {
        q[] arrq = q2.b();
        if (arrq.length == 0) {
            f f2 = new f(b, q2);
            a.add(f2);
            ++b;
        } else {
            for (q q3 : arrq) {
                org.lwjgl.a.c.a(q3);
            }
        }
    }

    public static a a(int n2) {
        return (a)a.get(n2);
    }

    public static int b() {
        return a.size();
    }

    public static void c() {
        for (int i2 = 0; i2 < a.size(); ++i2) {
            org.lwjgl.a.c.a(i2).d();
        }
    }

    public static void d() {
        c.clear();
    }

    public static boolean e() {
        if (c.size() == 0) {
            d = null;
            return false;
        }
        d = (b)c.remove(0);
        return d != null;
    }

    public static boolean f() {
        return e;
    }

    public static void g() {
    }

    public static a h() {
        return d.b();
    }

    public static int i() {
        return d.c();
    }

    public static boolean j() {
        return d.d();
    }

    public static boolean k() {
        return d.f();
    }

    public static boolean l() {
        return d.i();
    }

    public static boolean m() {
        return d.j();
    }

    public static boolean n() {
        return d.h();
    }

    public static boolean o() {
        return d.g();
    }

    public static long p() {
        return d.a();
    }

    public static boolean q() {
        return d.e();
    }

    public static float r() {
        return d.k();
    }

    public static float s() {
        return d.l();
    }

    static void a(b b2) {
        if (b2 != null) {
            c.add(b2);
        }
    }

    static {
        c = new ArrayList();
    }
}

