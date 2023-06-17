/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import com.a.a.n.a.dl;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.net.Proxy;
import net.minecraft.client.b.e;
import net.minecraft.client.k.ci;
import net.minecraft.client.r;
import net.minecraft.e.h;
import net.minecraft.q.am;
import net.minecraft.s.n;
import net.minecraft.u.bs;

public class b {
    public static boolean a() {
        return r.z().w.A;
    }

    public static Proxy b() {
        return r.z().M();
    }

    public static String c() {
        bs bs2 = r.z().K();
        return bs2 == null ? null : bs2.a();
    }

    public static String d() {
        bs bs2 = r.z().K();
        return bs2 == null ? null : bs2.c();
    }

    public static long e() {
        return r.I();
    }

    public static String f() {
        return r.z().K().a();
    }

    public static String g() {
        return r.z().K().b();
    }

    public static String h() {
        return r.z().K().c();
    }

    public static String a(String string) {
        return r.z().X().b(new com.c.a.e(com.c.d.b.b(string), null), false).b();
    }

    public static void a(n n2) {
        r.z().a(n2.o());
    }

    public static String i() {
        return r.z().y.getAbsolutePath();
    }

    public static int j() {
        return am.b.a();
    }

    public static int k() {
        return am.c.a();
    }

    public static int l() {
        return am.d.a();
    }

    public static int m() {
        return am.e.a();
    }

    public static void a(boolean bl2) {
        r.z().a(bl2);
    }

    public static dl a(String string, String string2) {
        return r.z().P().a(string, string2);
    }

    public static void n() {
        r.z().P().h();
    }

    public static boolean o() {
        return r.z().w.b(e.L);
    }

    public static boolean p() {
        return r.z().o != null && r.z().o instanceof ci;
    }

    public static void a(File file) {
        if (file.exists()) {
            try {
                net.minecraft.e.e e2 = h.a(new FileInputStream(file));
                net.minecraft.e.e e3 = e2.o("Data");
                e3.q("Player");
                h.a(e2, new FileOutputStream(file));
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

