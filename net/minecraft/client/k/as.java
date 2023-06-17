/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.b.e;
import net.minecraft.client.f.af;
import net.minecraft.client.f.u;
import net.minecraft.client.k.a;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;
import net.minecraft.client.k.cv;

public class as
extends cc {
    protected cc a;
    private a b;
    private final net.minecraft.client.b.a c;
    private final af d;
    private cp e;
    private cp f;

    public as(cc cc2, net.minecraft.client.b.a a2, af af2) {
        this.a = cc2;
        this.c = a2;
        this.d = af2;
    }

    @Override
    public void ct_() {
        this.e = (cp)this.b(new cp(100, this.p / 2 - 155, this.q - 38, net.minecraft.client.b.e.E, this.c.c(net.minecraft.client.b.e.E)));
        this.f = (cp)this.b(new cp(6, this.p / 2 - 155 + 160, this.q - 38, net.minecraft.client.f.u.a("gui.done", new Object[0])));
        this.b = new a(this, this.n);
        this.b.d(7, 8);
        this.b.b();
        this.n.a((cc)null);
    }

    @Override
    public void cp_() {
        super.cp_();
        this.b.cr_();
    }

    @Override
    protected void a(ch ch2) {
        if (ch2.k) {
            switch (ch2.j) {
                case 5: {
                    break;
                }
                case 6: {
                    this.n.a(this.a);
                    break;
                }
                case 100: {
                    if (!(ch2 instanceof cp)) break;
                    this.c.a(((cp)ch2).a(), 1);
                    ch2.i = this.c.c(net.minecraft.client.b.e.E);
                    cv cv2 = new cv(this.n);
                    int n2 = cv2.a();
                    int n3 = cv2.b();
                    this.a(this.n, n2, n3);
                    break;
                }
                default: {
                    this.b.a(ch2);
                }
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.b.a(n2, n3, f2);
        this.a(this.u, net.minecraft.client.f.u.a("options.language", new Object[0]), this.p / 2, 16, 0xFFFFFF);
        this.a(this.u, "(" + net.minecraft.client.f.u.a("options.languageWarning", new Object[0]) + ")", this.p / 2, this.q - 56, 0x808080);
        super.a(n2, n3, f2);
    }

    static /* synthetic */ af a(as as2) {
        return as2.d;
    }

    static /* synthetic */ net.minecraft.client.b.a b(as as2) {
        return as2.c;
    }

    static /* synthetic */ cp c(as as2) {
        return as2.f;
    }

    static /* synthetic */ cp d(as as2) {
        return as2.e;
    }
}

