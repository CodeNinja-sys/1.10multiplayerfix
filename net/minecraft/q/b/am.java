/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.b;

import net.minecraft.u.ce;

public class am
extends ce {
    public Class a;
    public int b;
    public int c;

    public am(Class class_, int n2, int n3, int n4) {
        super(n2);
        this.a = class_;
        this.b = n3;
        this.c = n4;
    }

    public String toString() {
        return String.valueOf(this.a.getSimpleName()) + "*(" + this.b + "-" + this.c + "):" + this.d;
    }
}

