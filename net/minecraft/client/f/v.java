/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.f;

import com.a.a.b.bx;
import com.a.a.d.aad;
import com.a.a.d.mq;
import com.a.a.d.ov;
import com.a.a.d.sz;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.client.f.a.d;
import net.minecraft.client.f.ai;
import net.minecraft.client.f.an;
import net.minecraft.client.f.j;
import net.minecraft.client.f.l;
import net.minecraft.client.f.o;
import net.minecraft.client.f.s;
import net.minecraft.client.f.t;
import net.minecraft.u.bp;
import org.apache.logging.log4j.c;

public class v
implements l {
    private static final org.apache.logging.log4j.d a = org.apache.logging.log4j.c.c();
    private static final bx b = bx.a(", ");
    private final Map c = sz.c();
    private final List d = ov.a();
    private final Set e = aad.c();
    private final d f;

    public v(d d2) {
        this.f = d2;
    }

    public void a(t t2) {
        for (String string : t2.a()) {
            this.e.add(string);
            ai ai2 = (ai)this.c.get(string);
            if (ai2 == null) {
                ai2 = new ai(this.f);
                this.c.put(string, ai2);
            }
            ai2.a(t2);
        }
    }

    @Override
    public Set a() {
        return this.e;
    }

    @Override
    public an a(bp bp2) {
        s s2 = (s)this.c.get(bp2.c());
        if (s2 != null) {
            return s2.a(bp2);
        }
        throw new FileNotFoundException(bp2.toString());
    }

    @Override
    public List b(bp bp2) {
        s s2 = (s)this.c.get(bp2.c());
        if (s2 != null) {
            return s2.b(bp2);
        }
        throw new FileNotFoundException(bp2.toString());
    }

    private void b() {
        this.c.clear();
        this.e.clear();
    }

    @Override
    public void a(List list) {
        this.b();
        a.d("Reloading ResourceManager: {}", b.a(mq.a((Iterable)list, new o(this))));
        for (t t2 : list) {
            this.a(t2);
        }
        this.c();
    }

    @Override
    public void a(j j2) {
        this.d.add(j2);
        j2.a(this);
    }

    private void c() {
        for (j j2 : this.d) {
            j2.a(this);
        }
    }
}

