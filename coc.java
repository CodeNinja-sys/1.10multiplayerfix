/*
 * Decompiled with CFR 0.150.
 */
public class coc
implements ds {
    private long a;

    public coc() {
    }

    public coc(long l2) {
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

    public void a(abu abu2) {
        abu2.a(this);
    }
}

