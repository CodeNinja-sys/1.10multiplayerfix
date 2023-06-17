/*
 * Decompiled with CFR 0.150.
 */
public class kx
extends Exception {
    private final Object[] a;

    public kx(String string, Object ... arrobject) {
        super(string);
        this.a = arrobject;
    }

    public Object[] a() {
        return this.a;
    }
}

