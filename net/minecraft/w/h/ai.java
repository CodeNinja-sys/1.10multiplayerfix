/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.w.h;

import com.a.a.b.cg;
import java.util.UUID;
import net.minecraft.c.b.d;
import net.minecraft.e.e;
import net.minecraft.j.i;
import net.minecraft.q.k;
import net.minecraft.u.aj;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.b.ay;
import net.minecraft.w.h.y;
import net.minecraft.w.l;
import net.minecraft.w.n;
import net.minecraft.w.u;
import net.minecraft.x.a.o;
import net.minecraft.x.a.q;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
public abstract class ai
extends y
implements u {
    protected static final net.minecraft.x.a.g b = net.minecraft.x.a.o.a(ai.class, net.minecraft.x.a.q.a);
    protected static final net.minecraft.x.a.g c = net.minecraft.x.a.o.a(ai.class, net.minecraft.x.a.q.m);
    protected ay d;

    public ai(k k2) {
        super(k2);
        this.cF_();
    }

    @Override
    protected void cb_() {
        super.cb_();
        this.bE.a(b, (byte)0);
        this.bE.a(c, cg.f());
    }

    @Override
    public void a(e e2) {
        super.a(e2);
        if (this.b() == null) {
            e2.a("OwnerUUID", "");
        } else {
            e2.a("OwnerUUID", this.b().toString());
        }
        e2.a("Sitting", this.E());
    }

    @Override
    public void b(e e2) {
        String string;
        super.b(e2);
        if (e2.b("OwnerUUID", 8)) {
            string = e2.l("OwnerUUID");
        } else {
            String string2 = e2.l("Owner");
            string = net.minecraft.c.b.d.a(this.aS(), string2);
        }
        if (!string.isEmpty()) {
            try {
                this.b(UUID.fromString(string));
                this.a(true);
            }
            catch (Throwable throwable) {
                this.a(false);
            }
        }
        if (this.d != null) {
            this.d.a(e2.p("Sitting"));
        }
        this.t(e2.p("Sitting"));
    }

    @Override
    public boolean c(b b2) {
        return this.z() && this.d((l)b2);
    }

    protected void e(boolean bl2) {
        aj aj2 = net.minecraft.u.aj.I;
        if (!bl2) {
            aj2 = net.minecraft.u.aj.l;
        }
        for (int i2 = 0; i2 < 7; ++i2) {
            double d2 = this.bx.nextGaussian() * 0.02;
            double d3 = this.bx.nextGaussian() * 0.02;
            double d4 = this.bx.nextGaussian() * 0.02;
            this.aQ.a(aj2, this.aU + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, this.aV + 0.5 + (double)(this.bx.nextFloat() * this.bm), this.aW + (double)(this.bx.nextFloat() * this.bl * 2.0f) - (double)this.bl, d2, d3, d4, new int[0]);
        }
    }

    @Override
    public void a(byte by2) {
        if (by2 == 7) {
            this.e(true);
        } else if (by2 == 6) {
            this.e(false);
        } else {
            super.a(by2);
        }
    }

    public boolean z() {
        return ((Byte)this.bE.a(b) & 4) != 0;
    }

    public void a(boolean bl2) {
        byte by2 = (Byte)this.bE.a(b);
        if (bl2) {
            this.bE.b(b, (byte)(by2 | 4));
        } else {
            this.bE.b(b, (byte)(by2 & 0xFFFFFFFB));
        }
        this.cF_();
    }

    protected void cF_() {
    }

    public boolean E() {
        return ((Byte)this.bE.a(b) & 1) != 0;
    }

    public void t(boolean bl2) {
        byte by2 = (Byte)this.bE.a(b);
        if (bl2) {
            this.bE.b(b, (byte)(by2 | 1));
        } else {
            this.bE.b(b, (byte)(by2 & 0xFFFFFFFE));
        }
    }

    @Override
    public UUID b() {
        return (UUID)((cg)this.bE.a(c)).d();
    }

    public void b(UUID uUID) {
        this.bE.b(c, cg.c(uUID));
    }

    public l do() {
        try {
            UUID uUID = this.b();
            return uUID == null ? null : this.aQ.a(uUID);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public boolean d(l l2) {
        return l2 == this.do();
    }

    public ay dp() {
        return this.d;
    }

    public boolean a(l l2, l l3) {
        return true;
    }

    @Override
    public i aA() {
        l l2;
        if (this.z() && (l2 = this.do()) != null) {
            return l2.aA();
        }
        return super.aA();
    }

    @Override
    public boolean w(n n2) {
        if (this.z()) {
            l l2 = this.do();
            if (n2 == l2) {
                return true;
            }
            if (l2 != null) {
                return l2.w(n2);
            }
        }
        return super.w(n2);
    }

    @Override
    public void a(net.minecraft.u.n n2) {
        if (!this.aQ.C && this.aQ.G().b("showDeathMessages") && this.do() instanceof g) {
            this.do().a(this.bu().b());
        }
        super.a(n2);
    }

    @Override
    public /* synthetic */ n c() {
        return this.do();
    }
}

