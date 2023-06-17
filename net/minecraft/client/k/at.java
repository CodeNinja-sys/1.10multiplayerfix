/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import com.a.a.d.ov;
import java.util.List;
import net.minecraft.client.f.u;
import net.minecraft.client.k.bu;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.ch;
import net.minecraft.client.k.cp;

public class at
extends cc {
    protected bu a;
    protected String b;
    private final String f;
    private final List g = ov.a();
    protected String c;
    protected String d;
    protected int e;
    private int h;

    public at(bu bu2, String string, String string2, int n2) {
        this.a = bu2;
        this.b = string;
        this.f = string2;
        this.e = n2;
        this.c = net.minecraft.client.f.u.a("gui.yes", new Object[0]);
        this.d = net.minecraft.client.f.u.a("gui.no", new Object[0]);
    }

    public at(bu bu2, String string, String string2, String string3, String string4, int n2) {
        this.a = bu2;
        this.b = string;
        this.f = string2;
        this.c = string3;
        this.d = string4;
        this.e = n2;
    }

    @Override
    public void ct_() {
        this.r.add(new cp(0, this.p / 2 - 155, this.q / 6 + 96, this.c));
        this.r.add(new cp(1, this.p / 2 - 155 + 160, this.q / 6 + 96, this.d));
        this.g.clear();
        this.g.addAll(this.u.c(this.f, this.p - 50));
    }

    @Override
    protected void a(ch ch2) {
        this.a.a(ch2.j == 0, this.e);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.m();
        this.a(this.u, this.b, this.p / 2, 70, 0xFFFFFF);
        int n4 = 90;
        for (String string : this.g) {
            this.a(this.u, string, this.p / 2, n4, 0xFFFFFF);
            n4 += this.u.a;
        }
        super.a(n2, n3, f2);
    }

    public void a(int n2) {
        this.h = n2;
        for (ch ch2 : this.r) {
            ch2.k = false;
        }
    }

    @Override
    public void bY_() {
        super.bY_();
        if (--this.h == 0) {
            for (ch ch2 : this.r) {
                ch2.k = true;
            }
        }
    }
}

