/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.a;
import e.a.d;
import e.a.h;
import e.a.i;
import e.a.n;
import e.a.p;
import e.a.t;
import e.a.u;
import e.a.v;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import javax.sound.sampled.AudioFormat;

public class g {
    private t h = p.b();
    protected h a;
    protected HashMap b = new HashMap();
    protected HashMap c = new HashMap();
    private i i;
    protected List d;
    protected List e;
    private String[] j;
    private String[] k;
    private int l = 0;
    private int m = 0;
    protected v f;
    protected boolean g = false;

    public g() {
        this.a = new h(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 1.0f, 0.0f, 0.0f);
        this.d = new LinkedList();
        this.e = new LinkedList();
        this.j = new String[p.d()];
        this.k = new String[p.c()];
        this.f = new v();
        this.f.start();
    }

    public void a() {
        this.f.d();
        this.f.interrupt();
        for (int i2 = 0; i2 < 50 && this.f.c(); ++i2) {
            try {
                Thread.sleep(100L);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        if (this.f.c()) {
            this.q("Stream thread did not die!");
            this.o("Ignoring errors... continuing clean-up.");
        }
        if (this.i != null) {
            this.i.a();
            this.i = null;
        }
        a a2 = null;
        if (this.d != null) {
            while (!this.d.isEmpty()) {
                a2 = (a)this.d.remove(0);
                a2.f();
                a2.a();
                a2 = null;
            }
            this.d.clear();
            this.d = null;
        }
        if (this.e != null) {
            while (!this.e.isEmpty()) {
                a2 = (a)this.e.remove(0);
                a2.f();
                a2.a();
                a2 = null;
            }
            this.e.clear();
            this.e = null;
        }
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.a();
        }
        this.c.clear();
        this.c = null;
        this.a = null;
        this.f = null;
    }

    public void b() {
        int n2;
        a a2 = null;
        for (n2 = 0; n2 < p.d() && (a2 = this.a(1)) != null; ++n2) {
            this.d.add(a2);
        }
        for (n2 = 0; n2 < p.c() && (a2 = this.a(0)) != null; ++n2) {
            this.e.add(a2);
        }
    }

    public static boolean c() {
        return true;
    }

    protected a a(int n2) {
        return new a(n2);
    }

    public boolean a(d d2) {
        return true;
    }

    public boolean a(n n2, String string) {
        return true;
    }

    public LinkedList d() {
        LinkedList linkedList = new LinkedList();
        Set set = this.b.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            linkedList.add(iterator.next());
        }
        return linkedList;
    }

    public LinkedList e() {
        LinkedList<String> linkedList = new LinkedList<String>();
        Set set = this.c.keySet();
        Iterator iterator = set.iterator();
        if (this.i != null) {
            linkedList.add(this.i.i());
        }
        while (iterator.hasNext()) {
            linkedList.add((String)iterator.next());
        }
        return linkedList;
    }

    public void a(String string) {
        this.b.remove(string);
    }

    public void a(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        this.c.put(string, new u(audioFormat, bl2, string, f2, f3, f4, n2, f5));
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5) {
        this.c.put(string, new u(bl2, bl3, bl4, string, d2, null, f2, f3, f4, n2, f5, false));
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5, boolean bl5) {
        this.c.put(string, new u(bl2, bl3, bl4, string, d2, null, f2, f3, f4, n2, f5, bl5));
    }

