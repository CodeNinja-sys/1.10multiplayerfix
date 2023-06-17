/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.a;
import e.a.b.h;
import e.a.d;
import e.a.e;
import e.a.g;
import e.a.n;
import e.a.o;
import e.a.p;
import e.a.s;
import e.a.u;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Mixer;

public class c
extends g {
    private static final boolean h = false;
    private static final boolean i = true;
    private static final int j = 0;
    private final int k = 0x100000;
    private static Mixer l = null;
    private static e.a.b.e m = null;
    private static c n = null;
    private static int o = 4000;
    private static int p = 48000;
    private static int q = 32;
    private static boolean r = true;
    private static boolean s = true;
    private static boolean t = true;

    public c() {
        n = this;
    }

    /*
     * WARNING - void declaration
     */
    public void b() {
        e.a.b.e e2 = null;
        if (l == null) {
            for (Mixer.Info info : AudioSystem.getMixerInfo()) {
                if (!info.getName().equals("Java Sound Audio Engine")) continue;
                e2 = new e.a.b.e();
                try {
                    e2.a(info);
                }
                catch (e.a.b.d d2) {
                    break;
                }
                if (e2.m < 14) break;
                l = AudioSystem.getMixer(info);
                e.a.b.c.a(true, e2);
                break;
            }
            if (l == null) {
                void var2_4;
                e.a.b.e e3 = e2;
                for (Mixer.Info info : AudioSystem.getMixerInfo()) {
                    e2 = new e.a.b.e();
                    try {
                        e2.a(info);
                    }
                    catch (e.a.b.d d3) {
                        // empty catch block
                    }
                    if (var2_4 != null && e2.m <= var2_4.m) continue;
                    e.a.b.e e4 = e2;
                }
                if (var2_4 == null) {
                    throw new e.a.b.d("No useable mixers found!", new e.a.b.e());
                }
                try {
                    l = AudioSystem.getMixer(var2_4.l);
                    e.a.b.c.a(true, (e.a.b.e)var2_4);
                }
                catch (Exception exception) {
                    throw new e.a.b.d("No useable mixers available!", new e.a.b.e());
                }
            }
        }
        this.a(1.0f);
        this.o("JavaSound initialized.");
        super.b();
    }

    public static boolean s() {
        for (Mixer.Info info : AudioSystem.getMixerInfo()) {
            if (!info.getName().equals("Java Sound Audio Engine")) continue;
            return true;
        }
        return false;
    }

    protected a a(int n2) {
        return new e.a.b.a(n2, l);
    }

    public void a() {
        super.a();
        n = null;
        l = null;
        m = null;
    }

    public boolean a(d d2) {
        if (this.b == null) {
            this.b = new HashMap();
            this.p("Buffer Map was null in method 'loadSound'");
        }
        if (this.a(d2 == null, "Filename/URL not specified in method 'loadSound'")) {
            return false;
        }
        if (this.b.get(d2.a()) != null) {
            return true;
        }
        e e2 = e.a.p.c(d2.a());
        if (this.a(e2 == null, "No codec found for file '" + d2.a() + "' in method 'loadSound'")) {
            return false;
        }
        URL uRL = d2.b();
        if (this.a(uRL == null, "Unable to open file '" + d2.a() + "' in method 'loadSound'")) {
            return false;
        }
        e2.a(uRL);
        n n2 = e2.c();
        e2.e();
        e2 = null;
        if (n2 != null) {
            this.b.put(d2.a(), n2);
        } else {
            this.q("Sound buffer null in method 'loadSound'");
        }
        return true;
    }

    public boolean a(n n2, String string) {
        if (this.b == null) {
            this.b = new HashMap();
            this.p("Buffer Map was null in method 'loadSound'");
        }
        if (this.a(string == null, "Identifier not specified in method 'loadSound'")) {
            return false;
        }
        if (this.b.get(string) != null) {
            return true;
        }
        if (n2 != null) {
            this.b.put(string, n2);
        } else {
            this.q("Sound buffer null in method 'loadSound'");
        }
        return true;
    }

    public void a(float f2) {
        super.a(f2);
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.g();
        }
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5) {
        n n3 = null;
        if (!bl3) {
            n3 = (n)this.b.get(d2.a());
            if (n3 == null && !this.a(d2)) {
                this.q("Source '" + string + "' was not created " + "because an error occurred while loading " + d2.a());
                return;
            }
            n3 = (n)this.b.get(d2.a());
            if (n3 == null) {
                this.q("Source '" + string + "' was not created " + "because audio data was not found for " + d2.a());
                return;
            }
        }
        if (!bl3 && n3 != null) {
            n3.a(0x100000);
        }
        this.c.put(string, new h(this.a, bl2, bl3, bl4, string, d2, n3, f2, f3, f4, n2, f5, false));
    }

    public void a(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        this.c.put(string, new h(this.a, audioFormat, bl2, string, f2, f3, f4, n2, f5));
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5, boolean bl5) {
        n n3 = null;
        if (!bl3) {
            n3 = (n)this.b.get(d2.a());
            if (n3 == null && !this.a(d2)) {
                this.q("Source '" + string + "' was not created " + "because an error occurred while loading " + d2.a());
                return;
            }
            n3 = (n)this.b.get(d2.a());
            if (n3 == null) {
                this.q("Source '" + string + "' was not created " + "because audio data was not found for " + d2.a());
                return;
            }
        }
        if (!bl3 && n3 != null) {
            n3.a(0x100000);
        }
        this.c.put(string, new h(this.a, bl2, bl3, bl4, string, d2, n3, f2, f3, f4, n2, f5, bl5));
    }

    public void a(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        if (this.b == null) {
            this.b = new HashMap();
            this.p("Buffer Map was null in method 'copySources'");
        }
        this.c.clear();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            u u2 = (u)hashMap.get(string);
            if (u2 == null) continue;
            n n2 = null;
            if (!u2.f) {
                this.a(u2.j);
                n2 = (n)this.b.get(u2.j.a());
            }
            if (!u2.f && n2 != null) {
                n2.a(0x100000);
            }
            if (!u2.f && n2 == null) continue;
            this.c.put(string, new h(this.a, u2, n2));
        }
    }

    public void a(float f2, float f3, float f4) {
        super.a(f2, f3, f4);
        this.l();
    }

    public void f() {
        super.f();
        this.l();
    }

    public static Mixer t() {
        return e.a.b.c.a(false, null);
    }

    public static void a(Mixer mixer) {
        e.a.b.c.a(true, mixer);
        s s2 = e.a.o.l();
        e.a.o.a(null);
        if (s2 != null) {
            throw s2;
        }
    }

    private static synchronized Mixer a(boolean bl2, Mixer mixer) {
        if (bl2) {
            if (mixer == null) {
                return l;
            }
            e.a.b.e e2 = new e.a.b.e();
            try {
                e2.a(mixer.getMixerInfo());
            }
            catch (e.a.b.d d2) {
                e.a.p.b().a(d2, 1);
                e.a.o.a(d2);
            }
            l = mixer;
            e.a.b.c.a(true, e2);
            if (n != null) {
                e.a.b.a a2;
                ListIterator listIterator = e.a.b.c.n.e.listIterator();
                e.a.o.a(null);
                while (listIterator.hasNext()) {
                    a2 = (e.a.b.a)listIterator.next();
                    a2.a(mixer);
                }
                listIterator = e.a.b.c.n.d.listIterator();
                while (listIterator.hasNext()) {
                    a2 = (e.a.b.a)listIterator.next();
                    a2.a(mixer);
                }
            }
        }
        return l;
    }

    public static e.a.b.e u() {
        return e.a.b.c.a(false, null);
    }

    private static synchronized e.a.b.e a(boolean bl2, e.a.b.e e2) {
        if (bl2) {
            m = e2;
        }
        return m;
    }

    public static void b(int n2) {
        e.a.b.c.d(true, n2);
    }

    private static synchronized int d(boolean bl2, int n2) {
        if (bl2) {
            o = n2;
        }
        return o;
    }

    public static void c(int n2) {
        e.a.b.c.e(true, n2);
    }

    private static synchronized int e(boolean bl2, int n2) {
        if (bl2) {
            p = n2;
        }
        return p;
    }

    public static void d(int n2) {
        e.a.b.c.f(true, n2);
    }

    private static synchronized int f(boolean bl2, int n2) {
        if (bl2) {
            q = n2;
        }
        return q;
    }

    public static void a(boolean bl2) {
        e.a.b.c.d(true, bl2);
    }

    private static synchronized boolean d(boolean bl2, boolean bl3) {
        if (bl2) {
            r = bl3;
        }
        return r;
    }

    public static void b(boolean bl2) {
        e.a.b.c.e(true, bl2);
    }

    private static synchronized boolean e(boolean bl2, boolean bl3) {
        if (bl2) {
            s = bl3;
        }
        return s;
    }

    public static void c(boolean bl2) {
        e.a.b.c.f(true, bl2);
    }

    private static synchronized boolean f(boolean bl2, boolean bl3) {
        if (bl2) {
            t = bl3;
        }
        return t;
    }

    public static String v() {
        return "Java Sound";
    }

    public static String w() {
        return "The Java Sound API.  For more information, see http://java.sun.com/products/java-media/sound/";
    }

    public String r() {
        return "LibraryJavaSound";
    }

    static /* synthetic */ int a(boolean bl2, int n2) {
        return e.a.b.c.d(bl2, n2);
    }

    static /* synthetic */ int b(boolean bl2, int n2) {
        return e.a.b.c.e(bl2, n2);
    }

    static /* synthetic */ int c(boolean bl2, int n2) {
        return e.a.b.c.f(bl2, n2);
    }

    static /* synthetic */ boolean a(boolean bl2, boolean bl3) {
        return e.a.b.c.d(bl2, bl3);
    }

    static /* synthetic */ boolean b(boolean bl2, boolean bl3) {
        return e.a.b.c.e(bl2, bl3);
    }

    static /* synthetic */ boolean c(boolean bl2, boolean bl3) {
        return e.a.b.c.f(bl2, bl3);
    }
}

