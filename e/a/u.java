/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.a;
import e.a.d;
import e.a.e;
import e.a.g;
import e.a.n;
import e.a.p;
import e.a.t;
import e.a.w;
import java.net.URL;
import java.util.LinkedList;
import java.util.ListIterator;
import javax.sound.sampled.AudioFormat;

public class u {
    protected Class a = g.class;
    private static final boolean F = false;
    private static final boolean G = true;
    private static final boolean H = false;
    private t I;
    public boolean b = false;
    public AudioFormat c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f = false;
    public boolean g = false;
    public boolean h = false;
    public String i = "";
    public d j = null;
    public w k;
    public int l = 0;
    public float m = 0.0f;
    public w n;
    public float o = 1.0f;
    public float p = 1.0f;
    protected float q = 1.0f;
    public float r = 0.0f;
    public a s = null;
    public n t = null;
    private boolean J = true;
    private boolean K = true;
    private boolean L = false;
    protected e u = null;
    protected e v = null;
    protected LinkedList w = null;
    protected LinkedList x = null;
    protected final Object y = new Object();
    public boolean z = false;
    protected float A = -1.0f;
    protected float B = 1.0f;
    protected long C = 0L;
    protected long D = 0L;
    protected long E = 0L;

    public u(boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        this.I = e.a.p.b();
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.i = string;
        this.j = d2;
        this.t = n2;
        this.k = new w(f2, f3, f4);
        this.l = n3;
        this.m = f5;
        this.n = new w(0.0f, 0.0f, 0.0f);
        this.d = bl5;
        if (bl3 && d2 != null) {
            this.u = e.a.p.c(d2.a());
        }
    }

    public u(u u2, n n2) {
        this.I = e.a.p.b();
        this.e = u2.e;
        this.f = u2.f;
        this.g = u2.g;
        this.i = u2.i;
        this.j = u2.j;
        this.k = u2.k.a();
        this.l = u2.l;
        this.m = u2.m;
        this.n = u2.n.a();
        this.d = u2.d;
        this.p = u2.p;
        this.b = u2.b;
        this.c = u2.c;
        this.t = n2;
        if (this.f && this.j != null) {
            this.u = e.a.p.c(this.j.a());
        }
    }

