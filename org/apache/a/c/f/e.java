/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.f;

import java.io.Closeable;
import java.io.IOException;
import org.apache.a.c.j;
import org.apache.a.n;
import org.apache.a.o.g;
import org.apache.a.x;

public class e {
    private e() {
    }

    public static void a(x x2) {
        n n2;
        if (x2 != null && (n2 = x2.b()) != null) {
            try {
                g.b(n2);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void a(org.apache.a.c.c.e e2) {
        if (e2 != null) {
            try {
                try {
                    g.b(e2.b());
                }
                finally {
                    e2.close();
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }

    public static void a(j j2) {
        if (j2 != null && j2 instanceof Closeable) {
            try {
                ((Closeable)((Object)j2)).close();
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
    }
}

