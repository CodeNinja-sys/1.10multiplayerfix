/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.io.UnsupportedEncodingException;
import org.apache.a.i.a.o;
import org.apache.a.i.a.t;

class v
extends t {
    protected byte[] a = new byte[8];
    protected String b;
    protected byte[] c;
    protected int d;

    v(String string) {
        super(string, 2);
        byte[] arrby;
        this.a(this.a, 24);
        this.d = this.c(20);
        if ((this.d & 1) == 0) {
            throw new o("NTLM type 2 message has flags that make no sense: " + Integer.toString(this.d));
        }
        this.b = null;
        if (this.b() >= 20 && (arrby = this.d(12)).length != 0) {
            try {
                this.b = new String(arrby, "UnicodeLittleUnmarked");
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                throw new o(unsupportedEncodingException.getMessage(), unsupportedEncodingException);
            }
        }
        this.c = null;
        if (this.b() >= 48 && (arrby = this.d(40)).length != 0) {
            this.c = arrby;
        }
    }

    byte[] d() {
        return this.a;
    }

    String e() {
        return this.b;
    }

    byte[] f() {
        return this.c;
    }

    int g() {
        return this.d;
    }
}

