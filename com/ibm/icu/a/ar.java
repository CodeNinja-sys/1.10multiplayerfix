/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.util.VersionInfo;

public final class ar {
    private static String d;
    private static boolean e;
    private static boolean f;
    public static final String a;
    public static final boolean b;
    public static final VersionInfo c;

    public static VersionInfo a(String string) {
        int[] arrn = new int[4];
        boolean bl2 = false;
        int n2 = 0;
        int n3 = 0;
        while (n2 < string.length()) {
            char c2;
            if ((c2 = string.charAt(n2++)) < '0' || c2 > '9') {
                if (!bl2) continue;
                if (n3 == 3) break;
                bl2 = false;
                ++n3;
                continue;
            }
            if (bl2) {
                arrn[n3] = arrn[n3] * 10 + (c2 - 48);
                if (arrn[n3] <= 255) continue;
                arrn[n3] = 0;
                break;
            }
            bl2 = true;
            arrn[n3] = c2 - 48;
        }
        return VersionInfo.a(arrn[0], arrn[1], arrn[2], arrn[3]);
    }

    public static boolean a() {
        return e;
    }

    public static boolean b(String string) {
        if (e) {
            boolean bl2;
            boolean bl3 = bl2 = d.indexOf(string) != -1;
            if (f) {
                System.out.println("\nICUDebug.enabled(" + string + ") = " + bl2);
            }
            return bl2;
        }
        return false;
    }

    public static String c(String string) {
        String string2 = "false";
        if (e) {
            int n2 = d.indexOf(string);
            if (n2 != -1) {
                int n3;
                string2 = d.length() > (n2 += string.length()) && d.charAt(n2) == '=' ? d.substring(n2, (n3 = d.indexOf(",", ++n2)) == -1 ? d.length() : n3) : "true";
            }
            if (f) {
                System.out.println("\nICUDebug.value(" + string + ") = " + string2);
            }
        }
        return string2;
    }

    static {
        VersionInfo versionInfo;
        try {
            d = System.getProperty("ICUDebug");
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        e = d != null;
        boolean bl2 = f = e && (d.equals("") || d.indexOf("help") != -1);
        if (e) {
            System.out.println("\nICUDebug=" + d);
        }
        b = (c = ar.a(a = System.getProperty("java.version", "0"))).a(versionInfo = VersionInfo.a("1.4.0")) >= 0;
    }
}

