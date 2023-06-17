/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.nio.charset.Charset;
import org.apache.a.b.d;
import org.apache.a.b.e;
import org.apache.a.b.f;
import org.apache.a.i.a.b;
import org.apache.a.l.j;
import org.apache.a.n.g;

public class c
implements e,
f {
    private final Charset a;

    public c(Charset charset) {
        this.a = charset;
    }

    public c() {
        this(null);
    }

    public d a(j j2) {
        return new b();
    }

    public d a(g g2) {
        return new b(this.a);
    }
}

