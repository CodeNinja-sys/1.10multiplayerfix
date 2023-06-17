/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.d;

import net.minecraft.u.d.l;

public class m
extends IllegalArgumentException {
    public m(l l2, String string) {
        super(String.format("Error parsing: %s: %s", l2, string));
    }

    public m(l l2, int n2) {
        super(String.format("Invalid index %d requested for %s", n2, l2));
    }

    public m(l l2, Throwable throwable) {
        super(String.format("Error while parsing: %s", l2), throwable);
    }
}

