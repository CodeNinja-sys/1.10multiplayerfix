/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.b.cm;
import net.minecraft.client.f.u;
import net.minecraft.client.i.a;
import net.minecraft.client.i.f;
import net.minecraft.client.k.ad;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.dn;
import org.lwjgl.a.g;

public class ax
extends cc {
    private final cc a;
    private final a b;
    private dn c;
    private dn d;
    private ch e;
    private final cm f = new ad(this);

    public ax(cc cc2, a a2) {
        this.a = cc2;
        this.b = a2;
    }

    @Override
    public void bY_() {
        this.d.a();
        this.c.a();
    }

    @Override
    public void ct_() {
        g.a(true);
        this.r.clear();
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 4 + 96 + 18, net.minecraft.client.f.u.a("addServer.add", new Object[0])));
        this.r.add(new ch(1, this.p / 2 - 100, this.q / 4 + 120 + 18, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.e = this.b(new ch(2, this.p / 2 - 100, this.q / 4 + 72, String.valueOf(net.minecraft.client.f.u.a("addServer.resourcePack", new Object[0])) + ": " + this.b.b().a().d()));
        this.d = new dn(0, this.u, this.p / 2 - 100, 66, 200, 20);
        this.d.b(true);
        this.d.a(this.b.a);
        this.c = new dn(1, this.u, this.p / 2 - 100, 106, 200, 20);
        this.c.f(128);
        this.c.a(this.b.b);
        this.c.a(this.f);
        ((ch)this.r.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0 && !this.d.b().isEmpty();
    }

    @Override
    public void cs_() {
        g.a(false);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            if (ch2.j == 2) {
                this.b.a(net.minecraft.client.i.f.values()[(this.b.b().ordinal() + 1) % net.minecraft.client.i.f.values().length]);
                this.e.i = String.valueOf(net.minecraft.client.f.u.a("addServer.resourcePack", new Object[0])) + ": " + this.b.b().a().d();
            } else if (ch2.j == 1) {
                this.a.a(false, 0);
            } else if (ch2.j == 0) {
                this.b.a = this.d.b();
                this.b.b = this.c.b();
                this.a.a(true, 0);
            }
        }
    }

    @Override
    protected void a(char c2, int n2) {
        this.d.a(c2, n2);
        this.c.a(c2, n2);
        if (n2 == 15) {
            this.d.b(!this.d.k());
            this.c.b(!this.c.k());
        }
        if (n2 == 28 || n2 == 156) {
            this.a((ch)this.r.get(0));
        }
        ((ch)this.r.get((int)0)).k = !this.c.b().isEmpty() && this.c.b().split(":").length > 0 && !this.d.b().isEmpty();
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.c.a(n2, n3, n4);
        this.d.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("addServer.title", new Object[0]), this.p / 2, 17, 0xFFFFFF);
        this.b(this.u, net.minecraft.client.f.u.a("addServer.enterName", new Object[0]), this.p / 2 - 100, 53, 0xA0A0A0);
        this.b(this.u, net.minecraft.client.f.u.a("addServer.enterIp", new Object[0]), this.p / 2 - 100, 94, 0xA0A0A0);
        this.d.g();
        this.c.g();
        super.a(n2, n3, f2);
    }
}

