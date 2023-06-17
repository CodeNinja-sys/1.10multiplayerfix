/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.util.List;
import java.util.Map;
import org.apache.a.f;
import org.apache.a.i.b.b;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;

public class aa
extends b {
    public boolean a(x x2, g g2) {
        a.a(x2, "HTTP response");
        int n2 = x2.a().b();
        return n2 == 401;
    }

    public Map b(x x2, g g2) {
        a.a(x2, "HTTP response");
        f[] arrf = x2.b("WWW-Authenticate");
        return this.a(arrf);
    }

    protected List c(x x2, g g2) {
        List list = (List)x2.f().a("http.auth.target-scheme-pref");
        if (list != null) {
            return list;
        }
        return super.c(x2, g2);
    }
}

