/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.b.bx;
import com.a.a.b.cm;
import com.a.a.b.cn;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.apache.commons.c.am;
import org.apache.commons.c.c;

public class chl {
    private static final bx a = bx.a(",");
    private final List b = ov.a();
    private final Map c = sz.c();
    private int d;
    private int e;

    private chl() {
        this.c.put(Character.valueOf(' '), cn.a());
    }

    public chl a(String ... arrstring) {
        if (org.apache.commons.c.c.f(arrstring) || am.a((CharSequence)arrstring[0])) {
            throw new IllegalArgumentException("Empty pattern for aisle");
        }
        if (this.b.isEmpty()) {
            this.d = arrstring.length;
            this.e = arrstring[0].length();
        }
        if (arrstring.length != this.d) {
            throw new IllegalArgumentException("Expected aisle with height of " + this.d + ", but was given one with a height of " + arrstring.length + ")");
        }
        for (String string : arrstring) {
            if (string.length() != this.e) {
                throw new IllegalArgumentException("Not all rows in the given aisle are the correct width (expected " + this.e + ", found one with " + string.length() + ")");
            }
            for (char c2 : string.toCharArray()) {
                if (this.c.containsKey(Character.valueOf(c2))) continue;
                this.c.put(Character.valueOf(c2), null);
            }
        }
        this.b.add(arrstring);
        return this;
    }

    public static chl a() {
        return new chl();
    }

    public chl a(char c2, cm cm2) {
        this.c.put(Character.valueOf(c2), cm2);
        return this;
    }

    public ve b() {
        return new ve(this.c());
    }

    private cm[][][] c() {
        this.d();
        cm[][][] arrcm = (cm[][][])Array.newInstance(cm.class, this.b.size(), this.d, this.e);
        for (int i2 = 0; i2 < this.b.size(); ++i2) {
            for (int i3 = 0; i3 < this.d; ++i3) {
                for (int i4 = 0; i4 < this.e; ++i4) {
                    arrcm[i2][i3][i4] = (cm)this.c.get(Character.valueOf(((String[])this.b.get(i2))[i3].charAt(i4)));
                }
            }
        }
        return arrcm;
    }

    private void d() {
        ArrayList arrayList = ov.a();
        for (Map.Entry entry : this.c.entrySet()) {
            if (entry.getValue() != null) continue;
            arrayList.add(entry.getKey());
        }
        if (!arrayList.isEmpty()) {
            throw new IllegalStateException("Predicates for character(s) " + a.a(arrayList) + " are missing");
        }
    }
}

