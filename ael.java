/*
 * Decompiled with CFR 0.150.
 */
public class ael
extends ux {
    public ael(tb tb2, int n2, int n3, int n4) {
        super(tb2, n2, n3, n4);
    }

    @Override
    public boolean a(bhl bhl2) {
        return bop.c(bhl2) || ael.e(bhl2);
    }

    @Override
    public int c(bhl bhl2) {
        return ael.e(bhl2) ? 1 : super.c(bhl2);
    }

    public static boolean e(bhl bhl2) {
        return bhl2 != null && bhl2.a() != null && bhl2.a() == hp.ay;
    }
}

