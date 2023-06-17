/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import java.util.Map;
import net.minecraft.q.b.q;
import net.minecraft.q.g.c.aj;
import net.minecraft.q.g.c.at;
import net.minecraft.q.g.c.bc;
import net.minecraft.q.g.c.j;
import net.minecraft.u.b.b;
import net.minecraft.u.b.n;

public class bs
extends at {
    private double a = 0.004;

    public bs() {
    }

    @Override
    public String a() {
        return "Mineshaft";
    }

    public bs(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            if (!((String)entry.getKey()).equals("chance")) continue;
            this.a = n.a((String)entry.getValue(), this.a);
        }
    }

    @Override
    protected boolean a(int n2, int n3) {
        return this.f.nextDouble() < this.a && this.f.nextInt(80) < Math.max(Math.abs(n2), Math.abs(n3));
    }

    @Override
    protected j b(int n2, int n3) {
        q q2 = this.g.a(new b((n2 << 4) + 8, 64, (n3 << 4) + 8));
        aj aj2 = q2 instanceof net.minecraft.q.b.aj ? aj.b : aj.a;
        return new bc(this.g, this.f, n2, n3, aj2);
    }
}

