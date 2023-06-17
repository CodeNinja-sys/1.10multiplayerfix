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
import net.minecraft.g.el;
import net.minecraft.g.fl;

class ca
extends g {
    final /* synthetic */ ac a;

    ca(ac ac2) {
        this.a = ac2;
    }

    @Override
    protected ag a(b b2) {
        LinkedHashMap linkedHashMap = sz.c(b2.b());
        String string = fl.e.a((el)linkedHashMap.remove(fl.e));
        linkedHashMap.remove(fl.a);
        String string2 = (Boolean)b2.a(fl.a) != false ? "all" : "normal";
        return new ag(String.valueOf(string) + "_double_slab", string2);
    }
}

