/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.c;

import net.minecraft.u.c.e;

public class b
extends e {
    private final Object a;

    public b(Object object) {
        this.a = object;
    }

    @Override
    public Object a(Object object) {
        Object object2 = super.a(object);
        return object2 == null ? this.a : object2;
    }
}

