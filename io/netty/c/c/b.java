/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.c.c.d;
import io.netty.c.c.o;
import io.netty.util.c.b.g;
import io.netty.util.c.b.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLSessionContext;

public abstract class b
extends o {
    private static final g d;
    static final String a = "TLS";
    static final String[] b;
    static final List c;
    private final String[] e;
    private final List f;

    private static void a(String[] arrstring, List list, String ... arrstring2) {
        block0: for (String string : arrstring2) {
            for (String string2 : arrstring) {
                if (!string.equals(string2)) continue;
                list.add(string2);
                continue block0;
            }
        }
    }

    b(Iterable iterable) {
        this.e = io.netty.c.c.b.a(iterable);
        this.f = Collections.unmodifiableList(Arrays.asList(this.e));
    }

    public abstract SSLContext c();

    public final SSLSessionContext d() {
        if (this.k()) {
            return this.c().getServerSessionContext();
        }
        return this.c().getClientSessionContext();
    }

    @Override
    public final List e() {
        return this.f;
    }

    @Override
    public final long f() {
        return this.d().getSessionCacheSize();
    }

    @Override
    public final long g() {
        return this.d().getSessionTimeout();
    }

    @Override
    public final SSLEngine a(io.netty.b.h h2) {
        SSLEngine sSLEngine = this.c().createSSLEngine();
        sSLEngine.setEnabledCipherSuites(this.e);
        sSLEngine.setEnabledProtocols(b);
        sSLEngine.setUseClientMode(this.a());
        return this.a(sSLEngine);
    }

    @Override
    public final SSLEngine a(io.netty.b.h h2, String string, int n2) {
        SSLEngine sSLEngine = this.c().createSSLEngine(string, n2);
        sSLEngine.setEnabledCipherSuites(this.e);
        sSLEngine.setEnabledProtocols(b);
        sSLEngine.setUseClientMode(this.a());
        return this.a(sSLEngine);
    }

    private SSLEngine a(SSLEngine sSLEngine) {
        if (this.b().isEmpty()) {
            return sSLEngine;
        }
        return new d(sSLEngine, this.b(), this.k());
    }

    private static String[] a(Iterable iterable) {
        String string;
        if (iterable == null) {
            return c.toArray(new String[c.size()]);
        }
        ArrayList<String> arrayList = new ArrayList<String>();
        Iterator iterator = iterable.iterator();
        while (iterator.hasNext() && (string = (String)iterator.next()) != null) {
            arrayList.add(string);
        }
        return arrayList.toArray(new String[arrayList.size()]);
    }

    static {
        SSLContext sSLContext;
        d = h.a(b.class);
        try {
            sSLContext = SSLContext.getInstance("TLS");
            sSLContext.init(null, null, null);
        }
        catch (Exception exception) {
            throw new Error("failed to initialize the default SSL context", exception);
        }
        SSLEngine sSLEngine = sSLContext.createSSLEngine();
        String[] arrstring = sSLEngine.getSupportedProtocols();
        ArrayList arrayList = new ArrayList();
        io.netty.c.c.b.a(arrstring, arrayList, "TLSv1.2", "TLSv1.1", "TLSv1", "SSLv3");
        b = !arrayList.isEmpty() ? arrayList.toArray(new String[arrayList.size()]) : sSLEngine.getEnabledProtocols();
        String[] arrstring2 = sSLEngine.getSupportedCipherSuites();
        ArrayList arrayList2 = new ArrayList();
        io.netty.c.c.b.a(arrstring2, arrayList2, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "TLS_ECDHE_RSA_WITH_RC4_128_SHA", "TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", "TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", "TLS_RSA_WITH_AES_128_GCM_SHA256", "SSL_RSA_WITH_RC4_128_SHA", "SSL_RSA_WITH_RC4_128_MD5", "TLS_RSA_WITH_AES_128_CBC_SHA", "TLS_RSA_WITH_AES_256_CBC_SHA", "SSL_RSA_WITH_DES_CBC_SHA");
        c = !arrayList2.isEmpty() ? Collections.unmodifiableList(arrayList2) : Collections.unmodifiableList(Arrays.asList(sSLEngine.getEnabledCipherSuites()));
        if (d.d()) {
            d.b("Default protocols (JDK): {} ", (Object)Arrays.asList(b));
            d.b("Default cipher suites (JDK): {}", (Object)c);
        }
    }
}

