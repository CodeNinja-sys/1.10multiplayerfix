/*
 * Decompiled with CFR 0.150.
 */
public class box
extends cyd {
    public final int a;
    public final int b;
    public final box c;
    private final String k;
    private nf l;
    public final bhl d;
    private boolean m;

    public box(String string, String string2, int n2, int n3, azg azg2, box box2) {
        this(string, string2, n2, n3, new bhl(azg2), box2);
    }

    public box(String string, String string2, int n2, int n3, bfa bfa2, box box2) {
        this(string, string2, n2, n3, new bhl(bfa2), box2);
    }

    public box(String string, String string2, int n2, int n3, bhl bhl2, box box2) {
        super(string, new du("achievement." + string2, new Object[0]));
        this.d = bhl2;
        this.k = "achievement." + string2 + ".desc";
        this.a = n2;
        this.b = n3;
        if (n2 < bpa.a) {
            bpa.a = n2;
        }
        if (n3 < bpa.b) {
            bpa.b = n3;
        }
        if (n2 > bpa.c) {
            bpa.c = n2;
        }
        if (n3 > bpa.d) {
            bpa.d = n3;
        }
        this.c = box2;
    }

    public box b() {
        this.f = true;
        return this;
    }

    public box c() {
        this.m = true;
        return this;
    }

    public box d() {
        super.aE_();
        bpa.e.add(this);
        return this;
    }

    @Override
    public boolean e() {
        return true;
    }

    @Override
    public cbg f() {
        cbg cbg2 = super.f();
        cbg2.h().a(this.h() ? aug.f : aug.k);
        return cbg2;
    }

    public box a(Class class_) {
        return (box)super.b(class_);
    }

    public String g() {
        if (this.l != null) {
            return this.l.a(caf.a(this.k));
        }
        return caf.a(this.k);
    }

    public box a(nf nf2) {
        this.l = nf2;
        return this;
    }

    public boolean h() {
        return this.m;
    }

    @Override
    public /* synthetic */ cyd b(Class class_) {
        return this.a(class_);
    }

    @Override
    public /* synthetic */ cyd aE_() {
        return this.d();
    }

    @Override
    public /* synthetic */ cyd i() {
        return this.b();
    }
}

