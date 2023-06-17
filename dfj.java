/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.bw;
import com.a.a.d.hy;
import com.a.a.d.sz;
import java.util.Map;
import org.apache.logging.log4j.c;

public class dfj
extends Enum {
    public static final /* enum */ dfj a = new aay(-1);
    public static final /* enum */ dfj b = new bet(0);
    public static final /* enum */ dfj c = new ru(1);
    public static final /* enum */ dfj d = new agl(2);
    private static final dfj[] e;
    private static final Map f;
    private final int g;
    private final Map h = sz.a(cdz.class);
    private static final /* synthetic */ dfj[] i;

    public static dfj[] values() {
        return (dfj[])i.clone();
    }

    public static dfj valueOf(String string) {
        return Enum.valueOf(dfj.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private dfj() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
    }

    protected dfj a(cdz cdz2, Class class_) {
        bw bw2 = (bw)this.h.get((Object)cdz2);
        if (bw2 == null) {
            bw2 = hy.a();
            this.h.put(cdz2, bw2);
        }
        if (bw2.containsValue(class_)) {
            String string = (Object)((Object)cdz2) + " packet " + class_ + " is already known to ID " + bw2.aT_().get(class_);
            org.apache.logging.log4j.c.c().c(string);
            throw new IllegalArgumentException(string);
        }
        bw2.put((Object)bw2.size(), class_);
        return this;
    }

    public Integer a(cdz cdz2, ds ds2) {
        return (Integer)((bw)this.h.get((Object)cdz2)).aT_().get(ds2.getClass());
    }

    public ds a(cdz cdz2, int n2) {
        Class class_ = (Class)((bw)this.h.get((Object)cdz2)).get(n2);
        if (class_ == null) {
            return null;
        }
        return (ds)class_.newInstance();
    }

    public int a() {
        return this.g;
    }

    public static dfj a(int n2) {
        if (n2 < -1 || n2 > 2) {
            return null;
        }
        return e[n2 - -1];
    }

    public static dfj a(ds ds2) {
        return (dfj)((Object)f.get(ds2.getClass()));
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ dfj(int n2, aay aay2) {
        this((String)var1_-1, (int)aay2, (int)var3_2);
        void var3_2;
        void var1_-1;
    }

    static {
        i = new dfj[]{a, b, c, d};
        e = new dfj[4];
        f = sz.c();
        for (dfj dfj2 : dfj.values()) {
            int n2 = dfj2.a();
            if (n2 < -1 || n2 > 2) {
                throw new Error("Invalid protocol ID " + Integer.toString(n2));
            }
            dfj.e[n2 - -1] = dfj2;
            for (cdz cdz2 : dfj2.h.keySet()) {
                for (Class class_ : ((bw)dfj2.h.get((Object)cdz2)).c()) {
                    if (f.containsKey(class_) && f.get(class_) != dfj2) {
                        throw new Error("Packet " + class_ + " is already assigned to protocol " + f.get(class_) + " - can't reassign to " + (Object)((Object)dfj2));
                    }
                    try {
                        class_.newInstance();
                    }
                    catch (Throwable throwable) {
                        throw new Error("Packet " + class_ + " fails instantiation checks! " + class_);
                    }
                    f.put(class_, dfj2);
                }
            }
        }
    }
}