    public u(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        this.I = e.a.p.b();
        this.e = bl2;
        this.f = true;
        this.g = false;
        this.i = string;
        this.j = null;
        this.t = null;
        this.k = new w(f2, f3, f4);
        this.l = n2;
        this.m = f5;
        this.n = new w(0.0f, 0.0f, 0.0f);
        this.d = false;
        this.b = true;
        this.c = audioFormat;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a() {
        if (this.u != null) {
            this.u.e();
        }
        Object object = this.y;
        synchronized (object) {
            if (this.x != null) {
                this.x.clear();
            }
            this.x = null;
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.t = null;
        this.u = null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2) {
        if (!this.f) {
            this.d("Method 'queueSound' may only be used for streaming and MIDI sources.");
            return;
        }
        if (d2 == null) {
            this.d("File not specified in method 'queueSound'");
            return;
        }
        Object object = this.y;
        synchronized (object) {
            if (this.x == null) {
                this.x = new LinkedList();
            }
            this.x.add(d2);
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(String string) {
        if (!this.f) {
            this.d("Method 'dequeueSound' may only be used for streaming and MIDI sources.");
            return;
        }
        if (string == null || string.equals("")) {
            this.d("Filename not specified in method 'dequeueSound'");
            return;
        }
        Object object = this.y;
        synchronized (object) {
            if (this.x != null) {
                ListIterator listIterator = this.x.listIterator();
                while (listIterator.hasNext()) {
                    if (!((d)listIterator.next()).a().equals(string)) continue;
                    listIterator.remove();
                    break;
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2, long l2) {
        if (!this.f) {
            this.d("Method 'fadeOut' may only be used for streaming and MIDI sources.");
            return;
        }
        if (l2 < 0L) {
            this.d("Miliseconds may not be negative in method 'fadeOut'.");
            return;
        }
        this.C = l2;
        this.D = 0L;
        this.A = 1.0f;
        this.E = System.currentTimeMillis();
        Object object = this.y;
        synchronized (object) {
            if (this.x != null) {
                this.x.clear();
            }
            if (d2 != null) {
                if (this.x == null) {
                    this.x = new LinkedList();
                }
                this.x.add(d2);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void a(d d2, long l2, long l3) {
        if (!this.f) {
            this.d("Method 'fadeOutIn' may only be used for streaming and MIDI sources.");
            return;
        }
        if (d2 == null) {
            this.d("Filename/URL not specified in method 'fadeOutIn'.");
            return;
        }
        if (l2 < 0L || l3 < 0L) {
            this.d("Miliseconds may not be negative in method 'fadeOutIn'.");
            return;
        }
        this.C = l2;
        this.D = l3;
        this.A = 1.0f;
        this.E = System.currentTimeMillis();
        Object object = this.y;
        synchronized (object) {
            if (this.x == null) {
                this.x = new LinkedList();
            }
            this.x.clear();
            this.x.add(d2);
        }
    }

    public boolean b() {
        if (!this.f) {
            return false;
        }
        if (this.A == -1.0f && this.B == 1.0f) {
            return false;
        }
        long l2 = System.currentTimeMillis();
        long l3 = l2 - this.E;
        this.E = l2;
        if (this.A >= 0.0f) {
            if (this.C == 0L) {
                this.A = -1.0f;
                this.B = 0.0f;
                if (!this.c()) {
                    this.n();
                }
                this.g();
                this.z = true;
                return false;
            }
            float f2 = (float)l3 / (float)this.C;
            this.A -= f2;
            if (this.A <= 0.0f) {
                this.A = -1.0f;
                this.B = 0.0f;
                if (!this.c()) {
                    this.n();
                }
                this.g();
                this.z = true;
                return false;
            }
            this.g();
            return true;
        }
        if (this.B < 1.0f) {
            this.A = -1.0f;
            if (this.D == 0L) {
                this.A = -1.0f;
                this.B = 1.0f;
            } else {
                float f3 = (float)l3 / (float)this.D;
                this.B += f3;
                if (this.B >= 1.0f) {
                    this.A = -1.0f;
                    this.B = 1.0f;
                }
            }
            this.g();
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean c() {
        if (!this.f) {
            this.d("Method 'incrementSoundSequence' may only be used for streaming and MIDI sources.");
            return false;
        }
        Object object = this.y;
        synchronized (object) {
            if (this.x != null && this.x.size() > 0) {
                this.j = (d)this.x.remove(0);
                if (this.u != null) {
                    this.u.e();
                }
                this.u = e.a.p.c(this.j.a());
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean d() {
        if (!this.f) {
            this.d("Method 'readBuffersFromNextSoundInSequence' may only be used for streaming sources.");
            return false;
        }
        Object object = this.y;
        synchronized (object) {
            if (this.x != null && this.x.size() > 0) {
                if (this.v != null) {
                    this.v.e();
                }
                this.v = e.a.p.c(((d)this.x.get(0)).a());
                this.v.a(((d)this.x.get(0)).b());
                n n2 = null;
                for (int i2 = 0; i2 < e.a.p.m() && !this.v.d(); ++i2) {
                    n2 = this.v.b();
                    if (n2 == null) continue;
                    if (this.w == null) {
                        this.w = new LinkedList();
                    }
                    this.w.add(n2);
                }
                return true;
            }
        }
        return false;
    }

    public int e() {
        if (this.x == null) {
            return 0;
        }
        return this.x.size();
    }

    public void a(boolean bl2) {
        this.d = bl2;
    }

    public void f() {
    }

    public void a(float f2, float f3, float f4) {
        this.k.a = f2;
        this.k.b = f3;
        this.k.c = f4;
    }

    public void g() {
    }

    public void b(boolean bl2) {
        this.e = bl2;
    }

    public void c(boolean bl2) {
        this.g = bl2;
    }

    public void a(int n2) {
        this.l = n2;
    }

    public void a(float f2) {
        this.m = f2;
    }

    public void b(float f2, float f3, float f4) {
        this.n.a = f2;
        this.n.b = f3;
        this.n.c = f4;
    }

    public float h() {
        return this.r;
    }

    public void b(float f2) {
        float f3 = f2;
        if (f3 < 0.5f) {
            f3 = 0.5f;
        } else if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        this.q = f3;
    }

    public float i() {
        return this.q;
    }

    public boolean j() {
        return e.a.p.f(this.a);
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        this.e = bl2;
        this.f = bl3;
        this.g = bl4;
        this.i = string;
        this.j = d2;
        this.t = n2;
        this.k.a = f2;
        this.k.b = f3;
        this.k.c = f4;
        this.l = n3;
        this.m = f5;
        this.d = bl5;
    }

    public int a(a a2, byte[] arrby) {
        if (!this.a(false, false)) {
            this.h = true;
            return -1;
        }
        if (this.s != a2) {
            this.s = a2;
            this.s.f();
            this.s.a(this.c);
            this.g();
        }
        this.b(true, false);
        this.c(true, false);
        return this.s.b(arrby);
    }

    public void a(a a2) {
        if (!this.a(false, false)) {
            if (this.g) {
                this.h = true;
            }
            return;
        }
        if (this.s != a2) {
            this.s = a2;
            this.s.f();
        }
        this.b(true, false);
        this.c(true, false);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean k() {
        if (this.s == null) {
            return false;
        }
        if (this.z) {
            if (this.b) {
                this.z = false;
            } else {
                return this.l();
            }
        }
        if (this.b) {
            if (this.u() || this.v()) {
                return true;
            }
            if (this.s.b() > 0) {
                this.s.d();
            }
            return true;
        }
        if (this.u == null) {
            return false;
        }
        if (this.u()) {
            return false;
        }
        if (this.v()) {
            return true;
        }
        int n2 = this.s.b();
        n n3 = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            n3 = this.u.b();
            if (n3 != null) {
                if (n3.a != null) {
                    this.s.a(n3.a);
                }
                n3.a();
                n3 = null;
                return true;
            }
            if (!this.u.d()) continue;
            Object object = this.y;
            synchronized (object) {
                if (e.a.p.n()) {
                    if (this.x != null && this.x.size() > 0) {
                        if (this.u != null) {
                            this.u.e();
                        }
                        this.j = (d)this.x.remove(0);
                        this.u = e.a.p.c(this.j.a());
                        this.u.a(this.j.b());
                        n3 = this.u.b();
                        if (n3 != null) {
                            if (n3.a != null) {
                                this.s.a(n3.a);
                            }
                            n3.a();
                            n3 = null;
                            return true;
                        }
                    } else if (this.g) {
                        this.u.a(this.j.b());
                        n3 = this.u.b();
                        if (n3 != null) {
                            if (n3.a != null) {
                                this.s.a(n3.a);
                            }
                            n3.a();
                            n3 = null;
                            return true;
                        }
                    }
                }
                continue;
            }
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean l() {
        if (this.s == null) {
            return false;
        }
        if (this.u == null) {
            return false;
        }
        n n2 = null;
        boolean bl2 = false;
        Object object = this.y;
        synchronized (object) {
            if (this.w == null || this.w.isEmpty()) {
                bl2 = true;
            }
        }
        if (this.v != null && !bl2) {
            this.u = this.v;
            this.v = null;
            object = this.y;
            synchronized (object) {
                while (!this.w.isEmpty()) {
                    n2 = (n)this.w.remove(0);
                    if (n2 == null) continue;
                    if (n2.a != null) {
                        this.s.a(n2.a);
                    }
                    n2.a();
                    n2 = null;
                }
            }
        } else {
            this.v = null;
            object = this.j.b();
            this.u.a((URL)object);
            for (int i2 = 0; i2 < e.a.p.m(); ++i2) {
                n2 = this.u.b();
                if (n2 == null) continue;
                if (n2.a != null) {
                    this.s.a(n2.a);
                }
                n2.a();
                n2 = null;
            }
        }
        return true;
    }

    public void m() {
        this.h = false;
        this.c(true, true);
        if (this.s != null) {
            this.s.h();
        } else {
            this.d("Channel null in method 'pause'");
        }
    }

    public void n() {
        this.h = false;
        this.b(true, true);
        this.c(true, false);
        if (this.s != null) {
            this.s.i();
        } else {
            this.d("Channel null in method 'stop'");
        }
    }

    public void o() {
        if (this.c(false, false)) {
            this.n();
        }
        if (this.s != null) {
            boolean bl2 = this.t();
            this.s.j();
            if (this.f && bl2) {
                this.n();
                this.a(this.s);
            }
        } else {
            this.d("Channel null in method 'rewind'");
        }
    }

    public void p() {
        if (this.s != null) {
            this.s.e();
        } else {
            this.d("Channel null in method 'flush'");
        }
    }

    public void q() {
        if (!this.a(false, false)) {
            return;
        }
        if (this.t() && this.g) {
            this.h = true;
        }
        if (this.b) {
            this.h = true;
        }
        this.a(true, false);
        if (this.s != null) {
            this.s.f();
        }
        this.s = null;
    }

    public void r() {
        this.a(true, true);
    }

    public boolean s() {
        return this.a(false, false);
    }

    public boolean t() {
        if (this.s == null || this.s.c != this) {
            return false;
        }
        if (this.v() || this.u()) {
            return false;
        }
        return this.s.k();
    }

    public boolean u() {
        return this.b(false, false);
    }

    public boolean v() {
        return this.c(false, false);
    }

    public float w() {
        if (this.s == null) {
            return -1.0f;
        }
        return this.s.c();
    }

    private synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            this.J = bl3;
        }
        return this.J;
    }

    private synchronized boolean b(boolean bl2, boolean bl3) {
        if (bl2) {
            this.K = bl3;
        }
        return this.K;
    }

    private synchronized boolean c(boolean bl2, boolean bl3) {
        if (bl2) {
            this.L = bl3;
        }
        return this.L;
    }

    public String x() {
        String string = e.a.p.d(this.a);
        if (string.equals("No Sound")) {
            return "Source";
        }
        return "Source" + string;
    }

    protected void b(String string) {
        this.I.a(string, 0);
    }

    protected void c(String string) {
        this.I.b(string, 0);
    }

    protected boolean a(boolean bl2, String string) {
        return this.I.a(bl2, this.x(), string, 0);
    }

    protected void d(String string) {
        this.I.a(this.x(), string, 0);
    }

    protected void a(Exception exception) {
        this.I.a(exception, 1);
    }
}

