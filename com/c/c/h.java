/*
 * Decompiled with CFR 0.150.
 */
package com.c.c;

import com.c.c.b.i;
import com.c.c.b.l;
import com.c.c.b.m;
import com.c.c.d.a;
import com.c.c.d.a.v;
import com.c.c.e.s;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import net.minecraft.s.b;
import net.minecraft.s.g;
import net.minecraft.s.n;
import net.minecraft.s.q;
import org.lwjgl.a.j;
import org.lwjgl.opengl.GL11;

class h
extends g {
    final /* synthetic */ com.c.c.a a;

    public h(com.c.c.a a2) {
        this.a = a2;
        super(a2.r() + 15, a2.s(), 32, a2.s() - 40, 36);
    }

    @Override
    public int a() {
        if (this.a.b()) {
            return com.c.c.a.e(this.a).size() + 1;
        }
        return com.c.c.a.e(this.a).size();
    }

    @Override
    public void a(int n2, boolean bl2, int n3, int n4) {
        if (this.a.b()) {
            if (n2 == 0) {
                com.c.c.a.a(this.a, true);
                return;
            }
            --n2;
        }
        if (n2 >= com.c.c.a.e(this.a).size()) {
            return;
        }
        i i2 = (i)com.c.c.a.e(this.a).get(n2);
        if (i2.e == l.c) {
            com.c.c.a.b(this.a, -1L);
            b.a(new v(i2, this.a));
        } else {
            com.c.c.a.b(this.a, i2.a);
        }
        com.c.c.a.f(this.a).b(com.c.c.a.a(this.a, i2));
        if (bl2 && com.c.c.a.f(this.a).d()) {
            if (com.c.c.a.b(this.a, i2) && s.a(i2)) {
                com.c.c.a.c(this.a, i2);
            } else {
                this.a.a(com.c.c.a.a(this.a, com.c.c.a.d(this.a)));
            }
        }
    }

    @Override
    public boolean a(int n2) {
        if (this.a.b()) {
            if (n2 == 0) {
                return false;
            }
            --n2;
        }
        return n2 == com.c.c.a.c(this.a, com.c.c.a.d(this.a));
    }

    @Override
    public int b() {
        return this.a() * 36;
    }

    @Override
    public int c() {
        return super.c() + 15;
    }

    @Override
    protected void a(int n2, int n3, int n4, int n5, net.minecraft.s.v v2, int n6, int n7) {
        if (this.a.b()) {
            if (n2 == 0) {
                this.a(n2, n3, n4);
                return;
            }
            --n2;
        }
        if (n2 < com.c.c.a.e(this.a).size()) {
            this.b(n2, n3, n4);
        }
    }

    private void a(int n2, int n3, int n4) {
        int n5 = n4 + 8;
        int n6 = 0;
        String string = n.f("mco.trial.message.line1") + "\\n" + n.f("mco.trial.message.line2");
        boolean bl2 = false;
        if (n3 <= this.g() && this.g() <= this.c() && n4 <= this.f() && this.f() <= n4 + 32) {
            bl2 = true;
        }
        int n7 = 0x7FFF7F;
        if (bl2 && !this.a.c()) {
            n7 = 6077788;
        }
        for (String string2 : string.split("\\\\n")) {
            this.a.a(string2, this.a.r() / 2, n5 + n6, n7);
            n6 += 10;
        }
    }

    @Override
    public void a(int n2, int n3, int n4, net.minecraft.s.v v2) {
        int n5 = this.c() - 300;
        int n6 = this.c() - 5;
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        GL11.l(3553);
        v2.a(7, net.minecraft.s.j.i);
        v2.a((double)n5, (double)(n3 + n4 + 2), 0.0).a(0.0, 1.0).a(128, 128, 128, 255).c();
        v2.a((double)n6, (double)(n3 + n4 + 2), 0.0).a(1.0, 1.0).a(128, 128, 128, 255).c();
        v2.a((double)n6, (double)(n3 - 2), 0.0).a(1.0, 0.0).a(128, 128, 128, 255).c();
        v2.a((double)n5, (double)(n3 - 2), 0.0).a(0.0, 0.0).a(128, 128, 128, 255).c();
        v2.a((double)(n5 + 1), (double)(n3 + n4 + 1), 0.0).a(0.0, 1.0).a(0, 0, 0, 255).c();
        v2.a((double)(n6 - 1), (double)(n3 + n4 + 1), 0.0).a(1.0, 1.0).a(0, 0, 0, 255).c();
        v2.a((double)(n6 - 1), (double)(n3 - 1), 0.0).a(1.0, 0.0).a(0, 0, 0, 255).c();
        v2.a((double)(n5 + 1), (double)(n3 - 1), 0.0).a(0.0, 0.0).a(0, 0, 0, 255).c();
        v2.a();
        GL11.k(3553);
    }

    @Override
    public void a(int n2, int n3, int n4, int n5, int n6) {
        if (this.a.b()) {
            if (n3 == 0) {
                com.c.c.a.a(this.a, true);
                return;
            }
            --n3;
        }
        if (n3 >= com.c.c.a.e(this.a).size()) {
            return;
        }
        i i2 = (i)com.c.c.a.e(this.a).get(n3);
        if (i2 == null) {
            return;
        }
        if (com.c.c.a.g(this.a)) {
            com.c.c.a.c(this.a, i2);
        } else if (com.c.c.a.h(this.a) != null && com.c.c.a.h(this.a).equals(n.f("mco.selectServer.configure"))) {
            com.c.c.a.b(this.a, i2.a);
            com.c.c.a.d(this.a, i2);
        } else if (com.c.c.a.h(this.a) != null && com.c.c.a.h(this.a).equals(n.f("mco.selectServer.leave"))) {
            com.c.c.a.b(this.a, i2.a);
            com.c.c.a.e(this.a, i2);
        } else if (com.c.c.a.b(this.a, i2) && i2.k && com.c.c.a.i(this.a)) {
            String string = "https://account.mojang.com/buy/realms?sid=" + i2.b + "&pid=" + b.g() + "&ref=" + (i2.l ? "expiredTrial" : "expiredRealm");
            this.a(string);
        }
    }

    @Override
    public void a(int n2, int n3, int n4, float f2, int n5) {
        if (j.a(0) && this.f() >= n2 && this.f() <= n3) {
            int n6 = this.e() / 2 - 160;
            int n7 = this.c();
            int n8 = this.f() - n2 - n4 + (int)f2 - 4;
            int n9 = n8 / n5;
            if (this.g() >= n6 && this.g() <= n7 && n9 >= 0 && n8 >= 0 && n9 < this.a()) {
                this.a(n8, n9, this.g(), this.f(), this.e());
                com.c.c.a.a(this.a, com.c.c.a.j(this.a) + (q.b / 3 + 1));
                this.a(n9, com.c.c.a.j(this.a) >= q.b / 2, this.g(), this.f());
            }
        }
    }

    private void b(int n2, int n3, int n4) {
        i i2 = (i)com.c.c.a.e(this.a).get(n2);
        if (i2.e == l.c) {
            n.d("realms:textures/gui/realms/world_icon.png");
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.k(3008);
            GL11.j();
            n.a(n3 + 10, n4 + 6, 0.0f, 0.0f, 40, 20, 40.0f, 20.0f);
            GL11.k();
            float f2 = 0.5f + (1.0f + net.minecraft.s.m.a((float)com.c.c.a.k(this.a) * 0.25f)) * 0.25f;
            int n5 = 0xFF000000 | (int)(127.0f * f2) << 16 | (int)(255.0f * f2) << 8 | (int)(127.0f * f2);
            this.a.a(n.f("mco.selectServer.uninitialized"), n3 + 10 + 40 + 75, n4 + 12, n5);
            return;
        }
        int n6 = 225;
        int n7 = 2;
        if (i2.k) {
            com.c.c.a.a(this.a, n3 + n6 - 14, n4 + n7, this.g(), this.f());
        } else if (i2.e == l.a && (!s.a(i2) || !com.c.c.a.b(this.a, i2)) || s.a(i2) && !com.c.c.a.b(this.a, i2)) {
            com.c.c.a.b(this.a, n3 + n6 - 14, n4 + n7, this.g(), this.f());
        } else if (com.c.c.a.b(this.a, i2) && i2.m < 7) {
            com.c.c.a.a(this.a, n3 + n6 - 14, n4 + n7, this.g(), this.f(), i2.m);
        } else if (i2.e == l.b || s.a(i2) && com.c.c.a.b(this.a, i2)) {
            com.c.c.a.c(this.a, n3 + n6 - 14, n4 + n7, this.g(), this.f());
        }
        if (!com.c.c.a.b(this.a, i2) && !com.c.c.a.n()) {
            com.c.c.a.d(this.a, n3 + n6, n4 + n7, this.g(), this.f());
        } else {
            com.c.c.a.e(this.a, n3 + n6, n4 + n7, this.g(), this.f());
        }
        if (!i2.v.a.equals("0")) {
            String string = (Object)((Object)com.c.c.d.a.h) + "" + i2.v.a;
            this.a.b(string, n3 + 207 - this.a.e(string), n4 + 3, 0x808080);
            if (this.g() >= n3 + 207 - this.a.e(string) && this.g() <= n3 + 207 && this.f() >= n4 + 1 && this.f() <= n4 + 10 && this.f() < this.a.s() - 40 && this.f() > 32 && !this.a.c()) {
                com.c.c.a.a(this.a, i2.v.b);
            }
        }
        if (com.c.c.a.b(this.a, i2) && i2.k) {
            boolean bl2 = false;
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
            GL11.k(3042);
            n.d("minecraft:textures/gui/widgets.png");
            GL11.j();
            GL11.a(770, 771);
            String string = n.f("mco.selectServer.expiredList");
            String string2 = n.f("mco.selectServer.expiredRenew");
            if (i2.l) {
                string = n.f("mco.selectServer.expiredTrial");
                string2 = n.f("mco.selectServer.expiredSubscribe");
            }
            int n8 = this.a.e(string2) + 20;
            int n9 = 16;
            int n10 = n3 + this.a.e(string) + 8;
            int n11 = n4 + 13;
            if (this.g() >= n10 && this.g() < n10 + n8 && this.f() > n11 && this.f() <= n11 + n9 & this.f() < this.a.s() - 40 && this.f() > 32 && !this.a.c()) {
                bl2 = true;
                com.c.c.a.b(this.a, true);
            }
            int n12 = bl2 ? 2 : 1;
            n.a(n10, n11, 0.0f, 46 + n12 * 20, n8 / 2, n9 / 2, 256.0f, 256.0f);
            n.a(n10 + n8 / 2, n11, 200 - n8 / 2, 46 + n12 * 20, n8 / 2, n9 / 2, 256.0f, 256.0f);
            n.a(n10, n11 + n9 / 2, 0.0f, 46 + n12 * 20 + 12, n8 / 2, n9 / 2, 256.0f, 256.0f);
            n.a(n10 + n8 / 2, n11 + n9 / 2, 200 - n8 / 2, 46 + n12 * 20 + 12, n8 / 2, n9 / 2, 256.0f, 256.0f);
            GL11.k();
            GL11.l(3042);
            int n13 = n4 + 11 + 5;
            int n14 = bl2 ? 0xFFFFA0 : 0xFFFFFF;
            this.a.b(string, n3 + 2, n13 + 1, 15553363);
            this.a.a(string2, n10 + n8 / 2, n13 + 1, n14);
        } else {
            if (i2.n.equals((Object)m.b)) {
                int n15 = 0xCCAC5C;
                String string = n.f("mco.selectServer.minigame") + " ";
                int n16 = this.a.e(string);
                this.a.b(string, n3 + 2, n4 + 12, n15);
                this.a.b(i2.c(), n3 + 2 + n16, n4 + 12, 0x6C6C6C);
            } else {
                this.a.b(i2.a(), n3 + 2, n4 + 12, 0x6C6C6C);
            }
            if (s.a(i2)) {
                String string = i2.n.equals((Object)m.c) ? n.a("mco.selectServer.mapOnlySupportedForVersion", q.c) : n.a("mco.selectServer.minigameNotSupportedInVersion", q.c);
                if (this.a(n2, n3, n4, string, com.c.c.a.b(this.a, i2))) {
                    com.c.c.a.c(this.a, true);
                }
            } else if (!com.c.c.a.b(this.a, i2)) {
                this.a.b(i2.f, n3 + 2, n4 + 12 + 11, 0x4C4C4C);
            }
        }
        this.a.b(i2.b(), n3 + 2, n4 + 1, 0xFFFFFF);
        n.b(i2.g, i2.f);
        GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        n.a(n3 - 36, n4, 8.0f, 8.0f, 8, 8, 32, 32, 64.0f, 64.0f);
        n.a(n3 - 36, n4, 40.0f, 8.0f, 8, 8, 32, 32, 64.0f, 64.0f);
    }

    private boolean a(int n2, int n3, int n4, String string, boolean bl2) {
        String string2 = n.f("mco.selectServer.note") + " ";
        int n5 = this.a.e(string2);
        int n6 = this.a.e(string);
        int n7 = n5 + n6;
        int n8 = n3 + 2;
        int n9 = n4 + 12 + 11;
        boolean bl3 = this.g() >= n8 && this.g() < n8 + n7 && this.f() > n9 && this.f() <= n9 + this.a.t() && bl2;
        int n10 = 15553363;
        int n11 = 0xFFFFFF;
        if (bl3) {
            n10 = 12535109;
            n11 = 0xA0A0A0;
            string2 = "\u00a7n" + string2;
            string = "\u00a7n" + string;
        }
        this.a.a(string2, n8, n9, n10, true);
        this.a.a(string, n8 + n5, n9, n11, true);
        return bl3;
    }

    private void a(String string) {
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(new StringSelection(string), null);
        s.a(string);
    }
}

