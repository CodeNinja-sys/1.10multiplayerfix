/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.d.a.ag;
import com.c.c.d.f;
import com.c.c.d.k;
import java.util.Arrays;
import java.util.List;
import net.minecraft.s.b;
import net.minecraft.s.n;
import org.lwjgl.a.g;
import org.lwjgl.opengl.GL11;

public class af
extends n {
    private static final String a = "realms:textures/gui/realms/invite_icon.png";
    private static final String b = "realms:textures/gui/realms/trial_icon.png";
    private static f c = new f();
    private volatile int d = 0;
    private static boolean e = false;
    private static boolean s = false;
    private static boolean t = false;
    private static final List u = Arrays.asList(new k[]{com.c.c.d.k.b, com.c.c.d.k.c});

    public af(n n2) {
    }

    @Override
    public void d() {
        this.b();
        org.lwjgl.a.g.a(true);
        this.u();
    }

    @Override
    public void g() {
        if (!(net.minecraft.s.b.o() && net.minecraft.s.b.p() && t || c.a())) {
            c.i();
            return;
        }
        if (!t || !net.minecraft.s.b.o()) {
            return;
        }
        c.a(u);
        if (c.a(com.c.c.d.k.b)) {
            this.d = c.f();
        }
        if (c.a(com.c.c.d.k.c)) {
            s = c.g();
        }
        c.c();
    }

    private void b() {
        if (!e) {
            e = true;
            new ag(this, "Realms Notification Availability checker #1").start();
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        if (t) {
            this.a(n2, n3);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public void a(int n2, int n3, int n4) {
    }

    private void a(int n2, int n3) {
        int n4 = this.d;
        int n5 = 24;
        int n6 = this.s() / 4 + 48;
        int n7 = this.r() / 2 + 80;
        int n8 = n6 + 48 + 2;
        if (n4 != 0) {
            net.minecraft.s.n.d(a);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            net.minecraft.s.n.a(n7, n8 - 6, 0.0f, 0.0f, 15, 25, 31.0f, 25.0f);
            GL11.k();
        }
        if (s) {
            net.minecraft.s.n.d(b);
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.j();
            int n9 = 0;
            if ((System.currentTimeMillis() / 800L & 1L) == 1L) {
                n9 = 8;
            }
            net.minecraft.s.n.a(n7 + 4 - (n4 != 0 ? 16 : 0), n8 + 4, 0.0f, n9, 8, 8, 8.0f, 16.0f);
            GL11.k();
        }
    }

    @Override
    public void h() {
        c.i();
    }

    static /* synthetic */ boolean a(boolean bl2) {
        e = bl2;
        return e;
    }

    static /* synthetic */ boolean b(boolean bl2) {
        t = bl2;
        return t;
    }
}

