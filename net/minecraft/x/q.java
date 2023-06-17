/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.x;

import com.a.a.d.bw;
import com.a.a.d.hy;
import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.x.ae;
import net.minecraft.x.ah;
import net.minecraft.x.ap;
import net.minecraft.x.ar;
import net.minecraft.x.at;
import net.minecraft.x.p;
import org.apache.logging.log4j.c;

public class q
extends Enum {
    public static final /* enum */ q a = new ae(-1);
    public static final /* enum */ q b = new ar(0);
    public static final /* enum */ q c = new ap(1);
    public static final /* enum */ q d = new ah(2);
    private static final q[] e;
    private static final Map f;
    private final int g;
    private final Map h = sz.a(at.class);
    private static final /* synthetic */ q[] i;

    static {
        i = new q[]{a, b, c, d};
        e = new q[4];
        f = sz.c();
        for (q q2 : q.values()) {
            int n2 = q2.a();
            if (n2 < -1 || n2 > 2) {
                throw new Error("Invalid protocol ID " + Integer.toString(n2));
            }
            q.e[n2 - -1] = q2;
            for (at at2 : q2.h.keySet()) {
                for (Class class_ : ((bw)q2.h.get((Object)at2)).c()) {
                    if (f.containsKey(class_) && f.get(class_) != q2) {
                        throw new Error("Packet " + class_ + " is already assigned to protocol " + f.get(class_) + " - can't reassign to " + (Object)((Object)q2));
                    }
                    try {
                        class_.newInstance();
                    }
                    catch (Throwable throwable) {
                        throw new Error("Packet " + class_ + " fails instantiation checks! " + class_);
                    }
                    f.put(class_, q2);
                }
            }
        }
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private q() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.g = var3_1;
    }

    protected q a(at at2, Class class_) {
        bw bw2 = (bw)this.h.get((Object)at2);
        if (bw2 == null) {
            bw2 = hy.a();
            this.h.put(at2, bw2);
        }
        if (bw2.containsValue(class_)) {
            String string = (Object)((Object)at2) + " packet " + class_ + " is already known to ID " + bw2.aT_().get(class_);
            org.apache.logging.log4j.c.c().c(string);
            throw new IllegalArgumentException(string);
        }
        bw2.put((Object)bw2.size(), class_);
        return this;
    }

    public Integer a(at at2, p p2) {
        return (Integer)((bw)this.h.get((Object)at2)).aT_().get(p2.getClass());
    }

    public p a(at at2, int n2) {
        Class class_ = (Class)((bw)this.h.get((Object)at2)).get(n2);
        return class_ == null ? null : (p)class_.newInstance();
    }

    public int a() {
        return this.g;
    }

    public static q a(int n2) {
        return n2 >= -1 && n2 <= 2 ? e[n2 - -1] : null;
    }

    public static q a(p p2) {
        return (q)((Object)f.get(p2.getClass()));
    }

    public static q[] values() {
        q[] arrq = i;
        int n2 = arrq.length;
        q[] arrq2 = new q[n2];
        System.arraycopy(i, 0, arrq2, 0, n2);
        return arrq2;
    }

    public static q valueOf(String string) {
        return Enum.valueOf(q.class, string);
    }

    /*
     * WARNING - void declaration
     */
    /* synthetic */ q(int n2, q q2) {
        this((String)var1_-1, (int)q2, (int)var3_2);
        void var3_2;
        void var1_-1;
    }
}

