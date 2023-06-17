/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.d.ov;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.ac;
import net.minecraft.client.f.an;
import net.minecraft.client.f.c;
import net.minecraft.client.f.s;
import net.minecraft.client.f.t;
import net.minecraft.u.bp;

public class ai
implements s {
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    protected final List a = ov.a();
    private final d c;

    public ai(d d2) {
        this.c = d2;
    }

    public void a(t t2) {
        this.a.add(t2);
    }

    @Override
    public Set a() {
        return null;
    }

    @Override
    public an a(bp bp2) {
        this.d(bp2);
        t t2 = null;
        bp bp3 = ai.c(bp2);
        for (int i2 = this.a.size() - 1; i2 >= 0; --i2) {
            t t3 = (t)this.a.get(i2);
            if (t2 == null && t3.b(bp3)) {
                t2 = t3;
            }
            if (!t3.b(bp2)) continue;
            InputStream inputStream = null;
            if (t2 != null) {
                inputStream = this.a(bp3, t2);
            }
            return new c(t3.c(), bp2, this.a(bp2, t3), inputStream, this.c);
        }
        throw new FileNotFoundException(bp2.toString());
    }

    protected InputStream a(bp bp2, t t2) {
        InputStream inputStream = t2.a(bp2);
        return b.e() ? new ac(inputStream, bp2, t2.c()) : inputStream;
    }

    private void d(bp bp2) {
        if (bp2.b().contains("..")) {
            throw new IOException("Invalid relative path to resource: " + bp2);
        }
    }

    @Override
    public List b(bp bp2) {
        this.d(bp2);
        ArrayList arrayList = ov.a();
        bp bp3 = ai.c(bp2);
        for (t t2 : this.a) {
            if (!t2.b(bp2)) continue;
            InputStream inputStream = t2.b(bp3) ? this.a(bp3, t2) : null;
            arrayList.add(new c(t2.c(), bp2, this.a(bp2, t2), inputStream, this.c));
        }
        if (arrayList.isEmpty()) {
            throw new FileNotFoundException(bp2.toString());
        }
        return arrayList;
    }

    static bp c(bp bp2) {
        return new bp(bp2.c(), String.valueOf(bp2.b()) + ".mcmeta");
    }

    static /* synthetic */ org.apache.logging.log4j.d b() {
        return b;
    }
}

