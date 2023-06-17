/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.sz;
import java.util.LinkedHashMap;
import net.minecraft.client.g.ac;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.g;
import net.minecraft.g.as;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.u.ad;
import net.minecraft.u.bp;

class x
extends g {
    final /* synthetic */ ac a;

    x(ac ac2) {
        this.a = ac2;
    }

    @Override
    protected ag a(b b2) {
        LinkedHashMap linkedHashMap = sz.c(b2.b());
        if (b2.a(as.b) != ad.b) {
            linkedHashMap.remove(as.a);
        }
        return new ag((bp)cn.v.b(b2.c()), this.a(linkedHashMap));
    }
}

