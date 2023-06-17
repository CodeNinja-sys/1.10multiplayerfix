/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.i;

import com.a.a.b.cl;
import com.a.a.i.ak;
import com.a.a.i.ck;
import java.io.Reader;

final class ao
extends ak {
    private final Iterable a;

    ao(Iterable iterable) {
        this.a = (Iterable)cl.a(iterable);
    }

    @Override
    public Reader a() {
        return new ck(this.a.iterator());
    }

    @Override
    public boolean g() {
        for (ak ak2 : this.a) {
            if (ak2.g()) continue;
            return false;
        }
        return true;
    }

    public String toString() {
        return "CharSource.concat(" + this.a + ")";
    }

    @Override
    public /* synthetic */ Object h() {
        return super.b();
    }
}

