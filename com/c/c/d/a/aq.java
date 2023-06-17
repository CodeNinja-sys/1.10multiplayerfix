/*
 * Decompiled with CFR 0.150.
 */
package com.c.c.d.a;

import com.c.c.b.ac;
import com.c.c.b.i;
import com.c.c.b.m;
import com.c.c.d.a.ae;
import com.c.c.d.a.ap;
import com.c.c.d.a.ar;
import com.c.c.d.a.at;
import com.c.c.d.a.au;
import com.c.c.d.a.av;
import com.c.c.d.a.aw;
import com.c.c.d.a.ay;
import com.c.c.d.e;
import com.c.c.e.l;
import com.c.c.e.n;
import com.c.c.e.q;
import net.minecraft.s.b;
import net.minecraft.s.f;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.opengl.GL11;

public class aq
extends av {
    private static final d b = org.apache.logging.log4j.c.c();
    private net.minecraft.s.n c;
    private i d;
    private net.minecraft.s.n e;
    private String s = aq.f("mco.reset.world.title");
    private String t = aq.f("mco.reset.world.warning");
    private String u = aq.f("gui.cancel");
    private int v = 0xFF0000;
    private static final String w = "realms:textures/gui/realms/slot_frame.png";
    private static final String x = "realms:textures/gui/realms/upload.png";
    private static final String y = "realms:textures/gui/realms/adventure.png";
    private static final String z = "realms:textures/gui/realms/survival_spawn.png";
    private static final String A = "realms:textures/gui/realms/new_world.png";
    private final int B = 0;
    private final com.c.c.b.ae C = new com.c.c.b.ae();
    private final com.c.c.b.ae D = new com.c.c.b.ae();
    private at E = at.a;
    public int a = -1;
    private at F = at.a;
    private au G = null;
    private ac H = null;
    private String I = null;
    private int J = -1;

    public aq(net.minecraft.s.n n2, i i2, net.minecraft.s.n n3) {
        this.c = n2;
        this.d = i2;
        this.e = n3;
    }

    public aq(net.minecraft.s.n n2, i i2, net.minecraft.s.n n3, String string, String string2, int n4, String string3) {
        this(n2, i2, n3);
        this.s = string;
        this.t = string2;
        this.v = n4;
        this.u = string3;
    }

    public void a(int n2) {
        this.J = n2;
    }

    public void b(int n2) {
        this.a = n2;
    }

    public void a(String string) {
        this.I = string;
    }

    @Override
    public void d() {
        this.u();
        this.b(aq.a(0, this.r() / 2 - 40, com.c.c.d.e.a(14) - 10, 80, 20, this.u));
        new ar(this, "Realms-reset-world-fetcher").start();
    }

    @Override
    public void h() {
        org.lwjgl.a.g.a(false);
    }

    @Override
    public void a(char c2, int n2) {
        if (n2 == 1) {
            net.minecraft.s.b.a(this.c);
        }
    }

    @Override
    public void a(f f2) {
        if (!f2.d()) {
            return;
        }
        if (f2.c() == 0) {
            net.minecraft.s.b.a(this.c);
        }
    }

    @Override
    public void a(int n2, int n3, int n4) {
        switch (this.E) {
            case a: {
                break;
            }
            case b: {
                net.minecraft.s.b.a(new ap(this, this.s));
                break;
            }
            case c: {
                net.minecraft.s.b.a(new aw(this.d.a, this.a != -1 ? this.a : this.d.o, this));
                break;
            }
            case d: {
                ay ay2 = new ay(this, null, com.c.c.b.m.c, new com.c.c.b.ae(this.D));
                ay2.a(aq.f("mco.reset.world.adventure"));
                net.minecraft.s.b.a(ay2);
                break;
            }
            case e: {
                ay ay3 = new ay(this, null, com.c.c.b.m.a, new com.c.c.b.ae(this.C));
                ay3.a(aq.f("mco.reset.world.template"));
                net.minecraft.s.b.a(ay3);
                break;
            }
            default: {
                return;
            }
        }
    }

    private int d(int n2) {
        return this.r() / 2 - 80 + (n2 - 1) * 100;
    }

    @Override
    public void a(int n2, int n3, float f2) {
        this.E = at.a;
        this.p();
        this.a(this.s, this.r() / 2, 7, 0xFFFFFF);
        this.a(this.t, this.r() / 2, 22, this.v);
        this.a(this.d(1), com.c.c.d.e.a(0) + 10, n2, n3, aq.f("mco.reset.world.generate"), -1L, A, at.b);
        this.a(this.d(2), com.c.c.d.e.a(0) + 10, n2, n3, aq.f("mco.reset.world.upload"), -1L, x, at.c);
        this.a(this.d(1), com.c.c.d.e.a(6) + 20, n2, n3, aq.f("mco.reset.world.adventure"), -1L, y, at.d);
        this.a(this.d(2), com.c.c.d.e.a(6) + 20, n2, n3, aq.f("mco.reset.world.template"), -1L, z, at.e);
        super.a(n2, n3, f2);
    }

    private void a(int n2, int n3, int n4, int n5, String string, long l2, String string2, at at2) {
        boolean bl2 = false;
        if (n4 >= n2 && n4 <= n2 + 60 && n5 >= n3 - 12 && n5 <= n3 + 60) {
            bl2 = true;
            this.E = at2;
        }
        if (l2 != -1L) {
            com.c.c.e.q.a(String.valueOf(l2), string2);
        } else {
            aq.d(string2);
        }
        if (bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else {
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        net.minecraft.s.n.a(n2 + 2, n3 + 2, 0.0f, 0.0f, 56, 56, 56.0f, 56.0f);
        aq.d(w);
        if (bl2) {
            GL11.c(0.56f, 0.56f, 0.56f, 1.0f);
        } else {
            GL11.c(1.0f, 1.0f, 1.0f, 1.0f);
        }
        net.minecraft.s.n.a(n2, n3, 0.0f, 0.0f, 60, 60, 60.0f, 60.0f);
        this.a(string, n2 + 30, n3 - 12, bl2 ? 0xA0A0A0 : 0xFFFFFF);
    }

    void a(ac ac2) {
        if (ac2 != null) {
            if (this.a != -1) {
                this.F = ac2.i.equals("") ? at.e : at.d;
                this.H = ac2;
                this.c();
            } else {
                this.b(ac2);
            }
        }
    }

    private void c() {
        this.a(this);
    }

    public void a(net.minecraft.s.n n2) {
        n n3 = new n(this.d.a, this.a, n2, 100);
        ae ae2 = new ae(this.c, n3);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    @Override
    public void a(boolean bl2, int n2) {
        if (n2 == 100 && bl2) {
            switch (this.F) {
                case d: 
                case e: {
                    if (this.H == null) break;
                    this.b(this.H);
                    break;
                }
                case b: {
                    if (this.G == null) break;
                    this.b(this.G);
                    break;
                }
                default: {
                    return;
                }
            }
            return;
        }
        if (bl2) {
            net.minecraft.s.b.a(this.e);
            if (this.J != -1) {
                this.e.a(true, this.J);
            }
        }
    }

    public void b(ac ac2) {
        l l2 = new l(this.d.a, this.e, ac2);
        if (this.I != null) {
            l2.c(this.I);
        }
        if (this.J != -1) {
            l2.a(this.J);
        }
        ae ae2 = new ae(this.c, l2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    public void a(au au2) {
        if (this.a != -1) {
            this.F = at.b;
            this.G = au2;
            this.c();
        } else {
            this.b(au2);
        }
    }

    private void b(au au2) {
        l l2 = new l(this.d.a, this.e, au2.a, au2.b, au2.c);
        if (this.I != null) {
            l2.c(this.I);
        }
        if (this.J != -1) {
            l2.a(this.J);
        }
        ae ae2 = new ae(this.c, l2);
        ae2.b();
        net.minecraft.s.b.a(ae2);
    }

    static /* synthetic */ com.c.c.b.ae a(aq aq2) {
        return aq2.C;
    }

    static /* synthetic */ com.c.c.b.ae b(aq aq2) {
        return aq2.D;
    }

    static /* synthetic */ d b() {
        return b;
    }
}

