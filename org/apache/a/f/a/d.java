/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.f.a;

import org.apache.a.f.a.h;
import org.apache.a.l.f;
import org.apache.a.l.j;

public class d
extends f {
    public d(j j2) {
        super(j2);
    }

    public void a(long l2) {
        this.a.b("http.conn-manager.timeout", l2);
    }

    public void a(int n2) {
        this.a.b("http.conn-manager.max-total", n2);
    }

    public void a(h h2) {
        this.a.a("http.conn-manager.max-per-route", h2);
    }
}

