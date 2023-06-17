/*
 * Decompiled with CFR 0.150.
 */
public class cnr
implements ds {
    private String a = "";
    private String b = "";
    private int c;
    private bcr d;

    public cnr() {
    }

    public cnr(czu czu2) {
        this.a = czu2.d();
        this.b = czu2.c().b();
        this.c = czu2.b();
        this.d = bcr.a;
    }

    public cnr(String string) {
        this.a = string;
        this.b = "";
        this.c = 0;
        this.d = bcr.b;
    }

    public cnr(String string, bhi bhi2) {
        this.a = string;
        this.b = bhi2.b();
        this.c = 0;
        this.d = bcr.b;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(40);
        this.d = (bcr)si2.a(bcr.class);
        this.b = si2.e(16);
        if (this.d != bcr.b) {
            this.c = si2.e();
        }
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.d);
        si2.a(this.b);
        if (this.d != bcr.b) {
            si2.d(this.c);
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

    public int c() {
        return this.c;
    }

    public bcr d() {
        return this.d;
    }
}

