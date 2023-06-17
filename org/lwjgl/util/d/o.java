/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.objectweb.asm.Type
 */
package org.lwjgl.util.d;

import org.objectweb.asm.Type;

class o {
    final long a;
    final long b;
    final long c;
    final Type d;
    final boolean e;
    final boolean f;

    o(long l2, long l3, long l4, Type type, boolean bl2, boolean bl3) {
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = type;
        this.e = bl2;
        this.f = bl3;
    }

    String a() {
        return this.f ? "a" : this.d.getDescriptor().toLowerCase() + (this.e ? "v" : "");
    }
}

