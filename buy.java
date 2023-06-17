/*
 * Decompiled with CFR 0.150.
 */
public class buy
extends bcf {
    private static final bpx a = new bpx("textures/entity/rabbit/brown.png");
    private static final bpx b = new bpx("textures/entity/rabbit/white.png");
    private static final bpx k = new bpx("textures/entity/rabbit/black.png");
    private static final bpx l = new bpx("textures/entity/rabbit/gold.png");
    private static final bpx m = new bpx("textures/entity/rabbit/salt.png");
    private static final bpx n = new bpx("textures/entity/rabbit/white_splotched.png");
    private static final bpx o = new bpx("textures/entity/rabbit/toast.png");
    private static final bpx p = new bpx("textures/entity/rabbit/caerbannog.png");

    public buy(bid bid2, axg axg2, float f2) {
        super(bid2, axg2, f2);
    }

    protected bpx a(amq amq2) {
        String string = aug.a(amq2.i_());
        if (string != null && "Toast".equals(string)) {
            return o;
        }
        switch (amq2.M()) {
            default: {
                return a;
            }
            case 1: {
                return b;
            }
            case 2: {
                return k;
            }
            case 4: {
                return l;
            }
            case 5: {
                return m;
            }
            case 3: {
                return n;
            }
            case 99: 
        }
        return p;
    }
}

