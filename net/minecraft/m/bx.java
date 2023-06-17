/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.m;

import net.minecraft.g.cn;
import net.minecraft.m.da;

public class bx
extends da {
    public bx(cn cn2) {
        super(cn2, cn2, new String[]{"intact", "slightlyDamaged", "veryDamaged"});
    }

    @Override
    public int a(int n2) {
        return n2 << 2;
    }
}

