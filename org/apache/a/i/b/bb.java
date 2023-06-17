/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.net.ProxySelector;
import org.apache.a.b;
import org.apache.a.f.b.d;
import org.apache.a.f.c;
import org.apache.a.i.b.s;
import org.apache.a.i.c.aj;
import org.apache.a.i.c.ap;
import org.apache.a.i.c.ar;
import org.apache.a.i.i;
import org.apache.a.i.p;
import org.apache.a.l.j;

public class bb
extends s {
    public bb(j j2) {
        super(null, j2);
    }

    public bb() {
        super(null, null);
    }

    protected c f() {
        aj aj2 = new aj(ar.b());
        String string = System.getProperty("http.keepAlive", "true");
        if ("true".equalsIgnoreCase(string)) {
            string = System.getProperty("http.maxConnections", "5");
            int n2 = Integer.parseInt(string);
            aj2.b(n2);
            aj2.a(2 * n2);
        }
        return aj2;
    }

    protected d t() {
        return new ap(this.b().a(), ProxySelector.getDefault());
    }

    protected b j() {
        String string = System.getProperty("http.keepAlive", "true");
        if ("true".equalsIgnoreCase(string)) {
            return new i();
        }
        return new p();
    }
}

