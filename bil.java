/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 */
import com.a.a.n.a.ci;
import com.c.a.c.i;
import com.c.a.f;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import java.io.File;
import java.io.IOException;
import java.util.Queue;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import net.minecraft.c.a;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class bil
extends a {
    private static final d k = org.apache.logging.log4j.c.c();
    private final bxy l;
    private final atd m;
    private boolean n;
    private boolean o;
    private cpd p;

    public bil(bxy bxy2, String string, String string2, atd atd2, com.c.a.e.c c2, i i2, f f2, bas bas2) {
        super(new File(bxy2.w, "saves"), bxy2.O(), (pd)((Object)bxy2.aj()), (YggdrasilAuthenticationService)c2, (MinecraftSessionService)i2, (GameProfileRepository)f2, (ml)((Object)bas2));
        this.i(bxy2.M().c());
        this.j(string);
        this.k(string2);
        this.b(bxy2.w());
        this.c(atd2.c());
        this.c(256);
        this.a((mp)((Object)new afr(this)));
        this.l = bxy2;
        this.m = this.V() ? cj.a : atd2;
    }

    protected blq a() {
        return new abp(this);
    }

    protected void a(String string, String string2, long l2, aaf aaf2, String string3) {
        this.a(string);
        this.d = new alj[3];
        this.i = new long[this.d.length][100];
        ajq ajq2 = this.W().a(string, true);
        this.a(this.S(), (bab)((Object)ajq2));
        cvn cvn2 = ajq2.c();
        if (cvn2 == null) {
            cvn2 = new cvn(this.m, string2);
        } else {
            cvn2.a(string2);
        }
        for (int i2 = 0; i2 < this.d.length; ++i2) {
            int n2 = 0;
            if (i2 == 1) {
                n2 = -1;
            }
            if (i2 == 2) {
                n2 = 1;
            }
            if (i2 == 0) {
                this.d[i2] = this.V() ? (alj)new cj(this, ajq2, cvn2, n2, (cfe)((Object)this.c)).b() : (alj)new alj(this, ajq2, cvn2, n2, (cfe)((Object)this.c)).b();
                ((alj)((Object)this.d[i2])).a(this.m);
            } else {
                this.d[i2] = (alj)new ib((a)this, ajq2, n2, (alj)((Object)this.d[0]), (cfe)((Object)this.c)).b();
            }
            ((iu)((Object)this.d[i2])).a(new zi(this, (alj)((Object)this.d[i2])));
        }
        ((cmt)((Object)this.al())).a((alj[])this.d);
        if (((iu)((Object)this.d[0])).E().w() == null) {
            this.a(this.l.u.aq);
        }
        this.l();
    }

    protected boolean b() {
        k.d("Starting integrated minecraft server version 1.10");
        this.d(true);
        this.e(true);
        this.f(true);
        this.g(true);
        this.h(true);
        k.d("Generating keypair");
        this.a(sv.b());
        this.a(this.S(), this.T(), this.m.d(), this.m.h(), this.m.j());
        this.l(this.Q() + " - " + ((iu)((Object)this.d[0])).E().i());
        return true;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void c() {
        boolean bl2 = this.n;
        boolean bl3 = this.n = bxy.B().x() != null && bxy.B().V();
        if (!bl2 && this.n) {
            k.d("Saving and pausing game...");
            ((cmt)((Object)this.al())).j();
            this.a(false);
        }
        if (this.n) {
            Queue queue = this.j;
            synchronized (queue) {
                while (!this.j.isEmpty()) {
                    asj.a((FutureTask)this.j.poll(), k);
                }
            }
        } else {
            super.C();
            if (this.l.u.d != ((cmt)((Object)this.al())).s()) {
                k.d("Changing view distance to {}, from {}", this.l.u.d, ((cmt)((Object)this.al())).s());
                ((cmt)((Object)this.al())).a(this.l.u.d);
            }
            if (this.l.f != null) {
                cvn cvn2 = ((iu)((Object)this.d[0])).E();
                cvn cvn3 = this.l.f.E();
                if (!cvn2.x() && cvn3.w() != cvn2.w()) {
                    k.d("Changing difficulty to {}, from {}", new Object[]{cvn3.w(), cvn2.w()});
                    this.a(cvn3.w());
                } else if (cvn3.x() && !cvn2.x()) {
                    k.d("Locking difficulty to {}", new Object[]{cvn3.w()});
                    for (ls ls2 : this.d) {
                        if (ls2 == null) continue;
                        ((iu)((Object)ls2)).E().e(true);
                    }
                }
            }
        }
    }

    public boolean d() {
        return false;
    }

    public bvh e() {
        return this.m.e();
    }

    public ct f() {
        return this.l.f.E().w();
    }

    public boolean g() {
        return this.m.f();
    }

    public boolean h() {
        return true;
    }

    public boolean i() {
        return true;
    }

    protected void a(boolean bl2) {
        super.a(bl2);
    }

    public File j() {
        return this.l.w;
    }

    public boolean k() {
        return false;
    }

    public boolean l() {
        return false;
    }

    protected void a(cet cet2) {
        this.l.a(cet2);
    }

    public cet b(cet object) {
        object = super.b((b)object);
        ((cet)object).f().a("Type", new bar(this));
        ((cet)object).f().a("Is Modded", new aiw(this));
        return object;
    }

    public void a(ct ct2) {
        super.a((qp)((Object)ct2));
        if (this.l.f != null) {
            this.l.f.E().a(ct2);
        }
    }

    public void a(et et2) {
        super.a((rb)((Object)et2));
        et2.a("snooper_partner", this.l.J().f());
    }

    public boolean m() {
        return bxy.B().a();
    }

    public String a(bvh bvh2, boolean bl2) {
        try {
            int n2 = -1;
            try {
                n2 = aix.a();
            }
            catch (IOException iOException) {
                // empty catch block
            }
            if (n2 <= 0) {
                n2 = 25564;
            }
            ((afx)((Object)this.am())).a(null, n2);
            k.d("Started on {}", n2);
            this.o = true;
            this.p = new cpd(this.ai(), n2 + "");
            this.p.start();
            ((cmt)((Object)this.al())).a(bvh2);
            ((cmt)((Object)this.al())).c(bl2);
            this.l.h.d(bl2 ? 4 : 0);
            return n2 + "";
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public void n() {
        super.u();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    public void o() {
        ci.a((Future)this.a(new mc(this)));
        super.x();
        if (this.p != null) {
            this.p.interrupt();
            this.p = null;
        }
    }

    public boolean p() {
        return this.o;
    }

    public void a(bvh bvh2) {
        super.a((aib)((Object)bvh2));
        ((cmt)((Object)this.al())).a(bvh2);
    }

    public boolean q() {
        return true;
    }

    public int r() {
        return 4;
    }

    public void s() {
        if (this.aE()) {
            ((iu)((Object)this.d[0])).V().a();
        } else {
            this.a(new axq(this));
        }
    }
}

