/*
 * Decompiled with CFR 0.150.
 */
import com.a.a.d.aad;
import com.a.a.d.sz;
import com.a.b.aa;
import com.a.b.ab;
import com.a.b.w;
import com.a.b.z;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.c.a;
import org.apache.commons.b.o;
import org.apache.logging.log4j.c;
import org.apache.logging.log4j.d;

public class f
extends cwj {
    private static final d b = org.apache.logging.log4j.c.c();
    private final a c;
    private final File d;
    private final Set e = aad.a();
    private int f = -300;
    private boolean g;

    public f(a a2, File file) {
        this.c = a2;
        this.d = file;
    }

    public void a() {
        if (this.d.isFile()) {
            try {
                this.a.clear();
                this.a.putAll(this.a(o.g(this.d)));
            }
            catch (IOException iOException) {
                b.b("Couldn't read statistics file {}", this.d, iOException);
            }
            catch (aa aa2) {
                b.b("Couldn't parse statistics file {}", this.d, aa2);
            }
        }
    }

    public void b() {
        try {
            o.d(this.d, f.a(this.a));
        }
        catch (IOException iOException) {
            b.b("Couldn't save stats", (Throwable)iOException);
        }
    }

    @Override
    public void a(bdl bdl2, cyd cyd2, int n2) {
        int n3 = cyd2.e() ? this.a(cyd2) : 0;
        super.a(bdl2, cyd2, n2);
        this.e.add(cyd2);
        if (cyd2.e() && n3 == 0 && n2 > 0) {
            this.g = true;
            if (this.c.ax()) {
                ((cmt)((Object)this.c.al())).a(new du("chat.type.achievement", bdl2.v(), cyd2.j()));
            }
        }
        if (cyd2.e() && n3 > 0 && n2 == 0) {
            this.g = true;
            if (this.c.ax()) {
                ((cmt)((Object)this.c.al())).a(new du("chat.type.achievement.taken", bdl2.v(), cyd2.j()));
            }
        }
    }

    public Set c() {
        HashSet hashSet = aad.b((Iterable)this.e);
        this.e.clear();
        this.g = false;
        return hashSet;
    }

    public Map a(String string) {
        w w2 = new ab().a(string);
        if (!w2.q()) {
            return sz.c();
        }
        z z2 = w2.t();
        HashMap hashMap = sz.c();
        for (Map.Entry entry : z2.b()) {
            cyd cyd2 = bpv.a((String)entry.getKey());
            if (cyd2 != null) {
                bgj bgj2 = new bgj();
                if (((w)entry.getValue()).r() && ((w)entry.getValue()).v().y()) {
                    bgj2.a(((w)entry.getValue()).j());
                } else if (((w)entry.getValue()).q()) {
                    z z3 = ((w)entry.getValue()).t();
                    if (z3.b("value") && z3.c("value").r() && z3.c("value").v().y()) {
                        bgj2.a(z3.d("value").j());
                    }
                    if (z3.b("progress") && cyd2.l() != null) {
                        try {
                            Constructor constructor = cyd2.l().getConstructor(new Class[0]);
                            awk awk2 = (awk)constructor.newInstance(new Object[0]);
                            awk2.a(z3.c("progress"));
                            bgj2.a(awk2);
                        }
                        catch (Throwable throwable) {
                            b.f("Invalid statistic progress in {}", this.d, throwable);
                        }
                    }
                }
                hashMap.put(cyd2, bgj2);
                continue;
            }
            b.f("Invalid statistic in {}: Don't know what {} is", this.d, entry.getKey());
        }
        return hashMap;
    }

    public static String a(Map map) {
        z z2 = new z();
        for (Map.Entry entry : map.entrySet()) {
            if (((bgj)entry.getValue()).b() != null) {
                z z3 = new z();
                z3.a("value", ((bgj)entry.getValue()).a());
                try {
                    z3.a("progress", ((bgj)entry.getValue()).b().a());
                }
                catch (Throwable throwable) {
                    b.f("Couldn't save statistic {}: error serializing progress", ((cyd)entry.getKey()).f(), throwable);
                }
                z2.a(((cyd)entry.getKey()).e, z3);
                continue;
            }
            z2.a(((cyd)entry.getKey()).e, ((bgj)entry.getValue()).a());
        }
        return z2.toString();
    }

    public void d() {
        for (cyd cyd2 : this.a.keySet()) {
            this.e.add(cyd2);
        }
    }

    public void a(czt czt2) {
        int n2 = this.c.ap();
        HashMap hashMap = sz.c();
        if (this.g || n2 - this.f > 300) {
            this.f = n2;
            for (cyd cyd2 : this.c()) {
                hashMap.put(cyd2, this.a(cyd2));
            }
        }
        czt2.a.a(new csl(hashMap));
    }

    public void b(czt czt2) {
        HashMap hashMap = sz.c();
        for (box box2 : bpa.e) {
            if (!this.a(box2)) continue;
            hashMap.put(box2, this.a((cyd)box2));
            this.e.remove(box2);
        }
        czt2.a.a(new csl(hashMap));
    }

    public boolean e() {
        return this.g;
    }
}

