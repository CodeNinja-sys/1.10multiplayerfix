/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public abstract class c
extends Enum {
    public static final /* enum */ c a = new alb();
    public static final /* enum */ c b = new bpg();
    public static final /* enum */ c c = new aha();
    public static final /* enum */ c d = new any();
    public static final /* enum */ c e = new bsn();
    private static final /* synthetic */ c[] f;

    public static c[] values() {
        return (c[])f.clone();
    }

    public static c valueOf(String string) {
        return Enum.valueOf(c.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private c() {
        void var2_-1;
        void var1_-1;
    }

    public abstract void a(alj var1, cmd var2, List var3, int var4, cmz var5);

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ c(alb alb2) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    static {
        f = new c[]{a, b, c, d, e};
    }
}

