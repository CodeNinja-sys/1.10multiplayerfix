/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i;

import java.net.Socket;
import org.apache.a.e.a;
import org.apache.a.i.d;
import org.apache.a.i.e;
import org.apache.a.k;
import org.apache.a.l;

public class f
implements l {
    public static final f a = new f();
    private final a b;
    private final org.apache.a.h.e c;
    private final org.apache.a.h.e d;
    private final org.apache.a.j.f e;
    private final org.apache.a.j.d f;

    public f(a a2, org.apache.a.h.e e2, org.apache.a.h.e e3, org.apache.a.j.f f2, org.apache.a.j.d d2) {
        this.b = a2 != null ? a2 : org.apache.a.e.a.a;
        this.c = e2;
        this.d = e3;
        this.e = f2;
        this.f = d2;
    }

    public f(a a2, org.apache.a.j.f f2, org.apache.a.j.d d2) {
        this(a2, null, null, f2, d2);
    }

    public f(a a2) {
        this(a2, null, null, null, null);
    }

    public f() {
        this(null, null, null, null, null);
    }

    public e b(Socket socket) {
        e e2 = new e(this.b.a(), this.b.b(), org.apache.a.i.d.a(this.b), org.apache.a.i.d.b(this.b), this.b.f(), this.c, this.d, this.e, this.f);
        e2.a(socket);
        return e2;
    }

    public /* synthetic */ k a(Socket socket) {
        return this.b(socket);
    }
}

