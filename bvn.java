/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.ov;
import java.util.Collection;

public class bvn
implements ds {
    private String a = "";
    private String b = "";
    private String c = "";
    private String d = "";
    private String e;
    private String f;
    private int g;
    private final Collection h;
    private int i;
    private int j;

    public bvn() {
        this.e = afb.a.e;
        this.f = bfo.a.e;
        this.g = -1;
        this.h = ov.a();
    }

    public bvn(ef ef2, int n2) {
        this.e = afb.a.e;
        this.f = bfo.a.e;
        this.g = -1;
        this.h = ov.a();
        this.a = ef2.a();
        this.i = n2;
        if (n2 == 0 || n2 == 2) {
            this.b = ef2.b();
            this.c = ef2.d();
            this.d = ef2.e();
            this.j = ef2.k();
            this.e = ef2.h().e;
            this.f = ef2.j().e;
            this.g = ef2.l().a();
        }
        if (n2 == 0) {
            this.h.addAll(ef2.c());
        }
    }

    public bvn(ef ef2, Collection collection, int n2) {
        this.e = afb.a.e;
        this.f = bfo.a.e;
        this.g = -1;
        this.h = ov.a();
        if (n2 != 3 && n2 != 4) {
            throw new IllegalArgumentException("Method must be join or leave for player constructor");
        }
        if (collection == null || collection.isEmpty()) {
            throw new IllegalArgumentException("Players cannot be null/empty");
        }
        this.i = n2;
        this.a = ef2.a();
        this.h.addAll(collection);
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(16);
        this.i = si2.E();
        if (this.i == 0 || this.i == 2) {
            this.b = si2.e(32);
            this.c = si2.e(16);
            this.d = si2.e(16);
            this.j = si2.E();
            this.e = si2.e(32);
            this.f = si2.e(32);
            this.g = si2.E();
        }
        if (this.i == 0 || this.i == 3 || this.i == 4) {
            int n2 = si2.e();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.h.add(si2.e(40));
            }
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.B(this.i);
        if (this.i == 0 || this.i == 2) {
            si2.a(this.b);
            si2.a(this.c);
            si2.a(this.d);
            si2.B(this.j);
            si2.a(this.e);
            si2.a(this.f);
            si2.B(this.g);
        }
        if (this.i == 0 || this.i == 3 || this.i == 4) {
            si2.d(this.h.size());
            for (String string : this.h) {
                si2.a(string);
            }
        }
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public String c() {
        return this.c;
    }

    public String d() {
        return this.d;
    }

    public Collection e() {
        return this.h;
    }

    public int f() {
        return this.i;
    }

    public int g() {
        return this.j;
    }

    public int h() {
        return this.g;
    }

    public String i() {
        return this.e;
    }

    public String j() {
        return this.f;
    }
}

