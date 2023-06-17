/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.g;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.client.g.a.d;
import net.minecraft.client.g.b.a.ag;
import net.minecraft.client.g.b.a.aq;
import net.minecraft.client.g.b.a.g;
import net.minecraft.client.g.br;
import net.minecraft.m.cg;
import net.minecraft.m.cu;

public class aw {
    private final Map a = sz.c();
    private final Map b = sz.c();
    private final Map c = sz.c();
    private final g d;

    public aw(g g2) {
        this.d = g2;
    }

    public d a(cg cg2) {
        return this.a(cg2, 0);
    }

    public d a(cg cg2, int n2) {
        return this.a(new cu(cg2, 1, n2)).d();
    }

    public aq a(cu cu2) {
        br br2;
        cg cg2 = cu2.a();
        aq aq2 = this.b(cg2, this.b(cu2));
        if (aq2 == null && (br2 = (br)this.c.get(cg2)) != null) {
            aq2 = this.d.a(br2.a(cu2));
        }
        if (aq2 == null) {
            aq2 = this.d.a();
        }
        return aq2;
    }

    protected int b(cu cu2) {
        return cu2.i() > 0 ? 0 : cu2.h();
    }

    protected aq b(cg cg2, int n2) {
        return (aq)this.b.get(this.c(cg2, n2));
    }

    private int c(cg cg2, int n2) {
        return cg.a(cg2) << 16 | n2;
    }

    public void a(cg cg2, int n2, ag ag2) {
        this.a.put(this.c(cg2, n2), ag2);
        this.b.put(this.c(cg2, n2), this.d.a(ag2));
    }

    public void a(cg cg2, br br2) {
        this.c.put(cg2, br2);
    }

    public g a() {
        return this.d;
    }

    public void b() {
        this.b.clear();
        for (Map.Entry entry : this.a.entrySet()) {
            this.b.put((Integer)entry.getKey(), this.d.a((ag)entry.getValue()));
        }
    }
}