    public void a(String string, boolean bl2) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.a(bl2);
        }
    }

    public void a(String string, float f2, float f3, float f4) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.a(f2, f3, f4);
        }
    }

    public void b(String string, boolean bl2) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.b(bl2);
        }
    }

    public void c(String string, boolean bl2) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.c(bl2);
        }
    }

    public void a(String string, int n2) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.a(n2);
        }
    }

    public void a(String string, float f2) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.a(f2);
        }
    }

    public void b(String string, float f2, float f3, float f4) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.b(f2, f3, f4);
        }
    }

    public void a(float f2, float f3, float f4) {
        this.a.b(f2, f3, f4);
    }

    public void f() {
    }

    public float b(String string) {
        if (string == null || string.equals("")) {
            this.q("Sourcename not specified in method 'millisecondsPlayed'");
            return -1.0f;
        }
        if (this.m(string)) {
            this.q("Unable to calculate milliseconds for MIDI source.");
            return -1.0f;
        }
        u u2 = (u)this.c.get(string);
        if (u2 == null) {
            this.q("Source '" + string + "' not found in " + "method 'millisecondsPlayed'");
        }
        return u2.w();
    }

    public int a(String string, byte[] arrby) {
        if (string == null || string.equals("")) {
            this.q("Sourcename not specified in method 'feedRawAudioData'");
            return -1;
        }
        if (this.m(string)) {
            this.q("Raw audio data can not be fed to the MIDI channel.");
            return -1;
        }
        u u2 = (u)this.c.get(string);
        if (u2 == null) {
            this.q("Source '" + string + "' not found in " + "method 'feedRawAudioData'");
        }
        return this.a(u2, arrby);
    }

    public int a(u u2, byte[] arrby) {
        if (u2 == null) {
            this.q("Source parameter null in method 'feedRawAudioData'");
            return -1;
        }
        if (!u2.f) {
            this.q("Only a streaming source may be specified in method 'feedRawAudioData'");
            return -1;
        }
        if (!u2.b) {
            this.q("Streaming source already associated with a file or URL in method'feedRawAudioData'");
            return -1;
        }
        if (!u2.t() || u2.s == null) {
            a a2 = u2.s != null && u2.s.c == u2 ? u2.s : this.b(u2);
            int n2 = u2.a(a2, arrby);
            a2.c = u2;
            this.f.a(u2);
            this.f.interrupt();
            return n2;
        }
        return u2.a(u2.s, arrby);
    }

    public void c(String string) {
        if (string == null || string.equals("")) {
            this.q("Sourcename not specified in method 'play'");
            return;
        }
        if (this.m(string)) {
            this.i.b();
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 == null) {
                this.q("Source '" + string + "' not found in " + "method 'play'");
            }
            this.a(u2);
        }
    }

    public void a(u u2) {
        if (u2 == null) {
            return;
        }
        if (u2.b) {
            return;
        }
        if (!u2.s()) {
            return;
        }
        if (!u2.t()) {
            a a2 = this.b(u2);
            if (u2 != null && a2 != null) {
                if (u2.s != null && u2.s.c != u2) {
                    u2.s = null;
                }
                a2.c = u2;
                u2.a(a2);
                if (u2.f) {
                    this.f.a(u2);
                    this.f.interrupt();
                }
            }
        }
    }

    public void d(String string) {
        if (string == null || string.equals("")) {
            this.q("Sourcename not specified in method 'stop'");
            return;
        }
        if (this.m(string)) {
            this.i.c();
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.n();
            }
        }
    }

    public void e(String string) {
        if (string == null || string.equals("")) {
            this.q("Sourcename not specified in method 'stop'");
            return;
        }
        if (this.m(string)) {
            this.i.d();
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.m();
            }
        }
    }

    public void f(String string) {
        if (this.m(string)) {
            this.i.e();
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.o();
            }
        }
    }

    public void g(String string) {
        if (this.m(string)) {
            this.q("You can not flush the MIDI channel");
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.p();
            }
        }
    }

    public void h(String string) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.q();
        }
    }

    public void i(String string) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.r();
            if (u2.h) {
                this.a(u2);
            }
        }
    }

    public void a(float f2) {
        p.a(f2);
        if (this.i != null) {
            this.i.l();
        }
    }

    public void b(String string, float f2) {
        if (this.m(string)) {
            this.i.a(f2);
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                float f3 = f2;
                if (f3 < 0.0f) {
                    f3 = 0.0f;
                } else if (f3 > 1.0f) {
                    f3 = 1.0f;
                }
                u2.p = f3;
                u2.g();
            }
        }
    }

    public float j(String string) {
        if (this.m(string)) {
            return this.i.f();
        }
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            return u2.p;
        }
        return 0.0f;
    }

    public void c(String string, float f2) {
        u u2;
        if (!this.m(string) && (u2 = (u)this.c.get(string)) != null) {
            float f3 = f2;
            if (f3 < 0.5f) {
                f3 = 0.5f;
            } else if (f3 > 2.0f) {
                f3 = 2.0f;
            }
            u2.b(f3);
            u2.g();
        }
    }

    public float k(String string) {
        u u2;
        if (!this.m(string) && (u2 = (u)this.c.get(string)) != null) {
            return u2.i();
        }
        return 1.0f;
    }

    public void b(float f2, float f3, float f4) {
        this.c(this.a.a.a + f2, this.a.a.b + f3, this.a.a.c + f4);
    }

    public void c(float f2, float f3, float f4) {
        this.a.a(f2, f3, f4);
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.g();
        }
    }

    public void b(float f2) {
        this.c(this.a.e + f2);
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.g();
        }
    }

    public void c(float f2) {
        this.a.a(f2);
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.g();
        }
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a.a(f2, f3, f4, f5, f6, f7);
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.g();
        }
    }

    public void a(h h2) {
        this.a.a(h2);
    }

    public void a(HashMap hashMap) {
        if (hashMap == null) {
            return;
        }
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        this.c.clear();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            u u2 = (u)hashMap.get(string);
            if (u2 == null) continue;
            this.a(u2.j);
            this.c.put(string, new u(u2, null));
        }
    }

    public void l(String string) {
        u u2 = (u)this.c.get(string);
        if (u2 != null) {
            u2.a();
        }
        this.c.remove(string);
    }

    public void g() {
        Set set = this.c.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            u u2 = (u)this.c.get(string);
            if (u2 == null || !u2.d || u2.t()) continue;
            u2.a();
            iterator.remove();
        }
    }

    private a b(u u2) {
        u u3;
        String string;
        int n2;
        String[] arrstring;
        List list;
        int n3;
        if (u2 == null) {
            return null;
        }
        String string2 = u2.i;
        if (string2 == null) {
            return null;
        }
        if (u2.f) {
            n3 = this.l;
            list = this.d;
            arrstring = this.j;
        } else {
            n3 = this.m;
            list = this.e;
            arrstring = this.k;
        }
        int n4 = list.size();
        for (n2 = 0; n2 < n4; ++n2) {
            if (!string2.equals(arrstring[n2])) continue;
            return (a)list.get(n2);
        }
        int n5 = n3;
        for (n2 = 0; n2 < n4; ++n2) {
            string = arrstring[n5];
            u3 = string == null ? null : (u)this.c.get(string);
            if (u3 == null || !u3.t()) {
                if (u2.f) {
                    this.l = n5 + 1;
                    if (this.l >= n4) {
                        this.l = 0;
                    }
                } else {
                    this.m = n5 + 1;
                    if (this.m >= n4) {
                        this.m = 0;
                    }
                }
                arrstring[n5] = string2;
                return (a)list.get(n5);
            }
            if (++n5 < n4) continue;
            n5 = 0;
        }
        n5 = n3;
        for (n2 = 0; n2 < n4; ++n2) {
            string = arrstring[n5];
            u3 = string == null ? null : (u)this.c.get(string);
            if (u3 == null || !u3.t() || !u3.e) {
                if (u2.f) {
                    this.l = n5 + 1;
                    if (this.l >= n4) {
                        this.l = 0;
                    }
                } else {
                    this.m = n5 + 1;
                    if (this.m >= n4) {
                        this.m = 0;
                    }
                }
                arrstring[n5] = string2;
                return (a)list.get(n5);
            }
            if (++n5 < n4) continue;
            n5 = 0;
        }
        return null;
    }

    public void h() {
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null || !u2.h || u2.t()) continue;
            this.c(string);
            u2.h = false;
        }
    }

    public void a(String string, d d2) {
        if (this.m(string)) {
            this.i.a(d2);
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.a(d2);
            }
        }
    }

    public void a(String string, String string2) {
        if (this.m(string)) {
            this.i.a(string2);
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.a(string2);
            }
        }
    }

    public void a(String string, d d2, long l2) {
        if (this.m(string)) {
            this.i.a(d2, l2);
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.a(d2, l2);
            }
        }
    }

    public void a(String string, d d2, long l2, long l3) {
        if (this.m(string)) {
            this.i.a(d2, l2, l3);
        } else {
            u u2 = (u)this.c.get(string);
            if (u2 != null) {
                u2.a(d2, l2, l3);
            }
        }
    }

    public void i() {
        u u2;
        a a2;
        if (this.i != null) {
            this.i.l();
        }
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            a2 = (a)this.d.get(i2);
            if (a2 == null || (u2 = a2.c) == null) continue;
            u2.b();
        }
        a2 = null;
        u2 = null;
    }

    public void a(boolean bl2, String string, d d2) {
        if (d2 == null) {
            this.q("Filename/URL not specified in method 'loadMidi'.");
            return;
        }
        if (!d2.a().matches(p.g)) {
            this.q("Filename/identifier doesn't end in '.mid' or'.midi' in method loadMidi.");
            return;
        }
        if (this.i == null) {
            this.i = new i(bl2, string, d2);
        } else {
            this.i.a(bl2, string, d2);
        }
    }

    public void j() {
        if (this.i != null) {
            this.i.a();
        }
        this.i = null;
    }

    public boolean m(String string) {
        if (this.i == null || string == null) {
            return false;
        }
        if (this.i.i() == null || string.equals("")) {
            return false;
        }
        return string.equals(this.i.i());
    }

    public u n(String string) {
        return (u)this.c.get(string);
    }

    public i k() {
        return this.i;
    }

    public void a(i i2) {
        if (this.i != null && this.i != i2) {
            this.i.a();
        }
        this.i = i2;
    }

    public void l() {
        Set set = this.c.keySet();
        for (String string : set) {
            u u2 = (u)this.c.get(string);
            if (u2 == null) continue;
            u2.f();
        }
    }

    public HashMap m() {
        return this.c;
    }

    public h n() {
        return this.a;
    }

    public boolean o() {
        return this.g;
    }

    public static String p() {
        return "No Sound";
    }

    public static String q() {
        return "Silent Mode";
    }

    public String r() {
        return "Library";
    }

    protected void o(String string) {
        this.h.a(string, 0);
    }

    protected void p(String string) {
        this.h.b(string, 0);
    }

    protected boolean a(boolean bl2, String string) {
        return this.h.a(bl2, this.r(), string, 0);
    }

    protected void q(String string) {
        this.h.a(this.r(), string, 0);
    }

    protected void a(Exception exception) {
        this.h.a(exception, 1);
    }
}

