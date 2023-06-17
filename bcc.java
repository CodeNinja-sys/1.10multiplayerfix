/*
 * Decompiled with CFR 0.150.
 */
public class bcc {
    private bcc a;
    private aug b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private cxk h;
    private dex i;
    private String j;
    private static final bcc k = new cqz();

    public aug a() {
        return this.b == null ? this.n().a() : this.b;
    }

    public boolean b() {
        return this.c == null ? this.n().b() : this.c.booleanValue();
    }

    public boolean c() {
        return this.d == null ? this.n().c() : this.d.booleanValue();
    }

    public boolean d() {
        return this.f == null ? this.n().d() : this.f.booleanValue();
    }

    public boolean e() {
        return this.e == null ? this.n().e() : this.e.booleanValue();
    }

    public boolean f() {
        return this.g == null ? this.n().f() : this.g.booleanValue();
    }

    public boolean g() {
        return this.c == null && this.d == null && this.f == null && this.e == null && this.g == null && this.b == null && this.h == null && this.i == null && this.j == null;
    }

    public cxk h() {
        return this.h == null ? this.n().h() : this.h;
    }

    public dex i() {
        return this.i == null ? this.n().i() : this.i;
    }

    public String j() {
        return this.j == null ? this.n().j() : this.j;
    }

    public bcc a(aug aug2) {
        this.b = aug2;
        return this;
    }

    public bcc a(Boolean bl2) {
        this.c = bl2;
        return this;
    }

    public bcc b(Boolean bl2) {
        this.d = bl2;
        return this;
    }

    public bcc c(Boolean bl2) {
        this.f = bl2;
        return this;
    }

    public bcc d(Boolean bl2) {
        this.e = bl2;
        return this;
    }

    public bcc e(Boolean bl2) {
        this.g = bl2;
        return this;
    }

    public bcc a(cxk cxk2) {
        this.h = cxk2;
        return this;
    }

    public bcc a(dex dex2) {
        this.i = dex2;
        return this;
    }

    public bcc a(String string) {
        this.j = string;
        return this;
    }

    public bcc a(bcc bcc2) {
        this.a = bcc2;
        return this;
    }

    public String k() {
        if (this.g()) {
            if (this.a != null) {
                return this.a.k();
            }
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (this.a() != null) {
            stringBuilder.append((Object)this.a());
        }
        if (this.b()) {
            stringBuilder.append((Object)aug.r);
        }
        if (this.c()) {
            stringBuilder.append((Object)aug.u);
        }
        if (this.e()) {
            stringBuilder.append((Object)aug.t);
        }
        if (this.f()) {
            stringBuilder.append((Object)aug.q);
        }
        if (this.d()) {
            stringBuilder.append((Object)aug.s);
        }
        return stringBuilder.toString();
    }

    private bcc n() {
        return this.a == null ? k : this.a;
    }

    public String toString() {
        return "Style{hasParent=" + (this.a != null) + ", color=" + (Object)((Object)this.b) + ", bold=" + this.c + ", italic=" + this.d + ", underlined=" + this.e + ", obfuscated=" + this.g + ", clickEvent=" + this.h() + ", hoverEvent=" + this.i() + ", insertion=" + this.j() + '}';
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof bcc) {
            bcc bcc2 = (bcc)object;
            return this.b() == bcc2.b() && this.a() == bcc2.a() && this.c() == bcc2.c() && this.f() == bcc2.f() && this.d() == bcc2.d() && this.e() == bcc2.e() && (this.h() != null ? this.h().equals(bcc2.h()) : bcc2.h() == null) && (this.i() != null ? this.i().equals(bcc2.i()) : bcc2.i() == null) && (this.j() != null ? this.j().equals(bcc2.j()) : bcc2.j() == null);
        }
        return false;
    }

    public int hashCode() {
        int n2 = this.b.hashCode();
        n2 = 31 * n2 + this.c.hashCode();
        n2 = 31 * n2 + this.d.hashCode();
        n2 = 31 * n2 + this.e.hashCode();
        n2 = 31 * n2 + this.f.hashCode();
        n2 = 31 * n2 + this.g.hashCode();
        n2 = 31 * n2 + this.h.hashCode();
        n2 = 31 * n2 + this.i.hashCode();
        n2 = 31 * n2 + this.j.hashCode();
        return n2;
    }

    public bcc l() {
        bcc bcc2 = new bcc();
        bcc2.c = this.c;
        bcc2.d = this.d;
        bcc2.f = this.f;
        bcc2.e = this.e;
        bcc2.g = this.g;
        bcc2.b = this.b;
        bcc2.h = this.h;
        bcc2.i = this.i;
        bcc2.a = this.a;
        bcc2.j = this.j;
        return bcc2;
    }

    public bcc m() {
        bcc bcc2 = new bcc();
        bcc2.a(this.b());
        bcc2.b(this.c());
        bcc2.c(this.d());
        bcc2.d(this.e());
        bcc2.e(this.f());
        bcc2.a(this.a());
        bcc2.a(this.h());
        bcc2.a(this.i());
        bcc2.a(this.j());
        return bcc2;
    }

    static /* synthetic */ Boolean a(bcc bcc2, Boolean bl2) {
        bcc2.c = bl2;
        return bcc2.c;
    }

    static /* synthetic */ Boolean b(bcc bcc2, Boolean bl2) {
        bcc2.d = bl2;
        return bcc2.d;
    }

    static /* synthetic */ Boolean c(bcc bcc2, Boolean bl2) {
        bcc2.e = bl2;
        return bcc2.e;
    }

    static /* synthetic */ Boolean d(bcc bcc2, Boolean bl2) {
        bcc2.f = bl2;
        return bcc2.f;
    }

    static /* synthetic */ Boolean e(bcc bcc2, Boolean bl2) {
        bcc2.g = bl2;
        return bcc2.g;
    }

    static /* synthetic */ aug a(bcc bcc2, aug aug2) {
        bcc2.b = aug2;
        return bcc2.b;
    }

    static /* synthetic */ String a(bcc bcc2, String string) {
        bcc2.j = string;
        return bcc2.j;
    }

    static /* synthetic */ cxk a(bcc bcc2, cxk cxk2) {
        bcc2.h = cxk2;
        return bcc2.h;
    }

    static /* synthetic */ dex a(bcc bcc2, dex dex2) {
        bcc2.i = dex2;
        return bcc2.i;
    }

    static /* synthetic */ Boolean b(bcc bcc2) {
        return bcc2.c;
    }

    static /* synthetic */ Boolean c(bcc bcc2) {
        return bcc2.d;
    }

    static /* synthetic */ Boolean d(bcc bcc2) {
        return bcc2.e;
    }

    static /* synthetic */ Boolean e(bcc bcc2) {
        return bcc2.f;
    }

    static /* synthetic */ Boolean f(bcc bcc2) {
        return bcc2.g;
    }

    static /* synthetic */ aug g(bcc bcc2) {
        return bcc2.b;
    }

    static /* synthetic */ String h(bcc bcc2) {
        return bcc2.j;
    }

    static /* synthetic */ cxk i(bcc bcc2) {
        return bcc2.h;
    }

    static /* synthetic */ dex j(bcc bcc2) {
        return bcc2.i;
    }
}

