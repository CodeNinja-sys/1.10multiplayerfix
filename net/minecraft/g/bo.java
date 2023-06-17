/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.g;

import java.util.List;
import java.util.Random;
import net.minecraft.a.p;
import net.minecraft.g.a.e;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.c.i;
import net.minecraft.g.cn;
import net.minecraft.g.db;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.u.d.b.a;
import net.minecraft.v.d;

public class bo
extends cn {
    public static final net.minecraft.g.b.e a = net.minecraft.g.b.e.a("variant", db.class);

    public bo() {
        super(h.e);
        this.z(this.O.b().a(a, (Comparable)((Object)db.a)));
        this.a(d.b);
    }

    @Override
    public String bV_() {
        return net.minecraft.u.d.b.a.a(String.valueOf(this.p()) + "." + db.a.d() + ".name");
    }

    @Override
    public e g(b b2) {
        return ((db)((Object)b2.a(a))).c();
    }

    @Override
    public cg a(b b2, Random random, int n2) {
        return b2.a(a) == db.a ? cg.a(p.e) : cg.a(p.b);
    }

    @Override
    public int k(b b2) {
        return ((db)((Object)b2.a(a))).b();
    }

    @Override
    public void a(cg cg2, d d2, List list) {
        for (db db2 : db.values()) {
            list.add(new cu(cg2, 1, db2.b()));
        }
    }

    @Override
    public b a(int n2) {
        return this.v().a(a, (Comparable)((Object)db.a(n2)));
    }

    @Override
    public int b(b b2) {
        return ((db)((Object)b2.a(a))).b();
    }

    @Override
    protected i a() {
        return new i(this, a);
    }
}

