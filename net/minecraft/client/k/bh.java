/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.k;

import net.minecraft.client.k.bt;
import net.minecraft.client.k.cc;
import net.minecraft.client.k.dn;
import net.minecraft.u.au;
import net.minecraft.u.b.n;
import net.minecraft.u.bx;
import net.minecraft.u.d.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;
import org.lwjgl.a.g;
import org.lwjgl.a.j;

public class bh
extends cc
implements au {
    private static final d b = org.apache.logging.log4j.c.c();
    private String c = "";
    private int d = -1;
    private bx e;
    protected dn a;
    private String f = "";

    public bh() {
    }

    public bh(String string) {
        this.f = string;
    }

    @Override
    public void ct_() {
        g.a(true);
        this.d = this.n.t.c().c().size();
        this.a = new dn(0, this.u, 4, this.q - 12, this.p - 4, 12);
        this.a.f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.f);
        this.a.d(false);
        this.e = new bt(this.a);
    }

    @Override
    public void cs_() {
        g.a(false);
        this.n.t.c().d();
    }

    @Override
    public void bY_() {
        this.a.a();
    }

    @Override
    protected void a(char c2, int n2) {
        this.e.d();
        if (n2 == 15) {
            this.e.a();
        } else {
            this.e.c();
        }
        if (n2 == 1) {
            this.n.a((cc)null);
        } else if (n2 != 28 && n2 != 156) {
            if (n2 == 200) {
                this.a(-1);
            } else if (n2 == 208) {
                this.a(1);
            } else if (n2 == 201) {
                this.n.t.c().b(this.n.t.c().i() - 1);
            } else if (n2 == 209) {
                this.n.t.c().b(-this.n.t.c().i() + 1);
            } else {
                this.a.a(c2, n2);
            }
        } else {
            String string = this.a.b().trim();
            if (!string.isEmpty()) {
                this.e(string);
            }
            this.n.a((cc)null);
        }
    }

    @Override
    public void cp_() {
        super.cp_();
        int n2 = j.o();
        if (n2 != 0) {
            if (n2 > 1) {
                n2 = 1;
            }
            if (n2 < -1) {
                n2 = -1;
            }
            if (!bh.o()) {
                n2 *= 7;
            }
            this.n.t.c().b(n2);
        }
    }

    @Override
    protected void a(int n2, int n3, int n4) {
        a a2;
        if (n4 == 0 && (a2 = this.n.t.c().a(j.q(), j.r())) != null && this.a(a2)) {
            return;
        }
        this.a.a(n2, n3, n4);
        super.a(n2, n3, n4);
    }

    @Override
    protected void a(String string, boolean bl2) {
        if (bl2) {
            this.a.a(string);
        } else {
            this.a.b(string);
        }
    }

    public void a(int n2) {
        int n3 = this.d + n2;
        int n4 = this.n.t.c().c().size();
        if ((n3 = net.minecraft.u.b.n.a(n3, 0, n4)) != this.d) {
            if (n3 == n4) {
                this.d = n4;
                this.a.a(this.c);
            } else {
                if (this.d == n4) {
                    this.c = this.a.b();
                }
                this.a.a((String)this.n.t.c().c().get(n3));
                this.d = n3;
            }
        }
    }

    @Override
    public void a(int n2, int n3, float f2) {
        bh.a(2, this.q - 14, this.p - 2, this.q - 2, Integer.MIN_VALUE);
        this.a.g();
        a a2 = this.n.t.c().a(j.q(), j.r());
        if (a2 != null && a2.a().i() != null) {
            this.a(a2, n2, n3);
        }
        super.a(n2, n3, f2);
    }

    @Override
    public boolean cq_() {
        return false;
    }

    @Override
    public void a(String ... arrstring) {
        this.e.a(arrstring);
    }
}

