/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a;

import com.ibm.icu.a.cf;
import com.ibm.icu.a.dg;
import com.ibm.icu.util.dn;

public class au
extends cf {
    private int b;
    private int c;
    private String d;
    private String e;
    private String f;
    public static final int a = -1;

    public static au a(String string, String string2) {
        return au.a(string, string2, -1);
    }

    public static au a(String string, String string2, int n2) {
        if (string == null) {
            return null;
        }
        String string3 = dn.h(string);
        return new au(string, string3, string2, n2);
    }

    public static au a(dn dn2, String string, int n2) {
        if (dn2 == null) {
            return null;
        }
        String string2 = dn2.l();
        return new au(string2, string2, string, n2);
    }

    protected au(String string, String string2, String string3, int n2) {
        super(string);
        this.b = n2;
        if (string2 == null || string2.equalsIgnoreCase("root")) {
            this.d = "";
            this.e = null;
        } else {
            int n3 = string2.indexOf(64);
            if (n3 == 4 && string2.regionMatches(true, 0, "root", 0, 4)) {
                this.d = string2.substring(4);
                this.c = 0;
                this.e = null;
            } else {
                this.d = string2;
                this.c = n3;
                this.e = string3 == null || this.d.equals(string3) ? "" : string3;
            }
        }
        this.f = this.c == -1 ? this.d : this.d.substring(0, this.c);
    }

    public String a() {
        return this.b == -1 ? null : Integer.toString(this.b());
    }

    public int b() {
        return this.b;
    }

    public String c() {
        return this.d;
    }

    public String d() {
        return this.f;
    }

    public String e() {
        String string = this.d();
        if (string != null) {
            StringBuilder stringBuilder = new StringBuilder();
            if (this.b != -1) {
                stringBuilder.append(this.a());
            }
            stringBuilder.append('/');
            stringBuilder.append(string);
            if (this.c != -1) {
                stringBuilder.append(this.d.substring(this.c, this.d.length()));
            }
            string = stringBuilder.toString();
        }
        return string;
    }

    public dn f() {
        return new dn(this.d);
    }

    public dn g() {
        if (this.c == -1) {
            return new dn(this.f);
        }
        return new dn(this.f + this.d.substring(this.c));
    }

    public boolean h() {
        int n2 = this.f.lastIndexOf(95);
        if (n2 != -1) {
            while (--n2 >= 0 && this.f.charAt(n2) == '_') {
            }
            this.f = this.f.substring(0, n2 + 1);
            return true;
        }
        if (this.e != null) {
            this.f = this.e;
            this.e = this.e.length() == 0 ? null : "";
            return true;
        }
        this.f = null;
        return false;
    }

    public boolean a(String string) {
        return dg.a(this.c(), string);
    }
}

