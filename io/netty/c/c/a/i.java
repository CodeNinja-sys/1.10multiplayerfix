/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.c.c.a.j;
import io.netty.c.c.a.k;
import io.netty.c.c.a.l;
import io.netty.util.b.z;
import java.security.KeyStore;
import java.security.Provider;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.TrustManagerFactorySpi;

public abstract class i
extends TrustManagerFactory {
    private static final Provider a = new j("", 0.0, "");
    private static final z b = new k();

    protected i() {
        this("");
    }

    protected i(String string) {
        super((TrustManagerFactorySpi)b.f(), a, string);
        ((l)b.f()).a(this);
        b.h();
        if (string == null) {
            throw new NullPointerException("name");
        }
    }

    protected abstract void a(KeyStore var1);

    protected abstract void a(ManagerFactoryParameters var1);

    protected abstract TrustManager[] a();
}

