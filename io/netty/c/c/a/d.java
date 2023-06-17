/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.c.c.a.b;
import java.security.MessageDigest;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import javax.net.ssl.X509TrustManager;

class d
implements X509TrustManager {
    final /* synthetic */ b a;

    d(b b2) {
        this.a = b2;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
        this.a("client", arrx509Certificate);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
        this.a("server", arrx509Certificate);
    }

    private void a(String string, X509Certificate[] arrx509Certificate) {
        X509Certificate x509Certificate = arrx509Certificate[0];
        byte[] arrby = this.a(x509Certificate);
        boolean bl2 = false;
        for (byte[] arrby2 : b.a(this.a)) {
            if (!Arrays.equals(arrby, arrby2)) continue;
            bl2 = true;
            break;
        }
        if (!bl2) {
            throw new CertificateException(string + " certificate with unknown fingerprint: " + x509Certificate.getSubjectDN());
        }
    }

    private byte[] a(X509Certificate x509Certificate) {
        MessageDigest messageDigest = (MessageDigest)b.b().f();
        messageDigest.reset();
        return messageDigest.digest(x509Certificate.getEncoded());
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return io.netty.util.c.d.m;
    }
}

