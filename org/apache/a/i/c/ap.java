/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.a.f.a.k;
import org.apache.a.f.b.b;
import org.apache.a.f.b.d;
import org.apache.a.f.c.f;
import org.apache.a.f.c.j;
import org.apache.a.n.g;
import org.apache.a.o.a;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;

public class ap
implements d {
    protected final j a;
    protected ProxySelector b;

    public ap(j j2, ProxySelector proxySelector) {
        org.apache.a.o.a.a(j2, "SchemeRegistry");
        this.a = j2;
        this.b = proxySelector;
    }

    public ProxySelector a() {
        return this.b;
    }

    public void a(ProxySelector proxySelector) {
        this.b = proxySelector;
    }

    public b a(r r2, u u2, g g2) {
        org.apache.a.o.a.a(u2, "HTTP request");
        b b2 = k.b(u2.f());
        if (b2 != null) {
            return b2;
        }
        org.apache.a.o.b.a(r2, "Target host");
        InetAddress inetAddress = k.c(u2.f());
        r r3 = this.b(r2, u2, g2);
        f f2 = this.a.a(r2.c());
        boolean bl2 = f2.e();
        b2 = r3 == null ? new b(r2, inetAddress, bl2) : new b(r2, inetAddress, r3, bl2);
        return b2;
    }

    protected r b(r r2, u u2, g g2) {
        ProxySelector proxySelector = this.b;
        if (proxySelector == null) {
            proxySelector = ProxySelector.getDefault();
        }
        if (proxySelector == null) {
            return null;
        }
        URI uRI = null;
        try {
            uRI = new URI(r2.e());
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new p("Cannot convert host to URI: " + r2, uRISyntaxException);
        }
        List<Proxy> list = proxySelector.select(uRI);
        Proxy proxy = this.a(list, r2, u2, g2);
        r r3 = null;
        if (proxy.type() == Proxy.Type.HTTP) {
            if (!(proxy.address() instanceof InetSocketAddress)) {
                throw new p("Unable to handle non-Inet proxy address: " + proxy.address());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress)proxy.address();
            r3 = new r(this.a(inetSocketAddress), inetSocketAddress.getPort());
        }
        return r3;
    }

    protected String a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    protected Proxy a(List list, r r2, u u2, g g2) {
        org.apache.a.o.a.a(list, "List of proxies");
        Proxy proxy = null;
        block3: for (int i2 = 0; proxy == null && i2 < list.size(); ++i2) {
            Proxy proxy2 = (Proxy)list.get(i2);
            switch (proxy2.type()) {
                case DIRECT: 
                case HTTP: {
                    proxy = proxy2;
                    continue block3;
                }
            }
        }
        if (proxy == null) {
            proxy = Proxy.NO_PROXY;
        }
        return proxy;
    }
}

