/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.an;
import java.util.zip.CRC32;
import java.util.zip.Checksum;

final class ao
extends an {
    ao(int n3) {
    }

    @Override
    public Checksum b() {
        return new CRC32();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.b();
    }
}

