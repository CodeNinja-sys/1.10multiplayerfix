/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.at;

public enum gp implements at
{
    a,
    b;


    public String toString() {
        return this.a();
    }

    @Override
    public String a() {
        return this == a ? "upper" : "lower";
    }
}

