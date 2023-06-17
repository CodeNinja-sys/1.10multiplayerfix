/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.c.c.a.i;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactorySpi;

final class l
extends TrustManagerFactorySpi {
    private i a;

    l() {
    }

    void a(i i2) {
        this.a = i2;
    }

    @Override
    protected void engineInit(KeyStore keyStore) {
        try {
            this.a.a(keyStore);
        }
        catch (KeyStoreException keyStoreException) {
            throw keyStoreException;
        }
        catch (Exception exception) {
            throw new KeyStoreException(exception);
        }
    }

    @Override
    protected void engineInit(ManagerFactoryParameters managerFactoryParameters) {
        try {
            this.a.a(managerFactoryParameters);
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw invalidAlgorithmParameterException;
        }
        catch (Exception exception) {
            throw new InvalidAlgorithmParameterException(exception);
        }
    }

    @Override
    protected TrustManager[] engineGetTrustManagers() {
        return this.a.a();
    }
}

