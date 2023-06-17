/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.c;

import java.util.Locale;
import org.apache.a.f.c.b;
import org.apache.a.f.c.c;
import org.apache.a.f.c.d;
import org.apache.a.f.c.g;
import org.apache.a.f.c.h;
import org.apache.a.f.c.i;
import org.apache.a.f.c.k;
import org.apache.a.f.c.l;
import org.apache.a.f.c.m;
import org.apache.a.f.c.n;
import org.apache.a.o.a;

public final class f {
    private final String a;
    private final k b;
    private final int c;
    private final boolean d;
    private String e;

    public f(String string, int n2, k k2) {
        org.apache.a.o.a.a((Object)string, "Scheme name");
        org.apache.a.o.a.a(n2 > 0 && n2 <= 65535, "Port is invalid");
        org.apache.a.o.a.a(k2, "Socket factory");
        this.a = string.toLowerCase(Locale.ENGLISH);
        this.c = n2;
        if (k2 instanceof g) {
            this.d = true;
            this.b = k2;
        } else if (k2 instanceof b) {
            this.d = true;
            this.b = new i((b)k2);
        } else {
            this.d = false;
            this.b = k2;
        }
    }

    public f(String string, m m2, int n2) {
        org.apache.a.o.a.a((Object)string, "Scheme name");
        org.apache.a.o.a.a(m2, "Socket factory");
        org.apache.a.o.a.a(n2 > 0 && n2 <= 65535, "Port is invalid");
        this.a = string.toLowerCase(Locale.ENGLISH);
        if (m2 instanceof c) {
            this.b = new h((c)m2);
            this.d = true;
        } else {
            this.b = new l(m2);
            this.d = false;
        }
        this.c = n2;
    }

    public final int a() {
        return this.c;
    }

    public final m b() {
        if (this.b instanceof l) {
            return ((l)this.b).a();
        }
        if (this.d) {
            return new d((b)this.b);
        }
        return new n(this.b);
    }

    public final k c() {
        return this.b;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.d;
    }

    public final int a(int n2) {
        return n2 <= 0 ? this.c : n2;
    }

    public final String toString() {
        if (this.e == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append(':');
            stringBuilder.append(Integer.toString(this.c));
            this.e = stringBuilder.toString();
        }
        return this.e;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof f) {
            f f2 = (f)object;
            return this.a.equals(f2.a) && this.c == f2.c && this.d == f2.d;
        }
        return false;
    }

    public int hashCode() {
        int n2 = 17;
        n2 = org.apache.a.o.i.a(n2, this.c);
        n2 = org.apache.a.o.i.a(n2, (Object)this.a);
        n2 = org.apache.a.o.i.a(n2, this.d);
        return n2;
    }
}

