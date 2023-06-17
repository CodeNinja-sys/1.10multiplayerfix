/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.d;

import com.ibm.icu.d.fo;
import com.ibm.icu.d.kx;
import java.util.Comparator;

public final class ky
implements Comparator {
    public static final int a = 0;
    public static final int b = 1;
    private int c;
    private int d;
    private boolean e;
    private static final int f = 10240;

    public ky() {
        this(false, false, 0);
    }

    public ky(boolean bl2, boolean bl3, int n2) {
        this.a(bl2);
        this.e = bl3;
        if (n2 < 0 || n2 > 1) {
            throw new IllegalArgumentException("Invalid fold case option");
        }
        this.d = n2;
    }

    public void a(boolean bl2) {
        this.c = bl2 ? 32768 : 0;
    }

    public void a(boolean bl2, int n2) {
        this.e = bl2;
        if (n2 < 0 || n2 > 1) {
            throw new IllegalArgumentException("Invalid fold case option");
        }
        this.d = n2;
    }

    public boolean a() {
        return this.c == 32768;
    }

    public boolean b() {
        return this.e;
    }

    public int c() {
        return this.d;
    }

    public int a(String string, String string2) {
        if (string == string2) {
            return 0;
        }
        if (string == null) {
            return -1;
        }
        if (string2 == null) {
            return 1;
        }
        if (this.e) {
            return this.b(string, string2);
        }
        return this.c(string, string2);
    }

    private int b(String string, String string2) {
        return fo.a((CharSequence)string, (CharSequence)string2, this.d | this.c | 0x10000);
    }

    private int c(String string, String string2) {
        boolean bl2;
        int n2;
        int n3 = string.length();
        int n4 = string2.length();
        int n5 = n3;
        int n6 = 0;
        if (n3 < n4) {
            n6 = -1;
        } else if (n3 > n4) {
            n6 = 1;
            n5 = n4;
        }
        char c2 = '\u0000';
        char c3 = '\u0000';
        for (n2 = 0; n2 < n5 && (c2 = string.charAt(n2)) == (c3 = string2.charAt(n2)); ++n2) {
        }
        if (n2 == n5) {
            return n6;
        }
        boolean bl3 = bl2 = this.c == 32768;
        if (c2 >= '\ud800' && c3 >= '\ud800' && bl2) {
            if (!(c2 <= '\udbff' && n2 + 1 != n3 && kx.b(string.charAt(n2 + 1)) || kx.b(c2) && n2 != 0 && kx.c(string.charAt(n2 - 1)))) {
                c2 = (char)(c2 - 10240);
            }
            if (!(c3 <= '\udbff' && n2 + 1 != n4 && kx.b(string2.charAt(n2 + 1)) || kx.b(c3) && n2 != 0 && kx.c(string2.charAt(n2 - 1)))) {
                c3 = (char)(c3 - 10240);
            }
        }
        return c2 - c3;
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((String)object, (String)object2);
    }
}

