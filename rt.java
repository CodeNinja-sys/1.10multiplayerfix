/*
 * Decompiled with CFR 0.150.
 */
public class rt
implements ds {
    private long a;
    private long b;

    public rt() {
    }

    public rt(long l2, long l3, boolean bl2) {
        this.a = l2;
        this.b = l3;
        if (!bl2) {
            this.b = -this.b;
            if (this.b == 0L) {
                this.b = -1L;
            }
        }
    }

    @Override
    public void a(si si2) {
        this.a = si2.M();
        this.b = si2.M();
    }

    @Override
    public void b(si si2) {
        si2.b(this.a);
        si2.b(this.b);
    }

    public void a(bfz bfz2) {
        bfz2.a(this);
    }

    public long a() {
        return this.a;
    }

    public long b() {
        return this.b;
    }
}

