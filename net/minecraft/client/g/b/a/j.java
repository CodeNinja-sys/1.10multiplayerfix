/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Comparator;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.l;

class j
implements Comparator {
    final /* synthetic */ l a;

    j(l l2) {
        this.a = l2;
    }

    public int a(ag ag2, ag ag3) {
        return ag2.toString().compareTo(ag3.toString());
    }

    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((ag)object, (ag)object2);
    }
}

