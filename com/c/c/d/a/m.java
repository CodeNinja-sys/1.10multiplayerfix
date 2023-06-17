/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.a;
import com.c.c.d.a.i;
import com.c.c.d.a.k;
import com.c.c.e.s;
import java.text.DateFormat;
import java.util.Date;
import net.minecraft.s.b;
import net.minecraft.s.g;
import net.minecraft.s.n;
import org.lwjgl.a.j;
import org.lwjgl.opengl.GL11;

class m
extends g {
    final /* synthetic */ k a;

    public m(k k2) {
        this.a = k2;
        super(k2.r() - 150, k2.s(), 32, k2.s() - 15, 36);
    }

    @Override
    public int a() {
        return k.b(this.a).size() + 1;
    }

    @Override
    public int b() {
        return this.a() * 36;
    }

    @Override
    public void d() {
        this.a.p();
    }

    @Override
    public void a(int n2, int n3, int n4, float f2, int n5) {
        if (j.a(0) && this.f() >= n2 && this.f() <= n3) {
            int n6 = this.e() / 2 - 92;
            int n7 = this.e();
            int n8 = this.f() - n2 - n4 + (int)f2 - 4;
            int n9 = n8 / n5;
            if (this.g() >= n6 && this.g() <= n7 && n9 >= 0 && n8 >= 0 && n9 < this.a()) {
                this.a(n8, n9, this.g(), this.f(), this.e());
            }
        }
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6, int n7) {
        n3 += 16;
        if (n2 < k.b(this.a).size()) {
            this.b(n2, n3, n4, n5, this.a.q);
        }
    }

    @Override
    public int c() {
        return this.e() - 5;
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        int n7 = this.e() - 40;
        int n8 = n2 + 30 - this.i();
        int n9 = n7 + 10;
        int n10 = n8 - 3;
        if (n4 >= n7 && n4 <= n7 + 9 && n5 >= n8 && n5 <= n8 + 9) {
            if (!((a)k.b((k)this.a).get((int)n3)).e.isEmpty()) {
                k.a(this.i());
                b.a(new i(this.a, (a)k.b(this.a).get(n3)));
            }
        } else if (n4 >= n9 && n4 <= n9 + 9 && n5 >= n10 && n5 <= n10 + 9) {
            k.a(this.i());
            k.a(this.a, n3);
        }
    }

    private void b(int n2, int n3, int n4, int n5, int n6) {
        a a2 = (a)k.b(this.a).get(n2);
        int n7 = a2.a() ? -8388737 : 0xFFFFFF;
        this.a.b("Backup (" + s.a(System.currentTimeMillis() - a2.b.getTime()) + ")", n3 + 2, n4 + 1, n7);
        this.a.b(this.a(a2.b), n3 + 2, n4 + 12, 0x4C4C4C);
        int n8 = this.e() - 30;
        int n9 = -3;
        int n10 = n8 - 10;
        int n11 = n9 + 3;
        if (!k.a((k)this.a).k) {
            this.b(n8, n4 + n9, this.g(), this.f());
        }
        if (!a2.e.isEmpty()) {
            this.c(n10, n4 + n11, this.g(), this.f());
        }
    }

    private String a(Date date) {
        return DateFormat.getDateTimeInstance(3, 3).format(date);
    }

    private void b(int n2, int n3, int n4, int n5) {
        boolean bl2 = n4 >= n2 && n4 <= n2 + 12 && n5 >= n3 && n5 <= n3 + 14 && n5 < this.a.s() - 15 && n5 > 32;
        n.d("realms:textures/gui/realms/restore_icon.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        GL11.c(0.5f, 0.5f, 0.5f);
        n.a(n2 * 2, n3 * 2, 0.0f, bl2 ? 28.0f : 0.0f, 23, 28, 23.0f, 56.0f);
        GL11.k();
        if (bl2) {
            k.a(this.a, n.f("mco.backup.button.restore"));
        }
    }

    private void c(int n2, int n3, int n4, int n5) {
        boolean bl2 = n4 >= n2 && n4 <= n2 + 8 && n5 >= n3 && n5 <= n3 + 8 && n5 < this.a.s() - 15 && n5 > 32;
        n.d("realms:textures/gui/realms/plus_icon.png");
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.j();
        GL11.c(0.5f, 0.5f, 0.5f);
        n.a(n2 * 2, n3 * 2, 0.0f, bl2 ? 15.0f : 0.0f, 15, 15, 15.0f, 30.0f);
        GL11.k();
        if (bl2) {
            k.a(this.a, n.f("mco.backup.changes.tooltip"));
        }
    }
}

