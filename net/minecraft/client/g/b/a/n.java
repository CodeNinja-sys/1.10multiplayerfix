/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import com.a.a.d.cv;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.u.ce;

class n
extends ce
implements Comparable {
    protected final aq a;

    public n(aq aq2, int n2) {
        super(n2);
        this.a = aq2;
    }

    public int a(n n2) {
        return cv.a().a(n2.d, this.d).b();
    }

    public String toString() {
        return "MyWeighedRandomItem{weight=" + this.d + ", model=" + this.a + '}';
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((n)object);
    }
}

