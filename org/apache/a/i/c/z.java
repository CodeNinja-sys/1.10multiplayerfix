/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.a.i.c.aa;
import org.apache.a.k;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class z {
    private final a a = c.b(this.getClass());
    private final Map b = new HashMap();

    public void a(k k2, long l2, TimeUnit timeUnit) {
        long l3 = System.currentTimeMillis();
        if (this.a.a()) {
            this.a.b("Adding connection at: " + l3);
        }
        this.b.put(k2, new aa(l3, l2, timeUnit));
    }

    public boolean a(k k2) {
        aa aa2 = (aa)this.b.remove(k2);
        if (aa2 == null) {
            this.a.d("Removing a connection that never existed!");
            return true;
        }
        return System.currentTimeMillis() <= aa.a(aa2);
    }

    public void a() {
        this.b.clear();
    }

    public void a(long l2) {
        long l3 = System.currentTimeMillis() - l2;
        if (this.a.a()) {
            this.a.b("Checking for connections, idle timeout: " + l3);
        }
        for (Map.Entry entry : this.b.entrySet()) {
            k k2 = (k)entry.getKey();
            aa aa2 = (aa)entry.getValue();
            long l4 = aa.b(aa2);
            if (l4 > l3) continue;
            if (this.a.a()) {
                this.a.b("Closing idle connection, connection time: " + l4);
            }
            try {
                k2.close();
            }
            catch (IOException iOException) {
                this.a.b("I/O error closing connection", iOException);
            }
        }
    }

    public void b() {
        long l2 = System.currentTimeMillis();
        if (this.a.a()) {
            this.a.b("Checking for expired connections, now: " + l2);
        }
        for (Map.Entry entry : this.b.entrySet()) {
            k k2 = (k)entry.getKey();
            aa aa2 = (aa)entry.getValue();
            if (aa.a(aa2) > l2) continue;
            if (this.a.a()) {
                this.a.b("Closing connection, expired @: " + aa.a(aa2));
            }
            try {
                k2.close();
            }
            catch (IOException iOException) {
                this.a.b("I/O error closing connection", iOException);
            }
        }
    }
}

