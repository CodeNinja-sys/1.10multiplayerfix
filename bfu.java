/*
 * Decompiled with CFR 0.150.
 */
public class bfu
implements ds {
    private String a;
    private String b;

    public bfu() {
    }

    public bfu(String string, String string2) {
        this.a = string;
        this.b = string2;
        if (string2.length() > 40) {
            throw new IllegalArgumentException("Hash is too long (max 40, was " + string2.length() + ")");
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.e(32767);
        this.b = si2.e(40);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
        si2.a(this.b);
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
}

