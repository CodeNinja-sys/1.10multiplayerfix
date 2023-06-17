/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import org.apache.a.ac;
import org.apache.a.ai;
import org.apache.a.ak;
import org.apache.a.ao;
import org.apache.a.b;
import org.apache.a.f;
import org.apache.a.k.q;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.x;

public class i
implements b {
    public static final i a = new i();

    public boolean a(x x2, g g2) {
        int n2;
        Object object;
        Object object2;
        ak ak2;
        block15: {
            org.apache.a.o.a.a(x2, "HTTP response");
            org.apache.a.o.a.a(g2, "HTTP context");
            ak2 = x2.a().a();
            f f2 = x2.c("Transfer-Encoding");
            if (f2 != null) {
                if (!"chunked".equalsIgnoreCase(f2.d())) {
                    return false;
                }
            } else if (this.a(x2)) {
                object2 = x2.b("Content-Length");
                if (((f[])object2).length == 1) {
                    object = object2[0];
                    try {
                        n2 = Integer.parseInt(object.d());
                        if (n2 < 0) {
                            return false;
                        }
                        break block15;
                    }
                    catch (NumberFormatException numberFormatException) {
                        return false;
                    }
                }
                return false;
            }
        }
        if (!(object2 = x2.f("Connection")).hasNext()) {
            object2 = x2.f("Proxy-Connection");
        }
        if (object2.hasNext()) {
            try {
                object = this.a((org.apache.a.i)object2);
                n2 = 0;
                while (object.hasNext()) {
                    String string = object.a();
                    if ("Close".equalsIgnoreCase(string)) {
                        return false;
                    }
                    if (!"Keep-Alive".equalsIgnoreCase(string)) continue;
                    n2 = 1;
                }
                if (n2 != 0) {
                    return true;
                }
            }
            catch (ai ai2) {
                return false;
            }
        }
        return !ak2.d(ac.c);
    }

    protected ao a(org.apache.a.i i2) {
        return new q(i2);
    }

    private boolean a(x x2) {
        int n2 = x2.a().b();
        return n2 >= 200 && n2 != 204 && n2 != 304 && n2 != 205;
    }
}

