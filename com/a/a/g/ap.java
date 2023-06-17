/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.an;
import java.util.zip.Adler32;
import java.util.zip.Checksum;

final class ap
extends an {
    ap(int n3) {
    }

    @Override
    public Checksum b() {
        return new Adler32();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

