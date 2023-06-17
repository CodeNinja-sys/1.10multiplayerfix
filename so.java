/*
 * Decompiled with CFR 0.150.
 */
public class so
extends bcf {
    private static final bpx a = new bpx("textures/entity/cat/black.png");
    private static final bpx b = new bpx("textures/entity/cat/ocelot.png");
    private static final bpx k = new bpx("textures/entity/cat/red.png");
    private static final bpx l = new bpx("textures/entity/cat/siamese.png");

    public so(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
    }

    protected bpx a(fl fl2) {
        switch (fl2.w()) {
            default: {
                return b;
            }
            case 1: {
                return a;
            }
            case 2: {
                return k;
            }
            case 3: 
        }
        return l;
    }

    protected void a(fl fl2, float f2) {
        super.a(fl2, f2);
        if (fl2.B()) {
            cja.b(0.8f, 0.8f, 0.8f);
        }
    }
}

