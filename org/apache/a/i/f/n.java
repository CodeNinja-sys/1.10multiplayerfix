/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.f;

import java.io.InterruptedIOException;
import org.apache.a.c.c.e;
import org.apache.a.c.c.i;
import org.apache.a.c.c.q;
import org.apache.a.c.e.c;
import org.apache.a.c.s;
import org.apache.a.f;
import org.apache.a.i.f.b;
import org.apache.commons.d.a;

public class n
implements b {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final b b;
    private final s c;

    public n(b b2, s s2) {
        org.apache.a.o.a.a(b2, "HTTP request executor");
        org.apache.a.o.a.a(s2, "Retry strategy");
        this.b = b2;
        this.c = s2;
    }

    public e a(org.apache.a.f.b.b b2, q q2, c c2, i i2) {
        f[] arrf = q2.cJ_();
        int n2 = 1;
        while (true) {
            e e2 = this.b.a(b2, q2, c2, i2);
            try {
                if (this.c.a(e2, n2, c2)) {
                    e2.close();
                    long l2 = this.c.a();
                    if (l2 > 0L) {
                        try {
                            this.a.a("Wait for " + l2);
                            Thread.sleep(l2);
                        }
                        catch (InterruptedException interruptedException) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    }
                } else {
                    return e2;
                }
                q2.a(arrf);
            }
            catch (RuntimeException runtimeException) {
                e2.close();
                throw runtimeException;
            }
            ++n2;
        }
    }
}

