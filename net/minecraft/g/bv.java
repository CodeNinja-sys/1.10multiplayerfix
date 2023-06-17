/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

enum bv implements at
{
    a("up"),
    b("side"),
    c("none");

    private final String d;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bv() {
        void var3_1;
        this.d = var3_1;
    }

    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this.d;
    }
}

