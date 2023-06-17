/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.b.a;

import org.apache.a.l.j;
import org.apache.a.n.f;
import org.apache.a.o.a;

public final class c {
    private c() {
    }

    public static String a(j j2) {
        a.a(j2, "HTTP parameters");
        String string = (String)j2.a("http.auth.credential-charset");
        if (string == null) {
            string = f.u.name();
        }
        return string;
    }

    public static void a(j j2, String string) {
        a.a(j2, "HTTP parameters");
        j2.a("http.auth.credential-charset", string);
    }
}

