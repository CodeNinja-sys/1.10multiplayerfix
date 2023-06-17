/*
 * Decompiled with CFR 0.150.
 */
public class ank
extends dad {
    private static final String[] e = new String[]{"all", "undead", "arthropods"};
    private static final int[] f = new int[]{1, 5, 5};
    private static final int[] g = new int[]{11, 8, 8};
    private static final int[] h = new int[]{20, 20, 20};
    public final int a;

    public ank(bkl bkl2, int n2, dfm ... arrdfm) {
        super(bkl2, mo.g, arrdfm);
        this.a = n2;
    }

    @Override
    public int a(int n2) {
        return f[this.a] + (n2 - 1) * g[this.a];
    }

    @Override
    public int b(int n2) {
        return this.a(n2) + h[this.a];
    }

    @Override
    public int a() {
        return 5;
    }

    @Override
    public float a(int n2, agh agh2) {
        if (this.a == 0) {
            return 1.0f + (float)Math.max(0, n2 - 1) * 0.5f;
        }
        if (this.a == 1 && agh2 == agh.b) {
            return (float)n2 * 2.5f;
        }
        if (this.a == 2 && agh2 == agh.c) {
            return (float)n2 * 2.5f;
        }
        return 0.0f;
    }

    @Override
    public String c() {
        return "enchantment.damage." + e[this.a];
    }

    @Override
    public boolean a(dad dad2) {
        return !(dad2 instanceof ank);
    }

    @Override
    public boolean a(bhl bhl2) {
        if (bhl2.a() instanceof bap) {
            return true;
        }
        return super.a(bhl2);
    }

    @Override
    public void a(bga bga2, cpk cpk2, int n2) {
        if (cpk2 instanceof bga) {
            bga bga3 = (bga)cpk2;
            if (this.a == 2 && bga3.ak() == agh.c) {
                int n3 = 20 + bga2.aW().nextInt(10 * n2);
                bga3.b(new cko(ake.b, n3, 3));
            }
        }
    }
}

