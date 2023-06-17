/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bn;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.l.i;
import com.a.b.aa;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.c.a;
import org.apache.commons.c.d.f;

public abstract class mn
implements fh {
    private static csc a;

    protected static hw a(aa aa2) {
        Throwable throwable = f.b(aa2);
        String string = "";
        if (throwable != null && (string = throwable.getMessage()).contains("setLenient")) {
            string = string.substring(string.indexOf("to accept ") + 10);
        }
        return new hw("commands.tellraw.jsonException", string);
    }

    protected static bvp a(cpk cpk2) {
        bhl bhl2;
        bvp bvp2 = cpk2.e(new bvp());
        if (cpk2 instanceof bdl && (bhl2 = ((bdl)cpk2).n.h()) != null && bhl2.a() != null) {
            bvp2.a("SelectedItem", bhl2.b(new bvp()));
        }
        return bvp2;
    }

    public int b() {
        return 4;
    }

    @Override
    public List c() {
        return Collections.emptyList();
    }

    @Override
    public boolean a(a a2, ala ala2) {
        return ala2.a(this.b(), this.a());
    }

    @Override
    public List a(a a2, ala ala2, String[] arrstring, cmz cmz2) {
        return Collections.emptyList();
    }

    public static int a(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new cml("commands.generic.num.invalid", string);
        }
    }

    public static int a(String string, int n2) {
        return mn.a(string, n2, Integer.MAX_VALUE);
    }

    public static int a(String string, int n2, int n3) {
        int n4 = mn.a(string);
        if (n4 < n2) {
            throw new cml("commands.generic.num.tooSmall", n4, n2);
        }
        if (n4 > n3) {
            throw new cml("commands.generic.num.tooBig", n4, n3);
        }
        return n4;
    }

    public static long b(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new cml("commands.generic.num.invalid", string);
        }
    }

    public static long a(String string, long l2, long l3) {
        long l4 = mn.b(string);
        if (l4 < l2) {
            throw new cml("commands.generic.num.tooSmall", l4, l2);
        }
        if (l4 > l3) {
            throw new cml("commands.generic.num.tooBig", l4, l3);
        }
        return l4;
    }

    public static cmz a(ala ala2, String[] arrstring, int n2, boolean bl2) {
        cmz cmz2 = ala2.k_();
        return new cmz(mn.b(cmz2.a(), arrstring[n2], -30000000, 30000000, bl2), mn.b(cmz2.b(), arrstring[n2 + 1], 0, 256, false), mn.b(cmz2.c(), arrstring[n2 + 2], -30000000, 30000000, bl2));
    }

    public static double c(String string) {
        try {
            double d2 = Double.parseDouble(string);
            if (!i.b(d2)) {
                throw new cml("commands.generic.num.invalid", string);
            }
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new cml("commands.generic.num.invalid", string);
        }
    }

    public static double a(String string, double d2) {
        return mn.a(string, d2, Double.MAX_VALUE);
    }

    public static double a(String string, double d2, double d3) {
        double d4 = mn.c(string);
        if (d4 < d2) {
            throw new cml("commands.generic.double.tooSmall", d4, d2);
        }
        if (d4 > d3) {
            throw new cml("commands.generic.double.tooBig", d4, d3);
        }
        return d4;
    }

    public static boolean d(String string) {
        if ("true".equals(string) || "1".equals(string)) {
            return true;
        }
        if ("false".equals(string) || "0".equals(string)) {
            return false;
        }
        throw new kx("commands.generic.boolean.invalid", string);
    }

    public static czt b(ala ala2) {
        if (ala2 instanceof czt) {
            return (czt)ala2;
        }
        throw new chs("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static czt a(a a2, ala ala2, String string) {
        czt czt2 = an.a(ala2, string);
        if (czt2 == null) {
            try {
                czt2 = ((cmt)((Object)a2.al())).a(UUID.fromString(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (czt2 == null) {
            czt2 = ((cmt)((Object)a2.al())).a(string);
        }
        if (czt2 == null) {
            throw new chs();
        }
        return czt2;
    }

    public static cpk b(a a2, ala ala2, String string) {
        return mn.a(a2, ala2, string, cpk.class);
    }

    public static cpk a(a a2, ala ala2, String string, Class class_) {
        Object object = an.a(ala2, string, class_);
        if (object == null) {
            object = ((cmt)((Object)a2.al())).a(string);
        }
        if (object == null) {
            try {
                UUID uUID = UUID.fromString(string);
                object = a2.a(uUID);
                if (object == null) {
                    object = ((cmt)((Object)a2.al())).a(uUID);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new bbg("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (object == null || !class_.isAssignableFrom(object.getClass())) {
            throw new bbg();
        }
        return object;
    }

    public static List c(a a2, ala ala2, String string) {
        if (an.b(string)) {
            return an.b(ala2, string, cpk.class);
        }
        return ov.a(mn.b(a2, ala2, string));
    }

    public static String d(a a2, ala ala2, String string) {
        try {
            return mn.a(a2, ala2, string).i_();
        }
        catch (chs chs2) {
            if (string == null || string.startsWith("@")) {
                throw chs2;
            }
            return string;
        }
    }

    public static String e(a a2, ala ala2, String string) {
        try {
            return mn.a(a2, ala2, string).i_();
        }
        catch (chs chs2) {
            try {
                return mn.b(a2, ala2, string).cy();
            }
            catch (bbg bbg2) {
                if (string == null || string.startsWith("@")) {
                    throw bbg2;
                }
                return string;
            }
        }
    }

    public static cbg a(ala ala2, String[] arrstring, int n2) {
        return mn.b(ala2, arrstring, n2, false);
    }

    public static cbg b(ala ala2, String[] arrstring, int n2, boolean bl2) {
        aym aym2 = new aym("");
        for (int i2 = n2; i2 < arrstring.length; ++i2) {
            if (i2 > n2) {
                aym2.b(" ");
            }
            cbg cbg2 = new aym(arrstring[i2]);
            if (bl2) {
                cbg cbg3 = an.b(ala2, arrstring[i2]);
                if (cbg3 == null) {
                    if (an.b(arrstring[i2])) {
                        throw new chs();
                    }
                } else {
                    cbg2 = cbg3;
                }
            }
            aym2.a(cbg2);
        }
        return aym2;
    }

    public static String b(String[] arrstring, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = n2; i2 < arrstring.length; ++i2) {
            if (i2 > n2) {
                stringBuilder.append(" ");
            }
            String string = arrstring[i2];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static gg a(double d2, String string, boolean bl2) {
        return mn.a(d2, string, -30000000, 30000000, bl2);
    }

    public static gg a(double d2, String string, int n2, int n3, boolean bl2) {
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new cml("commands.generic.num.invalid", d2);
        }
        double d3 = 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += mn.c(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        double d4 = d3 + (bl3 ? d2 : 0.0);
        if (n2 != 0 || n3 != 0) {
            if (d4 < (double)n2) {
                throw new cml("commands.generic.double.tooSmall", d4, n2);
            }
            if (d4 > (double)n3) {
                throw new cml("commands.generic.double.tooBig", d4, n3);
            }
        }
        return new gg(d4, d3, bl3);
    }

    public static double b(double d2, String string, boolean bl2) {
        return mn.b(d2, string, -30000000, 30000000, bl2);
    }

    public static double b(double d2, String string, int n2, int n3, boolean bl2) {
        double d3;
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new cml("commands.generic.num.invalid", d2);
        }
        double d4 = d3 = bl3 ? d2 : 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += mn.c(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (d3 < (double)n2) {
                throw new cml("commands.generic.double.tooSmall", d3, n2);
            }
            if (d3 > (double)n3) {
                throw new cml("commands.generic.double.tooBig", d3, n3);
            }
        }
        return d3;
    }

    public static azg a(ala ala2, String string) {
        bpx bpx2 = new bpx(string);
        azg azg2 = (azg)azg.g.c(bpx2);
        if (azg2 == null) {
            throw new cml("commands.give.item.notFound", bpx2);
        }
        return azg2;
    }

    public static bfa b(ala ala2, String string) {
        bpx bpx2 = new bpx(string);
        if (!bfa.v.d(bpx2)) {
            throw new cml("commands.give.block.notFound", bpx2);
        }
        bfa bfa2 = (bfa)bfa.v.c(bpx2);
        if (bfa2 == null) {
            throw new cml("commands.give.block.notFound", bpx2);
        }
        return bfa2;
    }

    public static String a(Object[] arrobject) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i2 = 0; i2 < arrobject.length; ++i2) {
            String string = arrobject[i2].toString();
            if (i2 > 0) {
                if (i2 == arrobject.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static cbg a(List list) {
        aym aym2 = new aym("");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 > 0) {
                if (i2 == list.size() - 1) {
                    aym2.b(" and ");
                } else if (i2 > 0) {
                    aym2.b(", ");
                }
            }
            aym2.a((cbg)list.get(i2));
        }
        return aym2;
    }

    public static String a(Collection collection) {
        return mn.a(collection.toArray(new String[collection.size()]));
    }

    public static List a(String[] arrstring, int n2, cmz cmz2) {
        String string;
        if (cmz2 == null) {
            return ov.a(new String[]{"~"});
        }
        int n3 = arrstring.length - 1;
        if (n3 == n2) {
            string = Integer.toString(cmz2.a());
        } else if (n3 == n2 + 1) {
            string = Integer.toString(cmz2.b());
        } else if (n3 == n2 + 2) {
            string = Integer.toString(cmz2.c());
        } else {
            return Collections.emptyList();
        }
        return ov.a(new String[]{string});
    }

    public static List b(String[] arrstring, int n2, cmz cmz2) {
        String string;
        if (cmz2 == null) {
            return ov.a(new String[]{"~"});
        }
        int n3 = arrstring.length - 1;
        if (n3 == n2) {
            string = Integer.toString(cmz2.a());
        } else if (n3 == n2 + 1) {
            string = Integer.toString(cmz2.c());
        } else {
            return null;
        }
        return ov.a(new String[]{string});
    }

    public static boolean a(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List a(String[] arrstring, String ... arrstring2) {
        return mn.a(arrstring, Arrays.asList(arrstring2));
    }

    public static List a(String[] arrstring, Collection collection) {
        String string = arrstring[arrstring.length - 1];
        ArrayList arrayList = ov.a();
        if (!collection.isEmpty()) {
            for (Object object : mq.a((Iterable)collection, bn.a())) {
                if (!mn.a(string, (String)object)) continue;
                arrayList.add(object);
            }
            if (arrayList.isEmpty()) {
                for (Object object : collection) {
                    if (!(object instanceof bpx) || !mn.a(string, ((bpx)object).b())) continue;
                    arrayList.add(String.valueOf(object));
                }
            }
        }
        return arrayList;
    }

    @Override
    public boolean a(String[] arrstring, int n2) {
        return false;
    }

    public static void a(ala ala2, fh fh2, String string, Object ... arrobject) {
        mn.a(ala2, fh2, 0, string, arrobject);
    }

    public static void a(ala ala2, fh fh2, int n2, String string, Object ... arrobject) {
        if (a != null) {
            a.a(ala2, fh2, n2, string, arrobject);
        }
    }

    public static void a(csc csc2) {
        a = csc2;
    }

    public int a(fh fh2) {
        return this.a().compareTo(fh2.a());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((fh)object);
    }
}

