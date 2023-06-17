/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.AccessController;
import org.lwjgl.WindowsSysImplementation;
import org.lwjgl.a.j;
import org.lwjgl.ac;
import org.lwjgl.ad;
import org.lwjgl.ae;
import org.lwjgl.af;
import org.lwjgl.d;
import org.lwjgl.l;
import org.lwjgl.n;

public final class ab {
    private static final String a = "lwjgl";
    private static final String b = "2.9.4";
    private static final String c = "64";
    private static final af d = ab.g();
    private static final boolean e;

    private static void b(String string) {
        AccessController.doPrivileged(new ac(string));
    }

    private static void c(String string) {
        String string2 = System.getProperty("os.arch");
        boolean bl2 = org.lwjgl.d.a() != 2 && ("amd64".equals(string2) || "x86_64".equals(string2));
        UnsatisfiedLinkError unsatisfiedLinkError = null;
        if (bl2) {
            try {
                ab.b(string + c);
                return;
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError2) {
                unsatisfiedLinkError = unsatisfiedLinkError2;
            }
        }
        try {
            ab.b(string);
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError3) {
            if (bl2) {
                throw unsatisfiedLinkError;
            }
            if (d.b()) {
                try {
                    ab.b(string + c);
                    return;
                }
                catch (UnsatisfiedLinkError unsatisfiedLinkError4) {
                    org.lwjgl.d.a((CharSequence)("Failed to load 64 bit library: " + unsatisfiedLinkError4.getMessage()));
                }
            }
            throw unsatisfiedLinkError3;
        }
    }

    private static af g() {
        switch (org.lwjgl.d.a()) {
            case 1: {
                return new l();
            }
            case 3: {
                return new WindowsSysImplementation();
            }
            case 2: {
                return new n();
            }
        }
        throw new IllegalStateException("Unsupported platform");
    }

    private ab() {
    }

    public static String a() {
        return b;
    }

    public static void b() {
    }

    public static boolean c() {
        return e;
    }

    public static long d() {
        return d.a();
    }

    public static long e() {
        return d.c() & Long.MAX_VALUE;
    }

    public static void a(String string, String string2) {
        boolean bl2 = j.x();
        if (bl2) {
            j.b(false);
        }
        if (string == null) {
            string = "";
        }
        if (string2 == null) {
            string2 = "";
        }
        d.a(string, string2);
        if (bl2) {
            j.b(true);
        }
    }

    public static boolean a(String string) {
        try {
            Class<?> class_ = Class.forName("javax.jnlp.ServiceManager");
            Method method = (Method)AccessController.doPrivileged(new ad(class_));
            Object object = method.invoke(class_, "javax.jnlp.BasicService");
            Class<?> class_2 = Class.forName("javax.jnlp.BasicService");
            Method method2 = (Method)AccessController.doPrivileged(new ae(class_2));
            try {
                Boolean bl2 = (Boolean)method2.invoke(object, new URL(string));
                return bl2;
            }
            catch (MalformedURLException malformedURLException) {
                malformedURLException.printStackTrace(System.err);
                return false;
            }
        }
        catch (Exception exception) {
            return d.a(string);
        }
    }

    public static String f() {
        return d.d();
    }

    static {
        ab.c(a);
        e = d.getPointerSize() == 8;
        int n2 = d.getJNIVersion();
        int n3 = d.e();
        if (n2 != n3) {
            throw new LinkageError("Version mismatch: jar version is '" + n3 + "', native library version is '" + n2 + "'");
        }
        d.setDebug(org.lwjgl.d.i);
    }
}

