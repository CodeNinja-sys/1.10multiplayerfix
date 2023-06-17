/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.s;
import com.c.c.d.e;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class bb
extends n {
    private s a;
    private i b;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int s = 3;
    private static final int t = 5;
    private final int u = 212;
    private f v;
    private k w;
    private k x;

    public bb(s s2, i i2) {
        this.a = s2;
        this.b = i2;
    }

    @Override
    public void g() {
        this.x.b();
        this.w.b();
        this.v.b(this.x.a() != null && !this.x.a().trim().equals(""));
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        int n2 = this.r() / 2 - 106;
        this.v = bb.a(1, n2 - 2, com.c.c.d.e.a(12), 106, 20, bb.f("mco.configure.world.buttons.done"));
        this.b(this.v);
        this.b(bb.a(0, this.r() / 2 + 2, com.c.c.d.e.a(12), 106, 20, bb.f("gui.cancel")));
        this.b(bb.a(5, this.r() / 2 - 53, com.c.c.d.e.a(0), 106, 20, this.b.e.equals((Object)com.c.c.b.l.b) ? bb.f("mco.configure.world.buttons.close") : bb.f("mco.configure.world.buttons.open")));
        this.x = this.a(2, n2, com.c.c.d.e.a(4), 212, 20);
        this.x.a(true);
        this.x.a(32);
        if (this.b.b() != null) {
            this.x.a(this.b.b());
        }
        this.w = this.a(3, n2, com.c.c.d.e.a(8), 212, 20);
        this.w.a(32);
        if (this.b.a() != null) {
            this.w.a(this.b.a());
        }
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
            case 0: {
                net.minecraft.s.b.a(this.a);
                break;
            }
            case 1: {
                this.b();
                break;
            }
            case 5: {
                if (this.b.e.equals((Object)com.c.c.b.l.b)) {
                    String string = bb.f("mco.configure.world.close.question.line1");
                    String string2 = bb.f("mco.configure.world.close.question.line2");
                    net.minecraft.s.b.a(new ac(this, ad.b, string, string2, true, 5));
                    break;
                }
                this.a.a(false, this);
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(boolean bl2, int n2) {
        switch (n2) {
            case 5: {
                if (bl2) {
                    this.a.a(this);
                    break;
                }
                net.minecraft.s.b.a(this);
            }
        }
    }

    @Override
    public void a(char c2, int n2) {
        this.x.a(c2, n2);
        this.w.a(c2, n2);
        switch (n2) {
            case 15: {
                this.x.a(!this.x.c());
                this.w.a(!this.w.c());
                break;
            }
            case 28: 
            case 156: {
                this.b();
                break;
            }
            case 1: {
                net.minecraft.s.b.a(this.a);
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.w.a(n2, n3, n4);
        this.x.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(bb.f("mco.configure.world.settings.title"), this.r() / 2, 17, 0xFFFFFF);
        this.b(bb.f("mco.configure.world.name"), this.r() / 2 - 106, com.c.c.d.e.a(3), 0xA0A0A0);
        this.b(bb.f("mco.configure.world.description"), this.r() / 2 - 106, com.c.c.d.e.a(7), 0xA0A0A0);
        this.x.d();
        this.w.d();
        super.a(n2, n3, f2);
    }

    public void b() {
        this.a.a(this.x.a(), this.w.a());
    }
}

