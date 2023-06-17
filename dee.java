/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.nj;
import com.a.a.d.ov;
import com.c.a.a;
import com.c.a.e;
import com.c.a.i;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.UUID;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class dee {
    private static final d e = org.apache.logging.log4j.c.c();
    public static final File a = new File("banned-ips.txt");
    public static final File b = new File("banned-players.txt");
    public static final File c = new File("ops.txt");
    public static final File d = new File("white-list.txt");

    private static void a(net.minecraft.c.a a2, Collection collection, i i2) {
        String[] arrstring = (String[])nj.a((Iterator)nj.b(collection.iterator(), new bfn()), String.class);
        if (a2.ab()) {
            a2.az().a(arrstring, com.c.a.a.a, i2);
        } else {
            for (String string : arrstring) {
                UUID uUID = bdl.a(new e(null, string));
                e e2 = new e(uUID, string);
                i2.a(e2);
            }
        }
    }

    public static String a(net.minecraft.c.a a2, String string) {
        if (aco.b(string) || string.length() > 16) {
            return string;
        }
        e e2 = ((bas)((Object)a2.aA())).a(string);
        if (e2 != null && e2.a() != null) {
            return e2.a().toString();
        }
        if (a2.R() || !a2.ab()) {
            return bdl.a(new e(null, string)).toString();
        }
        ArrayList arrayList = ov.a();
        ayn ayn2 = new ayn(a2, arrayList);
        dee.a(a2, ov.a(new String[]{string}), ayn2);
        if (!arrayList.isEmpty() && ((e)arrayList.get(0)).a() != null) {
            return ((e)arrayList.get(0)).a().toString();
        }
        return "";
    }

    static /* synthetic */ d a() {
        return e;
    }
}

