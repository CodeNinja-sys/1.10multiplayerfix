/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.apache.a.i.a.o;
import org.apache.a.i.a.p;
import org.apache.a.i.a.q;
import org.apache.a.i.a.t;

class w
extends t {
    protected int a;
    protected byte[] b;
    protected byte[] c;
    protected byte[] d;
    protected byte[] e;
    protected byte[] f;
    protected byte[] g;

    w(String string, String string2, String string3, String string4, byte[] arrby, int n2, String string5, byte[] arrby2) {
        byte[] arrby3;
        this.a = n2;
        String string6 = p.d(string2);
        String string7 = p.e(string);
        q q2 = new q(string7, string3, string4, arrby, string5, arrby2);
        try {
            if ((n2 & 0x800000) != 0 && arrby2 != null && string5 != null) {
                this.f = q2.l();
                this.e = q2.m();
                arrby3 = (n2 & 0x80) != 0 ? q2.t() : q2.r();
            } else if ((n2 & 0x80000) != 0) {
                this.f = q2.n();
                this.e = q2.o();
                arrby3 = (n2 & 0x80) != 0 ? q2.t() : q2.s();
            } else {
                this.f = q2.g();
                this.e = q2.e();
                arrby3 = (n2 & 0x80) != 0 ? q2.t() : q2.q();
            }
        }
        catch (o o2) {
            this.f = new byte[0];
            this.e = q2.e();
            arrby3 = (n2 & 0x80) != 0 ? q2.t() : q2.p();
        }
        this.g = (byte[])((n2 & 0x10) != 0 ? ((n2 & 0x40000000) != 0 ? p.b(q2.c(), arrby3) : arrby3) : null);
        try {
            this.c = string6 != null ? string6.getBytes("UnicodeLittleUnmarked") : null;
            this.b = string7 != null ? string7.toUpperCase(Locale.US).getBytes("UnicodeLittleUnmarked") : null;
            this.d = string3.getBytes("UnicodeLittleUnmarked");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new o("Unicode not supported: " + unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    String c() {
        int n2 = this.f.length;
        int n3 = this.e.length;
        int n4 = this.b != null ? this.b.length : 0;
        int n5 = this.c != null ? this.c.length : 0;
        int n6 = this.d.length;
        int n7 = this.g != null ? this.g.length : 0;
        int n8 = 72;
        int n9 = 72 + n3;
        int n10 = n9 + n2;
        int n11 = n10 + n4;
        int n12 = n11 + n6;
        int n13 = n12 + n5;
        int n14 = n13 + n7;
        this.a(n14, 3);
        this.e(n3);
        this.e(n3);
        this.f(72);
        this.e(n2);
        this.e(n2);
        this.f(n9);
        this.e(n4);
        this.e(n4);
        this.f(n10);
        this.e(n6);
        this.e(n6);
        this.f(n11);
        this.e(n5);
        this.e(n5);
        this.f(n12);
        this.e(n7);
        this.e(n7);
        this.f(n13);
        this.f(this.a & 0x80 | this.a & 0x200 | this.a & 0x80000 | 0x2000000 | this.a & 0x8000 | this.a & 0x20 | this.a & 0x10 | this.a & 0x20000000 | this.a & Integer.MIN_VALUE | this.a & 0x40000000 | this.a & 0x800000 | this.a & 1 | this.a & 4);
        this.e(261);
        this.f(2600);
        this.e(3840);
        this.a(this.e);
        this.a(this.f);
        this.a(this.b);
        this.a(this.d);
        this.a(this.c);
        if (this.g != null) {
            this.a(this.g);
        }
        return super.c();
    }
}

