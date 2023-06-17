/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

final class g
implements SSLSession {
    private final SSLEngine a;
    private volatile String b;

    g(SSLEngine sSLEngine) {
        this.a = sSLEngine;
    }

    void a(String string) {
        if (string != null) {
            string = string.replace(':', '_');
        }
        this.b = string;
    }

    @Override
    public String getProtocol() {
        String string = this.a().getProtocol();
        String string2 = this.b;
        if (string2 == null) {
            if (string != null) {
                return string.replace(':', '_');
            }
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder(32);
        if (string != null) {
            stringBuilder.append(string.replace(':', '_'));
            stringBuilder.append(':');
        } else {
            stringBuilder.append("null:");
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private SSLSession a() {
        return this.a.getSession();
    }

    @Override
    public byte[] getId() {
        return this.a().getId();
    }

    @Override
    public SSLSessionContext getSessionContext() {
        return this.a().getSessionContext();
    }

    @Override
    public long getCreationTime() {
        return this.a().getCreationTime();
    }

    @Override
    public long getLastAccessedTime() {
        return this.a().getLastAccessedTime();
    }

    @Override
    public void invalidate() {
        this.a().invalidate();
    }

    @Override
    public boolean isValid() {
        return this.a().isValid();
    }

    @Override
    public void putValue(String string, Object object) {
        this.a().putValue(string, object);
    }

    @Override
    public Object getValue(String string) {
        return this.a().getValue(string);
    }

    @Override
    public void removeValue(String string) {
        this.a().removeValue(string);
    }

    @Override
    public String[] getValueNames() {
        return this.a().getValueNames();
    }

    @Override
    public Certificate[] getPeerCertificates() {
        return this.a().getPeerCertificates();
    }

    @Override
    public Certificate[] getLocalCertificates() {
        return this.a().getLocalCertificates();
    }

    @Override
    public X509Certificate[] getPeerCertificateChain() {
        return this.a().getPeerCertificateChain();
    }

    @Override
    public Principal getPeerPrincipal() {
        return this.a().getPeerPrincipal();
    }

    @Override
    public Principal getLocalPrincipal() {
        return this.a().getLocalPrincipal();
    }

    @Override
    public String getCipherSuite() {
        return this.a().getCipherSuite();
    }

    @Override
    public String getPeerHost() {
        return this.a().getPeerHost();
    }

    @Override
    public int getPeerPort() {
        return this.a().getPeerPort();
    }

    @Override
    public int getPacketBufferSize() {
        return this.a().getPacketBufferSize();
    }

    @Override
    public int getApplicationBufferSize() {
        return this.a().getApplicationBufferSize();
    }
}

