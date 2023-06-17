/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.Arrays;
import java.util.List;
import net.minecraft.a.i;
import net.minecraft.a.w;
import net.minecraft.client.f.u;
import net.minecraft.client.k.bm;
import net.minecraft.client.k.by;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import net.minecraft.client.k.p;
import net.minecraft.g.t;
import net.minecraft.m.cg;
import net.minecraft.q.b.q;
import net.minecraft.q.g.e;
import net.minecraft.q.g.k;
import org.lwjgl.a.g;

public class cy
extends cc {
    private static final List a = ov.a();
    private final bm b;
    private String c;
    private String d;
    private String e;
    private by f;
    private ch g;
    private dn h;

    static {
        cy.a("Classic Flat", cg.a(net.minecraft.a.p.c), i.c, Arrays.asList("village"), new e(1, net.minecraft.a.p.c), new e(2, net.minecraft.a.p.d), new e(1, net.minecraft.a.p.h));
        cy.a("Tunnelers' Dream", cg.a(net.minecraft.a.p.b), i.e, Arrays.asList("biome_1", "dungeon", "decoration", "stronghold", "mineshaft"), new e(1, net.minecraft.a.p.c), new e(5, net.minecraft.a.p.d), new e(230, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("Water World", w.az, i.z, Arrays.asList("biome_1", "oceanmonument"), new e(90, net.minecraft.a.p.j), new e(5, net.minecraft.a.p.m), new e(5, net.minecraft.a.p.d), new e(5, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("Overworld", cg.a(net.minecraft.a.p.H), net.minecraft.g.t.b.b(), i.c, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon", "lake", "lava_lake"), new e(1, net.minecraft.a.p.c), new e(3, net.minecraft.a.p.d), new e(59, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("Snowy Kingdom", cg.a(net.minecraft.a.p.aH), i.n, Arrays.asList("village", "biome_1"), new e(1, net.minecraft.a.p.aH), new e(1, net.minecraft.a.p.c), new e(3, net.minecraft.a.p.d), new e(59, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("Bottomless Pit", w.I, i.c, Arrays.asList("village", "biome_1"), new e(1, net.minecraft.a.p.c), new e(3, net.minecraft.a.p.d), new e(2, net.minecraft.a.p.e));
        cy.a("Desert", cg.a(net.minecraft.a.p.m), i.d, Arrays.asList("village", "biome_1", "decoration", "stronghold", "mineshaft", "dungeon"), new e(8, net.minecraft.a.p.m), new e(52, net.minecraft.a.p.A), new e(3, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("Redstone Ready", w.aE, i.d, new e(52, net.minecraft.a.p.A), new e(3, net.minecraft.a.p.b), new e(1, net.minecraft.a.p.h));
        cy.a("The Void", cg.a(net.minecraft.a.p.cv), i.P, Arrays.asList("decoration"), new e(1, net.minecraft.a.p.a));
    }

    public cy(bm bm2) {
        this.b = bm2;
    }

    @Override
    public void ct_() {
        this.r.clear();
        org.lwjgl.a.g.a(true);
        this.c = net.minecraft.client.f.u.a("createWorld.customize.presets.title", new Object[0]);
        this.d = net.minecraft.client.f.u.a("createWorld.customize.presets.share", new Object[0]);
        this.e = net.minecraft.client.f.u.a("createWorld.customize.presets.list", new Object[0]);
        this.h = new dn(2, this.u, 50, 40, this.p - 100, 20);
        this.f = new by(this);
        this.h.f(1230);
        this.h.a(this.b.f());
        this.g = this.b(new ch(0, this.p / 2 - 155, this.q - 28, 150, 20, net.minecraft.client.f.u.a("createWorld.customize.presets.select", new Object[0])));
        this.r.add(new ch(1, this.p / 2 + 5, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.f();
    }

    @Override
    public void cp_() {
        super.cp_();
        this.f.cr_();
    }

    @Override
    public void cs_() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        this.h.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(char c2, int n2) {
        if (!this.h.a(c2, n2)) {
            super.a(c2, n2);
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0 && this.h()) {
            this.b.a(this.h.b());
            this.n.a(this.b);
        } else if (ch2.j == 1) {
            this.n.a(this.b);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.f.a(n2, n3, f2);
        this.a(this.u, this.c, this.p / 2, 8, 0xFFFFFF);
        this.b(this.u, this.d, 50, 30, 0xA0A0A0);
        this.b(this.u, this.e, 50, 70, 0xA0A0A0);
        this.h.g();
        super.a(n2, n3, f2);
    }

    @Override
    public void bY_() {
        this.h.a();
        super.bY_();
    }

    public void f() {
        this.g.k = this.h();
    }

    private boolean h() {
        return this.f.a > -1 && this.f.a < a.size() || this.h.b().length() > 1;
    }

    private static void a(String string, cg cg2, q q2, e ... arre) {
        cy.a(string, cg2, 0, q2, null, arre);
    }

    private static void a(String string, cg cg2, q q2, List list, e ... arre) {
        cy.a(string, cg2, 0, q2, list, arre);
    }

    private static void a(String string, cg cg2, int n2, q q2, List list, e ... arre) {
        k k2 = new k();
        for (int i2 = arre.length - 1; i2 >= 0; --i2) {
            k2.c().add(arre[i2]);
        }
        k2.a(net.minecraft.q.b.q.a(q2));
        k2.d();
        if (list != null) {
            for (String string2 : list) {
                k2.b().put(string2, sz.c());
            }
        }
        a.add(new p(cg2, n2, string, k2.toString()));
    }

    static /* synthetic */ List g() {
        return a;
    }

    static /* synthetic */ dn a(cy cy2) {
        return cy2.h;
    }

    static /* synthetic */ by b(cy cy2) {
        return cy2.f;
    }
}

