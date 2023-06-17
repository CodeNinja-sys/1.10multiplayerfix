/*
 * Decompiled with CFR 0.150.
 */
public class dcf
implements ds {
    private String a;

    public dcf() {
    }

    public dcf(String string) {
        if (string.length() > 100) {
            string = string.substring(0, 100);
        }
        this.a = string;
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(100);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public String a() {
        return this.a;
    }
}

