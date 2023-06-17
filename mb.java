/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.sz;
import java.util.Map;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class mb {
    private static final d a = org.apache.logging.log4j.c.c();
    private static final Map b = sz.c();
    private static final Map c = sz.c();
    private static final Map d = sz.c();
    private static final Map e = sz.c();

    private static void b(Class class_, String string) {
        b.put(string, class_);
        c.put(class_, string);
    }

    static void a(Class class_, String string) {
        d.put(string, class_);
        e.put(class_, string);
    }

    public static String a(cv cv2) {
        return (String)c.get(cv2.getClass());
    }

    public static String a(pc pc2) {
        return (String)e.get(pc2.getClass());
    }

    public static cv a(bvp bvp2, iu iu2) {
        cv cv2 = null;
        try {
            Class class_ = (Class)b.get(bvp2.l("id"));
            if (class_ != null) {
                cv2 = (cv)class_.newInstance();
            }
        }
        catch (Exception exception) {
            a.f("Failed Start with id {}", bvp2.l("id"));
            exception.printStackTrace();
        }
        if (cv2 != null) {
            cv2.a(iu2, bvp2);
        } else {
            a.f("Skipping Structure with id {}", bvp2.l("id"));
        }
        return cv2;
    }

    public static pc b(bvp bvp2, iu iu2) {
        pc pc2 = null;
        try {
            Class class_ = (Class)d.get(bvp2.l("id"));
            if (class_ != null) {
                pc2 = (pc)class_.newInstance();
            }
        }
        catch (Exception exception) {
            a.f("Failed Piece with id {}", bvp2.l("id"));
            exception.printStackTrace();
        }
        if (pc2 != null) {
            pc2.a(iu2, bvp2);
        } else {
            a.f("Skipping Piece with id {}", bvp2.l("id"));
        }
        return pc2;
    }

    static {
        mb.b(cun.class, "Mineshaft");
        mb.b(chv.class, "Village");
        mb.b(arj.class, "Fortress");
        mb.b(cc.class, "Stronghold");
        mb.b(oo.class, "Temple");
        mb.b(yd.class, "Monument");
        mb.b(l.class, "EndCity");
        awc.a();
        ccv.a();
        buh.a();
        bbj.a();
        ara.a();
        cao.a();
        bze.a();
    }
}

