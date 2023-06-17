/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.g.ay;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import net.minecraft.q.a.d;
import net.minecraft.q.a.w;
import org.apache.commons.b.o;
import org.lwjgl.a.g;

public class aj
extends cc {
    private final cc a;
    private dn b;
    private final String c;

    public aj(cc cc2, String string) {
        this.a = cc2;
        this.c = string;
    }

    @Override
    public void bY_() {
        this.b.a();
    }

    @Override
    public void ct_() {
        g.a(true);
        this.r.clear();
        ch ch2 = this.b(new ch(3, this.p / 2 - 100, this.q / 4 + 24 + 12, net.minecraft.client.f.u.a("selectWorld.edit.resetIcon", new Object[0])));
        this.r.add(new ch(4, this.p / 2 - 100, this.q / 4 + 48 + 12, net.minecraft.client.f.u.a("selectWorld.edit.openFolder", new Object[0])));
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 96 + 12, net.minecraft.client.f.u.a("selectWorld.edit.save", new Object[0])));
        this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 120 + 12, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        ch2.k = this.n.g().b(this.c, "icon.png").isFile();
        w w2 = this.n.g();
        d d2 = w2.a(this.c);
        String string = d2.i();
        this.b = new dn(2, this.u, this.p / 2 - 100, 60, 200, 20);
        this.b.b(true);
        this.b.a(string);
    }

    @Override
    public void cs_() {
        g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 1) {
                this.n.a(this.a);
            } else if (ch2.j == 0) {
                w w2 = this.n.g();
                w2.a(this.c, this.b.b().trim());
                this.n.a(this.a);
            } else if (ch2.j == 3) {
                w w3 = this.n.g();
                org.apache.commons.b.o.e(w3.b(this.c, "icon.png"));
                ch2.k = false;
            } else if (ch2.j == 4) {
                w w4 = this.n.g();
                ay.a(w4.b(this.c, "icon.png").getParentFile());
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.b.a(c2, n2);
        boolean bl2 = ((ch)this.r.get((int)2)).k = !this.b.b().trim().isEmpty();
        if (n2 == 28 || n2 == 156) {
            this.a((ch)this.r.get(2));
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.b.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("selectWorld.edit.title", new Object[0]), this.p / 2, 20, 0xFFFFFF);
        this.b(this.u, net.minecraft.client.f.u.a("selectWorld.enterName", new Object[0]), this.p / 2 - 100, 47, 0xA0A0A0);
        this.b.g();
        super.a(n2, n3, f2);
    }
}

