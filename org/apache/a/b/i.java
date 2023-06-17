/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b;

import java.util.Locale;
import org.apache.a.o.a;
import org.apache.a.r;

public class i {
    public static final String a = null;
    public static final int b = -1;
    public static final String c = null;
    public static final String d = null;
    public static final i e = new i(a, -1, c, d);
    private final String f;
    private final String g;
    private final String h;
    private final int i;

    public i(String string, int n2, String string2, String string3) {
        this.h = string == null ? a : string.toLowerCase(Locale.ENGLISH);
        this.i = n2 < 0 ? -1 : n2;
        this.g = string2 == null ? c : string2;
        this.f = string3 == null ? d : string3.toUpperCase(Locale.ENGLISH);
    }

    public i(r r2, String string, String string2) {
        this(r2.a(), r2.b(), string, string2);
    }

    public i(r r2) {
        this(r2, c, d);
    }

    public i(String string, int n2, String string2) {
        this(string, n2, string2, d);
    }

    public i(String string, int n2) {
        this(string, n2, c, d);
    }

    public i(i i2) {
        org.apache.a.o.a.a(i2, "Scope");
        this.h = i2.a();
        this.i = i2.b();
        this.g = i2.c();
        this.f = i2.d();
    }

    public String a() {
        return this.h;
    }

    public int b() {
        return this.i;
    }

    public String c() {
        return this.g;
    }

    public String d() {
        return this.f;
    }

    public int a(i i2) {
        int n2 = 0;
        if (org.apache.a.o.i.a(this.f, (Object)i2.f)) {
            ++n2;
        } else if (this.f != d && i2.f != d) {
            return -1;
        }
        if (org.apache.a.o.i.a(this.g, (Object)i2.g)) {
            n2 += 2;
        } else if (this.g != c && i2.g != c) {
            return -1;
        }
        if (this.i == i2.i) {
            n2 += 4;
        } else if (this.i != -1 && i2.i != -1) {
            return -1;
        }
        if (org.apache.a.o.i.a(this.h, (Object)i2.h)) {
            n2 += 8;
        } else if (this.h != a && i2.h != a) {
            return -1;
        }
        return n2;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (object == this) {
            return true;
        }
        if (!(object instanceof i)) {
            return super.equals(object);
        }
        i i2 = (i)object;
        return org.apache.a.o.i.a(this.h, (Object)i2.h) && this.i == i2.i && org.apache.a.o.i.a(this.g, (Object)i2.g) && org.apache.a.o.i.a(this.f, (Object)i2.f);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        if (this.f != null) {
            stringBuilder.append(this.f.toUpperCase(Locale.ENGLISH));
            stringBuilder.append(' ');
        }
        if (this.g != null) {
            stringBuilder.append('\'');
            stringBuilder.append(this.g);
            stringBuilder.append('\'');
        } else {
            stringBuilder.append("<any realm>");
        }
        if (this.h != null) {
            stringBuilder.append('@');
            stringBuilder.append(this.h);
            if (this.i >= 0) {
                stringBuilder.append(':');
                stringBuilder.append(this.i);
            }
        }
        return stringBuilder.toString();
    }

    public int hashCode() {
        int n2 = 17;
        n2 = org.apache.a.o.i.a(n2, (Object)this.h);
        n2 = org.apache.a.o.i.a(n2, this.i);
        n2 = org.apache.a.o.i.a(n2, (Object)this.g);
        n2 = org.apache.a.o.i.a(n2, (Object)this.f);
        return n2;
    }
}

