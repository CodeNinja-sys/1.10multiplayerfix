/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.c.c.a.e;
import io.netty.util.c.d;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;

final class f
implements X509TrustManager {
    f() {
    }

    @Override
    public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
        e.b().b("Accepting a client certificate: " + arrx509Certificate[0].getSubjectDN());
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
        e.b().b("Accepting a server certificate: " + arrx509Certificate[0].getSubjectDN());
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return d.m;
    }
}

