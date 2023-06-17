/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.c.a;

public class jv
extends bwr {
    private final String a;
    private final String b;
    private String d = "";

    public jv(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public String a() {
        return this.a;
    }

    public String c() {
        return this.b;
    }

    public void a(String string) {
        this.d = string;
    }

    @Override
    public String b() {
        return this.d;
    }

    public void a(ala ala2) {
        bhi bhi2;
        bzt bzt2;
        a a2 = ala2.o_();
        if (a2 != null && a2.M() && aco.b(this.d) && (bzt2 = ((iu)((Object)a2.a(0))).P()).b(this.a, bhi2 = bzt2.b(this.b))) {
            czu czu2 = bzt2.c(this.a, bhi2);
            this.a(String.format("%d", czu2.b()));
            return;
        }
        this.d = "";
    }

    public jv d() {
        jv jv2 = new jv(this.a, this.b);
        jv2.a(this.d);
        jv2.a(this.h().l());
        for (cbg cbg2 : this.g()) {
            jv2.a(cbg2.f());
        }
        return jv2;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof jv) {
            jv jv2 = (jv)object;
            return this.a.equals(jv2.a) && this.b.equals(jv2.b) && super.equals(object);
        }
        return false;
    }

    @Override
    public String toString() {
        return "ScoreComponent{name='" + this.a + '\'' + "objective='" + this.b + '\'' + ", siblings=" + this.c + ", style=" + this.h() + '}';
    }

    @Override
    public /* synthetic */ cbg f() {
        return this.d();
    }
}

