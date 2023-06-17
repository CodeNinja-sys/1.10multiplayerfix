/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.c;

import java.io.File;
import org.apache.commons.c.w;

public class an {
    private static final String ay = "Windows";
    private static final String az = "user.home";
    private static final String aA = "user.dir";
    private static final String aB = "java.io.tmpdir";
    private static final String aC = "java.home";
    public static final String a = org.apache.commons.c.an.c("awt.toolkit");
    public static final String b = org.apache.commons.c.an.c("file.encoding");
    public static final String c = org.apache.commons.c.an.c("file.separator");
    public static final String d = org.apache.commons.c.an.c("java.awt.fonts");
    public static final String e = org.apache.commons.c.an.c("java.awt.graphicsenv");
    public static final String f = org.apache.commons.c.an.c("java.awt.headless");
    public static final String g = org.apache.commons.c.an.c("java.awt.printerjob");
    public static final String h = org.apache.commons.c.an.c("java.class.path");
    public static final String i = org.apache.commons.c.an.c("java.class.version");
    public static final String j = org.apache.commons.c.an.c("java.compiler");
    public static final String k = org.apache.commons.c.an.c("java.endorsed.dirs");
    public static final String l = org.apache.commons.c.an.c("java.ext.dirs");
    public static final String m = org.apache.commons.c.an.c("java.home");
    public static final String n = org.apache.commons.c.an.c("java.io.tmpdir");
    public static final String o = org.apache.commons.c.an.c("java.library.path");
    public static final String p = org.apache.commons.c.an.c("java.runtime.name");
    public static final String q = org.apache.commons.c.an.c("java.runtime.version");
    public static final String r = org.apache.commons.c.an.c("java.specification.name");
    public static final String s = org.apache.commons.c.an.c("java.specification.vendor");
    public static final String t = org.apache.commons.c.an.c("java.specification.version");
    private static final w aD = org.apache.commons.c.w.b(t);
    public static final String u = org.apache.commons.c.an.c("java.util.prefs.PreferencesFactory");
    public static final String v = org.apache.commons.c.an.c("java.vendor");
    public static final String w = org.apache.commons.c.an.c("java.vendor.url");
    public static final String x = org.apache.commons.c.an.c("java.version");
    public static final String y = org.apache.commons.c.an.c("java.vm.info");
    public static final String z = org.apache.commons.c.an.c("java.vm.name");
    public static final String A = org.apache.commons.c.an.c("java.vm.specification.name");
    public static final String B = org.apache.commons.c.an.c("java.vm.specification.vendor");
    public static final String C = org.apache.commons.c.an.c("java.vm.specification.version");
    public static final String D = org.apache.commons.c.an.c("java.vm.vendor");
    public static final String E = org.apache.commons.c.an.c("java.vm.version");
    public static final String F = org.apache.commons.c.an.c("line.separator");
    public static final String G = org.apache.commons.c.an.c("os.arch");
    public static final String H = org.apache.commons.c.an.c("os.name");
    public static final String I = org.apache.commons.c.an.c("os.version");
    public static final String J = org.apache.commons.c.an.c("path.separator");
    public static final String K = org.apache.commons.c.an.c("user.country") == null ? org.apache.commons.c.an.c("user.region") : org.apache.commons.c.an.c("user.country");
    public static final String L = org.apache.commons.c.an.c("user.dir");
    public static final String M = org.apache.commons.c.an.c("user.home");
    public static final String N = org.apache.commons.c.an.c("user.language");
    public static final String O = org.apache.commons.c.an.c("user.name");
    public static final String P = org.apache.commons.c.an.c("user.timezone");
    public static final boolean Q = org.apache.commons.c.an.a("1.1");
    public static final boolean R = org.apache.commons.c.an.a("1.2");
    public static final boolean S = org.apache.commons.c.an.a("1.3");
    public static final boolean T = org.apache.commons.c.an.a("1.4");
    public static final boolean U = org.apache.commons.c.an.a("1.5");
    public static final boolean V = org.apache.commons.c.an.a("1.6");
    public static final boolean W = org.apache.commons.c.an.a("1.7");
    public static final boolean X = org.apache.commons.c.an.a("1.8");
    public static final boolean Y = org.apache.commons.c.an.b("AIX");
    public static final boolean Z = org.apache.commons.c.an.b("HP-UX");
    public static final boolean aa = org.apache.commons.c.an.b("OS/400");
    public static final boolean ab = org.apache.commons.c.an.b("Irix");
    public static final boolean ac = org.apache.commons.c.an.b("Linux") || org.apache.commons.c.an.b("LINUX");
    public static final boolean ad = org.apache.commons.c.an.b("Mac");
    public static final boolean ae = org.apache.commons.c.an.b("Mac OS X");
    public static final boolean af = org.apache.commons.c.an.b("FreeBSD");
    public static final boolean ag = org.apache.commons.c.an.b("OpenBSD");
    public static final boolean ah = org.apache.commons.c.an.b("NetBSD");
    public static final boolean ai = org.apache.commons.c.an.b("OS/2");
    public static final boolean aj = org.apache.commons.c.an.b("Solaris");
    public static final boolean ak = org.apache.commons.c.an.b("SunOS");
    public static final boolean al = Y || Z || ab || ac || ae || aj || ak || af || ag || ah;
    public static final boolean am = org.apache.commons.c.an.b("Windows");
    public static final boolean an = org.apache.commons.c.an.c("Windows", "5.0");
    public static final boolean ao = org.apache.commons.c.an.c("Windows", "5.2");
    public static final boolean ap = org.apache.commons.c.an.c("Windows Server 2008", "6.1");
    public static final boolean aq = org.apache.commons.c.an.c("Windows 9", "4.0");
    public static final boolean ar = org.apache.commons.c.an.c("Windows 9", "4.1");
    public static final boolean as = org.apache.commons.c.an.c("Windows", "4.9");
    public static final boolean at = org.apache.commons.c.an.b("Windows NT");
    public static final boolean au = org.apache.commons.c.an.c("Windows", "5.1");
    public static final boolean av = org.apache.commons.c.an.c("Windows", "6.0");
    public static final boolean aw = org.apache.commons.c.an.c("Windows", "6.1");
    public static final boolean ax = org.apache.commons.c.an.c("Windows", "6.2");

