/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.an;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.k.v;
import org.apache.a.o.a;
import org.apache.a.o.d;

public class k
implements v {
    public static final k a = new k();
    public static final k b = new k();

    protected d a(d d2) {
        d d3 = d2;
        if (d3 != null) {
            d3.a();
        } else {
            d3 = new d(64);
        }
        return d3;
    }

    public static String a(ak ak2, v v2) {
        return (v2 != null ? v2 : b).a(null, ak2).toString();
    }

    public d a(d d2, ak ak2) {
        org.apache.a.o.a.a(ak2, "Protocol version");
        d d3 = d2;
        int n2 = this.a(ak2);
        if (d3 == null) {
            d3 = new d(n2);
        } else {
            d3.b(n2);
        }
        d3.a(ak2.a());
        d3.a('/');
        d3.a(Integer.toString(ak2.b()));
        d3.a('.');
        d3.a(Integer.toString(ak2.c()));
        return d3;
    }

    protected int a(ak ak2) {
        return ak2.a().length() + 4;
    }

    public static String a(am am2, v v2) {
        return (v2 != null ? v2 : b).a(null, am2).toString();
    }

    public d a(d d2, am am2) {
        org.apache.a.o.a.a(am2, "Request line");
        d d3 = this.a(d2);
        this.b(d3, am2);
        return d3;
    }

    protected void b(d d2, am am2) {
        String string = am2.a();
        String string2 = am2.c();
        int n2 = string.length() + 1 + string2.length() + 1 + this.a(am2.b());
        d2.b(n2);
        d2.a(string);
        d2.a(' ');
        d2.a(string2);
        d2.a(' ');
        this.a(d2, am2.b());
    }

    public static String a(an an2, v v2) {
        return (v2 != null ? v2 : b).a(null, an2).toString();
    }

    public d a(d d2, an an2) {
        org.apache.a.o.a.a(an2, "Status line");
        d d3 = this.a(d2);
        this.b(d3, an2);
        return d3;
    }

    protected void b(d d2, an an2) {
        int n2 = this.a(an2.a()) + 1 + 3 + 1;
        String string = an2.c();
        if (string != null) {
            n2 += string.length();
        }
        d2.b(n2);
        this.a(d2, an2.a());
        d2.a(' ');
        d2.a(Integer.toString(an2.b()));
        d2.a(' ');
        if (string != null) {
            d2.a(string);
        }
    }

    public static String a(f f2, v v2) {
        return (v2 != null ? v2 : b).a(null, f2).toString();
    }

    public d a(d d2, f f2) {
        d d3;
        org.apache.a.o.a.a(f2, "Header");
        if (f2 instanceof e) {
            d3 = ((e)f2).a();
        } else {
            d3 = this.a(d2);
            this.b(d3, f2);
        }
        return d3;
    }

    protected void b(d d2, f f2) {
        String string = f2.c();
        String string2 = f2.d();
        int n2 = string.length() + 2;
        if (string2 != null) {
            n2 += string2.length();
        }
        d2.b(n2);
        d2.a(string);
        d2.a(": ");
        if (string2 != null) {
            d2.a(string2);
        }
    }
}

