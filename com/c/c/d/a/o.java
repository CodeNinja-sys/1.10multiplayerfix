/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.ab;
import com.c.c.b.i;
import com.c.c.b.s;
import com.c.c.c.b;
import com.c.c.d.a.aa;
import com.c.c.d.a.ac;
import com.c.c.d.a.ad;
import com.c.c.d.a.ae;
import com.c.c.d.a.aq;
import com.c.c.d.a.p;
import com.c.c.d.a.q;
import com.c.c.d.a.x;
import com.c.c.d.e;
import com.c.c.e.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import net.minecraft.s.f;
import net.minecraft.s.m;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.opengl.GL11;

public class o
extends net.minecraft.s.n {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final String b = "realms:textures/gui/realms/slot_frame.png";
    private static final String c = "realms:textures/gui/realms/empty_frame.png";
    private final net.minecraft.s.n d;
    private i e;
    private volatile long s;
    private String t = com.c.c.d.a.o.f("mco.brokenworld.title");
    private String u = com.c.c.d.a.o.f("mco.brokenworld.message.line1") + "\\n" + com.c.c.d.a.o.f("mco.brokenworld.message.line2");
    private int v;
    private int w;
    private int x = 80;
    private int y = 5;
    private static final int z = 0;
    private static final List A = Arrays.asList(1, 2, 3);
    private static final List B = Arrays.asList(4, 5, 6);
    private static final List C = Arrays.asList(7, 8, 9);
    private static final List D = Arrays.asList(10, 11, 12);
    private final List E = new ArrayList();
    private static final int F = 13;
    private static final int G = 14;
    private int H;

    public o(net.minecraft.s.n n2, long l2) {
        this.d = n2;
        this.s = l2;
    }

    public void a(String string) {
        this.t = string;
    }

    public void b(String string) {
        this.u = string;
    }

    @Override
    public void a() {
        super.a();
    }

    @Override
    public void d() {
        this.u();
        this.v = this.r() / 2 - 150;
        this.w = this.r() / 2 + 190;
        this.b(com.c.c.d.a.o.a(0, this.w - this.x + 8, com.c.c.d.e.a(13) - 5, this.x - 10, 20, com.c.c.d.a.o.f("gui.back")));
        if (this.e == null) {
            this.a(this.s);
        } else {
            this.b();
        }
        org.lwjgl.a.g.a(true);
    }

    public void b() {
        for (Map.Entry entry : this.e.i.entrySet()) {
            s s2 = (s)entry.getValue();
            boolean bl2 = !com.c.c.e.s.a(s2);
            f f2 = com.c.c.d.a.o.a(bl2 ? (Integer)A.get((Integer)entry.getKey() - 1) : (Integer)C.get((Integer)entry.getKey() - 1), this.a((Integer)entry.getKey()), com.c.c.d.e.a(8), this.x, 20, bl2 ? com.c.c.d.a.o.f("mco.brokenworld.play") : com.c.c.d.a.o.f("mco.brokenworld.download"));
            if (this.E.contains(entry.getKey())) {
                f2.b(false);
                f2.a(com.c.c.d.a.o.f("mco.brokenworld.downloaded"));
            }
            this.b(f2);
            this.b(com.c.c.d.a.o.a((Integer)B.get((Integer)entry.getKey() - 1), this.a((Integer)entry.getKey()), com.c.c.d.e.a(10), this.x, 20, com.c.c.d.a.o.f("mco.brokenworld.reset")));
        }
    }

    @Override
    public void g() {
        ++this.H;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.p();
        super.a(n2, n3, f2);
        this.a(this.t, this.r() / 2, 17, 0xFFFFFF);
        String[] arrstring = this.u.split("\\\\n");
        for (int i2 = 0; i2 < arrstring.length; ++i2) {
            this.a(arrstring[i2], this.r() / 2, com.c.c.d.e.a(-1) + 3 + i2 * 12, 0xA0A0A0);
        }
        if (this.e == null) {
            return;
        }
        for (Map.Entry entry : this.e.i.entrySet()) {
            if (((s)entry.getValue()).l != null && ((s)entry.getValue()).k != -1L) {
                this.a(this.a((Integer)entry.getKey()), com.c.c.d.e.a(1) + 5, n2, n3, this.e.o == (Integer)entry.getKey() && !this.f(), ((s)entry.getValue()).a((Integer)entry.getKey()), (Integer)entry.getKey(), ((s)entry.getValue()).k, ((s)entry.getValue()).l, ((s)entry.getValue()).o);
                continue;
            }
            this.a(this.a((Integer)entry.getKey()), com.c.c.d.e.a(1) + 5, n2, n3, this.e.o == (Integer)entry.getKey() && !this.f(), ((s)entry.getValue()).a((Integer)entry.getKey()), (Integer)entry.getKey(), -1L, null, ((s)entry.getValue()).o);
        }
    }

    private int a(int n2) {
        return this.v + (n2 - 1) * 110;
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
        if (A.contains(f2.c())) {
            int n2 = A.indexOf(f2.c()) + 1;
            if (((s)this.e.i.get((Object)Integer.valueOf((int)n2))).o) {
                aq aq2 = new aq(this, this.e, this, com.c.c.d.a.o.f("mco.configure.world.switch.slot"), com.c.c.d.a.o.f("mco.configure.world.switch.slot.subtitle"), 0xA0A0A0, com.c.c.d.a.o.f("gui.cancel"));
                aq2.b(n2);
                aq2.a(com.c.c.d.a.o.f("mco.create.world.reset.title"));
                aq2.a(14);
                net.minecraft.s.b.a(aq2);
            } else {
                this.d(n2);
            }
        } else if (B.contains(f2.c())) {
            int n3 = B.indexOf(f2.c()) + 1;
            aq aq3 = new aq(this, this.e, this);
            if (n3 != this.e.o || this.e.n.equals((Object)com.c.c.b.m.b)) {
                aq3.b(n3);
            }
            aq3.a(14);
            net.minecraft.s.b.a(aq3);
        } else if (C.contains(f2.c())) {
            String string = com.c.c.d.a.o.f("mco.configure.world.restore.download.question.line1");
            String string2 = com.c.c.d.a.o.f("mco.configure.world.restore.download.question.line2");
            net.minecraft.s.b.a(new ac(this, ad.b, string, string2, true, f2.c()));
        } else if (f2.c() == 0) {
            this.e();
        }
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            this.e();
        }
    }

    private void e() {
        net.minecraft.s.b.a(this.d);
    }

    private void a(long l2) {
        new p(this, l2).start();
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (!bl2) {
            net.minecraft.s.b.a(this);
            return;
        }
        if (n2 == 13 || n2 == 14) {
            new q(this).start();
        } else if (C.contains(n2)) {
            this.b(C.indexOf(n2) + 1);
        } else if (D.contains(n2)) {
            this.E.add(D.indexOf(n2) + 1);
            this.u();
            this.b();
        }
    }

    private void b(int n2) {
        com.c.c.a.m m2 = com.c.c.a.m.a();
        try {
            ab ab2 = m2.b(this.e.a, n2);
            x x2 = new x(this, ab2, this.e.c + " (" + ((s)this.e.i.get(n2)).a(n2) + ")");
            x2.a((Integer)D.get(n2 - 1));
            net.minecraft.s.b.a(x2);
        }
        catch (b b2) {
            a.b("Couldn't download world data");
            net.minecraft.s.b.a(new aa(b2, (net.minecraft.s.n)this));
        }
    }

    private boolean f() {
        return this.e != null && this.e.n.equals((Object)com.c.c.b.m.b);
    }

    private void a(int n2, int n3, int n4, int n5, boolean bl2, String string, int n6, long l2, String string2, boolean bl3) {
        if (bl3) {
            com.c.c.d.a.o.d(c);
        } else if (string2 != null && l2 != -1L) {
            com.c.c.e.q.a(String.valueOf(l2), string2);
        } else if (n6 == 1) {
            com.c.c.d.a.o.d("textures/gui/title/background/panorama_0.png");
        } else if (n6 == 2) {
            com.c.c.d.a.o.d("textures/gui/title/background/panorama_2.png");
        } else if (n6 == 3) {
            com.c.c.d.a.o.d("textures/gui/title/background/panorama_3.png");
        } else {
            com.c.c.e.q.a(String.valueOf(this.e.q), this.e.r);
        }
        if (!bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else if (bl2) {
            float f2 = 0.9f + 0.1f * net.minecraft.s.m.e((float)this.H * 0.2f);
            GL11.c(f2, f2, f2, 1.0f);
        }
        net.minecraft.s.n.a(n2 + 3, n3 + 3, 0.0f, 0.0f, 74, 74, 74.0f, 74.0f);
        com.c.c.d.a.o.d(b);
        if (!bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else {
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 80, 80, 80.0f, 80.0f);
        this.a(string, n2 + 40, n3 + 66, 0xFFFFFF);
    }

    private void d(int n2) {
        n n3 = new n(this.e.a, n2, this, 13);
        ae ae2 = new ae(this.d, n3);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    static /* synthetic */ i a(o o2, i i2) {
        o2.e = i2;
        return o2.e;
    }

    static /* synthetic */ d c() {
        return a;
    }

    static /* synthetic */ net.minecraft.s.n a(o o2) {
        return o2.d;
    }

    static /* synthetic */ i b(o o2) {
        return o2.e;
    }

    static /* synthetic */ long c(o o2) {
        return o2.s;
    }
}

