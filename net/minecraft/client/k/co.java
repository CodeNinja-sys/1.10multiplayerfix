/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.u.d.a;

public class co
extends cc {
    private final String a;
    private final a b;
    private List c;
    private final cc d;
    private int e;

    public co(cc cc2, String string, a a2) {
        this.d = cc2;
        this.a = net.minecraft.client.f.u.a(string, new Object[0]);
        this.b = a2;
    }

    @Override
    protected void a(char c2, int n2) {
    }

    @Override
    public void ct_() {
        this.r.clear();
        this.c = this.u.c(this.b.d(), this.p - 50);
        this.e = this.c.size() * this.u.a;
        this.r.add(new ch(0, this.p / 2 - 100, this.q / 2 + this.e / 2 + this.u.a, net.minecraft.client.f.u.a("gui.toMenu", new Object[0])));
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.j == 0) {
            this.n.a(this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.a, this.p / 2, this.q / 2 - this.e / 2 - this.u.a * 2, 0xAAAAAA);
        int n4 = this.q / 2 - this.e / 2;
        if (this.c != null) {
            for (String string : this.c) {
                this.a(this.u, string, this.p / 2, n4, 0xFFFFFF);
                n4 += this.u.a;
            }
        }
        super.a(n2, n3, f2);
    }
}

