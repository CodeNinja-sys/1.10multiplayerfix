/*
 * Decompiled with CFR 0.150.
 */
package io.netty.channel.b;

import io.netty.channel.an;
import io.netty.channel.b.e;

final class i
implements e {
    private final e[] a;

    i(e ... arre) {
        this.a = arre;
    }

    @Override
    public boolean a(an an2) {
        for (e e2 : this.a) {
            if (e2.a(an2)) continue;
            return false;
        }
        return true;
    }
}

