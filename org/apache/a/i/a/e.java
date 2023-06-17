/*
 * Decompiled with CFR 0.150.
 */
package org.apache.a.i.a;

import java.nio.charset.Charset;
import org.apache.a.b.f;
import org.apache.a.i.a.d;
import org.apache.a.l.j;
import org.apache.a.n.g;

public class e
implements org.apache.a.b.e,
f {
    private final Charset a;

    public e(Charset charset) {
        this.a = charset;
    }

    public e() {
        this(null);
    }

    public org.apache.a.b.d a(j j2) {
        return new d();
    }

    public org.apache.a.b.d a(g g2) {
        return new d(this.a);
    }
}

