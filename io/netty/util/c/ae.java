/*
 * Decompiled with CFR 0.150.
 */
package io.netty.util.c;

import io.netty.util.c.af;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public final class ae {
    private static boolean a = false;
    private static final g b = h.a(ae.class);
    private static boolean c;
    private static final Pattern d;

    public static boolean a(String string) {
        return ae.b(string) != null;
    }

    public static String b(String string) {
        return ae.a(string, null);
    }

    public static String a(String string, String string2) {
        String string3;
        block5: {
            if (string == null) {
                throw new NullPointerException("key");
            }
            if (string.isEmpty()) {
                throw new IllegalArgumentException("key must not be empty.");
            }
            string3 = null;
            try {
                string3 = System.getSecurityManager() == null ? System.getProperty(string) : (String)AccessController.doPrivileged(new af(string));
            }
            catch (Exception exception) {
                if (c) break block5;
                ae.a("Unable to retrieve a system property '" + string + "'; default values will be used.", exception);
                c = true;
            }
        }
        if (string3 == null) {
            return string2;
        }
        return string3;
    }

    public static boolean a(String string, boolean bl2) {
        String string2 = ae.b(string);
        if (string2 == null) {
            return bl2;
        }
        if ((string2 = string2.trim().toLowerCase()).isEmpty()) {
            return true;
        }
        if ("true".equals(string2) || "yes".equals(string2) || "1".equals(string2)) {
            return true;
        }
        if ("false".equals(string2) || "no".equals(string2) || "0".equals(string2)) {
            return false;
        }
        ae.c("Unable to parse the boolean system property '" + string + "':" + string2 + " - " + "using the default value: " + bl2);
        return bl2;
    }

    public static int a(String string, int n2) {
        String string2 = ae.b(string);
        if (string2 == null) {
            return n2;
        }
        if (d.matcher(string2 = string2.trim().toLowerCase()).matches()) {
            try {
                return Integer.parseInt(string2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        ae.c("Unable to parse the integer system property '" + string + "':" + string2 + " - " + "using the default value: " + n2);
        return n2;
    }

    public static long a(String string, long l2) {
        String string2 = ae.b(string);
        if (string2 == null) {
            return l2;
        }
        if (d.matcher(string2 = string2.trim().toLowerCase()).matches()) {
            try {
                return Long.parseLong(string2);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        ae.c("Unable to parse the long integer system property '" + string + "':" + string2 + " - " + "using the default value: " + l2);
        return l2;
    }

    private static void c(String string) {
        if (a) {
            b.d(string);
        } else {
            Logger.getLogger(ae.class.getName()).log(Level.WARNING, string);
        }
    }

    private static void a(String string, Exception exception) {
        if (a) {
            b.d(string, exception);
        } else {
            Logger.getLogger(ae.class.getName()).log(Level.WARNING, string, exception);
        }
    }

    private ae() {
    }

    static {
        a = true;
        d = Pattern.compile("-?[0-9]+");
    }
}

