/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a;
import com.c.c.b.i;
import com.c.c.d.a.ae;
import com.c.c.d.a.aq;
import com.c.c.e.p;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class v
extends n {
    private final i a;
    private a b;
    private k c;
    private k d;
    private static int e = 0;
    private static int s = 1;
    private static int t = 3;
    private static int u = 4;
    private f v;

    public v(i i2, a a2) {
        this.a = i2;
        this.b = a2;
    }

    @Override
    public void g() {
        if (this.c != null) {
            this.c.b();
        }
        if (this.d != null) {
            this.d.b();
        }
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        this.v = com.c.c.d.a.v.a(e, this.r() / 2 - 100, this.s() / 4 + 120 + 17, 97, 20, com.c.c.d.a.v.f("mco.create.world"));
        this.b(this.v);
        this.b(com.c.c.d.a.v.a(s, this.r() / 2 + 5, this.s() / 4 + 120 + 17, 95, 20, com.c.c.d.a.v.f("gui.cancel")));
        this.v.b(false);
        this.c = this.a(t, this.r() / 2 - 100, 65, 200, 20);
        this.c.a(true);
        this.d = this.a(u, this.r() / 2 - 100, 115, 200, 20);
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
        if (f2.c() == s) {
            net.minecraft.s.b.a(this.b);
        } else if (f2.c() == e) {
            this.b();
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (this.c != null) {
            this.c.a(c2, n2);
        }
        if (this.d != null) {
            this.d.a(c2, n2);
        }
        this.v.b(this.c());
        switch (n2) {
            case 15: {
                if (this.c != null) {
                    this.c.a(!this.c.c());
                }
                if (this.d == null) break;
                this.d.a(!this.d.c());
                break;
            }
            case 28: 
            case 156: {
                this.a(this.v);
                break;
            }
            case 1: {
                net.minecraft.s.b.a(this.b);
            }
        }
    }

    private void b() {
        if (this.c()) {
            aq aq2 = new aq(this.b, this.a, this.b.j(), com.c.c.d.a.v.f("mco.selectServer.create"), com.c.c.d.a.v.f("mco.create.world.subtitle"), 0xA0A0A0, com.c.c.d.a.v.f("mco.create.world.skip"));
            aq2.a(com.c.c.d.a.v.f("mco.create.world.reset.title"));
            p p2 = new p(this.a.a, this.c.a(), this.d.a(), aq2);
            ae ae2 = new ae(this.b, p2);
            ae2.b();
            net.minecraft.s.b.a(ae2);
        }
    }

    private boolean c() {
        return this.c.a() != null && !this.c.a().trim().equals("");
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.c != null) {
            this.c.a(n2, n3, n4);
        }
        if (this.d != null) {
            this.d.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(com.c.c.d.a.v.f("mco.selectServer.create"), this.r() / 2, 11, 0xFFFFFF);
        this.b(com.c.c.d.a.v.f("mco.configure.world.name"), this.r() / 2 - 100, 52, 0xA0A0A0);
        this.b(com.c.c.d.a.v.f("mco.configure.world.description"), this.r() / 2 - 100, 102, 0xA0A0A0);
        if (this.c != null) {
            this.c.d();
        }
        if (this.d != null) {
            this.d.d();
        }
        super.a(n2, n3, f2);
    }
}

