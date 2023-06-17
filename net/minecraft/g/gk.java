/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum gk implements at
{
    a("compare"),
    b("subtract");

    private final String c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private gk() {
        void var3_1;
        this.c = var3_1;
    }

    public String toString() {
        return this.c;
    }

    @Override
    public String a() {
        return this.c;
    }
}

