/*
 * Decompiled with CFR 0.150.
 */
public class bcy
extends cwv {
    private final oi a;

    public bcy(int n2, int n3, int n4, String string) {
        this(n2, n3, n4, null, string);
    }

    public bcy(int n2, int n3, int n4, int n5, int n6, String string) {
        super(n2, n3, n4, n5, n6, string);
        this.a = null;
    }

    public bcy(int n2, int n3, int n4, oi oi2, String string) {
        super(n2, n3, n4, 150, 20, string);
        this.a = oi2;
    }

    public oi a() {
        return this.a;
    }
}

