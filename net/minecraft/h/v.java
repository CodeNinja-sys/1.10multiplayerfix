/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.h;

import net.minecraft.m.cu;

public class v {
    public static cu a(cu[] arrcu, int n2, int n3) {
        if (n2 >= 0 && n2 < arrcu.length && arrcu[n2] != null && n3 > 0) {
            cu cu2 = arrcu[n2].a(n3);
            if (arrcu[n2].b == 0) {
                arrcu[n2] = null;
            }
            return cu2;
        }
        return null;
    }

    public static cu a(cu[] arrcu, int n2) {
        if (n2 >= 0 && n2 < arrcu.length) {
            cu cu2 = arrcu[n2];
            arrcu[n2] = null;
            return cu2;
        }
        return null;
    }
}