    public static File a() {
        return new File(System.getProperty(aC));
    }

    public static File b() {
        return new File(System.getProperty(aB));
    }

    private static boolean a(String string) {
        return org.apache.commons.c.an.a(t, string);
    }

    private static boolean c(String string, String string2) {
        return org.apache.commons.c.an.a(H, I, string, string2);
    }

    private static boolean b(String string) {
        return org.apache.commons.c.an.b(H, string);
    }

    private static String c(String string) {
        try {
            return System.getProperty(string);
        }
        catch (SecurityException securityException) {
            System.err.println("Caught a SecurityException reading the system property '" + string + "'; the SystemUtils property value will default to null.");
            return null;
        }
    }

    public static File c() {
        return new File(System.getProperty(aA));
    }

    public static File d() {
        return new File(System.getProperty(az));
    }

    public static boolean e() {
        return f != null ? f.equals(Boolean.TRUE.toString()) : false;
    }

    public static boolean a(w w2) {
        return aD.a(w2);
    }

    static boolean a(String string, String string2) {
        if (string == null) {
            return false;
        }
        return string.startsWith(string2);
    }

    static boolean a(String string, String string2, String string3, String string4) {
        if (string == null || string2 == null) {
            return false;
        }
        return string.startsWith(string3) && string2.startsWith(string4);
    }

    static boolean b(String string, String string2) {
        if (string == null) {
            return false;
        }
        return string.startsWith(string2);
    }
}

