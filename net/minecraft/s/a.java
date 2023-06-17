/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.s;

import java.util.List;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.n;

public class a
extends n {
    private final String a;
    private final net.minecraft.u.d.a b;
    private List c;
    private final n d;
    private int e;

    public a(n n2, String string, net.minecraft.u.d.a a2) {
        this.d = n2;
        this.a = net.minecraft.s.a.f(string);
        this.b = a2;
    }

    @Override
    public void d() {
        net.minecraft.s.b.a(false);
        net.minecraft.s.b.n();
        this.u();
        this.c = this.a(this.b.d(), this.r() - 50);
        this.e = this.c.size() * this.t();
        this.b(net.minecraft.s.a.a(0, this.r() / 2 - 100, this.s() / 2 + this.e / 2 + this.t(), net.minecraft.s.a.f("gui.back")));
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.d);
        }
    }

    @Override
    public void a(f f2) {
        if (f2.c() == 0) {
            net.minecraft.s.b.a(this.d);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(this.a, this.r() / 2, this.s() / 2 - this.e / 2 - this.t() * 2, 0xAAAAAA);
        int n4 = this.s() / 2 - this.e / 2;
        if (this.c != null) {
            for (String string : this.c) {
                this.a(string, this.r() / 2, n4, 0xFFFFFF);
                n4 += this.t();
            }
        }
        super.a(n2, n3, f2);
    }
}

