/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.apache.a.b.k;
import org.apache.a.b.q;
import org.apache.a.e;
import org.apache.a.f;
import org.apache.a.n.g;
import org.apache.a.o.d;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public abstract class b
implements org.apache.a.c.b {
    private final a a = c.b(this.getClass());
    private static final List b = Collections.unmodifiableList(Arrays.asList("negotiate", "NTLM", "Digest", "Basic"));

    protected Map a(f[] arrf) {
        HashMap<String, f> hashMap = new HashMap<String, f>(arrf.length);
        for (f f2 : arrf) {
            int n2;
            d d2;
            if (f2 instanceof e) {
                d2 = ((e)f2).a();
                n2 = ((e)f2).b();
            } else {
                String string = f2.d();
                if (string == null) {
                    throw new q("Header value is null");
                }
                d2 = new d(string.length());
                d2.a(string);
                n2 = 0;
            }
            while (n2 < d2.e() && org.apache.a.n.f.a(d2.a(n2))) {
                ++n2;
            }
            int n3 = n2;
            while (n2 < d2.e() && !org.apache.a.n.f.a(d2.a(n2))) {
                ++n2;
            }
            int n4 = n2;
            String string = d2.a(n3, n4);
            hashMap.put(string.toLowerCase(Locale.US), f2);
        }
        return hashMap;
    }

    protected List a() {
        return b;
    }

    protected List c(x x2, g g2) {
        return this.a();
    }

    public org.apache.a.b.d a(Map map, x x2, g g2) {
        org.apache.a.b.g g3 = (org.apache.a.b.g)g2.a("http.authscheme-registry");
        org.apache.a.o.b.a(g3, "AuthScheme registry");
        List list = this.c(x2, g2);
        if (list == null) {
            list = b;
        }
        if (this.a.a()) {
            this.a.b("Authentication schemes in the order of preference: " + list);
        }
        org.apache.a.b.d d2 = null;
        for (String string : list) {
            f f2 = (f)map.get(string.toLowerCase(Locale.ENGLISH));
            if (f2 != null) {
                if (this.a.a()) {
                    this.a.b(string + " authentication scheme selected");
                }
                try {
                    d2 = g3.a(string, x2.f());
                    break;
                }
                catch (IllegalStateException illegalStateException) {
                    if (!this.a.f()) continue;
                    this.a.d("Authentication scheme " + string + " not supported");
                    continue;
                }
            }
            if (!this.a.a()) continue;
            this.a.b("Challenge for " + string + " authentication scheme not available");
        }
        if (d2 == null) {
            throw new k("Unable to respond to any of these challenges: " + map);
        }
        return d2;
    }
}

