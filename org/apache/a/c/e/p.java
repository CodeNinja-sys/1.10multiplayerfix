/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import java.util.Locale;
import org.apache.a.c.b.b;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.n;
import org.apache.a.x;
import org.apache.a.z;

public class p
implements z {
    public static final String a = "http.client.response.uncompressed";

    public void a(x x2, org.apache.a.n.g g2) {
        f f2;
        n n2 = x2.b();
        if (n2 != null && n2.c() != 0L && (f2 = n2.e()) != null) {
            g[] arrg = f2.e();
            boolean bl2 = false;
            int n3 = 0;
            g[] arrg2 = arrg;
            int n4 = arrg2.length;
            if (n3 < n4) {
                g g3 = arrg2[n3];
                String string = g3.a().toLowerCase(Locale.US);
                if ("gzip".equals(string) || "x-gzip".equals(string)) {
                    x2.a(new org.apache.a.c.b.g(x2.b()));
                    bl2 = true;
                } else if ("deflate".equals(string)) {
                    x2.a(new b(x2.b()));
                    bl2 = true;
                } else {
                    if ("identity".equals(string)) {
                        return;
                    }
                    throw new org.apache.a.p("Unsupported Content-Coding: " + g3.a());
                }
            }
            if (bl2) {
                x2.e("Content-Length");
                x2.e("Content-Encoding");
                x2.e("Content-MD5");
            }
        }
    }
}

