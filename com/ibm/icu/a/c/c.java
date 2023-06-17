/*
 * Decompiled with CFR 0.150.
 */
package com.ibm.icu.a.c;

import com.ibm.icu.a.c.a;
import com.ibm.icu.a.c.d;
import com.ibm.icu.a.c.e;
import com.ibm.icu.a.c.f;

public final class c {
    private static final boolean c = false;
    public static final String a = "_";
    private static final e d = new e();
    public static final c b = com.ibm.icu.a.c.c.a("", "", "", "");
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private volatile transient int i = 0;

    private c(String string, String string2, String string3, String string4) {
        if (string != null) {
            this.e = com.ibm.icu.a.c.a.a(string).intern();
        }
        if (string2 != null) {
            this.f = com.ibm.icu.a.c.a.c(string2).intern();
        }
        if (string3 != null) {
            this.g = com.ibm.icu.a.c.a.b(string3).intern();
        }
        if (string4 != null) {
            this.h = com.ibm.icu.a.c.a.b(string4).intern();
        }
    }

    public static c a(String string, String string2, String string3, String string4) {
        f f2 = new f(string, string2, string3, string4);
        c c2 = (c)d.c(f2);
        return c2;
    }

    public String a() {
        return this.e;
    }

    public String b() {
        return this.f;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.h;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof c)) {
            return false;
        }
        c c2 = (c)object;
        return this.hashCode() == c2.hashCode() && this.e.equals(c2.e) && this.f.equals(c2.f) && this.g.equals(c2.g) && this.h.equals(c2.h);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.e.length() > 0) {
            stringBuilder.append("language=");
            stringBuilder.append(this.e);
        }
        if (this.f.length() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("script=");
            stringBuilder.append(this.f);
        }
        if (this.g.length() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("region=");
            stringBuilder.append(this.g);
        }
        if (this.h.length() > 0) {
            if (stringBuilder.length() > 0) {
                stringBuilder.append(", ");
            }
            stringBuilder.append("variant=");
            stringBuilder.append(this.h);
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n2 = this.i;
        if (n2 == 0) {
            int n3;
            for (n3 = 0; n3 < this.e.length(); ++n3) {
                n2 = 31 * n2 + this.e.charAt(n3);
            }
            for (n3 = 0; n3 < this.f.length(); ++n3) {
                n2 = 31 * n2 + this.f.charAt(n3);
            }
            for (n3 = 0; n3 < this.g.length(); ++n3) {
                n2 = 31 * n2 + this.g.charAt(n3);
            }
            for (n3 = 0; n3 < this.h.length(); ++n3) {
                n2 = 31 * n2 + this.h.charAt(n3);
            }
            this.i = n2;
        }
        return n2;
    }

    /* synthetic */ c(String string, String string2, String string3, String string4, d d2) {
        this(string, string2, string3, string4);
    }
}

