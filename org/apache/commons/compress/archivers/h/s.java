/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import org.apache.commons.compress.archivers.h.ap;
import org.apache.commons.compress.archivers.h.ba;
import org.apache.commons.compress.archivers.h.bb;

public class s
implements ap {
    private ba a;
    private byte[] b;
    private byte[] c;

    public void a(ba ba2) {
        this.a = ba2;
    }

    public ba cI_() {
        return this.a;
    }

    public void a(byte[] arrby) {
        this.b = bb.b(arrby);
    }

    public ba f() {
        return new ba(this.b != null ? this.b.length : 0);
    }

    public byte[] e() {
        return bb.b(this.b);
    }

    public void b(byte[] arrby) {
        this.c = bb.b(arrby);
    }

    public ba d() {
        if (this.c != null) {
            return new ba(this.c.length);
        }
        return this.f();
    }

    public byte[] c() {
        if (this.c != null) {
            return bb.b(this.c);
        }
        return this.e();
    }

    public void a(byte[] arrby, int n2, int n3) {
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, n2, arrby2, 0, n3);
        this.a(arrby2);
    }

    public void b(byte[] arrby, int n2, int n3) {
        byte[] arrby2 = new byte[n3];
        System.arraycopy(arrby, n2, arrby2, 0, n3);
        this.b(arrby2);
        if (this.b == null) {
            this.a(arrby2);
        }
    }
}

