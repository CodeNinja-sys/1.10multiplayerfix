/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.e;

import java.security.KeyStore;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509KeyManager;
import javax.net.ssl.X509TrustManager;
import org.apache.a.f.e.e;
import org.apache.a.f.e.h;
import org.apache.a.f.e.i;
import org.apache.a.f.e.o;

public class g {
    static final String a = "TLS";
    static final String b = "SSL";
    private String c;
    private Set d = new HashSet();
    private Set e = new HashSet();
    private SecureRandom f;

    public g a() {
        this.c = a;
        return this;
    }

    public g b() {
        this.c = b;
        return this;
    }

    public g a(String string) {
        this.c = string;
        return this;
    }

    public g a(SecureRandom secureRandom) {
        this.f = secureRandom;
        return this;
    }

    public g a(KeyStore keyStore, o o2) {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init(keyStore);
        TrustManager[] arrtrustManager = trustManagerFactory.getTrustManagers();
        if (arrtrustManager != null) {
            if (o2 != null) {
                for (int i2 = 0; i2 < arrtrustManager.length; ++i2) {
                    TrustManager trustManager = arrtrustManager[i2];
                    if (!(trustManager instanceof X509TrustManager)) continue;
                    arrtrustManager[i2] = new i((X509TrustManager)trustManager, o2);
                }
            }
            for (TrustManager trustManager : arrtrustManager) {
                this.e.add(trustManager);
            }
        }
        return this;
    }

    public g a(KeyStore keyStore) {
        return this.a(keyStore, (o)null);
    }

    public g a(KeyStore keyStore, char[] arrc) {
        this.a(keyStore, arrc, null);
        return this;
    }

    public g a(KeyStore keyStore, char[] arrc, e e2) {
        KeyManagerFactory keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
        keyManagerFactory.init(keyStore, arrc);
        KeyManager[] arrkeyManager = keyManagerFactory.getKeyManagers();
        if (arrkeyManager != null) {
            if (e2 != null) {
                for (int i2 = 0; i2 < arrkeyManager.length; ++i2) {
                    KeyManager keyManager = arrkeyManager[i2];
                    if (!(keyManager instanceof X509KeyManager)) continue;
                    arrkeyManager[i2] = new h((X509KeyManager)keyManager, e2);
                }
            }
            for (KeyManager keyManager : arrkeyManager) {
                this.d.add(keyManager);
            }
        }
        return this;
    }

    public SSLContext c() {
        SSLContext sSLContext = SSLContext.getInstance(this.c != null ? this.c : a);
        sSLContext.init(!this.d.isEmpty() ? this.d.toArray(new KeyManager[this.d.size()]) : null, !this.e.isEmpty() ? this.e.toArray(new TrustManager[this.e.size()]) : null, this.f);
        return sSLContext;
    }
}

