/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import java.util.Comparator;
import net.minecraft.w.n;

public class w
implements Comparator {
    private final n a;

    public w(n n2) {
        this.a = n2;
    }

    public int a(n n2, n n3) {
        double d2;
        double d3 = this.a.n(n2);
        return d3 < (d2 = this.a.n(n3)) ? -1 : (d3 > d2 ? 1 : 0);
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((n)object, (n)object2);
    }
}

