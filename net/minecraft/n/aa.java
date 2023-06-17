/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.n;

import com.a.a.b.bn;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.l.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import net.minecraft.c.a;
import net.minecraft.e.e;
import net.minecraft.g.cn;
import net.minecraft.m.cg;
import net.minecraft.m.cu;
import net.minecraft.n.ag;
import net.minecraft.n.ao;
import net.minecraft.n.as;
import net.minecraft.n.at;
import net.minecraft.n.ay;
import net.minecraft.n.az;
import net.minecraft.n.ba;
import net.minecraft.n.o;
import net.minecraft.n.t;
import net.minecraft.n.v;
import net.minecraft.u.bp;
import net.minecraft.u.d.k;
import net.minecraft.w.a.b;
import net.minecraft.w.a.g;
import net.minecraft.w.n;
import org.apache.commons.c.d.f;

public abstract class aa
implements t {
    private static ay a;

    protected static as a(com.a.b.aa aa2) {
        Throwable throwable = f.b(aa2);
        String string = "";
        if (throwable != null && (string = throwable.getMessage()).contains("setLenient")) {
            string = string.substring(string.indexOf("to accept ") + 10);
        }
        return new as("commands.tellraw.jsonException", string);
    }

    protected static e a(n n2) {
        cu cu2;
        e e2 = n2.e(new e());
        if (n2 instanceof b && (cu2 = ((b)n2).q.a()) != null && cu2.a() != null) {
            e2.a("SelectedItem", cu2.b(new e()));
        }
        return e2;
    }

    public int b() {
        return 4;
    }

    @Override
    public List c() {
        return Collections.emptyList();
    }

    @Override
    public boolean a(a a2, az az2) {
        return az2.a(this.b(), this.a());
    }

    @Override
    public List a(a a2, az az2, String[] arrstring, net.minecraft.u.b.b b2) {
        return Collections.emptyList();
    }

    public static int a(String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new v("commands.generic.num.invalid", string);
        }
    }

    public static int a(String string, int n2) {
        return aa.a(string, n2, Integer.MAX_VALUE);
    }

    public static int a(String string, int n2, int n3) {
        int n4 = aa.a(string);
        if (n4 < n2) {
            throw new v("commands.generic.num.tooSmall", n4, n2);
        }
        if (n4 > n3) {
            throw new v("commands.generic.num.tooBig", n4, n3);
        }
        return n4;
    }

    public static long b(String string) {
        try {
            return Long.parseLong(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new v("commands.generic.num.invalid", string);
        }
    }

    public static long a(String string, long l2, long l3) {
        long l4 = aa.b(string);
        if (l4 < l2) {
            throw new v("commands.generic.num.tooSmall", l4, l2);
        }
        if (l4 > l3) {
            throw new v("commands.generic.num.tooBig", l4, l3);
        }
        return l4;
    }

    public static net.minecraft.u.b.b a(az az2, String[] arrstring, int n2, boolean bl2) {
        net.minecraft.u.b.b b2 = az2.aC();
        return new net.minecraft.u.b.b(aa.b(b2.cy_(), arrstring[n2], -30000000, 30000000, bl2), aa.b(b2.k(), arrstring[n2 + 1], 0, 256, false), aa.b(b2.l(), arrstring[n2 + 2], -30000000, 30000000, bl2));
    }

    public static double c(String string) {
        try {
            double d2 = Double.parseDouble(string);
            if (!i.b(d2)) {
                throw new v("commands.generic.num.invalid", string);
            }
            return d2;
        }
        catch (NumberFormatException numberFormatException) {
            throw new v("commands.generic.num.invalid", string);
        }
    }

    public static double a(String string, double d2) {
        return aa.a(string, d2, Double.MAX_VALUE);
    }

    public static double a(String string, double d2, double d3) {
        double d4 = aa.c(string);
        if (d4 < d2) {
            throw new v("commands.generic.double.tooSmall", d4, d2);
        }
        if (d4 > d3) {
            throw new v("commands.generic.double.tooBig", d4, d3);
        }
        return d4;
    }

    public static boolean d(String string) {
        if (!"true".equals(string) && !"1".equals(string)) {
            if (!"false".equals(string) && !"0".equals(string)) {
                throw new o("commands.generic.boolean.invalid", string);
            }
            return false;
        }
        return true;
    }

    public static g b(az az2) {
        if (az2 instanceof g) {
            return (g)az2;
        }
        throw new ag("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static g a(a a2, az az2, String string) {
        g g2 = ao.a(az2, string);
        if (g2 == null) {
            try {
                g2 = a2.av().a(UUID.fromString(string));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                // empty catch block
            }
        }
        if (g2 == null) {
            g2 = a2.av().a(string);
        }
        if (g2 == null) {
            throw new ag();
        }
        return g2;
    }

    public static n b(a a2, az az2, String string) {
        return aa.a(a2, az2, string, n.class);
    }

    public static n a(a a2, az az2, String string, Class class_) {
        n n2 = ao.a(az2, string, class_);
        if (n2 == null) {
            n2 = a2.av().a(string);
        }
        if (n2 == null) {
            try {
                UUID uUID = UUID.fromString(string);
                n2 = a2.a(uUID);
                if (n2 == null) {
                    n2 = a2.av().a(uUID);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new ba("commands.generic.entity.invalidUuid", new Object[0]);
            }
        }
        if (n2 != null && class_.isAssignableFrom(n2.getClass())) {
            return n2;
        }
        throw new ba();
    }

    public static List c(a a2, az az2, String string) {
        return ao.b(string) ? ao.b(az2, string, n.class) : ov.a(aa.b(a2, az2, string));
    }

    public static String d(a a2, az az2, String string) {
        try {
            return aa.a(a2, az2, string).X();
        }
        catch (ag ag2) {
            if (string != null && !string.startsWith("@")) {
                return string;
            }
            throw ag2;
        }
    }

    public static String e(a a2, az az2, String string) {
        try {
            return aa.a(a2, az2, string).X();
        }
        catch (ag ag2) {
            try {
                return aa.b(a2, az2, string).cN();
            }
            catch (ba ba2) {
                if (string != null && !string.startsWith("@")) {
                    return string;
                }
                throw ba2;
            }
        }
    }

    public static net.minecraft.u.d.a a(az az2, String[] arrstring, int n2) {
        return aa.b(az2, arrstring, n2, false);
    }

    public static net.minecraft.u.d.a b(az az2, String[] arrstring, int n2, boolean bl2) {
        k k2 = new k("");
        for (int i2 = n2; i2 < arrstring.length; ++i2) {
            if (i2 > n2) {
                k2.a(" ");
            }
            net.minecraft.u.d.a a2 = new k(arrstring[i2]);
            if (bl2) {
                net.minecraft.u.d.a a3 = ao.b(az2, arrstring[i2]);
                if (a3 == null) {
                    if (ao.b(arrstring[i2])) {
                        throw new ag();
                    }
                } else {
                    a2 = a3;
                }
            }
            k2.a(a2);
        }
        return k2;
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

    public static at a(double d2, String string, boolean bl2) {
        return aa.a(d2, string, -30000000, 30000000, bl2);
    }

    public static at a(double d2, String string, int n2, int n3, boolean bl2) {
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new v("commands.generic.num.invalid", d2);
        }
        double d3 = 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += aa.c(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        double d4 = d3 + (bl3 ? d2 : 0.0);
        if (n2 != 0 || n3 != 0) {
            if (d4 < (double)n2) {
                throw new v("commands.generic.double.tooSmall", d4, n2);
            }
            if (d4 > (double)n3) {
                throw new v("commands.generic.double.tooBig", d4, n3);
            }
        }
        return new at(d4, d3, bl3);
    }

    public static double b(double d2, String string, boolean bl2) {
        return aa.b(d2, string, -30000000, 30000000, bl2);
    }

    public static double b(double d2, String string, int n2, int n3, boolean bl2) {
        double d3;
        boolean bl3 = string.startsWith("~");
        if (bl3 && Double.isNaN(d2)) {
            throw new v("commands.generic.num.invalid", d2);
        }
        double d4 = d3 = bl3 ? d2 : 0.0;
        if (!bl3 || string.length() > 1) {
            boolean bl4 = string.contains(".");
            if (bl3) {
                string = string.substring(1);
            }
            d3 += aa.c(string);
            if (!bl4 && !bl3 && bl2) {
                d3 += 0.5;
            }
        }
        if (n2 != 0 || n3 != 0) {
            if (d3 < (double)n2) {
                throw new v("commands.generic.double.tooSmall", d3, n2);
            }
            if (d3 > (double)n3) {
                throw new v("commands.generic.double.tooBig", d3, n3);
            }
        }
        return d3;
    }

    public static cg b(az az2, String string) {
        bp bp2 = new bp(string);
        cg cg2 = (cg)cg.e.a(bp2);
        if (cg2 == null) {
            throw new v("commands.give.item.notFound", bp2);
        }
        return cg2;
    }

    public static cn c(az az2, String string) {
        bp bp2 = new bp(string);
        if (!cn.v.c(bp2)) {
            throw new v("commands.give.block.notFound", bp2);
        }
        cn cn2 = (cn)cn.v.a(bp2);
        if (cn2 == null) {
            throw new v("commands.give.block.notFound", bp2);
        }
        return cn2;
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

    public static net.minecraft.u.d.a a(List list) {
        k k2 = new k("");
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (i2 > 0) {
                if (i2 == list.size() - 1) {
                    k2.a(" and ");
                } else if (i2 > 0) {
                    k2.a(", ");
                }
            }
            k2.a((net.minecraft.u.d.a)list.get(i2));
        }
        return k2;
    }

    public static String a(Collection collection) {
        return aa.a(collection.toArray(new String[collection.size()]));
    }

    public static List a(String[] arrstring, int n2, net.minecraft.u.b.b b2) {
        String string;
        if (b2 == null) {
            return ov.a(new String[]{"~"});
        }
        int n3 = arrstring.length - 1;
        if (n3 == n2) {
            string = Integer.toString(b2.cy_());
        } else if (n3 == n2 + 1) {
            string = Integer.toString(b2.k());
        } else {
            if (n3 != n2 + 2) {
                return Collections.emptyList();
            }
            string = Integer.toString(b2.l());
        }
        return ov.a(new String[]{string});
    }

    public static List b(String[] arrstring, int n2, net.minecraft.u.b.b b2) {
        String string;
        if (b2 == null) {
            return ov.a(new String[]{"~"});
        }
        int n3 = arrstring.length - 1;
        if (n3 == n2) {
            string = Integer.toString(b2.cy_());
        } else {
            if (n3 != n2 + 1) {
                return null;
            }
            string = Integer.toString(b2.l());
        }
        return ov.a(new String[]{string});
    }

    public static boolean a(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List a(String[] arrstring, String ... arrstring2) {
        return aa.a(arrstring, Arrays.asList(arrstring2));
    }

    public static List a(String[] arrstring, Collection collection) {
        String string = arrstring[arrstring.length - 1];
        ArrayList arrayList = ov.a();
        if (!collection.isEmpty()) {
            for (Object object : mq.a((Iterable)collection, bn.a())) {
                if (!aa.a(string, (String)object)) continue;
                arrayList.add(object);
            }
            if (arrayList.isEmpty()) {
                for (Object object : collection) {
                    if (!(object instanceof bp) || !aa.a(string, ((bp)object).b())) continue;
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

    public static void a(az az2, t t2, String string, Object ... arrobject) {
        aa.a(az2, t2, 0, string, arrobject);
    }

    public static void a(az az2, t t2, int n2, String string, Object ... arrobject) {
        if (a != null) {
            a.a(az2, t2, n2, string, arrobject);
        }
    }

    public static void a(ay ay2) {
        a = ay2;
    }

    public int a(t t2) {
        return this.a().compareTo(t2.a());
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.a((t)object);
    }
}

