/*
 * Decompiled with CFR 0.150.
 */
public abstract class dcb
implements cmb {
    private final cmb a;
    private final String b;
    private final double c;
    private boolean d;

    protected dcb(cmb cmb2, String string, double d2) {
        this.a = cmb2;
        this.b = string;
        this.c = d2;
        if (string == null) {
            throw new IllegalArgumentException("Name cannot be null!");
        }
    }

    @Override
    public String b() {
        return this.b;
    }

    @Override
    public double c() {
        return this.c;
    }

    @Override
    public boolean d() {
        return this.d;
    }

    public dcb a(boolean bl2) {
        this.d = bl2;
        return this;
    }

    @Override
    public cmb e() {
        return this.a;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof cmb && this.b.equals(((cmb)object).b());
    }
}

