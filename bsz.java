/*
 * Decompiled with CFR 0.150.
 */
public class bsz
extends bcf {
    private static final bpx k = new bpx("textures/entity/steve.png");
    protected chu a;
    protected float b;

    public bsz(bid bid2, chu chu2, float f2) {
        this(bid2, chu2, f2, 1.0f);
        this.a(new kl(this));
    }

    public bsz(bid bid2, chu chu2, float f2, float f3) {
        super(bid2, chu2, f2);
        this.a = chu2;
        this.b = f3;
        this.a(new aot(chu2.e));
    }

    protected bpx a(xy xy2) {
        return k;
    }

    @Override
    public void a() {
        cja.c(0.0f, 0.1875f, 0.0f);
    }
}

