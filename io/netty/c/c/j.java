/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.tomcat.jni.Buffer
 *  org.apache.tomcat.jni.SSL
 */
package io.netty.c.c;

import io.netty.b.g;
import io.netty.b.h;
import io.netty.c.c.i;
import io.netty.c.c.k;
import io.netty.util.c.d;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.security.cert.Certificate;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import javax.security.cert.X509Certificate;
import org.apache.tomcat.jni.Buffer;
import org.apache.tomcat.jni.SSL;

public final class j
extends SSLEngine {
    private static final io.netty.util.c.b.g c = io.netty.util.c.b.h.a(j.class);
    private static final Certificate[] d = new Certificate[0];
    private static final X509Certificate[] e = new X509Certificate[0];
    private static final SSLException f = new SSLException("engine closed");
    private static final SSLException g = new SSLException("renegotiation unsupported");
    private static final SSLException h = new SSLException("encrypted packet oversized");
    private static final int i = 16384;
    private static final int j = 17408;
    private static final int k = 18432;
    static final int a = 18713;
    static final int b = 2329;
    private static final AtomicIntegerFieldUpdater l;
    private long m;
    private long n;
    private int o;
    private boolean p;
    private boolean q;
    private volatile int r;
    private String s;
    private volatile String t;
    private boolean u;
    private boolean v;
    private boolean w;
    private int x;
    private final h y;
    private final String z;
    private SSLSession A;

    public j(long l2, h h2, String string) {
        io.netty.c.c.i.b();
        if (l2 == 0L) {
            throw new NullPointerException("sslContext");
        }
        if (h2 == null) {
            throw new NullPointerException("alloc");
        }
        this.y = h2;
        this.m = SSL.newSSL((long)l2, (boolean)true);
        this.n = SSL.makeNetworkBIO((long)this.m);
        this.z = string;
    }

    public synchronized void a() {
        if (l.compareAndSet(this, 0, 1)) {
            SSL.freeSSL((long)this.m);
            SSL.freeBIO((long)this.n);
            this.n = 0L;
            this.m = 0L;
            this.w = true;
            this.v = true;
            this.u = true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int a(ByteBuffer byteBuffer) {
        int n2;
        int n3 = byteBuffer.position();
        int n4 = byteBuffer.limit();
        int n5 = Math.min(n4 - n3, 16384);
        if (byteBuffer.isDirect()) {
            long l2 = Buffer.address((ByteBuffer)byteBuffer) + (long)n3;
            n2 = SSL.writeToSSL((long)this.m, (long)l2, (int)n5);
            if (n2 > 0) {
                byteBuffer.position(n3 + n2);
                return n2;
            }
        } else {
            g g2 = this.y.d(n5);
            try {
                long l3 = g2.Z() ? g2.aa() : Buffer.address((ByteBuffer)g2.U());
                byteBuffer.limit(n3 + n5);
                g2.b(0, byteBuffer);
                byteBuffer.limit(n4);
                n2 = SSL.writeToSSL((long)this.m, (long)l3, (int)n5);
                if (n2 > 0) {
                    byteBuffer.position(n3 + n2);
                    int n6 = n2;
                    return n6;
                }
                byteBuffer.position(n3);
            }
            finally {
                g2.ad();
            }
        }
        throw new IllegalStateException("SSL.writeToSSL() returned a non-positive value: " + n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int b(ByteBuffer byteBuffer) {
        int n2 = byteBuffer.position();
        int n3 = byteBuffer.remaining();
        if (byteBuffer.isDirect()) {
            long l2 = Buffer.address((ByteBuffer)byteBuffer) + (long)n2;
            int n4 = SSL.writeToBIO((long)this.n, (long)l2, (int)n3);
            if (n4 >= 0) {
                byteBuffer.position(n2 + n4);
                this.x = SSL.readFromSSL((long)this.m, (long)l2, (int)0);
                return n4;
            }
        } else {
            g g2 = this.y.d(n3);
            try {
                long l3 = g2.Z() ? g2.aa() : Buffer.address((ByteBuffer)g2.U());
                g2.b(0, byteBuffer);
                int n5 = SSL.writeToBIO((long)this.n, (long)l3, (int)n3);
                if (n5 >= 0) {
                    byteBuffer.position(n2 + n5);
                    this.x = SSL.readFromSSL((long)this.m, (long)l3, (int)0);
                    int n6 = n5;
                    return n6;
                }
                byteBuffer.position(n2);
            }
            finally {
                g2.ad();
            }
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int c(ByteBuffer byteBuffer) {
        if (byteBuffer.isDirect()) {
            int n2;
            int n3 = byteBuffer.position();
            long l2 = Buffer.address((ByteBuffer)byteBuffer) + (long)n3;
            int n4 = SSL.readFromSSL((long)this.m, (long)l2, (int)(n2 = byteBuffer.limit() - n3));
            if (n4 > 0) {
                byteBuffer.position(n3 + n4);
                return n4;
            }
        } else {
            int n5 = byteBuffer.position();
            int n6 = byteBuffer.limit();
            int n7 = Math.min(18713, n6 - n5);
            g g2 = this.y.d(n7);
            try {
                long l3 = g2.Z() ? g2.aa() : Buffer.address((ByteBuffer)g2.U());
                int n8 = SSL.readFromSSL((long)this.m, (long)l3, (int)n7);
                if (n8 > 0) {
                    byteBuffer.limit(n5 + n8);
                    g2.a(0, byteBuffer);
                    byteBuffer.limit(n6);
                    int n9 = n8;
                    return n9;
                }
            }
            finally {
                g2.ad();
            }
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private int a(ByteBuffer byteBuffer, int n2) {
        if (byteBuffer.isDirect() && byteBuffer.remaining() >= n2) {
            int n3 = byteBuffer.position();
            long l2 = Buffer.address((ByteBuffer)byteBuffer) + (long)n3;
            int n4 = SSL.readFromBIO((long)this.n, (long)l2, (int)n2);
            if (n4 > 0) {
                byteBuffer.position(n3 + n4);
                return n4;
            }
        } else {
            g g2 = this.y.d(n2);
            try {
                long l3 = g2.Z() ? g2.aa() : Buffer.address((ByteBuffer)g2.U());
                int n5 = SSL.readFromBIO((long)this.n, (long)l3, (int)n2);
                if (n5 > 0) {
                    int n6 = byteBuffer.limit();
                    byteBuffer.limit(byteBuffer.position() + n5);
                    g2.a(0, byteBuffer);
                    byteBuffer.limit(n6);
                    int n7 = n5;
                    return n7;
                }
            }
            finally {
                g2.ad();
            }
        }
        return 0;
    }

    @Override
    public synchronized SSLEngineResult wrap(ByteBuffer[] arrbyteBuffer, int n2, int n3, ByteBuffer byteBuffer) {
        if (this.r != 0) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        }
        if (arrbyteBuffer == null) {
            throw new NullPointerException("srcs");
        }
        if (byteBuffer == null) {
            throw new NullPointerException("dst");
        }
        if (n2 >= arrbyteBuffer.length || n2 + n3 > arrbyteBuffer.length) {
            throw new IndexOutOfBoundsException("offset: " + n2 + ", length: " + n3 + " (expected: offset <= offset + length <= srcs.length (" + arrbyteBuffer.length + "))");
        }
        if (byteBuffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (this.o == 0) {
            this.d();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = this.getHandshakeStatus();
        if ((!this.p || this.w) && handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_UNWRAP) {
            return new SSLEngineResult(this.e(), SSLEngineResult.HandshakeStatus.NEED_UNWRAP, 0, 0);
        }
        int n4 = 0;
        int n5 = SSL.pendingWrittenBytesInBIO((long)this.n);
        if (n5 > 0) {
            int n6 = byteBuffer.remaining();
            if (n6 < n5) {
                return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, handshakeStatus, 0, n4);
            }
            try {
                n4 += this.a(byteBuffer, n5);
            }
            catch (Exception exception) {
                throw new SSLException(exception);
            }
            if (this.v) {
                this.a();
            }
            return new SSLEngineResult(this.e(), this.getHandshakeStatus(), 0, n4);
        }
        int n7 = 0;
        for (int i2 = n2; i2 < n3; ++i2) {
            ByteBuffer byteBuffer2 = arrbyteBuffer[i2];
            while (byteBuffer2.hasRemaining()) {
                try {
                    n7 += this.a(byteBuffer2);
                }
                catch (Exception exception) {
                    throw new SSLException(exception);
                }
                n5 = SSL.pendingWrittenBytesInBIO((long)this.n);
                if (n5 <= 0) continue;
                int n8 = byteBuffer.remaining();
                if (n8 < n5) {
                    return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, this.getHandshakeStatus(), n7, n4);
                }
                try {
                }
                catch (Exception exception) {
                    throw new SSLException(exception);
                }
                return new SSLEngineResult(this.e(), this.getHandshakeStatus(), n7, n4 += this.a(byteBuffer, n5));
            }
        }
        return new SSLEngineResult(this.e(), this.getHandshakeStatus(), n7, n4);
    }

    @Override
    public synchronized SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] arrbyteBuffer, int n2, int n3) {
        int n4;
        if (this.r != 0) {
            return new SSLEngineResult(SSLEngineResult.Status.CLOSED, SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING, 0, 0);
        }
        if (byteBuffer == null) {
            throw new NullPointerException("src");
        }
        if (arrbyteBuffer == null) {
            throw new NullPointerException("dsts");
        }
        if (n2 >= arrbyteBuffer.length || n2 + n3 > arrbyteBuffer.length) {
            throw new IndexOutOfBoundsException("offset: " + n2 + ", length: " + n3 + " (expected: offset <= offset + length <= dsts.length (" + arrbyteBuffer.length + "))");
        }
        int n5 = 0;
        int n6 = n2 + n3;
        for (int i2 = n2; i2 < n6; ++i2) {
            ByteBuffer byteBuffer2 = arrbyteBuffer[i2];
            if (byteBuffer2 == null) {
                throw new IllegalArgumentException();
            }
            if (byteBuffer2.isReadOnly()) {
                throw new ReadOnlyBufferException();
            }
            n5 += byteBuffer2.remaining();
        }
        if (this.o == 0) {
            this.d();
        }
        SSLEngineResult.HandshakeStatus handshakeStatus = this.getHandshakeStatus();
        if ((!this.p || this.w) && handshakeStatus == SSLEngineResult.HandshakeStatus.NEED_WRAP) {
            return new SSLEngineResult(this.e(), SSLEngineResult.HandshakeStatus.NEED_WRAP, 0, 0);
        }
        if (byteBuffer.remaining() > 18713) {
            this.u = true;
            this.v = true;
            this.w = true;
            this.a();
            throw h;
        }
        int n7 = 0;
        this.x = 0;
        try {
            n7 += this.b(byteBuffer);
        }
        catch (Exception exception) {
            throw new SSLException(exception);
        }
        String string = SSL.getLastError();
        if (string != null && !string.startsWith("error:00000000:")) {
            if (c.e()) {
                c.c("SSL_read failed: primingReadResult: " + this.x + "; OpenSSL error: '" + string + '\'');
            }
            this.a();
            throw new SSLException(string);
        }
        int n8 = n4 = SSL.isInInit((long)this.m) == 0 ? SSL.pendingReadableBytesInSSL((long)this.m) : 0;
        if (n5 < n4) {
            return new SSLEngineResult(SSLEngineResult.Status.BUFFER_OVERFLOW, this.getHandshakeStatus(), n7, 0);
        }
        int n9 = 0;
        int n10 = n2;
        while (n10 < n6) {
            int n11;
            ByteBuffer byteBuffer3 = arrbyteBuffer[n10];
            if (!byteBuffer3.hasRemaining()) {
                ++n10;
                continue;
            }
            if (n4 <= 0) break;
            try {
                n11 = this.c(byteBuffer3);
            }
            catch (Exception exception) {
                throw new SSLException(exception);
            }
            if (n11 == 0) break;
            n9 += n11;
            n4 -= n11;
            if (byteBuffer3.hasRemaining()) continue;
            ++n10;
        }
        if (!this.q && (SSL.getShutdown((long)this.m) & 2) == 2) {
            this.q = true;
            this.closeOutbound();
            this.closeInbound();
        }
        return new SSLEngineResult(this.e(), this.getHandshakeStatus(), n7, n9);
    }

    @Override
    public Runnable getDelegatedTask() {
        return null;
    }

    @Override
    public synchronized void closeInbound() {
        if (this.u) {
            return;
        }
        this.u = true;
        this.w = true;
        if (this.o != 0) {
            if (!this.q) {
                this.a();
                throw new SSLException("Inbound closed before receiving peer's close_notify: possible truncation attack?");
            }
        } else {
            this.a();
        }
    }

    @Override
    public synchronized boolean isInboundDone() {
        return this.u || this.w;
    }

    @Override
    public synchronized void closeOutbound() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.w = true;
        if (this.o != 0 && this.r == 0) {
            int n2 = SSL.getShutdown((long)this.m);
            if ((n2 & 1) != 1) {
                SSL.shutdownSSL((long)this.m);
            }
        } else {
            this.a();
        }
    }

    @Override
    public synchronized boolean isOutboundDone() {
        return this.v;
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return io.netty.util.c.d.j;
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return io.netty.util.c.d.j;
    }

    @Override
    public void setEnabledCipherSuites(String[] arrstring) {
        throw new UnsupportedOperationException();
    }

    @Override
    public String[] getSupportedProtocols() {
        return io.netty.util.c.d.j;
    }

    @Override
    public String[] getEnabledProtocols() {
        return io.netty.util.c.d.j;
    }

    @Override
    public void setEnabledProtocols(String[] arrstring) {
        throw new UnsupportedOperationException();
    }

    @Override
    public SSLSession getSession() {
        SSLSession sSLSession = this.A;
        if (sSLSession == null) {
            this.A = sSLSession = new k(this);
        }
        return sSLSession;
    }

    @Override
    public synchronized void beginHandshake() {
        if (this.w) {
            throw f;
        }
        switch (this.o) {
            case 0: {
                SSL.doHandshake((long)this.m);
                this.o = 2;
                break;
            }
            case 1: {
                this.o = 2;
                break;
            }
            case 2: {
                throw g;
            }
            default: {
                throw new Error();
            }
        }
    }

    private synchronized void d() {
        if (this.w) {
            throw f;
        }
        if (this.o == 0) {
            SSL.doHandshake((long)this.m);
            this.o = 1;
        }
    }

    private SSLEngineResult.Status e() {
        return this.w ? SSLEngineResult.Status.CLOSED : SSLEngineResult.Status.OK;
    }

    @Override
    public synchronized SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        if (this.o == 0 || this.r != 0) {
            return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
        }
        if (!this.p) {
            if (SSL.pendingWrittenBytesInBIO((long)this.n) != 0) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            if (SSL.isInInit((long)this.m) == 0) {
                this.p = true;
                this.s = SSL.getCipherForSSL((long)this.m);
                String string = SSL.getNextProtoNegotiated((long)this.m);
                if (string == null) {
                    string = this.z;
                }
                this.t = string != null ? string.replace(':', '_') : null;
                return SSLEngineResult.HandshakeStatus.FINISHED;
            }
            return SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        }
        if (this.w) {
            if (SSL.pendingWrittenBytesInBIO((long)this.n) != 0) {
                return SSLEngineResult.HandshakeStatus.NEED_WRAP;
            }
            return SSLEngineResult.HandshakeStatus.NEED_UNWRAP;
        }
        return SSLEngineResult.HandshakeStatus.NOT_HANDSHAKING;
    }

    @Override
    public void setUseClientMode(boolean bl2) {
        if (bl2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean getUseClientMode() {
        return false;
    }

    @Override
    public void setNeedClientAuth(boolean bl2) {
        if (bl2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean getNeedClientAuth() {
        return false;
    }

    @Override
    public void setWantClientAuth(boolean bl2) {
        if (bl2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean getWantClientAuth() {
        return false;
    }

    @Override
    public void setEnableSessionCreation(boolean bl2) {
        if (bl2) {
            throw new UnsupportedOperationException();
        }
    }

    @Override
    public boolean getEnableSessionCreation() {
        return false;
    }

    static /* synthetic */ long a(j j2) {
        return j2.m;
    }

    static /* synthetic */ Certificate[] b() {
        return d;
    }

    static /* synthetic */ X509Certificate[] c() {
        return e;
    }

    static /* synthetic */ String b(j j2) {
        return j2.s;
    }

    static /* synthetic */ String c(j j2) {
        return j2.t;
    }

    static {
        f.setStackTrace(io.netty.util.c.d.k);
        g.setStackTrace(io.netty.util.c.d.k);
        h.setStackTrace(io.netty.util.c.d.k);
        l = AtomicIntegerFieldUpdater.newUpdater(j.class, "r");
    }
}

