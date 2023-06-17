/*
 * Decompiled with CFR 0.150.
 */
public class cap
extends ctk {
    private int b;

    public cap(brd brd2) {
        super(brd2);
    }

    @Override
    public void e() {
        this.a.aQ.a(this.a.aU, this.a.aV, this.a.aW, dah.aS, this.a.y(), 2.5f, 0.8f + this.a.aW().nextFloat() * 0.3f, false);
    }

    @Override
    public void a() {
        if (this.b++ >= 40) {
            this.a.aL().a(baw.f);
        }
    }

    @Override
    public void b() {
        this.b = 0;
    }

    @Override
    public baw d() {
        return baw.h;
    }
}

