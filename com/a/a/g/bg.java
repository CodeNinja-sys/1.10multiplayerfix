/*
 * Decompiled with CFR 0.150.
 */
package com.a.a.g;

import com.a.a.g.aj;
import com.a.a.g.bh;
import com.a.a.g.h;
import java.io.Serializable;

final class bg
extends h
implements Serializable {
    private final int a;
    private static final long b = 0L;

    bg(int n2) {
        this.a = n2;
    }

    @Override
    public int b() {
        return 128;
    }

    @Override
    public aj a() {
        return new bh(this.a);
    }

    public String toString() {
        return "Hashing.murmur3_128(" + this.a + ")";
    }

    public boolean equals(Object object) {
        if (object instanceof bg) {
            bg bg2 = (bg)object;
            return this.a == bg2.a;
        }
        return false;
    }

    public int hashCode() {
        return this.getClass().hashCode() ^ this.a;
    }
}

