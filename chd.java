/*
 * Decompiled with CFR 0.150.
 */
public class chd
extends bcf {
    private static final bpx a = new bpx("textures/entity/ghast/ghast.png");
    private static final bpx b = new bpx("textures/entity/ghast/ghast_shooting.png");

    public chd(bid bid2) {
        super(bid2, new bpz(), 0.5f);
    }

    protected bpx a(ha ha2) {
        if (ha2.w()) {
            return b;
        }
        return a;
    }

    protected void a(ha ha2, float f2) {
        float f3 = 1.0f;
        float f4 = 4.5f;
        float f5 = 4.5f;
        cja.b(4.5f, 4.5f, 4.5f);
        cja.c(1.0f, 1.0f, 1.0f, 1.0f);
    }
}

