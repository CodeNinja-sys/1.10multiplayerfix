/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.a.g;
import net.minecraft.client.k.a.j;
import net.minecraft.client.k.aa;
import net.minecraft.client.k.ai;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.ci;
import net.minecraft.client.k.m;
import net.minecraft.l.k;
import net.minecraft.s.d;

public class ar
extends cc {
    private int a;
    private int b;

    @Override
    public void ct_() {
        this.a = 0;
        this.r.clear();
        int n2 = -16;
        int n3 = 98;
        this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 120 + -16, net.minecraft.client.f.u.a("menu.returnToMenu", new Object[0])));
        if (!this.n.D()) {
            ((ch)this.r.get((int)0)).i = net.minecraft.client.f.u.a("menu.disconnect", new Object[0]);
        }
        this.r.add(new ch(4, this.p / 2 - 100, this.q / 4 + 24 + -16, net.minecraft.client.f.u.a("menu.returnToGame", new Object[0])));
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 96 + -16, 98, 20, net.minecraft.client.f.u.a("menu.options", new Object[0])));
        ch ch2 = this.b(new ch(7, this.p / 2 + 2, this.q / 4 + 96 + -16, 98, 20, net.minecraft.client.f.u.a("menu.shareToLan", new Object[0])));
        ch2.k = this.n.E() && !this.n.F().a();
        this.r.add(new ch(5, this.p / 2 - 100, this.q / 4 + 48 + -16, 98, 20, net.minecraft.client.f.u.a("gui.achievements", new Object[0])));
        this.r.add(new ch(6, this.p / 2 + 2, this.q / 4 + 48 + -16, 98, 20, net.minecraft.client.f.u.a("gui.stats", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        switch (ch2.j) {
            case 0: {
                this.n.a(new m(this, this.n.w));
                break;
            }
            case 1: {
                if (k.e) break;
                boolean bl2 = this.n.D();
                boolean bl3 = this.n.ag();
                ch2.k = false;
                this.n.h.e();
                this.n.a((net.minecraft.client.i.d)null);
                if (bl2) {
                    this.n.a(new ci());
                    break;
                }
                if (bl3) {
                    d d2 = new d();
                    d2.a(new ci());
                    break;
                }
                this.n.a(new ai(new ci()));
            }
            default: {
                break;
            }
            case 4: {
                this.n.a((cc)null);
                this.n.o();
                break;
            }
            case 5: {
                this.n.a(new g(this, this.n.j.y()));
                break;
            }
            case 6: {
                this.n.a(new j(this, this.n.j.y()));
                break;
            }
            case 7: {
                this.n.a(new aa(this));
            }
        }
    }

    @Override
    public void bY_() {
        if (k.g) {
            this.n.a((cc)null);
            this.n.o();
        }
        while (k.d) {
        }
        super.bY_();
        ++this.b;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("menu.game", new Object[0]), this.p / 2, 40, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

