/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import org.apache.a.f.x;
import org.apache.a.f.y;
import org.apache.a.o.a;
import org.apache.a.r;

public class u
implements x {
    public static final u a = new u();

    public int a(r r2) {
        org.apache.a.o.a.a(r2, "HTTP host");
        int n2 = r2.b();
        if (n2 > 0) {
            return n2;
        }
        String string = r2.c();
        if (string.equalsIgnoreCase("http")) {
            return 80;
        }
        if (string.equalsIgnoreCase("https")) {
            return 443;
        }
        throw new y(string + " protocol is not supported");
    }
}

