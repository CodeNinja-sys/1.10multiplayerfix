/*
 * Decompiled with CFR 0.150.
 */
public class avk
implements ds {
    public static final String[] a = new String[]{"tile.bed.notValid"};
    private int b;
    private float c;

    public avk() {
    }

    public avk(int n2, float f2) {
        this.b = n2;
        this.c = f2;
    }

    @Override
    public void a(si si2) {
        this.b = si2.F();
        this.c = si2.O();
    }

    @Override
    public void b(si si2) {
        si2.B(this.b);
        si2.a(this.c);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public int a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

