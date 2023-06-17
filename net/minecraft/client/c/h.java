/*
 * Decompiled with CFR 0.150.
 */
package net.minecraft.client.c;

import com.a.b.k;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;
import net.minecraft.client.b.a;
import net.minecraft.client.c.ab;
import net.minecraft.client.c.b;
import net.minecraft.client.c.d;
import net.minecraft.client.c.f;
import net.minecraft.client.c.l;
import net.minecraft.client.c.q;
import net.minecraft.client.c.r;
import net.minecraft.client.c.s;
import net.minecraft.client.c.t;
import net.minecraft.client.c.u;
import net.minecraft.client.c.v;
import net.minecraft.client.c.z;
import net.minecraft.client.f.an;
import net.minecraft.client.f.j;
import net.minecraft.u.aw;
import net.minecraft.u.bp;
import net.minecraft.u.bu;
import net.minecraft.u.bv;
import org.apache.logging.log4j.c;

public class h
implements j,
aw {
    public static final l a = new l("meta:missing_sound", 1.0f, 1.0f, 1, net.minecraft.client.c.d.a, false);
    private static final org.apache.logging.log4j.d b = org.apache.logging.log4j.c.c();
    private static final k c = new com.a.b.r().a(net.minecraft.u.d.a.class, (Object)new net.minecraft.u.d.b()).a((Type)((Object)q.class), (Object)new s()).i();
    private static final ParameterizedType d = new b();
    private final f e = new f();
    private final v f;
    private final net.minecraft.client.f.s g;

    public h(net.minecraft.client.f.s s2, a a2) {
        this.g = s2;
        this.f = new v(this, a2);
    }

    @Override
    public void a(net.minecraft.client.f.s s2) {
        Object object;
        Object object2;
        this.e.b();
        for (Object object3 : s2.a()) {
            try {
                object2 = s2.b(new bp((String)object3, "sounds.json")).iterator();
                while (object2.hasNext()) {
                    object = (an)object2.next();
                    try {
                        Map map = this.a(object.b());
                        for (Map.Entry entry : map.entrySet()) {
                            this.a(new bp((String)object3, (String)entry.getKey()), (q)entry.getValue());
                        }
                    }
                    catch (RuntimeException runtimeException) {
                        b.f("Invalid sounds.json", (Throwable)runtimeException);
                    }
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        for (Object object3 : this.e.c()) {
            object = (u)this.e.a(object3);
            if (!(((u)object).c() instanceof net.minecraft.u.d.l) || net.minecraft.client.f.u.a((String)(object2 = ((net.minecraft.u.d.l)((u)object).c()).i()))) continue;
            b.a("Missing subtitle {} for event: {}", object2, object3);
        }
        for (Object object3 : this.e.c()) {
            if (bv.a.a(object3) != null) continue;
            b.a("Not having sound event for: {}", object3);
        }
        this.f.a();
    }

    protected Map a(InputStream inputStream) {
        Map map;
        try {
            map = (Map)c.a((Reader)new InputStreamReader(inputStream), (Type)d);
        }
        finally {
            org.apache.commons.b.t.a(inputStream);
        }
        return map;
    }

    private void a(bp bp2, q q2) {
        boolean bl2;
        u u2 = (u)this.e.a(bp2);
        boolean bl3 = bl2 = u2 == null;
        if (bl2 || q2.b()) {
            if (!bl2) {
                b.a("Replaced sound event location {}", bp2);
            }
            u2 = new u(bp2, q2.c());
            this.e.a(u2);
        }
        block4: for (l l2 : q2.a()) {
            r r2;
            bp bp3 = l2.a();
            switch (l2.g()) {
                case a: {
                    if (!this.a(l2, bp2)) continue block4;
                    r2 = l2;
                    break;
                }
                case b: {
                    r2 = new t(this, bp3);
                    break;
                }
                default: {
                    throw new IllegalStateException("Unknown SoundEventRegistration type: " + (Object)((Object)l2.g()));
                }
            }
            u2.a(r2);
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(l l2, bp bp2) {
        bp bp3 = l2.b();
        an an2 = null;
        try {
            an2 = this.g.a(bp3);
            an2.b();
        }
        catch (FileNotFoundException fileNotFoundException) {
            b.f("File {} does not exist, cannot add it to event {}", bp3, bp2);
            boolean bl2 = false;
            {
                catch (Throwable throwable) {
                    org.apache.commons.b.t.a(an2);
                    throw throwable;
                }
            }
            org.apache.commons.b.t.a(an2);
            return bl2;
            catch (IOException iOException) {
                boolean bl3;
                b.f("Could not load sound file {}, cannot add it to event {}", bp3, bp2, iOException);
                boolean bl4 = bl3 = false;
                org.apache.commons.b.t.a(an2);
                return bl4;
            }
        }
        org.apache.commons.b.t.a(an2);
        return true;
    }

    public u a(bp bp2) {
        return (u)this.e.a(bp2);
    }

    public void a(z z2) {
        this.f.c(z2);
    }

    public void a(z z2, int n2) {
        this.f.a(z2, n2);
    }

    public void a(net.minecraft.w.a.b b2, float f2) {
        this.f.a(b2, f2);
    }

    public void b() {
        this.f.e();
    }

    public void c() {
        this.f.c();
    }

    public void d() {
        this.f.b();
    }

    @Override
    public void a() {
        this.f.d();
    }

    public void e() {
        this.f.f();
    }

    public void a(bu bu2, float f2) {
        if (bu2 == bu.a && f2 <= 0.0f) {
            this.c();
        }
        this.f.a(bu2, f2);
    }

    public void b(z z2) {
        this.f.b(z2);
    }

    public boolean c(z z2) {
        return this.f.a(z2);
    }

    public void a(ab ab2) {
        this.f.a(ab2);
    }

    public void b(ab ab2) {
        this.f.b(ab2);
    }

    public void a(String string, bu bu2) {
        this.f.a(string, bu2);
    }

    static /* synthetic */ f a(h h2) {
        return h2.e;
    }
}

