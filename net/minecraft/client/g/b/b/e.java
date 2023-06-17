/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.b;

import com.a.a.d.sz;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.b.g;
import net.minecraft.g.b.b;
import net.minecraft.g.cn;
import net.minecraft.u.bp;

public class e
extends g {
    private final b a;
    private final String c;
    private final List d;

    private e(b b2, String string, List list) {
        this.a = b2;
        this.c = string;
        this.d = list;
    }

    @Override
    protected ag a(net.minecraft.g.c.b b2) {
        LinkedHashMap linkedHashMap = sz.c(b2.b());
        String string = this.a == null ? ((bp)cn.v.b(b2.c())).toString() : this.a(this.a, linkedHashMap);
        if (this.c != null) {
            string = String.valueOf(string) + this.c;
        }
        for (b b3 : this.d) {
            linkedHashMap.remove(b3);
        }
        return new ag(string, this.a(linkedHashMap));
    }

    private String a(b b2, Map map) {
        return b2.a((Comparable)map.remove(this.a));
    }

    /* synthetic */ e(b b2, String string, List list, e e2) {
        this(b2, string, list);
    }
}

