/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.b;

import net.minecraft.u.a.b;
import net.minecraft.u.a.b.c;
import net.minecraft.u.a.d;

public class e
extends c {
    private final String[] a;

    public e(String string, String ... arrstring) {
        super("id", string);
        this.a = arrstring;
    }

    @Override
    net.minecraft.e.e b(d d2, net.minecraft.e.e e2, int n2) {
        String[] arrstring = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            String string = arrstring[i2];
            e2 = b.b(d2, e2, n2, string);
        }
        return e2;
    }
}

