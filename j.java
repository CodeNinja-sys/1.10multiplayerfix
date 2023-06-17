/*
 * Decompiled with CFR 0.150.
 */
public class j
implements ds {
    private long a;

    public j() {
    }

    public j(long l2) {
        this.a = l2;
    }

    @Override
    public void a(si si2) {
        this.a = si2.M();
    }

    @Override
    public void b(si si2) {
        si2.b(this.a);
    }

    public void a(px px2) {
        px2.a(this);
    }

    public long a() {
        return this.a;
    }
}

