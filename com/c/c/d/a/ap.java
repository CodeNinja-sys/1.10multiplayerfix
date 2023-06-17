/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.aq;
import com.c.c.d.a.au;
import com.c.c.d.e;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.k;
import net.minecraft.s.n;
import org.lwjgl.a.g;

public class ap
extends n {
    private aq b;
    private k c;
    private Boolean d = true;
    private Integer e = 0;
    String[] a;
    private final int s = 0;
    private final int t = 1;
    private static final int u = 2;
    private static final int v = 3;
    private final int w = 4;
    private f x;
    private f y;
    private f z;
    private String A = ap.f("mco.backup.button.reset");

    public ap(aq aq2) {
        this.b = aq2;
    }

    public ap(aq aq2, String string) {
        this(aq2);
        this.A = string;
    }

    @Override
    public void g() {
        this.c.b();
        super.g();
    }

    @Override
    public void d() {
        this.a = new String[]{ap.f("generator.default"), ap.f("generator.flat"), ap.f("generator.largeBiomes"), ap.f("generator.amplified")};
        org.lwjgl.a.g.a(true);
        this.u();
        this.b(ap.a(0, this.r() / 2 + 8, com.c.c.d.e.a(12), 97, 20, ap.f("gui.back")));
        this.x = ap.a(1, this.r() / 2 - 102, com.c.c.d.e.a(12), 97, 20, this.A);
        this.b(this.x);
        this.c = this.a(4, this.r() / 2 - 100, com.c.c.d.e.a(2), 200, 20);
        this.c.a(true);
        this.c.a(32);
        this.c.a("");
        this.y = ap.a(2, this.r() / 2 - 102, com.c.c.d.e.a(4), 205, 20, this.b());
        this.b(this.y);
        this.z = ap.a(3, this.r() / 2 - 102, com.c.c.d.e.a(6) - 2, 205, 20, this.c());
        this.b(this.z);
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(char c2, int n2) {
        this.c.a(c2, n2);
        if (n2 == 28 || n2 == 156) {
            this.a(this.x);
        }
        if (n2 == 1) {
            net.minecraft.s.b.a(this.b);
        }
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        switch (f2.c()) {
            case 0: {
                net.minecraft.s.b.a(this.b);
                break;
            }
            case 1: {
                this.b.a(new au(this.c.a(), this.e, this.d));
                break;
            }
            case 2: {
                this.e = (this.e + 1) % this.a.length;
                f2.a(this.b());
                break;
            }
            case 3: {
                this.d = this.d == false;
                f2.a(this.c());
                break;
            }
            default: {
                return;
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        this.c.a(n2, n3, n4);
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.a(ap.f("mco.reset.world.generate"), this.r() / 2, 17, 0xFFFFFF);
        this.b(ap.f("mco.reset.world.seed"), this.r() / 2 - 100, com.c.c.d.e.a(1), 0xA0A0A0);
        this.c.d();
        super.a(n2, n3, f2);
    }

    private String b() {
        String string = ap.f("selectWorld.mapType");
        return string + " " + this.a[this.e];
    }

    private String c() {
        return ap.f("selectWorld.mapFeatures") + " " + (this.d != false ? ap.f("mco.configure.world.on") : ap.f("mco.configure.world.off"));
    }
}

