/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.sz;
import java.util.LinkedHashMap;
import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.g;
import net.minecraft.g.c.b;
import net.minecraft.g.eg;
import net.minecraft.g.ic;

class p
extends g {
    final /* synthetic */ ac a;

    p(ac ac2) {
        this.a = ac2;
    }

    @Override
    protected ag a(b b2) {
        LinkedHashMap linkedHashMap = sz.c(b2.b());
        String string = eg.a.a((ic)linkedHashMap.remove(eg.a));
        if (ic.c != b2.a(eg.a)) {
            linkedHashMap.remove(eg.b);
        }
        return new ag(string, this.a(linkedHashMap));
    }
}

