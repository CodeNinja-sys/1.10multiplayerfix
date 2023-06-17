/*
 * Decompiled with CFR 0.150.
 */
public class apl
implements ds {
    private bqp a;

    public apl() {
    }

    public apl(bqp bqp2) {
        this.a = bqp2;
    }

    @Override
    public void a(si si2) {
        this.a = (bqp)si2.a(bqp.class);
    }

    @Override
    public void b(si si2) {
        si2.a(this.a);
    }

    public void a(bws bws2) {
        bws2.a(this);
    }

    public bqp a() {
        return this.a;
    }
}

