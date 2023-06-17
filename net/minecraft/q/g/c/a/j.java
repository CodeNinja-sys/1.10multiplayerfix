/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c.a;

import java.util.Iterator;
import net.minecraft.a.p;
import net.minecraft.g.c.b;
import net.minecraft.u.bn;

class j
implements Iterable {
    public static final b a = p.a.v();
    final bn b = new bn(16);
    private int c;

    private j() {
    }

    public int a(b b2) {
        int n2 = this.b.a(b2);
        if (n2 == -1) {
            n2 = this.c++;
            this.b.a(b2, n2);
        }
        return n2;
    }

    public b a(int n2) {
        b b2 = (b)this.b.a(n2);
        return b2 == null ? a : b2;
    }

    public Iterator iterator() {
        return this.b.iterator();
    }

    public void a(b b2, int n2) {
        this.b.a(b2, n2);
    }

    /* synthetic */ j(j j2) {
        this();
    }
}

