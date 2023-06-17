/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna;

import com.sun.jna.Native;

public final class ax {
    public static final int a = -1;
    public static final int b = 0;
    public static final int c = 1;
    public static final int d = 2;
    public static final int e = 3;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final boolean i;
    public static final boolean j;
    public static final boolean k;
    public static final String l;
    public static final String m;
    private static final int n;

    private ax() {
    }

    public static final int a() {
        return n;
    }

    public static final boolean b() {
        return n == 0;
    }

    public static final boolean c() {
        return n == 1;
    }

    public static final boolean d() {
        return n == 6;
    }

    public static final boolean e() {
        return n == 2 || n == 6;
    }

    public static final boolean f() {
        return n == 3;
    }

    public static final boolean g() {
        return n == 4;
    }

    public static final boolean h() {
        return n == 5;
    }

    public static final boolean i() {
        return !ax.e() && !ax.b();
    }

    public static final boolean j() {
        return !ax.d() || !"J9".equals(System.getProperty("java.vm.name"));
    }

    public static final boolean k() {
        String string = System.getProperty("sun.arch.data.model", System.getProperty("com.ibm.vm.bitmode"));
        if (string != null) {
            return "64".equals(string);
        }
        String string2 = System.getProperty("os.arch").toLowerCase();
        if ("x86_64".equals(string2) || "ia64".equals(string2) || "ppc64".equals(string2) || "sparcv9".equals(string2) || "amd64".equals(string2)) {
            return true;
        }
        return Native.a == 8;
    }

    public static final boolean l() {
        String string = System.getProperty("os.arch").toLowerCase().trim();
        return string.equals("i386") || string.equals("x86") || string.equals("x86_64") || string.equals("amd64");
    }

    public static final boolean m() {
        String string = System.getProperty("os.arch").toLowerCase().trim();
        return string.equals("ppc") || string.equals("ppc64") || string.equals("powerpc") || string.equals("powerpc64");
    }

    public static final boolean n() {
        String string = System.getProperty("os.arch").toLowerCase().trim();
        return string.equals("arm");
    }

    static {
        String string = System.getProperty("os.name");
        n = string.startsWith("Linux") ? 1 : (string.startsWith("Mac") || string.startsWith("Darwin") ? 0 : (string.startsWith("Windows CE") ? 6 : (string.startsWith("Windows") ? 2 : (string.startsWith("Solaris") || string.startsWith("SunOS") ? 3 : (string.startsWith("FreeBSD") ? 4 : (string.startsWith("OpenBSD") ? 5 : -1))))));
        boolean bl2 = false;
        try {
            Class.forName("java.awt.Component");
            bl2 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        k = bl2;
        boolean bl3 = false;
        try {
            Class.forName("java.nio.Buffer");
            bl3 = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        j = bl3;
        boolean bl4 = i = n != 6;
        String string2 = n == 2 ? "msvcrt" : (m = n == 6 ? "coredll" : "c");
        l = n == 2 ? "msvcrt" : (n == 6 ? "coredll" : "m");
    }
}

