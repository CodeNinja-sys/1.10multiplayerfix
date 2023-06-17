/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.c;
import org.apache.a.i.c.az;
import org.apache.a.j.b;
import org.apache.a.j.g;
import org.apache.a.j.h;
import org.apache.a.o.d;

public class af
implements b,
h {
    private final h a;
    private final b b;
    private final az c;
    private final String d;

    public af(h h2, az az2, String string) {
        this.a = h2;
        this.b = h2 instanceof b ? (b)((Object)h2) : null;
        this.c = az2;
        this.d = string != null ? string : org.apache.a.c.f.name();
    }

    public af(h h2, az az2) {
        this(h2, az2, null);
    }

    public boolean a(int n2) {
        return this.a.a(n2);
    }

    public int a(byte[] arrby, int n2, int n3) {
        int n4 = this.a.a(arrby, n2, n3);
        if (this.c.a() && n4 > 0) {
            this.c.b(arrby, n2, n4);
        }
        return n4;
    }

    public int a() {
        int n2 = this.a.a();
        if (this.c.a() && n2 != -1) {
            this.c.b(n2);
        }
        return n2;
    }

    public int a(byte[] arrby) {
        int n2 = this.a.a(arrby);
        if (this.c.a() && n2 > 0) {
            this.c.b(arrby, 0, n2);
        }
        return n2;
    }

    public String b() {
        String string = this.a.b();
        if (this.c.a() && string != null) {
            String string2 = string + "\r\n";
            this.c.b(string2.getBytes(this.d));
        }
        return string;
    }

    public int a(d d2) {
        int n2 = this.a.a(d2);
        if (this.c.a() && n2 >= 0) {
            int n3 = d2.e() - n2;
            String string = new String(d2.c(), n3, n2);
            String string2 = string + "\r\n";
            this.c.b(string2.getBytes(this.d));
        }
        return n2;
    }

    public g c() {
        return this.a.c();
    }

    public boolean d() {
        if (this.b != null) {
            return this.b.d();
        }
        return false;
    }
}

