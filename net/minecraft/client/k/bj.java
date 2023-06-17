/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.f.u;
import net.minecraft.client.k.at;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.ch;

public class bj
extends at {
    private final String f;
    private final String g;
    private final String h;
    private boolean i = true;

    public bj(bu bu2, String string, int n2, boolean bl2) {
        super(bu2, net.minecraft.client.f.u.a(bl2 ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), string, n2);
        this.c = net.minecraft.client.f.u.a(bl2 ? "chat.link.open" : "gui.yes", new Object[0]);
        this.d = net.minecraft.client.f.u.a(bl2 ? "gui.cancel" : "gui.no", new Object[0]);
        this.g = net.minecraft.client.f.u.a("chat.copy", new Object[0]);
        this.f = net.minecraft.client.f.u.a("chat.link.warning", new Object[0]);
        this.h = string;
    }

    @Override
    public void ct_() {
        super.ct_();
        this.r.clear();
        this.r.add(new ch(0, this.p / 2 - 50 - 105, this.q / 6 + 96, 100, 20, this.c));
        this.r.add(new ch(2, this.p / 2 - 50, this.q / 6 + 96, 100, 20, this.g));
        this.r.add(new ch(1, this.p / 2 - 50 + 105, this.q / 6 + 96, 100, 20, this.d));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 2) {
            this.f();
        }
        this.a.a(ch2.j == 0, this.e);
    }

    public void f() {
        bj.d(this.h);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        super.a(n2, n3, f2);
        if (this.i) {
            this.a(this.u, this.f, this.p / 2, 110, 0xFFCCCC);
        }
    }

    public void g() {
        this.i = false;
    }
}

