/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.q.g.c;

import com.a.a.d.sz;
import java.util.Map;
import net.minecraft.e.e;
import net.minecraft.q.g.c.aw;
import net.minecraft.q.g.c.az;
import net.minecraft.q.g.c.bc;
import net.minecraft.q.g.c.bl;
import net.minecraft.q.g.c.bm;
import net.minecraft.q.g.c.bp;
import net.minecraft.q.g.c.bu;
import net.minecraft.q.g.c.bw;
import net.minecraft.q.g.c.ci;
import net.minecraft.q.g.c.cm;
import net.minecraft.q.g.c.cv;
import net.minecraft.q.g.c.dk;
import net.minecraft.q.g.c.dq;
import net.minecraft.q.g.c.dt;
import net.minecraft.q.g.c.j;
import net.minecraft.q.g.c.r;
import net.minecraft.q.k;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class da {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final Map b = sz.c();
    private static final Map c = sz.c();
    private static final Map d = sz.c();
    private static final Map e = sz.c();

    static {
        da.b(bc.class, "Mineshaft");
        da.b(dk.class, "Village");
        da.b(bm.class, "Fortress");
        da.b(cv.class, "Stronghold");
        da.b(bp.class, "Temple");
        da.b(cm.class, "Monument");
        da.b(bw.class, "EndCity");
        ci.a();
        aw.a();
        bu.a();
        dq.a();
        az.a();
        bl.a();
        dt.a();
    }

    private static void b(Class class_, String string) {
        b.put(string, class_);
        c.put(class_, string);
    }

    static void a(Class class_, String string) {
        d.put(string, class_);
        e.put(class_, string);
    }

    public static String a(j j2) {
        return (String)c.get(j2.getClass());
    }

    public static String a(r r2) {
        return (String)e.get(r2.getClass());
    }

    public static j a(e e2, k k2) {
        j j2 = null;
        try {
            Class class_ = (Class)b.get(e2.l("id"));
            if (class_ != null) {
                j2 = (j)class_.newInstance();
            }
        }
        catch (Exception exception) {
            a.f("Failed Start with id {}", e2.l("id"));
            exception.printStackTrace();
        }
        if (j2 != null) {
            j2.a(k2, e2);
        } else {
            a.f("Skipping Structure with id {}", e2.l("id"));
        }
        return j2;
    }

    public static r b(e e2, k k2) {
        r r2 = null;
        try {
            Class class_ = (Class)d.get(e2.l("id"));
            if (class_ != null) {
                r2 = (r)class_.newInstance();
            }
        }
        catch (Exception exception) {
            a.f("Failed Piece with id {}", e2.l("id"));
            exception.printStackTrace();
        }
        if (r2 != null) {
            r2.a(k2, e2);
        } else {
            a.f("Skipping Piece with id {}", e2.l("id"));
        }
        return r2;
    }
}

