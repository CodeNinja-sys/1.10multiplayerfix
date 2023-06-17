/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.eclipse.jetty.npn.NextProtoNego
 *  org.eclipse.jetty.npn.NextProtoNego$Provider
 */
package io.netty.c.c;

import io.netty.c.c.e;
import io.netty.c.c.f;
import io.netty.c.c.g;
import java.nio.ByteBuffer;
import java.util.List;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSession;
import org.eclipse.jetty.npn.NextProtoNego;

final class d
extends SSLEngine {
    private static boolean b;
    private final SSLEngine c;
    private final g d;

    static boolean a() {
        io.netty.c.c.d.c();
        return b;
    }

    private static void c() {
        if (b) {
            return;
        }
        try {
            ClassLoader classLoader = ClassLoader.getSystemClassLoader().getParent();
            if (classLoader == null) {
                classLoader = ClassLoader.getSystemClassLoader();
            }
            Class.forName("sun.security.ssl.NextProtoNegoExtension", true, classLoader);
            b = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    d(SSLEngine sSLEngine, List list, boolean bl2) {
        assert (!list.isEmpty());
        this.c = sSLEngine;
        this.d = new g(sSLEngine);
        if (bl2) {
            NextProtoNego.put((SSLEngine)sSLEngine, (NextProtoNego.Provider)new e(this, list));
        } else {
            String[] arrstring = list.toArray(new String[list.size()]);
            String string = arrstring[arrstring.length - 1];
            NextProtoNego.put((SSLEngine)sSLEngine, (NextProtoNego.Provider)new f(this, arrstring, string));
        }
    }

    public g b() {
        return this.d;
    }

    @Override
    public void closeInbound() {
        NextProtoNego.remove((SSLEngine)this.c);
        this.c.closeInbound();
    }

    @Override
    public void closeOutbound() {
        NextProtoNego.remove((SSLEngine)this.c);
        this.c.closeOutbound();
    }

    @Override
    public String getPeerHost() {
        return this.c.getPeerHost();
    }

    @Override
    public int getPeerPort() {
        return this.c.getPeerPort();
    }

    @Override
    public SSLEngineResult wrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.c.wrap(byteBuffer, byteBuffer2);
    }

    @Override
    public SSLEngineResult wrap(ByteBuffer[] arrbyteBuffer, ByteBuffer byteBuffer) {
        return this.c.wrap(arrbyteBuffer, byteBuffer);
    }

    @Override
    public SSLEngineResult wrap(ByteBuffer[] arrbyteBuffer, int n2, int n3, ByteBuffer byteBuffer) {
        return this.c.wrap(arrbyteBuffer, n2, n3, byteBuffer);
    }

    @Override
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer byteBuffer2) {
        return this.c.unwrap(byteBuffer, byteBuffer2);
    }

    @Override
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] arrbyteBuffer) {
        return this.c.unwrap(byteBuffer, arrbyteBuffer);
    }

    @Override
    public SSLEngineResult unwrap(ByteBuffer byteBuffer, ByteBuffer[] arrbyteBuffer, int n2, int n3) {
        return this.c.unwrap(byteBuffer, arrbyteBuffer, n2, n3);
    }

    @Override
    public Runnable getDelegatedTask() {
        return this.c.getDelegatedTask();
    }

    @Override
    public boolean isInboundDone() {
        return this.c.isInboundDone();
    }

    @Override
    public boolean isOutboundDone() {
        return this.c.isOutboundDone();
    }

    @Override
    public String[] getSupportedCipherSuites() {
        return this.c.getSupportedCipherSuites();
    }

    @Override
    public String[] getEnabledCipherSuites() {
        return this.c.getEnabledCipherSuites();
    }

    @Override
    public void setEnabledCipherSuites(String[] arrstring) {
        this.c.setEnabledCipherSuites(arrstring);
    }

    @Override
    public String[] getSupportedProtocols() {
        return this.c.getSupportedProtocols();
    }

    @Override
    public String[] getEnabledProtocols() {
        return this.c.getEnabledProtocols();
    }

    @Override
    public void setEnabledProtocols(String[] arrstring) {
        this.c.setEnabledProtocols(arrstring);
    }

    @Override
    public SSLSession getHandshakeSession() {
        return this.c.getHandshakeSession();
    }

    @Override
    public void beginHandshake() {
        this.c.beginHandshake();
    }

    @Override
    public SSLEngineResult.HandshakeStatus getHandshakeStatus() {
        return this.c.getHandshakeStatus();
    }

    @Override
    public void setUseClientMode(boolean bl2) {
        this.c.setUseClientMode(bl2);
    }

    @Override
    public boolean getUseClientMode() {
        return this.c.getUseClientMode();
    }

    @Override
    public void setNeedClientAuth(boolean bl2) {
        this.c.setNeedClientAuth(bl2);
    }

    @Override
    public boolean getNeedClientAuth() {
        return this.c.getNeedClientAuth();
    }

    @Override
    public void setWantClientAuth(boolean bl2) {
        this.c.setWantClientAuth(bl2);
    }

    @Override
    public boolean getWantClientAuth() {
        return this.c.getWantClientAuth();
    }

    @Override
    public void setEnableSessionCreation(boolean bl2) {
        this.c.setEnableSessionCreation(bl2);
    }

    @Override
    public boolean getEnableSessionCreation() {
        return this.c.getEnableSessionCreation();
    }

    @Override
    public SSLParameters getSSLParameters() {
        return this.c.getSSLParameters();
    }

    @Override
    public void setSSLParameters(SSLParameters sSLParameters) {
        this.c.setSSLParameters(sSLParameters);
    }

    @Override
    public /* synthetic */ SSLSession getSession() {
        return this.b();
    }

    static /* synthetic */ g a(d d2) {
        return d2.d;
    }
}

