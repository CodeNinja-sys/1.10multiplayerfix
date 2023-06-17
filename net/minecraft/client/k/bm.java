/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cs;
import net.minecraft.client.k.cy;
import net.minecraft.client.k.q;
import net.minecraft.q.g.k;

public class bm
extends cc {
    private final cs a;
    private k b = k.e();
    private String c;
    private String d;
    private String e;
    private q f;
    private ch g;
    private ch h;
    private ch i;

    public bm(cs cs2, String string) {
        this.a = cs2;
        this.a(string);
    }

    public String f() {
        return this.b.toString();
    }

    public void a(String string) {
        this.b = k.a(string);
    }

    @Override
    public void ct_() {
        this.r.clear();
        this.c = net.minecraft.client.f.u.a("createWorld.customize.flat.title", new Object[0]);
        this.d = net.minecraft.client.f.u.a("createWorld.customize.flat.tile", new Object[0]);
        this.e = net.minecraft.client.f.u.a("createWorld.customize.flat.height", new Object[0]);
        this.f = new q(this);
        this.g = this.b(new ch(2, this.p / 2 - 154, this.q - 52, 100, 20, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.flat.addLayer", new Object[0])) + " (NYI)"));
        this.h = this.b(new ch(3, this.p / 2 - 50, this.q - 52, 100, 20, String.valueOf(net.minecraft.client.f.u.a("createWorld.customize.flat.editLayer", new Object[0])) + " (NYI)"));
        this.i = this.b(new ch(4, this.p / 2 - 155, this.q - 52, 150, 20, net.minecraft.client.f.u.a("createWorld.customize.flat.removeLayer", new Object[0])));
        this.r.add(new ch(0, this.p / 2 - 155, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.r.add(new ch(5, this.p / 2 + 5, this.q - 52, 150, 20, net.minecraft.client.f.u.a("createWorld.customize.presets", new Object[0])));
        this.r.add(new ch(1, this.p / 2 + 5, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.g.l = false;
        this.h.l = false;
        this.b.d();
        this.g();
    }

    @Override
    public void cp_() {
        super.cp_();
        this.f.cr_();
    }

    @Override
    protected void a(ch ch2) {
        int n2 = this.b.c().size() - this.f.a - 1;
        if (ch2.j == 1) {
            this.n.a(this.a);
        } else if (ch2.j == 0) {
            this.a.a = this.f();
            this.n.a(this.a);
        } else if (ch2.j == 5) {
            this.n.a(new cy(this));
        } else if (ch2.j == 4 && this.h()) {
            this.b.c().remove(n2);
            this.f.a = Math.min(this.f.a, this.b.c().size() - 1);
        }
        this.b.d();
        this.g();
    }

    public void g() {
        boolean bl2;
        this.i.k = bl2 = this.h();
        this.h.k = bl2;
        this.h.k = false;
        this.g.k = false;
    }

    private boolean h() {
        return this.f.a > -1 && this.f.a < this.b.c().size();
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.f.a(n2, n3, f2);
        this.a(this.u, this.c, this.p / 2, 8, 0xFFFFFF);
        int n4 = this.p / 2 - 92 - 16;
        this.b(this.u, this.d, n4, 32, 0xFFFFFF);
        this.b(this.u, this.e, n4 + 2 + 213 - this.u.a(this.e), 32, 0xFFFFFF);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ k a(bm bm2) {
        return bm2.b;
    }
}

