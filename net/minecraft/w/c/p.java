/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.c;

public enum p {
    a,
    b,
    c;


    public static p a(int n2) {
        if (n2 < 0 || n2 > p.values().length) {
            n2 = 0;
        }
        return p.values()[n2];
    }
}

