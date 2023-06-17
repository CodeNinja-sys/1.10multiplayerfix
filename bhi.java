/*
 * Decompiled with CFR 0.150.
 */
public class bhi {
    private final bzt a;
    private final String b;
    private final bcu c;
    private bmb d;
    private String e;

    public bhi(bzt bzt2, String string, bcu bcu2) {
        this.a = bzt2;
        this.b = string;
        this.c = bcu2;
        this.e = string;
        this.d = bcu2.c();
    }

    public bzt a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }

    public bcu c() {
        return this.c;
    }

    public String d() {
        return this.e;
    }

    public void a(String string) {
        this.e = string;
        this.a.b(this);
    }

    public bmb e() {
        return this.d;
    }

    public void a(bmb bmb2) {
        this.d = bmb2;
        this.a.b(this);
    }
}

