/*
 * Decompiled with CFR 0.150.
 */
public class adi
extends bcf {
    private static final bpx a = new bpx("textures/entity/zombie/zombie.png");
    private final float b;

    public adi(bid bid2, axg axg2, float f2, float f3) {
        super(bid2, axg2, f2 * f3);
        this.b = f3;
        this.a(new kl(this));
        this.a(new cly(this, this));
    }

    @Override
    public void a() {
        cja.c(0.0f, 0.1875f, 0.0f);
    }

    protected void a(aah aah2, float f2) {
        cja.b(this.b, this.b, this.b);
    }

    protected bpx a(aah aah2) {
        return a;
    }
}

