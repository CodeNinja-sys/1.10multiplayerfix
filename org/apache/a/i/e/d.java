/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.e;

import org.apache.a.ai;
import org.apache.a.aj;
import org.apache.a.f;
import org.apache.a.g;
import org.apache.a.h.e;
import org.apache.a.o.a;
import org.apache.a.t;

public class d
implements e {
    public static final d c = new d();
    private final int d;

    public d(int n2) {
        this.d = n2;
    }

    public d() {
        this(-1);
    }

    public long a(t t2) {
        a.a(t2, "HTTP message");
        f f2 = t2.c("Transfer-Encoding");
        if (f2 != null) {
            g[] arrg;
            try {
                arrg = f2.e();
            }
            catch (ai ai2) {
                throw new aj("Invalid Transfer-Encoding header value: " + f2, ai2);
            }
            int n2 = arrg.length;
            if ("identity".equalsIgnoreCase(f2.d())) {
                return -1L;
            }
            if (n2 > 0 && "chunked".equalsIgnoreCase(arrg[n2 - 1].a())) {
                return -2L;
            }
            return -1L;
        }
        f f3 = t2.c("Content-Length");
        if (f3 != null) {
            long l2 = -1L;
            f[] arrf = t2.b("Content-Length");
            for (int i2 = arrf.length - 1; i2 >= 0; --i2) {
                f f4 = arrf[i2];
                try {
                    l2 = Long.parseLong(f4.d());
                    break;
                }
                catch (NumberFormatException numberFormatException) {
                    continue;
                }
            }
            if (l2 >= 0L) {
                return l2;
            }
            return -1L;
        }
        return this.d;
    }
}

