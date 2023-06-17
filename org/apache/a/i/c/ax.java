/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.c;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import org.apache.a.f.x;
import org.apache.a.i.c.t;
import org.apache.a.n.g;
import org.apache.a.p;
import org.apache.a.r;
import org.apache.a.u;

public class ax
extends t {
    private final ProxySelector a;

    public ax(x x2, ProxySelector proxySelector) {
        super(x2);
        this.a = proxySelector != null ? proxySelector : ProxySelector.getDefault();
    }

    public ax(ProxySelector proxySelector) {
        this(null, proxySelector);
    }

    protected r b(r r2, u u2, g g2) {
        URI uRI;
        try {
            uRI = new URI(r2.e());
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new p("Cannot convert host to URI: " + r2, uRISyntaxException);
        }
        List<Proxy> list = this.a.select(uRI);
        Proxy proxy = this.a(list);
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

    private String a(InetSocketAddress inetSocketAddress) {
        return inetSocketAddress.isUnresolved() ? inetSocketAddress.getHostName() : inetSocketAddress.getAddress().getHostAddress();
    }

    private Proxy a(List list) {
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

