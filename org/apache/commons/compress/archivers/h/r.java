/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;

public final class r
implements ap {
    private static final ba a = new ba(44225);
    private byte[] b;
    private byte[] c;

    public ba cI_() {
        return a;
    }

    public ba f() {
        return new ba(this.b == null ? 0 : this.b.length);
    }

    public ba d() {
        return this.c == null ? this.f() : new ba(this.c.length);
    }

    public byte[] e() {
        return bb.b(this.b);
    }

    public byte[] c() {
        return this.c == null ? this.e() : bb.b(this.c);
    }

    public void a(byte[] arrby, int n2, int n3) {
        this.b = new byte[n3];
        System.arraycopy(arrby, n2, this.b, 0, n3);
    }

    public void b(byte[] arrby, int n2, int n3) {
        this.c = new byte[n3];
        System.arraycopy(arrby, n2, this.c, 0, n3);
        if (this.b == null) {
            this.a(arrby, n2, n3);
        }
    }
}

