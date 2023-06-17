/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.e;

import org.apache.a.ac;
import org.apache.a.aj;
import org.apache.a.f;
import org.apache.a.o.a;
import org.apache.a.t;

public class e
implements org.apache.a.h.e {
    public static final e c = new e();
    private final int d;

    public e(int n2) {
        this.d = n2;
    }

    public e() {
        this(-1);
    }

    public long a(t t2) {
        a.a(t2, "HTTP message");
        f f2 = t2.c("Transfer-Encoding");
        if (f2 != null) {
            String string = f2.d();
            if ("chunked".equalsIgnoreCase(string)) {
                if (t2.c().d(ac.c)) {
                    throw new aj("Chunked transfer encoding not allowed for " + t2.c());
                }
                return -2L;
            }
            if ("identity".equalsIgnoreCase(string)) {
                return -1L;
            }
            throw new aj("Unsupported transfer encoding: " + string);
        }
        f f3 = t2.c("Content-Length");
        if (f3 != null) {
            String string = f3.d();
            try {
                long l2 = Long.parseLong(string);
                if (l2 < 0L) {
                    throw new aj("Negative content length: " + string);
                }
                return l2;
            }
            catch (NumberFormatException numberFormatException) {
                throw new aj("Invalid content length: " + string);
            }
        }
        return this.d;
    }
}

