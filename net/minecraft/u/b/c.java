/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import java.util.Iterator;
import net.minecraft.u.b.b;
import net.minecraft.u.b.d;

class c
implements Iterable {
    private final /* synthetic */ b a;
    private final /* synthetic */ b b;

    c(b b2, b b3) {
        this.a = b2;
        this.b = b3;
    }

    public Iterator iterator() {
        return new d(this, this.a, this.b);
    }
}

