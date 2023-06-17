/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.a;

import net.minecraft.client.a.bp;
import net.minecraft.q.k;

public class q
extends bp {
    protected q(k k2, double d2, double d3, double d4, double d5, double d6, double d7) {
        super(k2, d2, d3, d4);
        this.z = 0.04f;
        this.g();
        if (d6 == 0.0 && (d5 != 0.0 || d7 != 0.0)) {
            this.j = d5;
            this.k = d6 + 0.1;
            this.l = d7;
        }
    }
}

