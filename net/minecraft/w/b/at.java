/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.b;

import net.minecraft.a.p;
import net.minecraft.a.w;
import net.minecraft.g.a.h;
import net.minecraft.g.c.b;
import net.minecraft.g.cn;
import net.minecraft.g.z;
import net.minecraft.h.e;
import net.minecraft.m.cu;
import net.minecraft.q.k;
import net.minecraft.w.b.bo;
import net.minecraft.w.h.ak;

public class at
extends bo {
    private final ak c;
    private boolean d;
    private boolean e;
    private int f;

    public at(ak ak2, double d2) {
        super(ak2, d2, 16);
        this.c = ak2;
    }

    @Override
    public boolean e() {
        if (this.a <= 0) {
            if (!this.c.aQ.G().b("mobGriefing")) {
                return false;
            }
            this.f = -1;
            this.d = this.c.do();
            this.e = this.c.E();
        }
        return super.e();
    }

    @Override
    public boolean a() {
        return this.f >= 0 && super.a();
    }

    @Override
    public void b() {
        super.b();
    }

    @Override
    public void c() {
        super.c();
    }

    @Override
    public void d() {
        super.d();
        this.c.I().a((double)this.b.cy_() + 0.5, this.b.k() + 1, (double)this.b.l() + 0.5, 10.0f, this.c.ao());
        if (this.f()) {
            k k2 = this.c.aQ;
            net.minecraft.u.b.b b2 = this.b.b();
            b b3 = k2.n(b2);
            cn cn2 = b3.c();
            if (this.f == 0 && cn2 instanceof z && ((z)cn2).m(b3)) {
                k2.b(b2, true);
            } else if (this.f == 1 && b3.d() == h.a) {
                e e2 = this.c.w();
                for (int i2 = 0; i2 < e2.e(); ++i2) {
                    cu cu2 = e2.a(i2);
                    boolean bl2 = false;
                    if (cu2 != null) {
                        if (cu2.a() == w.P) {
                            k2.a(b2, p.aj.v(), 3);
                            bl2 = true;
                        } else if (cu2.a() == w.cc) {
                            k2.a(b2, p.cc.v(), 3);
                            bl2 = true;
                        } else if (cu2.a() == w.cb) {
                            k2.a(b2, p.cb.v(), 3);
                            bl2 = true;
                        } else if (cu2.a() == w.cU) {
                            k2.a(b2, p.cZ.v(), 3);
                            bl2 = true;
                        }
                    }
                    if (!bl2) continue;
                    --cu2.b;
                    if (cu2.b > 0) break;
                    e2.a(i2, null);
                    break;
                }
            }
            this.f = -1;
            this.a = 10;
        }
    }

    @Override
    protected boolean a(k k2, net.minecraft.u.b.b b2) {
        cn cn2 = k2.n(b2).c();
        if (cn2 == p.ak) {
            b b3 = k2.n(b2 = b2.b());
            cn2 = b3.c();
            if (cn2 instanceof z && ((z)cn2).m(b3) && this.e && (this.f == 0 || this.f < 0)) {
                this.f = 0;
                return true;
            }
            if (b3.d() == h.a && this.d && (this.f == 1 || this.f < 0)) {
                this.f = 1;
                return true;
            }
        }
        return false;
    }
}

