/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.k;

import org.apache.a.ak;
import org.apache.a.am;
import org.apache.a.f;
import org.apache.a.k.i;
import org.apache.a.n;
import org.apache.a.o;

public class h
extends i
implements o {
    private n a;

    public h(String string, String string2) {
        super(string, string2);
    }

    public h(String string, String string2, ak ak2) {
        super(string, string2, ak2);
    }

    public h(am am2) {
        super(am2);
    }

    public n b() {
        return this.a;
    }

    public void a(n n2) {
        this.a = n2;
    }

    public boolean a() {
        f f2 = this.c("Expect");
        return f2 != null && "100-continue".equalsIgnoreCase(f2.d());
    }
}

