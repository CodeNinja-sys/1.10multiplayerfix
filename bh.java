/*
 * Decompiled with CFR 0.150.
 */
public abstract class bh {
    public final String a;
    private boolean b;

    public bh(String string) {
        this.a = string;
    }

    public abstract void a(bvp var1);

    public abstract bvp b(bvp var1);

    public void a() {
        this.a(true);
    }

    public void a(boolean bl2) {
        this.b = bl2;
    }

    public boolean b() {
        return this.b;
    }
}

