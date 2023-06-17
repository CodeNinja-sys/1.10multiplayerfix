/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import com.a.a.l.i;
import com.a.a.l.m;
import io.netty.util.b.ad;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Future;
import net.minecraft.c.a;
import net.minecraft.q.v;
import org.apache.commons.c.am;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bhu
implements avf,
bws {
    private static final d c = org.apache.logging.log4j.c.c();
    public final sz a;
    private final a d;
    public czt b;
    private int e;
    private int f;
    private long g;
    private long h;
    private int i;
    private int j;
    private final cyn k = new cyn();
    private double l;
    private double m;
    private double n;
    private double o;
    private double p;
    private double q;
    private cpk r;
    private double s;
    private double t;
    private double u;
    private double v;
    private double w;
    private double x;
    private amj y;
    private int z;
    private int A;
    private boolean B;
    private int C;
    private boolean D;
    private int E;
    private int F;
    private int G;

    public bhu(a a2, sz sz2, czt czt2) {
        this.d = a2;
        this.a = sz2;
        sz2.a(this);
        this.b = czt2;
        czt2.a = this;
    }

    @Override
    public void a() {
        this.c();
        this.b.T();
        this.b.b(this.l, this.m, this.n, this.b.ba, this.b.bb);
        ++this.e;
        this.G = this.F;
        if (this.B) {
            if (++this.C > 80) {
                c.f("{} was kicked for floating too long!", this.b.i_());
                this.a("Flying is not enabled on this server");
                return;
            }
        } else {
            this.B = false;
            this.C = 0;
        }
        this.r = this.b.cJ();
        if (this.r == this.b || this.r.aj() != this.b) {
            this.r = null;
            this.D = false;
            this.E = 0;
        } else {
            this.s = this.r.aU;
            this.t = this.r.aV;
            this.u = this.r.aW;
            this.v = this.r.aU;
            this.w = this.r.aV;
            this.x = this.r.aW;
            if (this.D && this.b.cJ().aj() == this.b) {
                if (++this.E > 80) {
                    c.f("{} was kicked for floating a vehicle too long!", this.b.i_());
                    this.a("Flying is not enabled on this server");
                    return;
                }
            } else {
                this.D = false;
                this.E = 0;
            }
        }
        ((cfe)((Object)this.d.c)).a("keepAlive");
        if ((long)this.e - this.h > 40L) {
            this.h = this.e;
            this.g = this.d();
            this.f = (int)this.g;
            this.a(new yn(this.f));
        }
        ((cfe)((Object)this.d.c)).b();
        if (this.i > 0) {
            --this.i;
        }
        if (this.j > 0) {
            --this.j;
        }
        if (this.b.cO() > 0L && this.d.aw() > 0 && net.minecraft.c.a.av() - this.b.cO() > (long)(this.d.aw() * 1000 * 60)) {
            this.a("You have been idle for too long!");
        }
    }

    private void c() {
        this.l = this.b.aU;
        this.m = this.b.aV;
        this.n = this.b.aW;
        this.o = this.b.aU;
        this.p = this.b.aV;
        this.q = this.b.aW;
    }

    public sz b() {
        return this.a;
    }

    public void a(String string) {
        aym aym2 = new aym(string);
        this.a.a(new bkm(aym2), new aze(this, aym2), new ad[0]);
        this.a.i();
        com.a.a.n.a.ci.a((Future)this.d.a(new cnn(this)));
    }

    @Override
    public void a(qk qk2) {
        ceb.a(qk2, this, this.b.bS());
        this.b.a(qk2.a(), qk2.b(), qk2.c(), qk2.d());
    }

    private static boolean b(cyg cyg2) {
        if (com.a.a.l.i.b(cyg2.a(0.0)) && com.a.a.l.i.b(cyg2.b(0.0)) && com.a.a.l.i.b(cyg2.c(0.0)) && com.a.a.l.m.b(cyg2.b(0.0f)) && com.a.a.l.m.b(cyg2.a(0.0f))) {
            return false;
        }
        return !(Math.abs(cyg2.a(0.0)) > 3.0E7) && !(Math.abs(cyg2.a(0.0)) > 3.0E7);
    }

    private static boolean b(btl btl2) {
        return !com.a.a.l.i.b(btl2.a()) || !com.a.a.l.i.b(btl2.b()) || !com.a.a.l.i.b(btl2.c()) || !com.a.a.l.m.b(btl2.e()) || !com.a.a.l.m.b(btl2.d());
    }

    @Override
    public void a(btl btl2) {
        ceb.a(btl2, this, this.b.bS());
        if (bhu.b(btl2)) {
            this.a("Invalid move vehicle packet received");
            return;
        }
        cpk cpk2 = this.b.cJ();
        if (cpk2 != this.b && cpk2.aj() == this.b && cpk2 == this.r) {
            alj alj2 = this.b.bS();
            double d2 = cpk2.aU;
            double d3 = cpk2.aV;
            double d4 = cpk2.aW;
            double d5 = btl2.a();
            double d6 = btl2.b();
            double d7 = btl2.c();
            float f2 = btl2.d();
            float f3 = btl2.e();
            double d8 = d5 - this.s;
            double d9 = d6 - this.t;
            double d10 = d7 - this.u;
            double d11 = d8 * d8 + d9 * d9 + d10 * d10;
            double d12 = cpk2.aX * cpk2.aX + cpk2.aY * cpk2.aY + cpk2.aZ * cpk2.aZ;
            if (!(!(d11 - d12 > 100.0) || this.d.R() && this.d.Q().equals(cpk2.i_()))) {
                c.f("{} (vehicle of {}) moved too quickly! {},{},{}", cpk2.i_(), this.b.i_(), d8, d9, d10);
                this.a.a(new bnh(cpk2));
                return;
            }
            boolean bl2 = alj2.a(cpk2, cpk2.cD().c(0.0625)).isEmpty();
            d8 = d5 - this.v;
            d9 = d6 - this.w - 1.0E-6;
            d10 = d7 - this.x;
            cpk2.b(d8, d9, d10);
            double d13 = d9;
            d8 = d5 - cpk2.aU;
            d9 = d6 - cpk2.aV;
            if (d9 > -0.5 || d9 < 0.5) {
                d9 = 0.0;
            }
            d10 = d7 - cpk2.aW;
            d11 = d8 * d8 + d9 * d9 + d10 * d10;
            boolean bl3 = false;
            if (d11 > 0.0625) {
                bl3 = true;
                c.f("{} moved wrongly!", cpk2.i_());
            }
            cpk2.b(d5, d6, d7, f2, f3);
            boolean bl4 = alj2.a(cpk2, cpk2.cD().c(0.0625)).isEmpty();
            if (bl2 && (bl3 || !bl4)) {
                cpk2.b(d2, d3, d4, f2, f3);
                this.a.a(new bnh(cpk2));
                return;
            }
            ((cmt)((Object)this.d.al())).d(this.b);
            this.b.f(this.b.aU - d2, this.b.aV - d3, this.b.aW - d4);
            this.D = d13 >= -0.03125 && !this.d.ag() && !alj2.d(cpk2.cD().b(0.0625).a(0.0, -0.55, 0.0));
            this.v = cpk2.aU;
            this.w = cpk2.aV;
            this.x = cpk2.aW;
        }
    }

    @Override
    public void a(ctd ctd2) {
        ceb.a(ctd2, this, this.b.bS());
        if (ctd2.a() == this.z) {
            this.b.b(this.y.b, this.y.c, this.y.d, this.b.ba, this.b.bb);
            if (this.b.cQ()) {
                this.o = this.y.b;
                this.p = this.y.c;
                this.q = this.y.d;
                this.b.cR();
            }
            this.y = null;
        }
    }

    @Override
    public void a(cyg cyg2) {
        ceb.a(cyg2, this, this.b.bS());
        if (bhu.b(cyg2)) {
            this.a("Invalid move player packet received");
            return;
        }
        ls ls2 = this.d.a(this.b.bS);
        if (this.b.h) {
            return;
        }
        if (this.e == 0) {
            this.c();
        }
        if (this.y != null) {
            if (this.e - this.A > 20) {
                this.A = this.e;
                this.a(this.y.b, this.y.c, this.y.d, this.b.ba, this.b.bb);
            }
            return;
        }
        this.A = this.e;
        if (this.b.cp()) {
            this.b.b(this.b.aU, this.b.aV, this.b.aW, cyg2.a(this.b.ba), cyg2.b(this.b.bb));
            ((cmt)((Object)this.d.al())).d(this.b);
            return;
        }
        double d2 = this.b.aU;
        double d3 = this.b.aV;
        double d4 = this.b.aW;
        double d5 = this.b.aV;
        double d6 = cyg2.a(this.b.aU);
        double d7 = cyg2.b(this.b.aV);
        double d8 = cyg2.c(this.b.aW);
        float f2 = cyg2.a(this.b.ba);
        float f3 = cyg2.b(this.b.bb);
        double d9 = d6 - this.l;
        double d10 = d7 - this.m;
        double d11 = d8 - this.n;
        double d12 = this.b.aX * this.b.aX + this.b.aY * this.b.aY + this.b.aZ * this.b.aZ;
        double d13 = d9 * d9 + d10 * d10 + d11 * d11;
        ++this.F;
        int n2 = this.F - this.G;
        if (n2 > 5) {
            c.a("{} is sending move packets too frequently ({} packets since last tick)", this.b.i_(), n2);
            n2 = 1;
        }
        if (!(this.b.cQ() || this.b.bS().F().b("disableElytraMovementCheck") && this.b.bL())) {
            float f4;
            float f5 = f4 = this.b.bL() ? 300.0f : 100.0f;
            if (!(!(d13 - d12 > (double)(f4 * (float)n2)) || this.d.R() && this.d.Q().equals(this.b.i_()))) {
                c.f("{} moved too quickly! {},{},{}", this.b.i_(), d9, d10, d11);
                this.a(this.b.aU, this.b.aV, this.b.aW, this.b.ba, this.b.bb);
                return;
            }
        }
        boolean bl2 = ((iu)((Object)ls2)).a(this.b, this.b.cD().c(0.0625)).isEmpty();
        d9 = d6 - this.o;
        d10 = d7 - this.p;
        d11 = d8 - this.q;
        if (this.b.be && !cyg2.a() && d10 > 0.0) {
            this.b.ad_();
        }
        this.b.b(d9, d10, d11);
        this.b.be = cyg2.a();
        double d14 = d10;
        d9 = d6 - this.b.aU;
        d10 = d7 - this.b.aV;
        if (d10 > -0.5 || d10 < 0.5) {
            d10 = 0.0;
        }
        d11 = d8 - this.b.aW;
        d13 = d9 * d9 + d10 * d10 + d11 * d11;
        boolean bl3 = false;
        if (!this.b.cQ() && d13 > 0.0625 && !this.b.H_() && !this.b.c.d() && this.b.c.b() != bvh.e) {
            bl3 = true;
            c.f("{} moved wrongly!", this.b.i_());
        }
        this.b.b(d6, d7, d8, f2, f3);
        this.b.f(this.b.aU - d2, this.b.aV - d3, this.b.aW - d4);
        if (!this.b.bv && !this.b.H_()) {
            boolean bl4 = ((iu)((Object)ls2)).a(this.b, this.b.cD().c(0.0625)).isEmpty();
            if (bl2 && (bl3 || !bl4)) {
                this.a(d2, d3, d4, f2, f3);
                return;
            }
        }
        this.B = d14 >= -0.03125;
        this.B &= !this.d.ag() && !this.b.G.c;
        this.B &= !this.b.b(ake.y) && !this.b.bL() && !((iu)((Object)ls2)).d(this.b.cD().b(0.0625).a(0.0, -0.55, 0.0));
        this.b.be = cyg2.a();
        ((cmt)((Object)this.d.al())).d(this.b);
        this.b.a(this.b.aV - d5, cyg2.a());
        this.o = this.b.aU;
        this.p = this.b.aV;
        this.q = this.b.aW;
    }

    public void a(double d2, double d3, double d4, float f2, float f3) {
        this.a(d2, d3, d4, f2, f3, Collections.emptySet());
    }

    public void a(double d2, double d3, double d4, float f2, float f3, Set set) {
        double d5 = set.contains((Object)bgf.a) ? this.b.aU : 0.0;
        double d6 = set.contains((Object)bgf.b) ? this.b.aV : 0.0;
        double d7 = set.contains((Object)bgf.c) ? this.b.aW : 0.0;
        this.y = new amj(d2 + d5, d3 + d6, d4 + d7);
        float f4 = f2;
        float f5 = f3;
        if (set.contains((Object)bgf.d)) {
            f4 += this.b.ba;
        }
        if (set.contains((Object)bgf.e)) {
            f5 += this.b.bb;
        }
        if (++this.z == Integer.MAX_VALUE) {
            this.z = 0;
        }
        this.A = this.e;
        this.b.b(this.y.b, this.y.c, this.y.d, f4, f5);
        this.b.a.a(new aqf(d2, d3, d4, f2, f3, set, this.z));
    }

    @Override
    public void a(cco cco2) {
        ceb.a(cco2, this, this.b.bS());
        ls ls2 = this.d.a(this.b.bS);
        cmz cmz2 = cco2.a();
        this.b.bV();
        switch (cco2.c()) {
            case g: {
                if (!this.b.aL()) {
                    bhl bhl2 = this.b.c(bqp.b);
                    this.b.a(bqp.b, this.b.c(bqp.a));
                    this.b.a(bqp.a, bhl2);
                }
                return;
            }
            case e: {
                if (!this.b.aL()) {
                    this.b.a(false);
                }
                return;
            }
            case d: {
                if (!this.b.aL()) {
                    this.b.a(true);
                }
                return;
            }
            case f: {
                this.b.bJ();
                bhl bhl3 = this.b.bt();
                if (bhl3 != null && bhl3.b == 0) {
                    this.b.a(bqp.a, null);
                }
                return;
            }
            case a: 
            case b: 
            case c: {
                double d2 = this.b.aU - ((double)cmz2.a() + 0.5);
                double d3 = this.b.aV - ((double)cmz2.b() + 0.5) + 1.5;
                double d4 = this.b.aW - ((double)cmz2.c() + 0.5);
                double d5 = d2 * d2 + d3 * d3 + d4 * d4;
                if (d5 > 36.0) {
                    return;
                }
                if (cmz2.b() < this.d.aj()) break;
                return;
            }
            default: {
                throw new IllegalArgumentException("Invalid player action");
            }
        }
        if (cco2.c() == bpk.a) {
            if (!this.d.a((aid)((Object)ls2), (cm)((Object)cmz2), (zs)((Object)this.b)) && ((iu)((Object)ls2)).U().a(cmz2)) {
                this.b.c.a(cmz2, cco2.b());
            } else {
                this.b.a.a(new cjj((iu)((Object)ls2), cmz2));
            }
        } else {
            if (cco2.c() == bpk.c) {
                this.b.c.a(cmz2);
            } else if (cco2.c() == bpk.b) {
                this.b.c.e();
            }
            if (((iu)((Object)ls2)).n(cmz2).a() != ahk.a) {
                this.b.a.a(new cjj((iu)((Object)ls2), cmz2));
            }
        }
    }

    @Override
    public void a(apf apf2) {
        ceb.a(apf2, this, this.b.bS());
        ls ls2 = this.d.a(this.b.bS);
        bqp bqp2 = apf2.c();
        bhl bhl2 = this.b.c(bqp2);
        cmz cmz2 = apf2.a();
        bqk bqk2 = apf2.b();
        this.b.bV();
        if (cmz2.b() < this.d.aj() - 1 || bqk2 != bqk.b && cmz2.b() < this.d.aj()) {
            if (this.y == null && this.b.i((double)cmz2.a() + 0.5, (double)cmz2.b() + 0.5, (double)cmz2.c() + 0.5) < 64.0 && !this.d.a((aid)((Object)ls2), (cm)((Object)cmz2), (zs)((Object)this.b)) && ((iu)((Object)ls2)).U().a(cmz2)) {
                this.b.c.a(this.b, (iu)((Object)ls2), bhl2, bqp2, cmz2, bqk2, apf2.d(), apf2.e(), apf2.f());
            }
        } else {
            du du2 = new du("build.tooHigh", this.d.aj());
            du2.h().a(aug.m);
            this.b.a.a(new cxg(du2));
        }
        this.b.a.a(new cjj((iu)((Object)ls2), cmz2));
        this.b.a.a(new cjj((iu)((Object)ls2), cmz2.c(bqk2)));
        bhl2 = this.b.c(bqp2);
        if (bhl2 != null && bhl2.b == 0) {
            this.b.a(bqp2, null);
        }
    }

    @Override
    public void a(ciz ciz2) {
        ceb.a(ciz2, this, this.b.bS());
        ls ls2 = this.d.a(this.b.bS);
        bqp bqp2 = ciz2.a();
        bhl bhl2 = this.b.c(bqp2);
        this.b.bV();
        if (bhl2 == null) {
            return;
        }
        this.b.c.a(this.b, (iu)((Object)ls2), bhl2, bqp2);
        bhl2 = this.b.c(bqp2);
        if (bhl2 != null && bhl2.b == 0) {
            this.b.a(bqp2, null);
            bhl2 = null;
        }
    }

    @Override
    public void a(ci ci2) {
        ceb.a(ci2, this, this.b.bS());
        if (this.b.aL()) {
            cpk cpk2 = null;
            for (v v2 : this.d.d) {
                if (v2 != null && (cpk2 = ci2.a((alj)((Object)v2))) != null) break;
            }
            if (cpk2 != null) {
                this.b.w(this.b);
                this.b.s_();
                if (cpk2.aQ == this.b.aQ) {
                    this.b.l(cpk2.aU, cpk2.aV, cpk2.aW);
                } else {
                    alj alj2 = this.b.bS();
                    alj alj3 = (alj)cpk2.aQ;
                    this.b.bS = cpk2.bS;
                    this.a(new bzd(this.b.bS, alj2.Q(), alj2.E().s(), this.b.c.b()));
                    ((cmt)((Object)this.d.al())).f(this.b);
                    alj2.f(this.b);
                    this.b.bk = false;
                    this.b.a_(cpk2.aU, cpk2.aV, cpk2.aW, cpk2.ba, cpk2.bb);
                    if (this.b.bj()) {
                        alj2.a((cpk)this.b, false);
                        alj3.b(this.b);
                        alj3.a((cpk)this.b, false);
                    }
                    this.b.b(alj3);
                    ((cmt)((Object)this.d.al())).a(this.b, alj2);
                    this.b.l(cpk2.aU, cpk2.aV, cpk2.aW);
                    this.b.c.a(alj3);
                    ((cmt)((Object)this.d.al())).b(this.b, alj3);
                    ((cmt)((Object)this.d.al())).g(this.b);
                }
            }
        }
    }

    @Override
    public void a(cyj cyj2) {
    }

    @Override
    public void a(bpd bpd2) {
        ceb.a(bpd2, this, this.b.bS());
        cpk cpk2 = this.b.cL();
        if (cpk2 instanceof cor) {
            ((cor)cpk2).a(bpd2.a(), bpd2.b());
        }
    }

    @Override
    public void a(cbg cbg2) {
        c.d("{} lost connection: {}", this.b.i_(), cbg2);
        this.d.aC();
        du du2 = new du("multiplayer.player.left", this.b.v());
        du2.h().a(aug.o);
        ((cmt)((Object)this.d.al())).a(du2);
        this.b.bQ();
        ((cmt)((Object)this.d.al())).e(this.b);
        if (this.d.R() && this.b.i_().equals(this.d.Q())) {
            c.d("Stopping singleplayer server as player logged out");
            this.d.x();
        }
    }

    public void a(ds ds2) {
        Object object;
        if (ds2 instanceof cxg) {
            cxg cxg2 = (cxg)ds2;
            object = this.b.bU();
            if (object == bgi.c) {
                return;
            }
            if (object == bgi.b && !cxg2.b()) {
                return;
            }
        }
        try {
            this.a.a(ds2);
        }
        catch (Throwable throwable) {
            object = cet.a(throwable, "Sending packet");
            sx sx2 = ((cet)object).a("Packet being sent");
            sx2.a("Packet class", new dgm(this, ds2));
            throw new oz((cet)object);
        }
    }

    @Override
    public void a(ayo ayo2) {
        ceb.a(ayo2, this, this.b.bS());
        if (ayo2.a() < 0 || ayo2.a() >= cps.i()) {
            c.f("{} tried to set an invalid carried item", this.b.i_());
            return;
        }
        this.b.n.d = ayo2.a();
        this.b.bV();
    }

    @Override
    public void a(dcf dcf2) {
        ceb.a(dcf2, this, this.b.bS());
        if (this.b.bU() == bgi.c) {
            du du2 = new du("chat.cannotSend", new Object[0]);
            du2.h().a(aug.m);
            this.a(new cxg(du2));
            return;
        }
        this.b.bV();
        String string = dcf2.a();
        string = am.v(string);
        for (int i2 = 0; i2 < string.length(); ++i2) {
            if (ate.a(string.charAt(i2))) continue;
            this.a("Illegal characters in chat");
            return;
        }
        if (string.startsWith("/")) {
            this.b(string);
        } else {
            du du3 = new du("chat.type.text", this.b.v(), string);
            ((cmt)((Object)this.d.al())).a(du3, false);
        }
        this.i += 20;
        if (this.i > 200 && !((cmt)((Object)this.d.al())).e(this.b.aq())) {
            this.a("disconnect.spam");
        }
    }

    private void b(String string) {
        this.d.N().a((ala)this.b, string);
    }

    @Override
    public void a(apl apl2) {
        ceb.a(apl2, this, this.b.bS());
        this.b.bV();
        this.b.a(apl2.a());
    }

    @Override
    public void a(cqg cqg2) {
        ceb.a(cqg2, this, this.b.bS());
        this.b.bV();
        switch (cqg2.a()) {
            case a: {
                this.b.q(true);
                break;
            }
            case b: {
                this.b.q(false);
                break;
            }
            case d: {
                this.b.c_(true);
                break;
            }
            case e: {
                this.b.c_(false);
                break;
            }
            case c: {
                this.b.a(false, true, true);
                this.y = new amj(this.b.aU, this.b.aV, this.b.aW);
                break;
            }
            case f: {
                if (!(this.b.cL() instanceof btj)) break;
                btj btj2 = (btj)((Object)this.b.cL());
                int n2 = cqg2.b();
                if (!btj2.ae() || n2 <= 0) break;
                btj2.h(n2);
                break;
            }
            case g: {
                if (!(this.b.cL() instanceof btj)) break;
                btj btj3 = (btj)((Object)this.b.cL());
                btj3.af();
                break;
            }
            case h: {
                if (!(this.b.cL() instanceof it)) break;
                ((it)this.b.cL()).d(this.b);
                break;
            }
            case i: {
                if (!this.b.be && this.b.aY < 0.0 && !this.b.bL() && !this.b.V_()) {
                    bhl bhl2 = this.b.a(dfm.e);
                    if (bhl2 == null || bhl2.a() != hp.cR || !anb.g(bhl2)) break;
                    this.b.cS();
                    break;
                }
                this.b.cT();
                break;
            }
            default: {
                throw new IllegalArgumentException("Invalid client command!");
            }
        }
    }

    @Override
    public void a(cnj cnj2) {
        ceb.a(cnj2, this, this.b.bS());
        ls ls2 = this.d.a(this.b.bS);
        cpk cpk2 = cnj2.a((iu)((Object)ls2));
        this.b.bV();
        if (cpk2 != null) {
            boolean bl2 = this.b.j(cpk2);
            double d2 = 36.0;
            if (!bl2) {
                d2 = 9.0;
            }
            if (this.b.l(cpk2) < d2) {
                if (cnj2.a() == ahr.a) {
                    bqp bqp2 = cnj2.b();
                    bhl bhl2 = this.b.c(bqp2);
                    this.b.a(cpk2, bhl2, bqp2);
                } else if (cnj2.a() == ahr.c) {
                    bqp bqp3 = cnj2.b();
                    bhl bhl3 = this.b.c(bqp3);
                    cpk2.a(this.b, cnj2.c(), bhl3, bqp3);
                } else if (cnj2.a() == ahr.b) {
                    if (cpk2 instanceof er || cpk2 instanceof cvs || cpk2 instanceof cwt || cpk2 == this.b) {
                        this.a("Attempting to attack an invalid entity");
                        this.d.f("Player " + this.b.i_() + " tried to attack an invalid entity");
                        return;
                    }
                    this.b.g(cpk2);
                }
            }
        }
    }

    @Override
    public void a(daq daq2) {
        ceb.a(daq2, this, this.b.bS());
        this.b.bV();
        cpl cpl2 = daq2.a();
        switch (cpl2) {
            case a: {
                if (this.b.h) {
                    this.b.h = false;
                    this.b = ((cmt)((Object)this.d.al())).a(this.b, 0, true);
                    break;
                }
                if (this.b.bh() > 0.0f) {
                    return;
                }
                this.b = ((cmt)((Object)this.d.al())).a(this.b, 0, false);
                if (!this.d.p()) break;
                this.b.a(bvh.e);
                this.b.bS().F().a("spectatorsGenerateChunks", "false");
                break;
            }
            case b: {
                this.b.cM().a(this.b);
                break;
            }
            case c: {
                this.b.a((cyd)bpa.f);
            }
        }
    }

    @Override
    public void a(aqt aqt2) {
        ceb.a(aqt2, this, this.b.bS());
        this.b.bP();
    }

    @Override
    public void a(buu buu2) {
        ceb.a(buu2, this, this.b.bS());
        this.b.bV();
        if (this.b.p.h == buu2.a() && this.b.p.c(this.b)) {
            if (this.b.aL()) {
                ArrayList arrayList = ov.a();
                for (int i2 = 0; i2 < this.b.p.g.size(); ++i2) {
                    arrayList.add(((ux)this.b.p.g.get(i2)).a());
                }
                this.b.a(this.b.p, arrayList);
            } else {
                bhl bhl2 = this.b.p.a(buu2.b(), buu2.c(), buu2.f(), (bdl)this.b);
                if (bhl.b(buu2.e(), bhl2)) {
                    this.b.a.a(new jh(buu2.a(), buu2.d(), true));
                    this.b.f = true;
                    this.b.p.a();
                    this.b.bO();
                    this.b.f = false;
                } else {
                    this.k.a(this.b.p.h, buu2.d());
                    this.b.a.a(new jh(buu2.a(), buu2.d(), false));
                    this.b.p.a((bdl)this.b, false);
                    ArrayList arrayList = ov.a();
                    for (int i3 = 0; i3 < this.b.p.g.size(); ++i3) {
                        bhl bhl3 = ((ux)this.b.p.g.get(i3)).a();
                        bhl bhl4 = bhl3 != null && bhl3.b > 0 ? bhl3 : null;
                        arrayList.add(bhl4);
                    }
                    this.b.a(this.b.p, arrayList);
                }
            }
        }
    }

    @Override
    public void a(cqn cqn2) {
        ceb.a(cqn2, this, this.b.bS());
        this.b.bV();
        if (this.b.p.h == cqn2.a() && this.b.p.c(this.b) && !this.b.aL()) {
            this.b.p.a((bdl)this.b, cqn2.b());
            this.b.p.a();
        }
    }

    @Override
    public void a(gn gn2) {
        ceb.a(gn2, this, this.b.bS());
        if (this.b.c.d()) {
            boolean bl2;
            Object object;
            cmz cmz2;
            bql bql2;
            bvp bvp2;
            boolean bl3 = gn2.a() < 0;
            bhl bhl2 = gn2.b();
            if (bhl2 != null && bhl2.n() && bhl2.o().b("BlockEntityTag", 10) && (bvp2 = bhl2.o().o("BlockEntityTag")).e("x") && bvp2.e("y") && bvp2.e("z") && (bql2 = this.b.aQ.q(cmz2 = new cmz(bvp2.h("x"), bvp2.h("y"), bvp2.h("z")))) != null) {
                object = bql2.b(new bvp());
                ((bvp)object).q("x");
                ((bvp)object).q("y");
                ((bvp)object).q("z");
                bhl2.a("BlockEntityTag", (azt)object);
            }
            boolean bl4 = gn2.a() >= 1 && gn2.a() <= 45;
            boolean bl5 = bhl2 == null || bhl2.a() != null;
            boolean bl6 = bl2 = bhl2 == null || bhl2.h() >= 0 && bhl2.b <= 64 && bhl2.b > 0;
            if (bl4 && bl5 && bl2) {
                if (bhl2 == null) {
                    this.b.o.a(gn2.a(), null);
                } else {
                    this.b.o.a(gn2.a(), bhl2);
                }
                this.b.o.a((bdl)this.b, true);
            } else if (bl3 && bl5 && bl2 && this.j < 200) {
                this.j += 20;
                object = this.b.a(bhl2, true);
                if (object != null) {
                    ((er)object).f();
                }
            }
        }
    }

    @Override
    public void a(asa asa2) {
        ceb.a(asa2, this, this.b.bS());
        Short s2 = (Short)this.k.a(this.b.p.h);
        if (s2 != null && asa2.b() == s2.shortValue() && this.b.p.h == asa2.a() && !this.b.p.c(this.b) && !this.b.aL()) {
            this.b.p.a((bdl)this.b, true);
        }
    }

    @Override
    public void a(btv btv2) {
        ceb.a(btv2, this, this.b.bS());
        this.b.bV();
        ls ls2 = this.d.a(this.b.bS);
        cmz cmz2 = btv2.a();
        if (((iu)((Object)ls2)).d(cmz2)) {
            dbk dbk2 = ((iu)((Object)ls2)).n(cmz2);
            bql bql2 = ((iu)((Object)ls2)).q(cmz2);
            if (!(bql2 instanceof bxr)) {
                return;
            }
            bxr bxr2 = (bxr)bql2;
            if (!bxr2.f() || bxr2.g() != this.b) {
                this.d.f("Player " + this.b.i_() + " just tried to change non-editable sign");
                return;
            }
            String[] arrstring = btv2.b();
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                bxr2.a[i2] = new aym(aug.a(arrstring[i2]));
            }
            bxr2.c_();
            ((iu)((Object)ls2)).a(cmz2, dbk2, dbk2, 3);
        }
    }

    @Override
    public void a(ani ani2) {
        if (ani2.a() == this.f) {
            int n2 = (int)(this.d() - this.g);
            this.b.g = (this.b.g * 3 + n2) / 4;
        }
    }

    private long d() {
        return System.nanoTime() / 1000000L;
    }

    @Override
    public void a(cmw cmw2) {
        ceb.a(cmw2, this, this.b.bS());
        this.b.G.b = cmw2.b() && this.b.G.c;
    }

    @Override
    public void a(aas aas2) {
        ceb.a(aas2, this, this.b.bS());
        ArrayList arrayList = ov.a();
        for (String string : this.d.a((n)((Object)this.b), aas2.a(), (cm)((Object)aas2.b()), aas2.c())) {
            arrayList.add(string);
        }
        this.b.a.a(new cjh(arrayList.toArray(new String[arrayList.size()])));
    }

    @Override
    public void a(aoc aoc2) {
        ceb.a(aoc2, this, this.b.bS());
        this.b.a(aoc2);
    }

    @Override
    public void a(pm pm2) {
        block82: {
            ceb.a(pm2, this, this.b.bS());
            String string = pm2.a();
            if ("MC|BEdit".equals(string)) {
                si si2 = pm2.b();
                try {
                    bhl bhl2 = si2.i();
                    if (bhl2 == null) {
                        return;
                    }
                    if (!bsp.b(bhl2.o())) {
                        throw new IOException("Invalid book tag!");
                    }
                    bhl bhl3 = this.b.bt();
                    if (bhl3 == null) {
                        return;
                    }
                    if (bhl2.a() == hp.bW && bhl2.a() == bhl3.a()) {
                        bhl3.a("pages", bhl2.o().c("pages", 8));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't handle book info", (Throwable)exception);
                }
            } else if ("MC|BSign".equals(string)) {
                si si3 = pm2.b();
                try {
                    bhl bhl4 = si3.i();
                    if (bhl4 == null) {
                        return;
                    }
                    if (!daa.b(bhl4.o())) {
                        throw new IOException("Invalid book tag!");
                    }
                    bhl bhl5 = this.b.bt();
                    if (bhl5 == null) {
                        return;
                    }
                    if (bhl4.a() == hp.bW && bhl5.a() == hp.bW) {
                        bhl5.a("author", new byh(this.b.i_()));
                        bhl5.a("title", new byh(bhl4.o().l("title")));
                        bmh bmh2 = bhl4.o().c("pages", 8);
                        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
                            String string2 = bmh2.g(i2);
                            aym aym2 = new aym(string2);
                            string2 = zf.a(aym2);
                            bmh2.a(i2, new byh(string2));
                        }
                        bhl5.a("pages", bmh2);
                        bhl5.a(hp.bX);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't sign book", (Throwable)exception);
                }
            } else if ("MC|TrSel".equals(string)) {
                try {
                    int n2 = pm2.b().K();
                    apq apq2 = this.b.p;
                    if (apq2 instanceof dbx) {
                        ((dbx)apq2).d(n2);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't select trade", (Throwable)exception);
                }
            } else if ("MC|AdvCmd".equals(string)) {
                if (!this.d.ah()) {
                    this.b.a(new du("advMode.notEnabled", new Object[0]));
                    return;
                }
                if (!this.b.aU()) {
                    this.b.a(new du("advMode.notAllowed", new Object[0]));
                    return;
                }
                si si4 = pm2.b();
                try {
                    Object object;
                    byte by2 = si4.E();
                    cxh cxh2 = null;
                    if (by2 == 0) {
                        object = this.b.aQ.q(new cmz(si4.K(), si4.K(), si4.K()));
                        if (object instanceof jf) {
                            cxh2 = ((jf)object).d();
                        }
                    } else if (by2 == 1 && (object = this.b.aQ.a(si4.K())) instanceof dbu) {
                        cxh2 = ((dbu)object).p();
                    }
                    object = si4.e(si4.r());
                    boolean bl2 = si4.D();
                    if (cxh2 != null) {
                        cxh2.a((String)object);
                        cxh2.a(bl2);
                        if (!bl2) {
                            cxh2.b((cbg)null);
                        }
                        cxh2.h();
                        this.b.a(new du("advMode.setCommand.success", object));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set command block", (Throwable)exception);
                }
            } else if ("MC|AutoCmd".equals(string)) {
                if (!this.d.ah()) {
                    this.b.a(new du("advMode.notEnabled", new Object[0]));
                    return;
                }
                if (!this.b.aU()) {
                    this.b.a(new du("advMode.notAllowed", new Object[0]));
                    return;
                }
                si si5 = pm2.b();
                try {
                    cxh cxh3 = null;
                    jf jf2 = null;
                    cmz cmz2 = new cmz(si5.K(), si5.K(), si5.K());
                    bql bql2 = this.b.aQ.q(cmz2);
                    if (bql2 instanceof jf) {
                        jf2 = (jf)bql2;
                        cxh3 = jf2.d();
                    }
                    String string3 = si5.e(si5.r());
                    boolean bl3 = si5.D();
                    cjt cjt2 = cjt.valueOf(si5.e(16));
                    boolean bl4 = si5.D();
                    boolean bl5 = si5.D();
                    if (cxh3 == null) break block82;
                    bqk bqk2 = (bqk)((Object)this.b.aQ.n(cmz2).b(btt.a));
                    switch (cjt2) {
                        case a: {
                            dbk dbk2 = blg.dd.s();
                            this.b.aQ.a(cmz2, dbk2.a(btt.a, (Comparable)((Object)bqk2)).a(btt.b, Boolean.valueOf(bl4)), 2);
                            break;
                        }
                        case b: {
                            dbk dbk3 = blg.dc.s();
                            this.b.aQ.a(cmz2, dbk3.a(btt.a, (Comparable)((Object)bqk2)).a(btt.b, Boolean.valueOf(bl4)), 2);
                            break;
                        }
                        case c: {
                            dbk dbk4 = blg.bX.s();
                            this.b.aQ.a(cmz2, dbk4.a(btt.a, (Comparable)((Object)bqk2)).a(btt.b, Boolean.valueOf(bl4)), 2);
                        }
                    }
                    bql2.f_();
                    this.b.aQ.a(cmz2, bql2);
                    cxh3.a(string3);
                    cxh3.a(bl3);
                    if (!bl3) {
                        cxh3.b((cbg)null);
                    }
                    jf2.b(bl5);
                    cxh3.h();
                    if (!aco.b(string3)) {
                        this.b.a(new du("advMode.setCommand.success", string3));
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set command block", (Throwable)exception);
                }
            } else if ("MC|Beacon".equals(string)) {
                if (this.b.p instanceof bmj) {
                    try {
                        si si6 = pm2.b();
                        int n3 = si6.K();
                        int n4 = si6.K();
                        bmj bmj2 = (bmj)this.b.p;
                        ux ux2 = bmj2.a(0);
                        if (ux2.b()) {
                            ux2.a(1);
                            tb tb2 = bmj2.b();
                            tb2.b(1, n3);
                            tb2.b(2, n4);
                            tb2.c_();
                        }
                    }
                    catch (Exception exception) {
                        c.b("Couldn't set beacon", (Throwable)exception);
                    }
                }
            } else if ("MC|ItemName".equals(string)) {
                if (this.b.p instanceof li) {
                    li li2 = (li)this.b.p;
                    if (pm2.b() == null || pm2.b().r() < 1) {
                        li2.a("");
                    } else {
                        String string4 = ate.a(pm2.b().e(32767));
                        if (string4.length() <= 30) {
                            li2.a(string4);
                        }
                    }
                }
            } else if ("MC|Struct".equals(string)) {
                if (!this.b.aU()) {
                    return;
                }
                si si7 = pm2.b();
                try {
                    cmz cmz3 = new cmz(si7.K(), si7.K(), si7.K());
                    dbk dbk5 = this.b.aQ.n(cmz3);
                    bql bql3 = this.b.aQ.q(cmz3);
                    if (bql3 instanceof i) {
                        i i3 = (i)bql3;
                        byte by3 = si7.E();
                        String string5 = si7.e(32);
                        i3.a(cfk.valueOf(string5));
                        i3.a(si7.e(64));
                        int n5 = cmk.a(si7.K(), -32, 32);
                        int n6 = cmk.a(si7.K(), -32, 32);
                        int n7 = cmk.a(si7.K(), -32, 32);
                        i3.a(new cmz(n5, n6, n7));
                        int n8 = cmk.a(si7.K(), 0, 32);
                        int n9 = cmk.a(si7.K(), 0, 32);
                        int n10 = cmk.a(si7.K(), 0, 32);
                        i3.b(new cmz(n8, n9, n10));
                        String string6 = si7.e(32);
                        i3.a(cdk.valueOf(string6));
                        String string7 = si7.e(32);
                        i3.a(ih.valueOf(string7));
                        i3.b(si7.e(128));
                        i3.a(si7.D());
                        i3.e(si7.D());
                        i3.f(si7.D());
                        i3.a(cmk.a(si7.O(), 0.0f, 1.0f));
                        i3.a(si7.f());
                        String string8 = i3.c();
                        if (by3 == 2) {
                            if (i3.o()) {
                                this.b.b(new du("structure_block.save_success", string8));
                            } else {
                                this.b.b(new du("structure_block.save_failure", string8));
                            }
                        } else if (by3 == 3) {
                            if (!i3.r()) {
                                this.b.b(new du("structure_block.load_not_found", string8));
                            } else if (i3.p()) {
                                this.b.b(new du("structure_block.load_success", string8));
                            } else {
                                this.b.b(new du("structure_block.load_prepare", string8));
                            }
                        } else if (by3 == 4) {
                            if (i3.n()) {
                                this.b.b(new du("structure_block.size_success", string8));
                            } else {
                                this.b.b(new du("structure_block.size_failure", new Object[0]));
                            }
                        }
                        i3.c_();
                        this.b.aQ.a(cmz3, dbk5, dbk5, 3);
                    }
                }
                catch (Exception exception) {
                    c.b("Couldn't set structure block", (Throwable)exception);
                }
            } else if ("MC|PickItem".equals(string)) {
                si si8 = pm2.b();
                try {
                    int n11 = si8.e();
                    this.b.n.d(n11);
                    this.b.a.a(new bxu(-2, this.b.n.d, this.b.n.a(this.b.n.d)));
                    this.b.a.a(new bxu(-2, n11, this.b.n.a(n11)));
                    this.b.a.a(new bud(this.b.n.d));
                }
                catch (Exception exception) {
                    c.b("Couldn't pick item", (Throwable)exception);
                }
            }
        }
    }
}

