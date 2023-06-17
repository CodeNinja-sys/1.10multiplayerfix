/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.opencl;

import org.lwjgl.d;
import org.lwjgl.opencl.ar;
import org.lwjgl.opencl.be;

class as {
    private be a;

    as() {
    }

    final boolean a() {
        return this.a == null || this.a.b();
    }

    final ar a(long l2) {
        return this.a == null ? null : (ar)this.a.a(l2);
    }

    final boolean b(long l2) {
        return this.a != null && this.a.b(l2);
    }

    final Iterable b() {
        return this.a;
    }

    void a(ar ar2) {
        be be2 = this.c();
        Long l2 = ar2.a();
        if (d.i && be2.b(l2)) {
            throw new IllegalStateException("Duplicate object found: " + ar2.getClass() + " - " + l2);
        }
        this.c().a(ar2.a(), ar2);
    }

    void b(ar ar2) {
        this.c().c(ar2.l());
    }

    private be c() {
        if (this.a == null) {
            this.a = new be();
        }
        return this.a;
    }
}

