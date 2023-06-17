/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.aad;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.h;
import net.minecraft.client.f.j;
import net.minecraft.client.f.n;
import net.minecraft.client.f.s;
import net.minecraft.client.f.t;
import net.minecraft.client.f.u;
import net.minecraft.u.d.b.b;
import org.apache.logging.log4j.c;

public class af
implements j {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private final d c;
    private String d;
    protected static final n a = new n();
    private final Map e = sz.c();

    public af(d d2, String string) {
        this.c = d2;
        this.d = string;
        u.a(a);
    }

    public void a(List list) {
        this.e.clear();
        for (t t2 : list) {
            try {
                net.minecraft.client.f.a.j j2 = (net.minecraft.client.f.a.j)t2.a(this.c, "language");
                if (j2 == null) continue;
                for (h h2 : j2.a()) {
                    if (this.e.containsKey(h2.a())) continue;
                    this.e.put(h2.a(), h2);
                }
            }
            catch (RuntimeException runtimeException) {
                b.f("Unable to parse metadata section of resourcepack: {}", t2.c(), runtimeException);
            }
            catch (IOException iOException) {
                b.f("Unable to parse metadata section of resourcepack: {}", t2.c(), iOException);
            }
        }
    }

    @Override
    public void a(s s2) {
        ArrayList arrayList = ov.a(new String[]{"en_US"});
        if (!"en_US".equals(this.d)) {
            arrayList.add(this.d);
        }
        a.a(s2, arrayList);
        net.minecraft.u.d.b.b.a(af.a.a);
    }

    public boolean a() {
        return a.a();
    }

    public boolean b() {
        return this.c() != null && this.c().b();
    }

    public void a(h h2) {
        this.d = h2.a();
    }

    public h c() {
        String string = this.e.containsKey(this.d) ? this.d : "en_US";
        return (h)this.e.get(string);
    }

    public SortedSet d() {
        return aad.e(this.e.values());
    }
}

