/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.k;

import com.a.a.b.bx;
import com.a.a.b.cl;
import com.a.a.b.dg;
import com.a.a.b.e;
import com.a.a.b.m;
import com.a.a.d.jl;
import com.a.c.a.a;
import java.util.List;

public final class f {
    private static final m a = com.a.a.b.m.a(".\u3002\uff0e\uff61");
    private static final dg b = dg.a('.');
    private static final bx c = bx.a('.');
    private static final int d = -1;
    private static final String e = "\\.";
    private static final int f = 127;
    private static final int g = 253;
    private static final int h = 63;
    private final String i;
    private final jl j;
    private final int k;
    private static final m l = com.a.a.b.m.a("-_");
    private static final m m = com.a.a.b.m.f.b(l);

    f(String string) {
        string = com.a.a.b.e.a(a.a((CharSequence)string, '.'));
        if (string.endsWith(".")) {
            string = string.substring(0, string.length() - 1);
        }
        cl.a(string.length() <= 253, "Domain name too long: '%s':", new Object[]{string});
        this.i = string;
        this.j = jl.a(b.a(string));
        cl.a(this.j.size() <= 127, "Domain has too many parts: '%s'", new Object[]{string});
        cl.a(com.a.a.k.f.a(this.j), "Not a valid domain name: '%s'", new Object[]{string});
        this.k = this.j();
    }

    private int j() {
        int n2 = this.j.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = c.a(this.j.a(i2, n2));
            if (com.a.c.a.a.a.containsKey(string)) {
                return i2;
            }
            if (com.a.c.a.a.c.containsKey(string)) {
                return i2 + 1;
            }
            if (!com.a.a.k.f.d(string)) continue;
            return i2;
        }
        return -1;
    }

    public static f a(String string) {
        return new f((String)cl.a(string));
    }

    private static boolean a(List list) {
        int n2 = list.size() - 1;
        if (!com.a.a.k.f.a((String)list.get(n2), true)) {
            return false;
        }
        for (int i2 = 0; i2 < n2; ++i2) {
            String string = (String)list.get(i2);
            if (com.a.a.k.f.a(string, false)) continue;
            return false;
        }
        return true;
    }

    private static boolean a(String string, boolean bl2) {
        if (string.length() < 1 || string.length() > 63) {
            return false;
        }
        String string2 = com.a.a.b.m.b.j(string);
        if (!m.d(string2)) {
            return false;
        }
        if (l.c(string.charAt(0)) || l.c(string.charAt(string.length() - 1))) {
            return false;
        }
        return !bl2 || !com.a.a.b.m.c.c(string.charAt(0));
    }

    public jl a() {
        return this.j;
    }

    public boolean b() {
        return this.k == 0;
    }

    public boolean c() {
        return this.k != -1;
    }

    public f d() {
        return this.c() ? this.a(this.k) : null;
    }

    public boolean e() {
        return this.k > 0;
    }

    public boolean f() {
        return this.k == 1;
    }

    public f g() {
        if (this.f()) {
            return this;
        }
        cl.b(this.e(), "Not under a public suffix: %s", this.i);
        return this.a(this.k - 1);
    }

    public boolean h() {
        return this.j.size() > 1;
    }

    public f i() {
        cl.b(this.h(), "Domain '%s' has no parent", this.i);
        return this.a(1);
    }

    private f a(int n2) {
        return com.a.a.k.f.a(c.a(this.j.a(n2, this.j.size())));
    }

    public f b(String string) {
        return com.a.a.k.f.a((String)cl.a(string) + "." + this.i);
    }

    public static boolean c(String string) {
        try {
            com.a.a.k.f.a(string);
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return false;
        }
    }

    private static boolean d(String string) {
        String[] arrstring = string.split(e, 2);
        return arrstring.length == 2 && com.a.c.a.a.b.containsKey(arrstring[1]);
    }

    public String toString() {
        return this.i;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object instanceof f) {
            f f2 = (f)object;
            return this.i.equals(f2.i);
        }
        return false;
    }

    public int hashCode() {
        return this.i.hashCode();
    }
}

