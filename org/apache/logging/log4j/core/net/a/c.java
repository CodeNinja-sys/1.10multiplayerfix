/*
 * Decompiled with CFR 0.150.
 */
package org.apache.logging.log4j.core.net.a;

import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.apache.logging.log4j.core.net.a.a;
import org.apache.logging.log4j.core.net.a.b;
import org.apache.logging.log4j.core.net.a.g;
import org.apache.logging.log4j.core.net.a.h;
import org.apache.logging.log4j.core.net.a.i;
import org.apache.logging.log4j.d.d;

public class c {
    private static final d a = org.apache.logging.log4j.d.d.k();
    private a b;
    private h c;
    private SSLContext d;

    private c(a a2, h h2) {
        this.b = a2;
        this.c = h2;
        this.d = null;
    }

    public SSLSocketFactory a() {
        if (this.d == null) {
            this.d = this.c();
        }
        return this.d.getSocketFactory();
    }

    public SSLServerSocketFactory b() {
        if (this.d == null) {
            this.d = this.c();
        }
        return this.d.getServerSocketFactory();
    }

    private SSLContext c() {
        SSLContext sSLContext = null;
        try {
            sSLContext = this.f();
            a.a("Creating SSLContext with the given parameters");
        }
        catch (i i2) {
            sSLContext = this.d();
        }
        catch (b b2) {
            sSLContext = this.e();
        }
        return sSLContext;
    }

    private SSLContext d() {
        SSLContext sSLContext;
        try {
            sSLContext = this.h();
            a.a("Creating SSLContext with default truststore");
        }
        catch (b b2) {
            sSLContext = this.i();
            a.a("Creating SSLContext with default configuration");
        }
        return sSLContext;
    }

    private SSLContext e() {
        SSLContext sSLContext;
        try {
            sSLContext = this.g();
            a.a("Creating SSLContext with default keystore");
        }
        catch (i i2) {
            sSLContext = this.i();
            a.a("Creating SSLContext with default configuration");
        }
        return sSLContext;
    }

    private SSLContext f() {
        return this.a(false, false);
    }

    private SSLContext g() {
        try {
            return this.a(true, false);
        }
        catch (b b2) {
            a.a("Exception occured while using default keystore. This should be a BUG");
            return null;
        }
    }

    private SSLContext h() {
        try {
            return this.a(false, true);
        }
        catch (i i2) {
            a.a("Exception occured while using default truststore. This should be a BUG");
            return null;
        }
    }

    private SSLContext i() {
        try {
            return SSLContext.getDefault();
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            a.b("Failed to create an SSLContext with default configuration");
            return null;
        }
    }

    private SSLContext a(boolean bl2, boolean bl3) {
        try {
            Object object;
            KeyManager[] arrkeyManager = null;
            TrustManager[] arrtrustManager = null;
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            if (!bl2) {
                object = this.k();
                arrkeyManager = ((KeyManagerFactory)object).getKeyManagers();
            }
            if (!bl3) {
                object = this.j();
                arrtrustManager = ((TrustManagerFactory)object).getTrustManagers();
            }
            sSLContext.init(arrkeyManager, arrtrustManager, null);
            return sSLContext;
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            a.b("No Provider supports a TrustManagerFactorySpi implementation for the specified protocol");
            throw new i(noSuchAlgorithmException);
        }
        catch (KeyManagementException keyManagementException) {
            a.b("Failed to initialize the SSLContext");
            throw new b(keyManagementException);
        }
    }

    private TrustManagerFactory j() {
        KeyStore keyStore = null;
        TrustManagerFactory trustManagerFactory = null;
        if (this.c == null) {
            throw new i(new Exception("The trustStoreConfiguration is null"));
        }
        try {
            keyStore = this.c.b();
            trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(keyStore);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            a.b("The specified algorithm is not available from the specified provider");
            throw new i(noSuchAlgorithmException);
        }
        catch (KeyStoreException keyStoreException) {
            a.b("Failed to initialize the TrustManagerFactory");
            throw new i(keyStoreException);
        }
        catch (g g2) {
            throw new i(g2);
        }
        return trustManagerFactory;
    }

    private KeyManagerFactory k() {
        KeyStore keyStore = null;
        KeyManagerFactory keyManagerFactory = null;
        if (this.b == null) {
            throw new b(new Exception("The keyStoreConfiguration is null"));
        }
        try {
            keyStore = this.b.b();
            keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm());
            keyManagerFactory.init(keyStore, this.b.e());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            a.b("The specified algorithm is not available from the specified provider");
            throw new b(noSuchAlgorithmException);
        }
        catch (KeyStoreException keyStoreException) {
            a.b("Failed to initialize the TrustManagerFactory");
            throw new b(keyStoreException);
        }
        catch (g g2) {
            throw new b(g2);
        }
        catch (UnrecoverableKeyException unrecoverableKeyException) {
            a.b("The key cannot be recovered (e.g. the given password is wrong)");
            throw new b(unrecoverableKeyException);
        }
        return keyManagerFactory;
    }

    public boolean a(c c2) {
        if (c2 == null) {
            return false;
        }
        boolean bl2 = false;
        boolean bl3 = false;
        if (this.b != null) {
            bl2 = this.b.a(c2.b);
        } else {
            boolean bl4 = bl2 = this.b == c2.b;
        }
        bl3 = this.c != null ? this.c.a(c2.c) : this.c == c2.c;
        return bl2 && bl3;
    }

    public static c a(a a2, h h2) {
        return new c(a2, h2);
    }
}

