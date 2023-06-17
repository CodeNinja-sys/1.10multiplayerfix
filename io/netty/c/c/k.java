/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.j;
import io.netty.util.c.d;
import java.security.Principal;
import java.security.cert.Certificate;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSessionContext;
import javax.security.cert.X509Certificate;

class k
implements SSLSession {
    final /* synthetic */ j a;

    k(j j2) {
        this.a = j2;
    }

    @Override
    public byte[] getId() {
        return String.valueOf(j.a(this.a)).getBytes();
    }

    @Override
    public SSLSessionContext getSessionContext() {
        return null;
    }

    @Override
    public long getCreationTime() {
        return 0L;
    }

    @Override
    public long getLastAccessedTime() {
        return 0L;
    }

    @Override
    public void invalidate() {
    }

    @Override
    public boolean isValid() {
        return false;
    }

    @Override
    public void putValue(String string, Object object) {
    }

    @Override
    public Object getValue(String string) {
        return null;
    }

    @Override
    public void removeValue(String string) {
    }

    @Override
    public String[] getValueNames() {
        return d.j;
    }

    @Override
    public Certificate[] getPeerCertificates() {
        return j.b();
    }

    @Override
    public Certificate[] getLocalCertificates() {
        return j.b();
    }

    @Override
    public X509Certificate[] getPeerCertificateChain() {
        return j.c();
    }

    @Override
    public Principal getPeerPrincipal() {
        return null;
    }

    @Override
    public Principal getLocalPrincipal() {
        return null;
    }

    @Override
    public String getCipherSuite() {
        return j.b(this.a);
    }

    @Override
    public String getProtocol() {
        String string = j.c(this.a);
        if (string == null) {
            return "unknown";
        }
        return "unknown:" + string;
    }

    @Override
    public String getPeerHost() {
        return null;
    }

    @Override
    public int getPeerPort() {
        return 0;
    }

    @Override
    public int getPacketBufferSize() {
        return 18713;
    }

    @Override
    public int getApplicationBufferSize() {
        return 16384;
    }
}

