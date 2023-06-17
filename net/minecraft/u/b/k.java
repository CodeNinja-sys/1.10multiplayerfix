/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.u.b;

import java.util.Collections;
import java.util.Iterator;
import net.minecraft.u.b.i;
import net.minecraft.u.b.l;

class k
implements Iterable {
    private final Class a;
    private final Iterable[] b;

    private k(Class class_, Iterable[] arriterable) {
        this.a = class_;
        this.b = arriterable;
    }

    public Iterator iterator() {
        return this.b.length <= 0 ? Collections.singletonList(i.a(this.a, 0)).iterator() : new l(this.a, this.b, null);
    }

    /* synthetic */ k(Class class_, Iterable[] arriterable, k k2) {
        this(class_, arriterable);
    }
}

