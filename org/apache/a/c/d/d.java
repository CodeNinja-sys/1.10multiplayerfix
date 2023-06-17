/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.c.d;

import java.util.Collection;
import org.apache.a.l.f;
import org.apache.a.l.j;
import org.apache.a.r;

public class d
extends f {
    public d(j j2) {
        super(j2);
    }

    public void a(String string) {
        this.a.a("http.connection-manager.factory-class-name", string);
    }

    public void a(boolean bl2) {
        this.a.b("http.protocol.handle-redirects", bl2);
    }

    public void b(boolean bl2) {
        this.a.b("http.protocol.reject-relative-redirect", bl2);
    }

    public void a(int n2) {
        this.a.b("http.protocol.max-redirects", n2);
    }

    public void c(boolean bl2) {
        this.a.b("http.protocol.allow-circular-redirects", bl2);
    }

    public void d(boolean bl2) {
        this.a.b("http.protocol.handle-authentication", bl2);
    }

    public void b(String string) {
        this.a.a("http.protocol.cookie-policy", string);
    }

    public void a(r r2) {
        this.a.a("http.virtual-host", r2);
    }

    public void a(Collection collection) {
        this.a.a("http.default-headers", collection);
    }

    public void b(r r2) {
        this.a.a("http.default-host", r2);
    }

    public void a(long l2) {
        this.a.b("http.conn-manager.timeout", l2);
    }
}

