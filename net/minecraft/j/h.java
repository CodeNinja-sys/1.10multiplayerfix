/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.j;

import net.minecraft.e.e;
import net.minecraft.e.q;
import net.minecraft.e.y;
import net.minecraft.j.b;
import net.minecraft.j.d;
import net.minecraft.j.f;
import net.minecraft.j.j;
import net.minecraft.j.l;
import net.minecraft.j.n;
import net.minecraft.j.p;
import net.minecraft.j.r;
import net.minecraft.u.d.o;
import org.apache.logging.log4j.c;

public class h
extends net.minecraft.q.f {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private r b;
    private e c;

    public h() {
        this("scoreboard");
    }

    public h(String string) {
        super(string);
    }

    public void a(r r2) {
        this.b = r2;
        if (this.c != null) {
            this.a(this.c);
        }
    }

    @Override
    public void a(e e2) {
        if (this.b == null) {
            this.c = e2;
        } else {
            this.b(e2.c("Objectives", 10));
            this.c(e2.c("PlayerScores", 10));
            if (e2.b("DisplaySlots", 10)) {
                this.c(e2.o("DisplaySlots"));
            }
            if (e2.b("Teams", 9)) {
                this.a(e2.c("Teams", 10));
            }
        }
    }

    protected void a(q q2) {
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            Enum enum_;
            e e2 = q2.b(i2);
            String string = e2.l("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            d d2 = this.b.e(string);
            String string2 = e2.l("DisplayName");
            if (string2.length() > 32) {
                string2 = string2.substring(0, 32);
            }
            d2.a(string2);
            if (e2.b("TeamColor", 8)) {
                d2.a(o.b(e2.l("TeamColor")));
            }
            d2.b(e2.l("Prefix"));
            d2.c(e2.l("Suffix"));
            if (e2.b("AllowFriendlyFire", 99)) {
                d2.a(e2.p("AllowFriendlyFire"));
            }
            if (e2.b("SeeFriendlyInvisibles", 99)) {
                d2.b(e2.p("SeeFriendlyInvisibles"));
            }
            if (e2.b("NameTagVisibility", 8) && (enum_ = n.a(e2.l("NameTagVisibility"))) != null) {
                d2.a((n)enum_);
            }
            if (e2.b("DeathMessageVisibility", 8) && (enum_ = n.a(e2.l("DeathMessageVisibility"))) != null) {
                d2.b((n)enum_);
            }
            if (e2.b("CollisionRule", 8) && (enum_ = net.minecraft.j.b.a(e2.l("CollisionRule"))) != null) {
                d2.a((b)enum_);
            }
            this.a(d2, e2.c("Players", 8));
        }
    }

    protected void a(d d2, q q2) {
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            this.b.a(q2.g(i2), d2.a());
        }
    }

    protected void c(e e2) {
        for (int i2 = 0; i2 < 19; ++i2) {
            if (!e2.b("slot_" + i2, 8)) continue;
            String string = e2.l("slot_" + i2);
            j j2 = this.b.b(string);
            this.b.a(i2, j2);
        }
    }

    protected void b(q q2) {
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e2 = q2.b(i2);
            f f2 = (f)f.a.get(e2.l("CriteriaName"));
            if (f2 == null) continue;
            String string = e2.l("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            j j2 = this.b.a(string, f2);
            j2.a(e2.l("DisplayName"));
            j2.a(l.a(e2.l("RenderType")));
        }
    }

    protected void c(q q2) {
        for (int i2 = 0; i2 < q2.e(); ++i2) {
            e e2 = q2.b(i2);
            j j2 = this.b.b(e2.l("Objective"));
            String string = e2.l("Name");
            if (string.length() > 40) {
                string = string.substring(0, 40);
            }
            p p2 = this.b.c(string, j2);
            p2.c(e2.h("Score"));
            if (!e2.e("Locked")) continue;
            p2.a(e2.p("Locked"));
        }
    }

    @Override
    public e b(e e2) {
        if (this.b == null) {
            a.f("Tried to save scoreboard without having a scoreboard...");
            return e2;
        }
        e2.a("Objectives", this.b());
        e2.a("PlayerScores", this.c());
        e2.a("Teams", this.a());
        this.d(e2);
        return e2;
    }

    protected q a() {
        q q2 = new q();
        for (d d2 : this.b.f()) {
            e e2 = new e();
            e2.a("Name", d2.a());
            e2.a("DisplayName", d2.b());
            if (d2.l().a() >= 0) {
                e2.a("TeamColor", d2.l().d());
            }
            e2.a("Prefix", d2.d());
            e2.a("Suffix", d2.e());
            e2.a("AllowFriendlyFire", d2.f());
            e2.a("SeeFriendlyInvisibles", d2.g());
            e2.a("NameTagVisibility", d2.h().e);
            e2.a("DeathMessageVisibility", d2.i().e);
            e2.a("CollisionRule", d2.j().e);
            q q3 = new q();
            for (String string : d2.c()) {
                q3.a(new y(string));
            }
            e2.a("Players", q3);
            q2.a(e2);
        }
        return q2;
    }

    protected void d(e e2) {
        e e3 = new e();
        boolean bl2 = false;
        for (int i2 = 0; i2 < 19; ++i2) {
            j j2 = this.b.a(i2);
            if (j2 == null) continue;
            e3.a("slot_" + i2, j2.b());
            bl2 = true;
        }
        if (bl2) {
            e2.a("DisplaySlots", e3);
        }
    }

    protected q b() {
        q q2 = new q();
        for (j j2 : this.b.b()) {
            if (j2.c() == null) continue;
            e e2 = new e();
            e2.a("Name", j2.b());
            e2.a("CriteriaName", j2.c().c());
            e2.a("DisplayName", j2.d());
            e2.a("RenderType", j2.e().a());
            q2.a(e2);
        }
        return q2;
    }

    protected q c() {
        q q2 = new q();
        for (p p2 : this.b.d()) {
            if (p2.c() == null) continue;
            e e2 = new e();
            e2.a("Name", p2.d());
            e2.a("Objective", p2.c().b());
            e2.a("Score", p2.b());
            e2.a("Locked", p2.f());
            q2.a(e2);
        }
        return q2;
    }
}

