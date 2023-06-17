/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c.a;

import io.netty.c.c.a.f;
import io.netty.c.c.a.i;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.security.KeyStore;
import javax.net.ssl.ManagerFactoryParameters;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;

public final class e
extends i {
    private static final g b = h.a(e.class);
    public static final TrustManagerFactory a = new e();
    private static final TrustManager c = new f();

    private e() {
    }

    @Override
    protected void a(KeyStore keyStore) {
    }

    @Override
    protected void a(ManagerFactoryParameters managerFactoryParameters) {
    }

    @Override
    protected TrustManager[] a() {
        return new TrustManager[]{c};
    }

    static /* synthetic */ g b() {
        return b;
    }
}

