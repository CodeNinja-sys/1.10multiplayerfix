/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.a;

import java.net.InetAddress;
import org.apache.a.f.b.b;
import org.apache.a.l.f;
import org.apache.a.r;

public class j
extends f {
    public j(org.apache.a.l.j j2) {
        super(j2);
    }

    public void a(r r2) {
        this.a.a("http.route.default-proxy", r2);
    }

    public void a(InetAddress inetAddress) {
        this.a.a("http.route.local-address", inetAddress);
    }

    public void a(b b2) {
        this.a.a("http.route.forced-route", b2);
    }
}

