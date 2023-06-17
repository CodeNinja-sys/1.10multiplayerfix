/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a.m;
import com.c.c.b.i;
import com.c.c.d.a.an;
import com.c.c.d.a.s;
import com.c.c.d.e;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class ab
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private k b;
    private i c;
    private final s d;
    private final n e;
    private final int s = 0;
    private final int t = 1;
    private f u;
    private final int v = 2;
    private String w;
    private boolean x;

    public ab(s s2, n n2, i i2) {
        this.d = s2;
        this.e = n2;
        this.c = i2;
    }

    @Override
    public void g() {
        this.b.b();
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.u = ab.a(0, this.r() / 2 - 100, com.c.c.d.e.a(10), ab.f("mco.configure.world.buttons.invite"));
        this.b(this.u);
        this.b(ab.a(1, this.r() / 2 - 100, com.c.c.d.e.a(12), ab.f("gui.cancel")));
        this.b = this.a(2, this.r() / 2 - 100, com.c.c.d.e.a(2), 200, 20);
        this.b.a(true);
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 1: {
                net.minecraft.s.b.a(this.e);
                break;
            }
            case 0: {
                m m2 = com.c.c.a.m.a();
                if (this.b.a() == null || this.b.a().isEmpty()) {
                    return;
                }
                try {
                    i i2 = m2.b(this.c.a, this.b.a());
                    if (i2 != null) {
                        this.c.h = i2.h;
                        net.minecraft.s.b.a(new an(this.d, this.c));
                        break;
                    }
                    this.a(ab.f("mco.configure.world.players.error"));
                }
                catch (Exception exception) {
                    a.b("Couldn't invite user");
                    this.a(ab.f("mco.configure.world.players.error"));
                }
                break;
            }
            default: {
                return;
            }
        }
    }

    private void a(String string) {
        this.x = true;
        this.w = string;
    }

    @Override
    public void a(char c2, int n2) {
        this.b.a(c2, n2);
        if (n2 == 15) {
            if (this.b.c()) {
                this.b.a(false);
            } else {
                this.b.a(true);
            }
        }
        if (n2 == 28 || n2 == 156) {
            this.a(this.u);
        }
        if (n2 == 1) {
            net.minecraft.s.b.a(this.e);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.b.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.b(ab.f("mco.configure.world.invite.profile.name"), this.r() / 2 - 100, com.c.c.d.e.a(1), 0xA0A0A0);
        if (this.x) {
            this.a(this.w, this.r() / 2, com.c.c.d.e.a(5), 0xFF0000);
        }
        this.b.d();
        super.a(n2, n3, f2);
    }
}

