/*
 * Decompiled with CFR 0.150.
 */
package org.lwjgl.util.d;

import java.util.Iterator;
import org.lwjgl.util.d.g;
import org.lwjgl.util.d.i;

final class f
implements Iterable {
    final i a;
    final int b;

    f(i i2, int n2) {
        this.a = i2;
        this.b = n2;
    }

    public Iterator iterator() {
        return new g(this);
    }
}

