/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ac;
import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.k.a;
import org.apache.a.k.o;
import org.apache.a.u;

public class i
extends a
implements u {
    private final String a;
    private final String d;
    private am e;

    public i(String string, String string2) {
        this.a = (String)org.apache.a.o.a.a((Object)string, "Method name");
        this.d = (String)org.apache.a.o.a.a((Object)string2, "Request URI");
        this.e = null;
    }

    public i(String string, String string2, ak ak2) {
        this(new o(string, string2, ak2));
    }

    public i(am am2) {
        this.e = (am)org.apache.a.o.a.a(am2, "Request line");
        this.a = am2.a();
        this.d = am2.c();
    }

    public ak c() {
        return this.g().b();
    }

    public am g() {
        if (this.e == null) {
            this.e = new o(this.a, this.d, ac.d);
        }
        return this.e;
    }

    public String toString() {
        return this.a + " " + this.d + " " + this.b;
    }
}

