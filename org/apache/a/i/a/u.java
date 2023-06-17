/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.UnsupportedEncodingException;
import java.util.Locale;
import org.apache.a.i.a.o;
import org.apache.a.i.a.p;
import org.apache.a.i.a.t;

class u
extends t {
    protected byte[] a;
    protected byte[] b;

    u(String string, String string2) {
        try {
            String string3 = p.d(string2);
            String string4 = p.e(string);
            this.a = string3 != null ? string3.getBytes("ASCII") : null;
            this.b = string4 != null ? string4.toUpperCase(Locale.US).getBytes("ASCII") : null;
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            throw new o("Unicode unsupported: " + unsupportedEncodingException.getMessage(), unsupportedEncodingException);
        }
    }

    String c() {
        int n2 = 40;
        this.a(40, 1);
        this.f(-1576500735);
        this.e(0);
        this.e(0);
        this.f(40);
        this.e(0);
        this.e(0);
        this.f(40);
        this.e(261);
        this.f(2600);
        this.e(3840);
        return super.c();
    }
}

