/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.n;

import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.u;
import org.apache.a.w;

public class ab
implements w {
    private final String a;

    public ab(String string) {
        this.a = string;
    }

    public ab() {
        this(null);
    }

    public void a(u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        if (!u2.a("User-Agent")) {
            String string = null;
            j j2 = u2.f();
            if (j2 != null) {
                string = (String)j2.a("http.useragent");
            }
            if (string == null) {
                string = this.a;
            }
            if (string != null) {
                u2.a("User-Agent", string);
            }
        }
    }
}

