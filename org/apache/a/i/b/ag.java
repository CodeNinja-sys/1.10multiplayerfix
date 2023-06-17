/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Closeable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import org.apache.a.c.c.u;
import org.apache.a.c.j;
import org.apache.a.c.r;
import org.apache.a.d.c;
import org.apache.a.i.b.ae;
import org.apache.a.i.b.ak;
import org.apache.a.i.b.al;
import org.apache.a.n.g;

public class ag
implements Closeable {
    private final j a;
    private final ExecutorService b;
    private final ae c = new ae();
    private final AtomicBoolean d = new AtomicBoolean(false);

    public ag(j j2, ExecutorService executorService) {
        this.a = j2;
        this.b = executorService;
    }

    public ak a(u u2, g g2, r r2) {
        return this.a(u2, g2, r2, null);
    }

    public ak a(u u2, g g2, r r2, c c2) {
        if (this.d.get()) {
            throw new IllegalStateException("Close has been called on this httpclient instance.");
        }
        this.c.b().incrementAndGet();
        al al2 = new al(this.a, u2, g2, r2, c2, this.c);
        ak ak2 = new ak(u2, al2);
        this.b.execute(ak2);
        return ak2;
    }

    public ae a() {
        return this.c;
    }

    public void close() {
        this.d.set(true);
        this.b.shutdownNow();
        if (this.a instanceof Closeable) {
            ((Closeable)((Object)this.a)).close();
        }
    }
}

