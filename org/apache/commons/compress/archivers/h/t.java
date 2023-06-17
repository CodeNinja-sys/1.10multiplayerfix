/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.IOException;
import java.io.InputStream;
import org.apache.commons.compress.b.g.a.a;

class t
extends a {
    private static final int j = 13;
    private static final int k = 8192;
    private final boolean[] l;

    public t(InputStream inputStream) {
        super(inputStream);
        this.b(this.c);
        this.c(13);
        this.l = new boolean[this.h.length];
        for (int i2 = 0; i2 < 256; ++i2) {
            this.l[i2] = true;
        }
        this.g = this.b + 1;
    }

    protected int a(int n2, byte by2) {
        while (this.g < 8192 && this.l[this.g]) {
            ++this.g;
        }
        int n3 = this.a(n2, by2, 8192);
        if (n3 >= 0) {
            this.l[n3] = true;
        }
        return n3;
    }

    private void f() {
        int n2;
        boolean[] arrbl = new boolean[8192];
        for (n2 = 0; n2 < this.l.length; ++n2) {
            if (!this.l[n2] || this.h[n2] == -1) continue;
            arrbl[this.h[n2]] = true;
        }
        for (n2 = this.b + 1; n2 < arrbl.length; ++n2) {
            if (arrbl[n2]) continue;
            this.l[n2] = false;
            this.h[n2] = -1;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected int a() {
        int n2 = this.d();
        if (n2 < 0) {
            return -1;
        }
        if (n2 == this.b) {
            int n3 = this.d();
            if (n3 < 0) {
                throw new IOException("Unexpected EOF;");
            }
            if (n3 == 1) {
                if (this.c >= 13) throw new IOException("Attempt to increase code size beyond maximum");
                ++this.c;
                return 0;
            } else {
                if (n3 != 2) throw new IOException("Invalid clear code subcode " + n3);
                this.f();
                this.g = this.b + 1;
            }
            return 0;
        }
        boolean bl2 = false;
        int n4 = n2;
        if (this.l[n2]) return this.a(n4, bl2);
        n4 = this.e();
        bl2 = true;
        return this.a(n4, bl2);
    }
}

