/*
 * Decompiled with CFR 0.150.
 */
package io.netty.c.a.d;

import io.netty.c.a.d.ar;
import io.netty.c.a.d.k;

final class t
extends k {
    t(boolean bl2) {
        super(bl2);
    }

    @Override
    void a(CharSequence charSequence) {
        super.a(charSequence);
        if (ar.a((CharSequence)"Content-Length", charSequence) || ar.a((CharSequence)"Transfer-Encoding", charSequence) || ar.a((CharSequence)"Trailer", charSequence)) {
            throw new IllegalArgumentException("prohibited trailing header: " + charSequence);
        }
    }
}

