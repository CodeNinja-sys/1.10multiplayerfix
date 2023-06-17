/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import net.minecraft.n.a;
import net.minecraft.n.a.aa;
import net.minecraft.n.a.ab;
import net.minecraft.n.a.ac;
import net.minecraft.n.a.b;
import net.minecraft.n.a.c;
import net.minecraft.n.a.d;
import net.minecraft.n.a.e;
import net.minecraft.n.a.h;
import net.minecraft.n.a.l;
import net.minecraft.n.a.o;
import net.minecraft.n.a.r;
import net.minecraft.n.a.s;
import net.minecraft.n.a.t;
import net.minecraft.n.a.u;
import net.minecraft.n.a.v;
import net.minecraft.n.a.w;
import net.minecraft.n.a.x;
import net.minecraft.n.a.z;
import net.minecraft.n.ad;
import net.minecraft.n.af;
import net.minecraft.n.ah;
import net.minecraft.n.ai;
import net.minecraft.n.aj;
import net.minecraft.n.ak;
import net.minecraft.n.al;
import net.minecraft.n.am;
import net.minecraft.n.an;
import net.minecraft.n.ar;
import net.minecraft.n.au;
import net.minecraft.n.av;
import net.minecraft.n.aw;
import net.minecraft.n.ay;
import net.minecraft.n.az;
import net.minecraft.n.bc;
import net.minecraft.n.be;
import net.minecraft.n.bg;
import net.minecraft.n.bi;
import net.minecraft.n.bj;
import net.minecraft.n.bk;
import net.minecraft.n.bm;
import net.minecraft.n.bn;
import net.minecraft.n.bq;
import net.minecraft.n.bs;
import net.minecraft.n.f;
import net.minecraft.n.g;
import net.minecraft.n.i;
import net.minecraft.n.j;
import net.minecraft.n.k;
import net.minecraft.n.n;
import net.minecraft.n.q;
import net.minecraft.n.y;

public class m
extends av
implements ay {
    private final net.minecraft.c.a a;

    public m(net.minecraft.c.a a2) {
        this.a = a2;
        this.a(new j());
        this.a(new net.minecraft.n.x());
        this.a(new aj());
        this.a(new am());
        this.a(new bi());
        this.a(new ai());
        this.a(new ak());
        this.a(new an());
        this.a(new a());
        this.a(new aa());
        this.a(new be());
        this.a(new k());
        this.a(new au());
        this.a(new q());
        this.a(new bq());
        this.a(new bn());
        this.a(new net.minecraft.n.a.a());
        this.a(new f());
        this.a(new bc());
        this.a(new ad());
        this.a(new net.minecraft.n.a.m());
        this.a(new r());
        this.a(new y());
        this.a(new net.minecraft.n.a.q());
        this.a(new g());
        this.a(new bk());
        this.a(new w());
        this.a(new i());
        this.a(new bj());
        this.a(new b());
        this.a(new ah());
        this.a(new net.minecraft.n.ab());
        this.a(new net.minecraft.n.a.i());
        this.a(new v());
        this.a(new t());
        this.a(new bg());
        this.a(new aw());
        this.a(new net.minecraft.n.b());
        this.a(new bm());
        this.a(new c());
        this.a(new net.minecraft.n.a.g());
        this.a(new bs());
        this.a(new ar());
        this.a(new af());
        this.a(new net.minecraft.n.z());
        if (a2.ak()) {
            this.a(new ac());
            this.a(new ab());
            this.a(new s());
            this.a(new d());
            this.a(new u());
            this.a(new h());
            this.a(new z());
            this.a(new net.minecraft.n.a.k());
            this.a(new x());
            this.a(new net.minecraft.n.a.j());
            this.a(new e());
            this.a(new n());
            this.a(new net.minecraft.n.a.n());
            this.a(new o());
            this.a(new al());
        } else {
            this.a(new l());
        }
        net.minecraft.n.aa.a(this);
    }

    @Override
    public void a(az az2, net.minecraft.n.t t2, int n2, String string, Object ... arrobject) {
        boolean bl2 = true;
        net.minecraft.c.a a2 = this.a;
        if (!az2.aR()) {
            bl2 = false;
        }
        net.minecraft.u.d.l l2 = new net.minecraft.u.d.l("chat.type.admin", az2.X(), new net.minecraft.u.d.l(string, arrobject));
        l2.a().a(net.minecraft.u.d.o.h);
        l2.a().b(true);
        if (bl2) {
            for (net.minecraft.w.a.b b2 : a2.av().u()) {
                boolean bl3;
                if (b2 == az2 || !a2.av().e(b2.ac()) || !t2.a(this.a, az2)) continue;
                boolean bl4 = az2 instanceof net.minecraft.c.a && this.a.D();
                boolean bl5 = bl3 = az2 instanceof net.minecraft.x.c.a && this.a.C();
                if (!bl4 && !bl3 && (az2 instanceof net.minecraft.x.c.a || az2 instanceof net.minecraft.c.a)) continue;
                b2.a(l2);
            }
        }
        if (az2 != a2 && a2.d[0].G().b("logAdminCommands")) {
            a2.a(l2);
        }
        boolean bl6 = a2.d[0].G().b("sendCommandFeedback");
        if (az2 instanceof net.minecraft.f.q) {
            bl6 = ((net.minecraft.f.q)az2).f();
        }
        if ((n2 & 1) != 1 && bl6 || az2 instanceof net.minecraft.c.a) {
            az2.a(new net.minecraft.u.d.l(string, arrobject));
        }
    }

    @Override
    protected net.minecraft.c.a a() {
        return this.a;
    }
}

