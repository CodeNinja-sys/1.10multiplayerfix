/*
 * Decompiled with CFR 0.150.
 */
package org.apache.commons.compress.archivers.h;

import java.io.InputStream;
import org.apache.commons.compress.archivers.h.c;
import org.apache.commons.compress.archivers.h.d;
import org.apache.commons.compress.archivers.h.e;

class f
extends InputStream {
    private final InputStream a;
    private d b;
    private final int c;
    private final int d;
    private final int e;
    private c f;
    private c g;
    private c h;
    private final e i = new e(32768);

    public f(int n2, int n3, InputStream inputStream) {
        if (n2 != 4096 && n2 != 8192) {
            throw new IllegalArgumentException("The dictionary size must be 4096 or 8192");
        }
        if (n3 != 2 && n3 != 3) {
            throw new IllegalArgumentException("The number of trees must be 2 or 3");
        }
        this.c = n2;
        this.d = n3;
        this.e = n3;
        this.a = inputStream;
    }

    private void a() {
        if (this.b == null) {
            if (this.d == 3) {
                this.f = org.apache.commons.compress.archivers.h.c.a(this.a, 256);
            }
            this.g = org.apache.commons.compress.archivers.h.c.a(this.a, 64);
            this.h = org.apache.commons.compress.archivers.h.c.a(this.a, 64);
            this.b = new d(this.a);
        }
    }

    public int read() {
        if (!this.i.a()) {
            this.b();
        }
        return this.i.b();
    }

    private void b() {
        this.a();
        int n2 = this.b.a();
        if (n2 == 1) {
            int n3 = this.f != null ? this.f.a(this.b) : this.b.a(8);
            if (n3 == -1) {
                return;
            }
            this.i.a(n3);
        } else if (n2 == 0) {
            int n4 = this.c == 4096 ? 6 : 7;
            int n5 = this.b.a(n4);
            int n6 = this.h.a(this.b);
            if (n6 == -1 && n5 <= 0) {
                return;
            }
            int n7 = n6 << n4 | n5;
            int n8 = this.g.a(this.b);
            if (n8 == 63) {
                n8 += this.b.a(8);
            }
            this.i.a(n7 + 1, n8 += this.e);
        }
    }
}

