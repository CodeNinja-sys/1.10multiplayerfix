/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.b;

import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.a.aj;
import org.apache.a.c.e;
import org.apache.a.c.f.k;
import org.apache.a.c.o;
import org.apache.a.f;
import org.apache.a.i.b.av;
import org.apache.a.l.j;
import org.apache.a.n.g;
import org.apache.a.o.b;
import org.apache.a.r;
import org.apache.a.u;
import org.apache.a.x;
import org.apache.commons.d.a;
import org.apache.commons.d.c;

public class v
implements o {
    private final a a = c.b(this.getClass());
    private static final String b = "http.protocol.redirect-locations";

    public boolean a(x x2, g g2) {
        org.apache.a.o.a.a(x2, "HTTP response");
        int n2 = x2.a().b();
        switch (n2) {
            case 301: 
            case 302: 
            case 307: {
                u u2 = (u)g2.a("http.request");
                String string = u2.g().a();
                return string.equalsIgnoreCase("GET") || string.equalsIgnoreCase("HEAD");
            }
            case 303: {
                return true;
            }
        }
        return false;
    }

    public URI b(x x2, g g2) {
        Serializable serializable;
        Object object;
        Object object2;
        URI uRI;
        org.apache.a.o.a.a(x2, "HTTP response");
        f f2 = x2.c("location");
        if (f2 == null) {
            throw new aj("Received redirect response " + x2.a() + " but no location header");
        }
        String string = f2.d();
        if (this.a.a()) {
            this.a.b("Redirect requested to location '" + string + "'");
        }
        try {
            uRI = new URI(string);
        }
        catch (URISyntaxException uRISyntaxException) {
            throw new aj("Invalid redirect URI: " + string, uRISyntaxException);
        }
        j j2 = x2.f();
        if (!uRI.isAbsolute()) {
            if (j2.c("http.protocol.reject-relative-redirect")) {
                throw new aj("Relative redirect location '" + uRI + "' not allowed");
            }
            object2 = (r)g2.a("http.target_host");
            org.apache.a.o.b.a(object2, "Target host");
            object = (u)g2.a("http.request");
            try {
                serializable = new URI(object.g().c());
                URI uRI2 = k.a(serializable, (r)object2, true);
                uRI = k.a(uRI2, uRI);
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new aj(uRISyntaxException.getMessage(), uRISyntaxException);
            }
        }
        if (j2.d("http.protocol.allow-circular-redirects")) {
            object2 = (av)g2.a(b);
            if (object2 == null) {
                object2 = new av();
                g2.a(b, object2);
            }
            if (uRI.getFragment() != null) {
                try {
                    serializable = new r(uRI.getHost(), uRI.getPort(), uRI.getScheme());
                    object = k.a(uRI, (r)serializable, true);
                }
                catch (URISyntaxException uRISyntaxException) {
                    throw new aj(uRISyntaxException.getMessage(), uRISyntaxException);
                }
            } else {
                object = uRI;
            }
            if (((av)object2).a((URI)object)) {
                throw new e("Circular redirect to '" + object + "'");
            }
            ((av)object2).b((URI)object);
        }
        return uRI;
    }
}

