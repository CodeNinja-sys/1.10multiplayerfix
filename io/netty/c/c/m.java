/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.tomcat.jni.SSLContext
 */
package io.netty.c.c;

import org.apache.tomcat.jni.SSLContext;

public final class m {
    private final long a;

    m(long l2) {
        this.a = l2;
    }

    public long a() {
        return SSLContext.sessionNumber((long)this.a);
    }

    public long b() {
        return SSLContext.sessionConnect((long)this.a);
    }

    public long c() {
        return SSLContext.sessionConnectGood((long)this.a);
    }

    public long d() {
        return SSLContext.sessionConnectRenegotiate((long)this.a);
    }

    public long e() {
        return SSLContext.sessionAccept((long)this.a);
    }

    public long f() {
        return SSLContext.sessionAcceptGood((long)this.a);
    }

    public long g() {
        return SSLContext.sessionAcceptRenegotiate((long)this.a);
    }

    public long h() {
        return SSLContext.sessionHits((long)this.a);
    }

    public long i() {
        return SSLContext.sessionCbHits((long)this.a);
    }

    public long j() {
        return SSLContext.sessionMisses((long)this.a);
    }

    public long k() {
        return SSLContext.sessionTimeouts((long)this.a);
    }

    public long l() {
        return SSLContext.sessionCacheFull((long)this.a);
    }
}

