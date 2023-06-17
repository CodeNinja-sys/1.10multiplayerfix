/*
 * Decompiled with CFR 0.150.
 */
package com.sun.jna.a.c;

import com.sun.jna.Native;
import com.sun.jna.at;
import com.sun.jna.bb;

public class m
extends bb {
    public at d() {
        if (this.c() != null) {
            return this.c().n(Native.a);
        }
        return new at(0L);
    }

    public String toString() {
        return "Visual: VisualID=0x" + Long.toHexString(this.d().longValue());
    }
}

