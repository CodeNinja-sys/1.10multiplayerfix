/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import org.apache.a.f.e.o;

class i
implements X509TrustManager {
    private final X509TrustManager a;
    private final o b;

    i(X509TrustManager x509TrustManager, o o2) {
        this.a = x509TrustManager;
        this.b = o2;
    }

    public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
        this.a.checkClientTrusted(arrx509Certificate, string);
    }

    public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
        if (!this.b.a(arrx509Certificate, string)) {
            this.a.checkServerTrusted(arrx509Certificate, string);
        }
    }

    public X509Certificate[] getAcceptedIssuers() {
        return this.a.getAcceptedIssuers();
    }
}

