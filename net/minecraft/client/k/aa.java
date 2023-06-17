/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.q.am;
import net.minecraft.u.d.k;
import net.minecraft.u.d.l;

public class aa
extends cc {
    private final cc a;
    private ch b;
    private ch c;
    private String d = "survival";
    private boolean e;

    public aa(cc cc2) {
        this.a = cc2;
    }

    @Override
    public void ct_() {
        this.r.clear();
        this.r.add(new ch(101, this.p / 2 - 155, this.q - 28, 150, 20, net.minecraft.client.f.u.a("lanServer.start", new Object[0])));
        this.r.add(new ch(102, this.p / 2 + 5, this.q - 28, 150, 20, net.minecraft.client.f.u.a("gui.cancel", new Object[0])));
        this.c = this.b(new ch(104, this.p / 2 - 155, 100, 150, 20, net.minecraft.client.f.u.a("selectWorld.gameMode", new Object[0])));
        this.b = this.b(new ch(103, this.p / 2 + 5, 100, 150, 20, net.minecraft.client.f.u.a("selectWorld.allowCommands", new Object[0])));
        this.g();
    }

    private void g() {
        this.c.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.gameMode", new Object[0])) + ": " + net.minecraft.client.f.u.a("selectWorld.gameMode." + this.d, new Object[0]);
        this.b.i = String.valueOf(net.minecraft.client.f.u.a("selectWorld.allowCommands", new Object[0])) + " ";
        this.b.i = this.e ? String.valueOf(this.b.i) + net.minecraft.client.f.u.a("options.on", new Object[0]) : String.valueOf(this.b.i) + net.minecraft.client.f.u.a("options.off", new Object[0]);
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 102) {
            this.n.a(this.a);
        } else if (ch2.j == 104) {
            this.d = "spectator".equals(this.d) ? "creative" : ("creative".equals(this.d) ? "adventure" : ("adventure".equals(this.d) ? "survival" : "spectator"));
            this.g();
        } else if (ch2.j == 103) {
            this.e = !this.e;
            this.g();
        } else if (ch2.j == 101) {
            this.f();
        }
    }

    public void f() {
        this.n.a((cc)null);
        String string = this.n.F().a(am.a(this.d), this.e);
        if (string != null) {
            l l2 = new l("commands.publish.started", string);
        } else {
            k k2 = new k("commands.publish.failed");
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, net.minecraft.client.f.u.a("lanServer.title", new Object[0]), this.p / 2, 50, 0xFFFFFF);
        this.a(this.u, net.minecraft.client.f.u.a("lanServer.otherPlayers", new Object[0]), this.p / 2, 82, 0xFFFFFF);
        super.a(n2, n3, f2);
    }
}

