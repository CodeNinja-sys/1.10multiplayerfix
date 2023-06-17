/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.a.b;

import net.minecraft.e.e;
import net.minecraft.u.a.b;
import net.minecraft.u.a.b.c;

public class d
extends c {
    private final String[] a;

    public d(String string, String ... arrstring) {
        super("id", string);
        this.a = arrstring;
    }

    @Override
    e b(net.minecraft.u.a.d d2, e e2, int n2) {
        String[] arrstring = this.a;
        int n3 = this.a.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            String string = arrstring[i2];
            e2 = b.a(d2, e2, n2, string);
        }
        return e2;
    }
}

