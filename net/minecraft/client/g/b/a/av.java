/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g.b.a;

import java.util.Map;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.m.cy;
import net.minecraft.q.k;
import net.minecraft.u.bp;
import net.minecraft.w.l;

public class av {
    private final bp a;
    private final Map b;

    public av(bp bp2, Map map) {
        this.a = bp2;
        this.b = map;
    }

    public bp a() {
        return this.a;
    }

    boolean a(cu cu2, k k2, l l2) {
        cg cg2 = cu2.a();
        for (Map.Entry entry : this.b.entrySet()) {
            cy cy2 = cg2.a((bp)entry.getKey());
            if (cy2 != null && !(cy2.a(cu2, k2, l2) < ((Float)entry.getValue()).floatValue())) continue;
            return false;
        }
        return true;
    }
}

