/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dcr
extends bh {
    private static final d b = org.apache.logging.log4j.c.c();
    private bzt c;
    private bvp d;

    public dcr() {
        this("scoreboard");
    }

    public dcr(String string) {
        super(string);
    }

    public void a(bzt bzt2) {
        this.c = bzt2;
        if (this.d != null) {
            this.a(this.d);
        }
    }

    @Override
    public void a(bvp bvp2) {
        if (this.c == null) {
            this.d = bvp2;
            return;
        }
        this.b(bvp2.c("Objectives", 10));
        this.c(bvp2.c("PlayerScores", 10));
        if (bvp2.b("DisplaySlots", 10)) {
            this.c(bvp2.o("DisplaySlots"));
        }
        if (bvp2.b("Teams", 9)) {
            this.a(bvp2.c("Teams", 10));
        }
    }

    protected void a(bmh bmh2) {
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            Enum enum_;
            bvp bvp2 = bmh2.b(i2);
            String string = bvp2.l("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            ef ef2 = this.c.e(string);
            String string2 = bvp2.l("DisplayName");
            if (string2.length() > 32) {
                string2 = string2.substring(0, 32);
            }
            ef2.a(string2);
            if (bvp2.b("TeamColor", 8)) {
                ef2.a(aug.b(bvp2.l("TeamColor")));
            }
            ef2.b(bvp2.l("Prefix"));
            ef2.c(bvp2.l("Suffix"));
            if (bvp2.b("AllowFriendlyFire", 99)) {
                ef2.a(bvp2.p("AllowFriendlyFire"));
            }
            if (bvp2.b("SeeFriendlyInvisibles", 99)) {
                ef2.b(bvp2.p("SeeFriendlyInvisibles"));
            }
            if (bvp2.b("NameTagVisibility", 8) && (enum_ = afb.a(bvp2.l("NameTagVisibility"))) != null) {
                ef2.a((afb)enum_);
            }
            if (bvp2.b("DeathMessageVisibility", 8) && (enum_ = afb.a(bvp2.l("DeathMessageVisibility"))) != null) {
                ef2.b((afb)enum_);
            }
            if (bvp2.b("CollisionRule", 8) && (enum_ = bfo.a(bvp2.l("CollisionRule"))) != null) {
                ef2.a((bfo)enum_);
            }
            this.a(ef2, bvp2.c("Players", 8));
        }
    }

    protected void a(ef ef2, bmh bmh2) {
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            this.c.a(bmh2.g(i2), ef2.a());
        }
    }

    protected void c(bvp bvp2) {
        for (int i2 = 0; i2 < 19; ++i2) {
            if (!bvp2.b("slot_" + i2, 8)) continue;
            String string = bvp2.l("slot_" + i2);
            bhi bhi2 = this.c.b(string);
            this.c.a(i2, bhi2);
        }
    }

    protected void b(bmh bmh2) {
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp2 = bmh2.b(i2);
            bcu bcu2 = (bcu)bcu.a.get(bvp2.l("CriteriaName"));
            if (bcu2 == null) continue;
            String string = bvp2.l("Name");
            if (string.length() > 16) {
                string = string.substring(0, 16);
            }
            bhi bhi2 = this.c.a(string, bcu2);
            bhi2.a(bvp2.l("DisplayName"));
            bhi2.a(bmb.a(bvp2.l("RenderType")));
        }
    }

    protected void c(bmh bmh2) {
        for (int i2 = 0; i2 < bmh2.b(); ++i2) {
            bvp bvp2 = bmh2.b(i2);
            bhi bhi2 = this.c.b(bvp2.l("Objective"));
            String string = bvp2.l("Name");
            if (string.length() > 40) {
                string = string.substring(0, 40);
            }
            czu czu2 = this.c.c(string, bhi2);
            czu2.c(bvp2.h("Score"));
            if (!bvp2.e("Locked")) continue;
            czu2.a(bvp2.p("Locked"));
        }
    }

    @Override
    public bvp b(bvp bvp2) {
        if (this.c == null) {
            b.f("Tried to save scoreboard without having a scoreboard...");
            return bvp2;
        }
        bvp2.a("Objectives", this.d());
        bvp2.a("PlayerScores", this.e());
        bvp2.a("Teams", this.c());
        this.d(bvp2);
        return bvp2;
    }

    protected bmh c() {
        bmh bmh2 = new bmh();
        Collection collection = this.c.f();
        for (ef ef2 : collection) {
            bvp bvp2 = new bvp();
            bvp2.a("Name", ef2.a());
            bvp2.a("DisplayName", ef2.b());
            if (ef2.l().a() >= 0) {
                bvp2.a("TeamColor", ef2.l().d());
            }
            bvp2.a("Prefix", ef2.d());
            bvp2.a("Suffix", ef2.e());
            bvp2.a("AllowFriendlyFire", ef2.f());
            bvp2.a("SeeFriendlyInvisibles", ef2.g());
            bvp2.a("NameTagVisibility", ef2.h().e);
            bvp2.a("DeathMessageVisibility", ef2.i().e);
            bvp2.a("CollisionRule", ef2.j().e);
            bmh bmh3 = new bmh();
            for (String string : ef2.c()) {
                bmh3.a(new byh(string));
            }
            bvp2.a("Players", bmh3);
            bmh2.a(bvp2);
        }
        return bmh2;
    }

    protected void d(bvp bvp2) {
        bvp bvp3 = new bvp();
        boolean bl2 = false;
        for (int i2 = 0; i2 < 19; ++i2) {
            bhi bhi2 = this.c.a(i2);
            if (bhi2 == null) continue;
            bvp3.a("slot_" + i2, bhi2.b());
            bl2 = true;
        }
        if (bl2) {
            bvp2.a("DisplaySlots", bvp3);
        }
    }

    protected bmh d() {
        bmh bmh2 = new bmh();
        Collection collection = this.c.b();
        for (bhi bhi2 : collection) {
            if (bhi2.c() == null) continue;
            bvp bvp2 = new bvp();
            bvp2.a("Name", bhi2.b());
            bvp2.a("CriteriaName", bhi2.c().a());
            bvp2.a("DisplayName", bhi2.d());
            bvp2.a("RenderType", bhi2.e().a());
            bmh2.a(bvp2);
        }
        return bmh2;
    }

    protected bmh e() {
        bmh bmh2 = new bmh();
        Collection collection = this.c.d();
        for (czu czu2 : collection) {
            if (czu2.c() == null) continue;
            bvp bvp2 = new bvp();
            bvp2.a("Name", czu2.d());
            bvp2.a("Objective", czu2.c().b());
            bvp2.a("Score", czu2.b());
            bvp2.a("Locked", czu2.f());
            bmh2.a(bvp2);
        }
        return bmh2;
    }
}

