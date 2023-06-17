/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

public enum aj {
    a,
    b;


    public static aj a(int n2) {
        return n2 >= 0 && n2 < aj.values().length ? aj.values()[n2] : a;
    }
}

