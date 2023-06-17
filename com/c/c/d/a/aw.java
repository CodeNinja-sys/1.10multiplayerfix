/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.aa;
import com.c.c.d.a.aq;
import com.c.c.d.a.ax;
import com.c.c.d.a.bh;
import com.c.c.d.e;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.minecraft.s.b;
import net.minecraft.s.f;
import net.minecraft.s.l;
import net.minecraft.s.n;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;

public class aw
extends n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final int b = 1;
    private static final int c = 2;
    private final aq d;
    private final long e;
    private int s;
    private f t;
    private final DateFormat u = new SimpleDateFormat();
    private List v = new ArrayList();
    private int w = -1;
    private ax x;
    private String y;
    private String z;
    private String[] A = new String[4];

    public aw(long l2, int n2, aq aq2) {
        this.d = aq2;
        this.e = l2;
        this.s = n2;
    }

    private void b() {
        net.minecraft.s.c c2 = this.x();
        this.v = c2.c();
        Collections.sort(this.v);
    }

    @Override
    public void d() {
        org.lwjgl.a.g.a(true);
        this.u();
        try {
            this.b();
        }
        catch (Exception exception) {
            a.b("Couldn't load level list", (Throwable)exception);
            net.minecraft.s.b.a(new aa("Unable to load worlds", exception.getMessage(), this.d));
            return;
        }
        this.y = aw.f("selectWorld.world");
        this.z = aw.f("selectWorld.conversion");
        this.A[net.minecraft.s.b.j()] = aw.f("gameMode.survival");
        this.A[net.minecraft.s.b.k()] = aw.f("gameMode.creative");
        this.A[net.minecraft.s.b.l()] = aw.f("gameMode.adventure");
        this.A[net.minecraft.s.b.m()] = aw.f("gameMode.spectator");
        this.b(aw.a(1, this.r() / 2 + 6, this.s() - 32, 153, 20, aw.f("gui.back")));
        this.t = aw.a(2, this.r() / 2 - 154, this.s() - 32, 153, 20, aw.f("mco.upload.button.name"));
        this.b(this.t);
        this.t.b(this.w >= 0 && this.w < this.v.size());
        this.x = new ax(this);
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
        if (f2.c() == 1) {
            net.minecraft.s.b.a(this.d);
        } else if (f2.c() == 2) {
            this.c();
        }
    }

    private void c() {
        if (this.w != -1 && !((l)this.v.get(this.w)).d()) {
            l l2 = (l)this.v.get(this.w);
            net.minecraft.s.b.a(new bh(this.e, this.s, this.d, l2));
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        this.x.a(n2, n3, f2);
        this.a(aw.f("mco.upload.select.world.title"), this.r() / 2, 13, 0xFFFFFF);
        this.a(aw.f("mco.upload.select.world.subtitle"), this.r() / 2, com.c.c.d.e.a(-1), 0xA0A0A0);
        if (this.v.size() == 0) {
            this.a(aw.f("mco.upload.select.world.none"), this.r() / 2, this.s() / 2 - 20, 0xFFFFFF);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.d);
        }
    }

    @Override
    public void a() {
        super.a();
        this.x.h();
    }

    @Override
    public void g() {
        super.g();
    }

    static /* synthetic */ List a(aw aw2) {
        return aw2.v;
    }

    static /* synthetic */ int a(aw aw2, int n2) {
        aw2.w = n2;
        return aw2.w;
    }

    static /* synthetic */ int b(aw aw2) {
        return aw2.w;
    }

    static /* synthetic */ f c(aw aw2) {
        return aw2.t;
    }

    static /* synthetic */ void d(aw aw2) {
        aw2.c();
    }

    static /* synthetic */ String e(aw aw2) {
        return aw2.y;
    }

    static /* synthetic */ DateFormat f(aw aw2) {
        return aw2.u;
    }

    static /* synthetic */ String g(aw aw2) {
        return aw2.z;
    }

    static /* synthetic */ String[] h(aw aw2) {
        return aw2.A;
    }
}

