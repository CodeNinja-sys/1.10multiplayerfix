/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.net.Socket;
import org.apache.a.e.a;
import org.apache.a.h.e;
import org.apache.a.i.d;
import org.apache.a.i.g;
import org.apache.a.j.f;
import org.apache.a.k;
import org.apache.a.l;

public class h
implements l {
    public static final h a = new h();
    private final a b;
    private final e c;
    private final e d;
    private final org.apache.a.j.d e;
    private final f f;

    public h(a a2, e e2, e e3, org.apache.a.j.d d2, f f2) {
        this.b = a2 != null ? a2 : org.apache.a.e.a.a;
        this.c = e2;
        this.d = e3;
        this.e = d2;
        this.f = f2;
    }

    public h(a a2, org.apache.a.j.d d2, f f2) {
        this(a2, null, null, d2, f2);
    }

    public h(a a2) {
        this(a2, null, null, null, null);
    }

    public h() {
        this(null, null, null, null, null);
    }

    public g b(Socket socket) {
        g g2 = new g(this.b.a(), this.b.b(), org.apache.a.i.d.a(this.b), org.apache.a.i.d.b(this.b), this.b.f(), this.c, this.d, this.e, this.f);
        g2.a(socket);
        return g2;
    }

    public /* synthetic */ k a(Socket socket) {
        return this.b(socket);
    }
}

