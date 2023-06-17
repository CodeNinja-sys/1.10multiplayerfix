/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.a;
import com.c.c.d.a.ae;
import com.c.c.e.o;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class w
extends n {
    private a a;
    private k b;
    private k c;
    private static int d = 0;
    private static int e = 1;
    private static int s = 3;
    private static int t = 4;
    private boolean u = false;
    private f v;

    public w(a a2) {
        this.a = a2;
    }

    @Override
    public void g() {
        if (this.b != null) {
            this.b.b();
            this.v.b(this.c());
        }
        if (this.c != null) {
            this.c.b();
        }
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        if (!this.u) {
            this.u = true;
            this.b = this.a(s, this.r() / 2 - 100, 65, 200, 20);
            this.b.a(true);
            this.c = this.a(t, this.r() / 2 - 100, 115, 200, 20);
        }
        this.v = w.a(d, this.r() / 2 - 100, this.s() / 4 + 120 + 17, 97, 20, w.f("mco.create.world"));
        this.b(this.v);
        this.b(w.a(e, this.r() / 2 + 5, this.s() / 4 + 120 + 17, 95, 20, w.f("gui.cancel")));
        this.v.b(this.c());
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
        if (f2.c() == e) {
            net.minecraft.s.b.a(this.a);
        } else if (f2.c() == d) {
            this.b();
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (this.b != null) {
            this.b.a(c2, n2);
        }
        if (this.c != null) {
            this.c.a(c2, n2);
        }
        switch (n2) {
            case 15: {
                if (this.b != null) {
                    this.b.a(!this.b.c());
                }
                if (this.c == null) break;
                this.c.a(!this.c.c());
                break;
            }
            case 28: 
            case 156: {
                this.a(this.v);
                break;
            }
            case 1: {
                net.minecraft.s.b.a(this.a);
            }
        }
    }

    private void b() {
        if (this.c()) {
            o o2 = new o(this.b.a(), this.c.a(), this.a);
            ae ae2 = new ae(this.a, o2);
            ae2.b();
            net.minecraft.s.b.a(ae2);
        }
    }

    private boolean c() {
        return this.b != null && this.b.a() != null && !this.b.a().trim().equals("");
    }

    @Override
    public void a(int n2, int n3, int n4) {
        if (this.b != null) {
            this.b.a(n2, n3, n4);
        }
        if (this.c != null) {
            this.c.a(n2, n3, n4);
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(w.f("mco.trial.title"), this.r() / 2, 11, 0xFFFFFF);
        this.b(w.f("mco.configure.world.name"), this.r() / 2 - 100, 52, 0xA0A0A0);
        this.b(w.f("mco.configure.world.description"), this.r() / 2 - 100, 102, 0xA0A0A0);
        if (this.b != null) {
            this.b.d();
        }
        if (this.c != null) {
            this.c.d();
        }
        super.a(n2, n3, f2);
    }
}

