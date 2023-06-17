/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.p;

import com.a.a.d.ov;
import com.a.a.d.sz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.minecraft.p.c;
import org.apache.logging.log4j.d;

public class b {
    private static final d b = org.apache.logging.log4j.c.c();
    private final List c = ov.a();
    private final List d = ov.a();
    public boolean a;
    private String e = "";
    private final Map f = sz.c();

    public void a() {
        this.f.clear();
        this.e = "";
        this.c.clear();
    }

    public void a(String string) {
        if (this.a) {
            if (this.e.length() > 0) {
                this.e = String.valueOf(this.e) + ".";
            }
            this.e = String.valueOf(this.e) + string;
            this.c.add(this.e);
            this.d.add(System.nanoTime());
        }
    }

    public void b() {
        if (this.a) {
            long l2 = System.nanoTime();
            long l3 = (Long)this.d.remove(this.d.size() - 1);
            this.c.remove(this.c.size() - 1);
            long l4 = l2 - l3;
            if (this.f.containsKey(this.e)) {
                this.f.put(this.e, (Long)this.f.get(this.e) + l4);
            } else {
                this.f.put(this.e, l4);
            }
            if (l4 > 100000000L) {
                b.f("Something's taking too long! '{}' took aprox {} ms", this.e, (double)l4 / 1000000.0);
            }
            this.e = this.c.isEmpty() ? "" : (String)this.c.get(this.c.size() - 1);
        }
    }

    public List b(String string) {
        if (!this.a) {
            return Collections.emptyList();
        }
        long l2 = this.f.containsKey("root") ? (Long)this.f.get("root") : 0L;
        long l3 = this.f.containsKey(string) ? (Long)this.f.get(string) : -1L;
        ArrayList arrayList = ov.a();
        if (string.length() > 0) {
            string = String.valueOf(string) + ".";
        }
        long l4 = 0L;
        for (String string2 : this.f.keySet()) {
            if (string2.length() <= string.length() || !string2.startsWith(string) || string2.indexOf(".", string.length() + 1) >= 0) continue;
            l4 += ((Long)this.f.get(string2)).longValue();
        }
        float f2 = l4;
        if (l4 < l3) {
            l4 = l3;
        }
        if (l2 < l4) {
            l2 = l4;
        }
        for (Object object : this.f.keySet()) {
            if (((String)object).length() <= string.length() || !((String)object).startsWith(string) || ((String)object).indexOf(".", string.length() + 1) >= 0) continue;
            long l5 = (Long)this.f.get(object);
            double d2 = (double)l5 * 100.0 / (double)l4;
            double d3 = (double)l5 * 100.0 / (double)l2;
            String string3 = ((String)object).substring(string.length());
            arrayList.add(new c(string3, d2, d3));
        }
        for (Object object : this.f.keySet()) {
            this.f.put(object, (Long)this.f.get(object) * 999L / 1000L);
        }
        if ((float)l4 > f2) {
            arrayList.add(new c("unspecified", (double)((float)l4 - f2) * 100.0 / (double)l4, (double)((float)l4 - f2) * 100.0 / (double)l2));
        }
        Collections.sort(arrayList);
        arrayList.add(0, new c(string, 100.0, (double)l4 * 100.0 / (double)l2));
        return arrayList;
    }

    public void c(String string) {
        this.b();
        this.a(string);
    }

    public String c() {
        return this.c.size() == 0 ? "[UNKNOWN]" : (String)this.c.get(this.c.size() - 1);
    }
}

