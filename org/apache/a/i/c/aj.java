/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.apache.a.f.b.b;
import org.apache.a.f.c.j;
import org.apache.a.f.e;
import org.apache.a.f.f;
import org.apache.a.f.i;
import org.apache.a.f.l;
import org.apache.a.f.t;
import org.apache.a.i.c.ah;
import org.apache.a.i.c.ak;
import org.apache.a.i.c.ar;
import org.apache.a.i.c.aw;
import org.apache.a.i.c.m;
import org.apache.a.i.c.w;
import org.apache.a.i.c.y;
import org.apache.a.m.h;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class aj
implements org.apache.a.f.c,
h {
    private final a a = org.apache.commons.d.c.b(this.getClass());
    private final j b;
    private final w c;
    private final e d;
    private final l e;

    public aj(j j2) {
        this(j2, -1L, TimeUnit.MILLISECONDS);
    }

    public aj(j j2, l l2) {
        this(j2, -1L, TimeUnit.MILLISECONDS, l2);
    }

    public aj() {
        this(ar.a());
    }

    public aj(j j2, long l2, TimeUnit timeUnit) {
        this(j2, l2, timeUnit, new aw());
    }

    public aj(j j2, long l2, TimeUnit timeUnit, l l3) {
        org.apache.a.o.a.a(j2, "Scheme registry");
        org.apache.a.o.a.a(l3, "DNS resolver");
        this.b = j2;
        this.e = l3;
        this.d = this.a(j2);
        this.c = new w(this.a, this.d, 2, 20, l2, timeUnit);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void finalize() {
        try {
            this.c();
        }
        finally {
            super.finalize();
        }
    }

    protected e a(j j2) {
        return new m(j2, this.e);
    }

    public j a() {
        return this.b;
    }

    private String b(b b2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[route: ").append(b2).append("]");
        if (object != null) {
            stringBuilder.append("[state: ").append(object).append("]");
        }
        return stringBuilder.toString();
    }

    private String c(b b2) {
        StringBuilder stringBuilder = new StringBuilder();
        org.apache.a.m.l l2 = this.c.f();
        org.apache.a.m.l l3 = this.c.a(b2);
        stringBuilder.append("[total kept alive: ").append(l2.c()).append("; ");
        stringBuilder.append("route allocated: ").append(l3.a() + l3.c());
        stringBuilder.append(" of ").append(l3.d()).append("; ");
        stringBuilder.append("total allocated: ").append(l2.a() + l2.c());
        stringBuilder.append(" of ").append(l2.d()).append("]");
        return stringBuilder.toString();
    }

    private String a(y y2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[id: ").append(y2.g()).append("]");
        stringBuilder.append("[route: ").append(y2.h()).append("]");
        Object object = y2.l();
        if (object != null) {
            stringBuilder.append("[state: ").append(object).append("]");
        }
        return stringBuilder.toString();
    }

    public f a(b b2, Object object) {
        org.apache.a.o.a.a(b2, "HTTP route");
        if (this.a.a()) {
            this.a.b("Connection request: " + this.b(b2, object) + this.c(b2));
        }
        Future future = this.c.b(b2, object);
        return new ak(this, future);
    }

    t a(Future future, long l2, TimeUnit timeUnit) {
        try {
            y y2 = (y)future.get(l2, timeUnit);
            if (y2 == null || future.isCancelled()) {
                throw new InterruptedException();
            }
            org.apache.a.o.b.a(y2.i() != null, "Pool entry with no connection");
            if (this.a.a()) {
                this.a.b("Connection leased: " + this.a(y2) + this.c((b)y2.h()));
            }
            return new ah(this, this.d, y2);
        }
        catch (ExecutionException executionException) {
            Throwable throwable = executionException.getCause();
            if (throwable == null) {
                throwable = executionException;
            }
            this.a.e("Unexpected exception leasing connection from pool", throwable);
            throw new InterruptedException();
        }
        catch (TimeoutException timeoutException) {
            throw new i("Timeout waiting for connection from pool");
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(t t2, long l2, TimeUnit timeUnit) {
        org.apache.a.o.a.a(t2 instanceof ah, "Connection class mismatch, connection not obtained from this manager");
        ah ah2 = (ah)t2;
        org.apache.a.o.b.a(ah2.w() == this, "Connection not obtained from this manager");
        ah ah3 = ah2;
        synchronized (ah3) {
            y y2 = ah2.v();
            if (y2 == null) {
                return;
            }
            try {
                block13: {
                    if (ah2.c() && !ah2.q()) {
                        try {
                            ah2.f();
                        }
                        catch (IOException iOException) {
                            if (!this.a.a()) break block13;
                            this.a.b("I/O exception shutting down released connection", iOException);
                        }
                    }
                }
                if (ah2.q()) {
                    y2.a(l2, timeUnit != null ? timeUnit : TimeUnit.MILLISECONDS);
                    if (this.a.a()) {
                        String string = l2 > 0L ? "for " + l2 + " " + (Object)((Object)timeUnit) : "indefinitely";
                        this.a.b("Connection " + this.a(y2) + " can be kept alive " + string);
                    }
                }
            }
            finally {
                this.c.a(y2, ah2.q());
            }
            if (this.a.a()) {
                this.a.b("Connection released: " + this.a(y2) + this.c((b)y2.h()));
            }
        }
    }

    public void c() {
        this.a.b("Connection manager is shutting down");
        try {
            this.c.b();
        }
        catch (IOException iOException) {
            this.a.b("I/O exception shutting down connection manager", iOException);
        }
        this.a.b("Connection manager shut down");
    }

    public void a(long l2, TimeUnit timeUnit) {
        if (this.a.a()) {
            this.a.b("Closing connections idle longer than " + l2 + " " + (Object)((Object)timeUnit));
        }
        this.c.a(l2, timeUnit);
    }

    public void b() {
        this.a.b("Closing expired connections");
        this.c.c();
    }

    public int d() {
        return this.c.d();
    }

    public void a(int n2) {
        this.c.a(n2);
    }

    public int e() {
        return this.c.e();
    }

    public void b(int n2) {
        this.c.b(n2);
    }

    public int a(b b2) {
        return this.c.b(b2);
    }

    public void a(b b2, int n2) {
        this.c.a((Object)b2, n2);
    }

    public org.apache.a.m.l f() {
        return this.c.f();
    }

    public org.apache.a.m.l b(b b2) {
        return this.c.a(b2);
    }

    public /* synthetic */ org.apache.a.m.l a(Object object) {
        return this.b((b)object);
    }

    public /* synthetic */ int b(Object object) {
        return this.a((b)object);
    }
}

