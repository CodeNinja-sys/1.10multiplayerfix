/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.c;

import io.netty.b.g;
import io.netty.b.j;
import io.netty.c.c.b;
import io.netty.c.c.d;
import io.netty.c.c.n;
import java.io.File;
import java.security.KeyStore;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManagerFactory;
import javax.security.auth.x500.X500Principal;

public final class a
extends b {
    private final SSLContext d;
    private final List e;

    public a() {
        this(null, null, null, null, 0L, 0L);
    }

    public a(File file) {
        this(file, null);
    }

    public a(TrustManagerFactory trustManagerFactory) {
        this(null, trustManagerFactory);
    }

    public a(File file, TrustManagerFactory trustManagerFactory) {
        this(file, trustManagerFactory, null, null, 0L, 0L);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public a(File file, TrustManagerFactory trustManagerFactory, Iterable iterable, Iterable iterable2, long l2, long l3) {
        super(iterable);
        Object object;
        Object object2;
        Object object3;
        if (iterable2 != null && iterable2.iterator().hasNext()) {
            if (!io.netty.c.c.d.a()) {
                throw new SSLException("NPN/ALPN unsupported: " + iterable2);
            }
            object3 = new ArrayList();
            object2 = iterable2.iterator();
            while (object2.hasNext() && (object = (String)object2.next()) != null) {
                object3.add(object);
            }
            this.e = Collections.unmodifiableList(object3);
        } else {
            this.e = Collections.emptyList();
        }
        try {
            if (file == null) {
                this.d = SSLContext.getInstance("TLS");
                if (trustManagerFactory == null) {
                    this.d.init(null, null, null);
                } else {
                    trustManagerFactory.init((KeyStore)null);
                    this.d.init(null, trustManagerFactory.getTrustManagers(), null);
                }
            } else {
                object3 = KeyStore.getInstance("JKS");
                ((KeyStore)object3).load(null, null);
                object2 = CertificateFactory.getInstance("X.509");
                object = n.a(file);
                try {
                    for (g g2 : object) {
                        X509Certificate x509Certificate = (X509Certificate)((CertificateFactory)object2).generateCertificate(new j(g2));
                        X500Principal x500Principal = x509Certificate.getSubjectX500Principal();
                        ((KeyStore)object3).setCertificateEntry(x500Principal.getName("RFC2253"), x509Certificate);
                    }
                }
                finally {
                    for (g g2 : object) {
                        g2.ad();
                    }
                }
                if (trustManagerFactory == null) {
                    trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                }
                trustManagerFactory.init((KeyStore)object3);
                this.d = SSLContext.getInstance("TLS");
                this.d.init(null, trustManagerFactory.getTrustManagers(), null);
            }
            object3 = this.d.getClientSessionContext();
            if (l2 > 0L) {
                object3.setSessionCacheSize((int)Math.min(l2, Integer.MAX_VALUE));
            }
            if (l3 > 0L) {
                object3.setSessionTimeout((int)Math.min(l3, Integer.MAX_VALUE));
            }
        }
        catch (Exception exception) {
            throw new SSLException("failed to initialize the server-side SSL context", exception);
        }
    }

    @Override
    public boolean a() {
        return true;
    }

    @Override
    public List b() {
        return this.e;
    }

    @Override
    public SSLContext c() {
        return this.d;
    }
}

