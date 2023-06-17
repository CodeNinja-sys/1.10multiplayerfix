/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.a.c;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.concurrent.Semaphore;
import org.apache.logging.log4j.core.a.c.e;
import org.apache.logging.log4j.core.a.c.i;
import org.apache.logging.log4j.core.a.c.j;
import org.apache.logging.log4j.core.a.c.p;
import org.apache.logging.log4j.core.a.c.s;
import org.apache.logging.log4j.core.a.c.v;
import org.apache.logging.log4j.core.a.r;
import org.apache.logging.log4j.core.h;
import org.apache.logging.log4j.d;

public class f
extends r {
    private static j c = new j(null);
    private long d;
    private long e;
    private final e f;
    private final Semaphore g = new Semaphore(1);
    private final v h;
    private final s i;

    protected f(String string, String string2, OutputStream outputStream, boolean bl2, long l2, long l3, v v2, s s2, String string3, org.apache.logging.log4j.core.f f2) {
        super(string, outputStream, bl2, false, string3, f2);
        this.d = l2;
        this.e = l3;
        this.h = v2;
        this.i = s2;
        this.f = new e(string2);
        v2.a(this);
    }

    public static f a(String string, String string2, boolean bl2, boolean bl3, v v2, s s2, String string3, org.apache.logging.log4j.core.f f2) {
        return (f)org.apache.logging.log4j.core.a.c.f.a(string, new i(string2, bl2, bl3, v2, s2, string3, f2), c);
    }

    @Override
    protected synchronized void a(byte[] arrby, int n2, int n3) {
        this.d += (long)n3;
        super.a(arrby, n2, n3);
    }

    public long m() {
        return this.d;
    }

    public long n() {
        return this.e;
    }

    public synchronized void a(h h2) {
        if (this.h.a(h2) && this.a(this.i)) {
            try {
                this.d = 0L;
                this.e = System.currentTimeMillis();
                this.o();
            }
            catch (IOException iOException) {
                a.b("FileManager (" + this.f() + ") " + iOException);
            }
        }
    }

    protected void o() {
        FileOutputStream fileOutputStream = new FileOutputStream(this.f(), this.g());
        this.a(fileOutputStream);
    }

    public e p() {
        return this.f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private boolean a(s s2) {
        try {
            this.g.acquire();
        }
        catch (InterruptedException interruptedException) {
            a.b("Thread interrupted while attempting to check rollover", (Throwable)interruptedException);
            return false;
        }
        boolean bl2 = false;
        Thread thread = null;
        try {
            p p2 = s2.a(this);
            if (p2 != null) {
                this.k();
                if (p2.c() != null) {
                    try {
                        bl2 = p2.c().a();
                    }
                    catch (Exception exception) {
                        a.b("Error in synchronous task", (Throwable)exception);
                    }
                }
                if (bl2 && p2.d() != null) {
                    thread = new Thread(new org.apache.logging.log4j.core.a.c.h(p2.d(), this));
                    thread.start();
                }
                boolean bl3 = true;
                return bl3;
            }
            boolean bl4 = false;
            return bl4;
        }
        finally {
            if (thread == null) {
                this.g.release();
            }
        }
    }

    static /* synthetic */ Semaphore a(f f2) {
        return f2.g;
    }

    static /* synthetic */ d q() {
        return a;
    }

    static /* synthetic */ d r() {
        return a;
    }
}

