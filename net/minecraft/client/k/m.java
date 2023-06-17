/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.a;
import net.minecraft.client.b.e;
import net.minecraft.client.f.u;
import net.minecraft.client.k.ab;
import net.minecraft.client.k.aq;
import net.minecraft.client.k.as;
import net.minecraft.client.k.at;
import net.minecraft.client.k.bg;
import net.minecraft.client.k.bq;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cb;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cl;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.d;
import net.minecraft.client.k.da;
import net.minecraft.l.k;
import net.minecraft.q.l;

public class m
extends cc
implements bu {
    private static final e[] b = new e[]{net.minecraft.client.b.e.c};
    private final cc c;
    private final a d;
    private ch e;
    private cl f;
    protected String a = "Options";

    public m(cc cc2, a a2) {
        this.c = cc2;
        this.d = a2;
    }

    @Override
    public void ct_() {
        Enum enum_;
        this.a = net.minecraft.client.f.u.a("options.title", new Object[0]);
        int n2 = 0;
        e[] arre = b;
        int n3 = b.length;
        for (int i2 = 0; i2 < n3; ++i2) {
            enum_ = arre[i2];
            if (((e)enum_).a()) {
                this.r.add(new d(((e)enum_).c(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), (e)enum_));
            } else {
                cp cp2 = new cp(((e)enum_).c(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), (e)enum_, this.d.c((e)enum_));
                this.r.add(cp2);
            }
            ++n2;
        }
        if (this.n.h != null) {
            enum_ = this.n.h.R();
            this.e = new ch(108, this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), 150, 20, this.a((l)enum_));
            this.r.add(this.e);
            if (this.n.E() && !this.n.h.F().s()) {
                this.e.a(this.e.c() - 20);
                this.f = new cl(109, this.e.g + this.e.c(), this.e.h);
                this.r.add(this.f);
                this.f.a(this.n.h.F().I());
                this.f.k = !this.f.a();
                this.e.k = !this.f.a();
            } else {
                this.e.k = false;
            }
        } else {
            this.r.add(new cp(net.minecraft.client.b.e.L.c(), this.p / 2 - 155 + n2 % 2 * 160, this.q / 6 - 12 + 24 * (n2 >> 1), net.minecraft.client.b.e.L, this.d.c(net.minecraft.client.b.e.L)));
        }
        this.r.add(new ch(110, this.p / 2 - 155, this.q / 6 + 48 - 6, 150, 20, net.minecraft.client.f.u.a("options.skinCustomisation", new Object[0])));
        this.r.add(new ch(106, this.p / 2 + 5, this.q / 6 + 48 - 6, 150, 20, net.minecraft.client.f.u.a("options.sounds", new Object[0])));
        this.r.add(new ch(101, this.p / 2 - 155, this.q / 6 + 72 - 6, 150, 20, net.minecraft.client.f.u.a("options.video", new Object[0])));
        this.r.add(new ch(100, this.p / 2 + 5, this.q / 6 + 72 - 6, 150, 20, net.minecraft.client.f.u.a("options.controls", new Object[0])));
        this.r.add(new ch(102, this.p / 2 - 155, this.q / 6 + 96 - 6, 150, 20, net.minecraft.client.f.u.a("options.language", new Object[0])));
        this.r.add(new ch(103, this.p / 2 + 5, this.q / 6 + 96 - 6, 150, 20, net.minecraft.client.f.u.a("options.chat.title", new Object[0])));
        this.r.add(new ch(105, this.p / 2 - 155, this.q / 6 + 120 - 6, 150, 20, net.minecraft.client.f.u.a("options.resourcepack", new Object[0])));
        this.r.add(new ch(104, this.p / 2 + 5, this.q / 6 + 120 - 6, 150, 20, net.minecraft.client.f.u.a("options.snooper.view", new Object[0])));
        this.r.add(new ch(200, this.p / 2 - 100, this.q / 6 + 168, net.minecraft.client.f.u.a("gui.done", new Object[0])));
    }

    public String a(l l2) {
        net.minecraft.u.d.k k2 = new net.minecraft.u.d.k("");
        k2.a(new net.minecraft.u.d.l("options.difficulty", new Object[0]));
        k2.a(": ");
        k2.a(new net.minecraft.u.d.l(l2.b(), new Object[0]));
        return k2.d();
    }

    @Override
    public void a(boolean bl2, int n2) {
        this.n.a(this);
        if (n2 == 109 && bl2 && this.n.h != null) {
            this.n.h.F().g(true);
            this.f.a(true);
            this.f.k = false;
            this.e.k = false;
        }
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j < 100 && ch2 instanceof cp) {
                e e2 = ((cp)ch2).a();
                this.d.a(e2, 1);
                ch2.i = this.d.c(net.minecraft.client.b.e.a(ch2.j));
            }
            if (ch2.j == 108) {
                this.n.h.F().a(l.a(this.n.h.R().a() + 1));
                this.e.i = this.a(this.n.h.R());
            }
            if (ch2.j == 109) {
                this.n.a(new at(this, new net.minecraft.u.d.l("difficulty.lock.title", new Object[0]).d(), new net.minecraft.u.d.l("difficulty.lock.question", new net.minecraft.u.d.l(this.n.h.F().H().b(), new Object[0])).d(), 109));
            }
            if (ch2.j == 110) {
                this.n.w.b();
                this.n.a(new aq(this));
            }
            if (ch2.j == 101) {
                this.n.w.b();
                this.n.a(new bq(this, this.d));
            }
            if (ch2.j == 100) {
                this.n.w.b();
                this.n.a(new ab(this, this.d));
            }
            if (ch2.j == 102) {
                this.n.w.b();
                this.n.a(new as(this, this.d, this.n.Q()));
            }
            if (ch2.j == 103) {
                this.n.w.b();
                this.n.a(new cb(this, this.d));
            }
            if (ch2.j == 104) {
                this.n.w.b();
                this.n.a(new da(this, this.d));
            }
            if (ch2.j == 200) {
                this.n.w.b();
                this.n.a(this.c);
            }
            if (ch2.j == 105) {
                this.n.w.b();
                k.b();
            }
            if (ch2.j == 106) {
                this.n.w.b();
                this.n.a(new bg(this, this.d));
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.a, this.p / 2, 15, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

