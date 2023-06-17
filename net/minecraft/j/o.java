/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import java.util.Comparator;
import net.minecraft.j.p;

class o
implements Comparator {
    o() {
    }

    public int a(p p2, p p3) {
        return p2.b() > p3.b() ? 1 : (p2.b() < p3.b() ? -1 : p3.d().compareToIgnoreCase(p2.d()));
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((p)object, (p)object2);
    }
}

