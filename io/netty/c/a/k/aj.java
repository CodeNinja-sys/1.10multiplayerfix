/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.k;

import io.netty.c.a.d.aw;
import io.netty.c.a.d.bp;
import io.netty.c.a.d.br;
import io.netty.c.a.k.ak;
import io.netty.c.a.k.am;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public abstract class aj
implements Iterable {
    public static final aj a = new ak();

    public static String a(am am2, String string) {
        return am2.e().b(string);
    }

    public static String a(am am2, String string, String string2) {
        String string3 = am2.e().b(string);
        if (string3 == null) {
            return string2;
        }
        return string3;
    }

    public static void a(am am2, String string, Object object) {
        am2.e().b(string, object);
    }

    public static void a(am am2, String string, Iterable iterable) {
        am2.e().a(string, iterable);
    }

    public static void b(am am2, String string, Object object) {
        am2.e().a(string, object);
    }

    public static void a(am am2) {
        am2.e().a(":host");
    }

    public static String b(am am2) {
        return am2.e().b(":host");
    }

    public static void b(am am2, String string) {
        am2.e().b(":host", string);
    }

    public static void a(int n2, am am2) {
        am2.e().a(":method");
    }

    public static aw b(int n2, am am2) {
        try {
            return aw.a(am2.e().b(":method"));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(int n2, am am2, aw aw2) {
        am2.e().b(":method", aw2.a());
    }

    public static void c(int n2, am am2) {
        am2.e().a(":scheme");
    }

    public static String d(int n2, am am2) {
        return am2.e().b(":scheme");
    }

    public static void a(int n2, am am2, String string) {
        am2.e().b(":scheme", string);
    }

    public static void e(int n2, am am2) {
        am2.e().a(":status");
    }

    public static bp f(int n2, am am2) {
        try {
            String string = am2.e().b(":status");
            int n3 = string.indexOf(32);
            if (n3 == -1) {
                return bp.a(Integer.parseInt(string));
            }
            int n4 = Integer.parseInt(string.substring(0, n3));
            String string2 = string.substring(n3 + 1);
            bp bp2 = bp.a(n4);
            if (bp2.b().equals(string2)) {
                return bp2;
            }
            return new bp(n4, string2);
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(int n2, am am2, bp bp2) {
        am2.e().b(":status", bp2.toString());
    }

    public static void g(int n2, am am2) {
        am2.e().a(":path");
    }

    public static String h(int n2, am am2) {
        return am2.e().b(":path");
    }

    public static void b(int n2, am am2, String string) {
        am2.e().b(":path", string);
    }

    public static void i(int n2, am am2) {
        am2.e().a(":version");
    }

    public static br j(int n2, am am2) {
        try {
            return br.a(am2.e().b(":version"));
        }
        catch (Exception exception) {
            return null;
        }
    }

    public static void a(int n2, am am2, br br2) {
        am2.e().b(":version", br2.d());
    }

    public Iterator iterator() {
        return this.b().iterator();
    }

    public abstract String b(String var1);

    public abstract List c(String var1);

    public abstract List b();

    public abstract boolean d(String var1);

    public abstract Set c();

    public abstract aj a(String var1, Object var2);

    public abstract aj b(String var1, Iterable var2);

    public abstract aj b(String var1, Object var2);

    public abstract aj a(String var1, Iterable var2);

    public abstract aj a(String var1);

    public abstract aj a();

    public abstract boolean d();
}

