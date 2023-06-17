/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import net.minecraft.u.ae;
import net.minecraft.u.at;

public enum bg implements at
{
    a("x"),
    b("y"),
    c("z"),
    d("none");

    private final String e;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private bg() {
        void var3_1;
        this.e = var3_1;
    }

    public String toString() {
        return this.e;
    }

    public static bg a(ae ae2) {
        switch (ae2) {
            case a: {
                return a;
            }
            case b: {
                return b;
            }
            case c: {
                return c;
            }
        }
        return d;
    }

    @Override
    public String a() {
        return this.e;
    }
}

