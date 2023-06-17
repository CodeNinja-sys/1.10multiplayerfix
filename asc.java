/*
 * Decompiled with CFR 0.150.
 */
public abstract class asc
extends Enum {
    public static final /* enum */ asc a = new bia();
    public static final /* enum */ asc b = new aov();
    public static final /* enum */ asc c = new bai();
    private static final /* synthetic */ asc[] d;

    public static asc[] values() {
        return (asc[])d.clone();
    }

    public static asc valueOf(String string) {
        return Enum.valueOf(asc.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private asc() {
        void var2_-1;
        void var1_-1;
    }

    public abstract void a();

    public abstract void b();

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ asc(aio aio2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        d = new asc[]{a, b, c};
    }
}

