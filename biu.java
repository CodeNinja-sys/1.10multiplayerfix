/*
 * Decompiled with CFR 0.150.
 */
public class biu {
    public static final biu a = new biu("");
    private final String b;

    public biu(String string) {
        this.b = string;
    }

    public boolean a() {
        return this.b == null || this.b.isEmpty();
    }

    public String b() {
        return this.b;
    }

    public void a(bvp bvp2) {
        bvp2.a("Lock", this.b);
    }

    public static biu b(bvp bvp2) {
        if (bvp2.b("Lock", 8)) {
            String string = bvp2.l("Lock");
            return new biu(string);
        }
        return a;
    }
}

