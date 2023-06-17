/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.aq;
import net.minecraft.client.k.ch;
import net.minecraft.w.a.j;

class k
extends ch {
    private final j b;
    final /* synthetic */ aq a;

    private k(aq aq2, int n2, int n3, int n4, int n5, int n6, j j2) {
        this.a = aq2;
        super(n2, n3, n4, n5, n6, aq.a(aq2, j2));
        this.b = j2;
    }

    /* synthetic */ k(aq aq2, int n2, int n3, int n4, int n5, int n6, j j2, k k2) {
        this(aq2, n2, n3, n4, n5, n6, j2);
    }

    static /* synthetic */ j a(k k2) {
        return k2.b;
    }
}

