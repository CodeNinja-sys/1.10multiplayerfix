/*
 * Decompiled with CFR 0.150.
 */
public enum s {
    a((cbg)new du("options.mainHand.left", new Object[0])),
    b((cbg)new du("options.mainHand.right", new Object[0]));

    private final cbg c;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private s() {
        void var3_1;
        this.c = var3_1;
    }

    public s a() {
        if (this == a) {
            return b;
        }
        return a;
    }

    public String toString() {
        return this.c.i();
    }
}

