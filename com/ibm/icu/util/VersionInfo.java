/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.util;

import com.ibm.icu.util.bo;
import com.ibm.icu.util.dj;
import java.util.concurrent.ConcurrentHashMap;

public final class VersionInfo
implements Comparable {
    public static final VersionInfo a;
    public static final VersionInfo b;
    public static final VersionInfo c;
    public static final VersionInfo d;
    public static final VersionInfo e;
    public static final VersionInfo f;
    public static final VersionInfo g;
    public static final VersionInfo h;
    public static final VersionInfo i;
    public static final VersionInfo j;
    public static final VersionInfo k;
    public static final VersionInfo l;
    public static final VersionInfo m;
    public static final VersionInfo n;
    public static final VersionInfo o;
    public static final VersionInfo p;
    public static final VersionInfo q;
    public static final VersionInfo r;
    public static final VersionInfo s;
    public static final VersionInfo t;
    public static final VersionInfo u;
    public static final VersionInfo v;
    public static final VersionInfo w;
    public static final VersionInfo x;
    public static final String y = "51b";
    public static final VersionInfo z;
    public static final VersionInfo A;
    public static final VersionInfo B;
    public static final VersionInfo C;
    private static volatile VersionInfo D;
    private static final VersionInfo E;
    private int F;
    private static final ConcurrentHashMap G;
    private static final int H = 255;
    private static final String I = "Invalid version number: Version number may be negative or greater than 255";

    public static VersionInfo a(String string) {
        int n2;
        int n3;
        int n4 = string.length();
        int[] arrn = new int[]{0, 0, 0, 0};
        int n5 = 0;
        for (n3 = 0; n5 < 4 && n3 < n4; ++n3) {
            n2 = string.charAt(n3);
            if (n2 == 46) {
                ++n5;
                continue;
            }
            if ((n2 = (char)(n2 - 48)) < 0 || n2 > 9) {
                throw new IllegalArgumentException(I);
            }
            int n6 = n5;
            arrn[n6] = arrn[n6] * 10;
            int n7 = n5;
            arrn[n7] = arrn[n7] + n2;
        }
        if (n3 != n4) {
            throw new IllegalArgumentException("Invalid version number: String '" + string + "' exceeds version format");
        }
        for (n2 = 0; n2 < 4; ++n2) {
            if (arrn[n2] >= 0 && arrn[n2] <= 255) continue;
            throw new IllegalArgumentException(I);
        }
        return VersionInfo.a(arrn[0], arrn[1], arrn[2], arrn[3]);
    }

    public static VersionInfo a(int n2, int n3, int n4, int n5) {
        VersionInfo versionInfo;
        if (n2 < 0 || n2 > 255 || n3 < 0 || n3 > 255 || n4 < 0 || n4 > 255 || n5 < 0 || n5 > 255) {
            throw new IllegalArgumentException(I);
        }
        int n6 = VersionInfo.b(n2, n3, n4, n5);
        Integer n7 = n6;
        VersionInfo versionInfo2 = (VersionInfo)G.get(n7);
        if (versionInfo2 == null && (versionInfo = G.putIfAbsent(n7, versionInfo2 = new VersionInfo(n6))) != null) {
            versionInfo2 = versionInfo;
        }
        return versionInfo2;
    }

    public static VersionInfo a(int n2, int n3, int n4) {
        return VersionInfo.a(n2, n3, n4, 0);
    }

    public static VersionInfo a(int n2, int n3) {
        return VersionInfo.a(n2, n3, 0, 0);
    }

    public static VersionInfo a(int n2) {
        return VersionInfo.a(n2, 0, 0, 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static VersionInfo a() {
        if (D != null) return D;
        Class<VersionInfo> class_ = VersionInfo.class;
        synchronized (VersionInfo.class) {
            if (D != null) return D;
            String string = System.getProperty("java.version");
            char[] arrc = string.toCharArray();
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            boolean bl2 = false;
            while (n2 < arrc.length) {
                char c2;
                if ((c2 = arrc[n2++]) < '0' || c2 > '9') {
                    if (!bl2) continue;
                    if (n4 == 3) break;
                    bl2 = false;
                    arrc[n3++] = 46;
                    ++n4;
                    continue;
                }
                bl2 = true;
                arrc[n3++] = c2;
            }
            while (n3 > 0 && arrc[n3 - 1] == '.') {
                --n3;
            }
            String string2 = new String(arrc, 0, n3);
            D = VersionInfo.a(string2);
            // ** MonitorExit[var0] (shouldn't be in output)
            return D;
        }
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(7);
        stringBuilder.append(this.b());
        stringBuilder.append('.');
        stringBuilder.append(this.c());
        stringBuilder.append('.');
        stringBuilder.append(this.d());
        stringBuilder.append('.');
        stringBuilder.append(this.e());
        return stringBuilder.toString();
    }

    public int b() {
        return this.F >> 24 & 0xFF;
    }

    public int c() {
        return this.F >> 16 & 0xFF;
    }

    public int d() {
        return this.F >> 8 & 0xFF;
    }

    public int e() {
        return this.F & 0xFF;
    }

    public boolean equals(Object object) {
        return object == this;
    }

    public int a(VersionInfo versionInfo) {
        return this.F - versionInfo.F;
    }

    private VersionInfo(int n2) {
        this.F = n2;
    }

    private static int b(int n2, int n3, int n4, int n5) {
        return n2 << 24 | n3 << 16 | n4 << 8 | n5;
    }

    public static void main(String[] arrstring) {
        String string;
        if (x.b() <= 4) {
            if (x.c() % 2 != 0) {
                int n2 = x.b();
                int n3 = x.c() + 1;
                if (n3 >= 10) {
                    n3 -= 10;
                    ++n2;
                }
                string = "" + n2 + "." + n3 + "M" + x.d();
            } else {
                string = x.b(2, 2);
            }
        } else {
            string = x.c() == 0 ? "" + x.b() + "M" + x.d() : x.b(2, 2);
        }
        System.out.println("International Components for Unicode for Java " + string);
        System.out.println("");
        System.out.println("Implementation Version: " + x.b(2, 4));
        System.out.println("Unicode Data Version:   " + E.b(2, 4));
        System.out.println("CLDR Data Version:      " + bo.e().b(2, 4));
        System.out.println("Time Zone Data Version: " + dj.q());
    }

    private String b(int n2, int n3) {
        int n4;
        if (n2 < 1 || n3 < 1 || n2 > 4 || n3 > 4 || n2 > n3) {
            throw new IllegalArgumentException("Invalid min/maxDigits range");
        }
        int[] arrn = new int[]{this.b(), this.c(), this.d(), this.e()};
        for (n4 = n3; n4 > n2 && arrn[n4 - 1] == 0; --n4) {
        }
        StringBuilder stringBuilder = new StringBuilder(7);
        stringBuilder.append(arrn[0]);
        for (int i2 = 1; i2 < n4; ++i2) {
            stringBuilder.append(".");
            stringBuilder.append(arrn[i2]);
        }
        return stringBuilder.toString();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((VersionInfo)object);
    }

    static {
        G = new ConcurrentHashMap();
        a = VersionInfo.a(1, 0, 0, 0);
        b = VersionInfo.a(1, 0, 1, 0);
        c = VersionInfo.a(1, 1, 0, 0);
        d = VersionInfo.a(1, 1, 5, 0);
        e = VersionInfo.a(2, 0, 0, 0);
        f = VersionInfo.a(2, 1, 2, 0);
        g = VersionInfo.a(2, 1, 5, 0);
        h = VersionInfo.a(2, 1, 8, 0);
        i = VersionInfo.a(2, 1, 9, 0);
        j = VersionInfo.a(3, 0, 0, 0);
        k = VersionInfo.a(3, 0, 1, 0);
        l = VersionInfo.a(3, 1, 0, 0);
        m = VersionInfo.a(3, 1, 1, 0);
        n = VersionInfo.a(3, 2, 0, 0);
        o = VersionInfo.a(4, 0, 0, 0);
        p = VersionInfo.a(4, 0, 1, 0);
        q = VersionInfo.a(4, 1, 0, 0);
        r = VersionInfo.a(5, 0, 0, 0);
        s = VersionInfo.a(5, 1, 0, 0);
        t = VersionInfo.a(5, 2, 0, 0);
        u = VersionInfo.a(6, 0, 0, 0);
        v = VersionInfo.a(6, 1, 0, 0);
        w = VersionInfo.a(6, 2, 0, 0);
        x = VersionInfo.a(51, 2, 0, 0);
        z = VersionInfo.a(51, 2, 0, 0);
        E = w;
        A = VersionInfo.a(7);
        B = VersionInfo.a(8);
        C = VersionInfo.a(1);
    }
}

