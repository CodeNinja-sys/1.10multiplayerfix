/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.e;

import java.util.List;
import org.apache.a.c.e.c;
import org.apache.a.c.h;
import org.apache.a.f;
import org.apache.a.g.b;
import org.apache.a.g.e;
import org.apache.a.g.m;
import org.apache.a.i;
import org.apache.a.n.g;
import org.apache.a.x;
import org.apache.a.z;
import org.apache.commons.d.a;

public class q
implements z {
    private final a a = org.apache.commons.d.c.b(this.getClass());

    public void a(x x2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP request");
        org.apache.a.o.a.a(g2, "HTTP context");
        c c2 = c.a(g2);
        org.apache.a.g.h h2 = c2.e();
        if (h2 == null) {
            this.a.b("Cookie spec not specified in HTTP context");
            return;
        }
        h h3 = c2.d();
        if (h3 == null) {
            this.a.b("Cookie store not specified in HTTP context");
            return;
        }
        e e2 = c2.f();
        if (e2 == null) {
            this.a.b("Cookie origin not specified in HTTP context");
            return;
        }
        i i2 = x2.f("Set-Cookie");
        this.a(i2, h2, e2, h3);
        if (h2.a() > 0) {
            i2 = x2.f("Set-Cookie2");
            this.a(i2, h2, e2, h3);
        }
    }

    private void a(i i2, org.apache.a.g.h h2, e e2, h h3) {
        while (i2.hasNext()) {
            f f2 = i2.a();
            try {
                List list = h2.a(f2, e2);
                for (b b2 : list) {
                    try {
                        h2.a(b2, e2);
                        h3.a(b2);
                        if (!this.a.a()) continue;
                        this.a.b("Cookie accepted [" + q.a(b2) + "]");
                    }
                    catch (m m2) {
                        if (!this.a.f()) continue;
                        this.a.d("Cookie rejected [" + q.a(b2) + "] " + m2.getMessage());
                    }
                }
            }
            catch (m m3) {
                if (!this.a.f()) continue;
                this.a.d("Invalid cookie header: \"" + f2 + "\". " + m3.getMessage());
            }
        }
    }

    private static String a(b b2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(b2.a());
        stringBuilder.append("=\"");
        String string = b2.b();
        if (string.length() > 100) {
            string = string.substring(0, 100) + "...";
        }
        stringBuilder.append(string);
        stringBuilder.append("\"");
        stringBuilder.append(", version:");
        stringBuilder.append(Integer.toString(b2.k()));
        stringBuilder.append(", domain:");
        stringBuilder.append(b2.g());
        stringBuilder.append(", path:");
        stringBuilder.append(b2.h());
        stringBuilder.append(", expiry:");
        stringBuilder.append(b2.e());
        return stringBuilder.toString();
    }
}

