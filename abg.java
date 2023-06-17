/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class abg
extends bcf {
    private static final bpx a = new bpx("textures/entity/enderman/enderman.png");
    private final cti b;
    private final Random k = new Random();

    public abg(bid bid2) {
        super(bid2, new cti(0.0f), 0.5f);
        this.b = (cti)this.c;
        this.a(new vf(this));
        this.a(new axw(this));
    }

    public void a(bgv bgv2, double d2, double d3, double d4, float f2, float f3) {
        dbk dbk2 = bgv2.aL();
        this.b.a = dbk2 != null;
        this.b.b = bgv2.aM();
        if (bgv2.aM()) {
            double d5 = 0.02;
            d2 += this.k.nextGaussian() * 0.02;
            d4 += this.k.nextGaussian() * 0.02;
        }
        super.a(bgv2, d2, d3, d4, f2, f3);
    }

    protected bpx a(bgv bgv2) {
        return a;
    }
}

