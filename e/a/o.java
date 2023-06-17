/*
 * Decompiled with CFR 0.150.
 */
package e.a;

import e.a.b;
import e.a.c;
import e.a.d;
import e.a.g;
import e.a.h;
import e.a.i;
import e.a.n;
import e.a.p;
import e.a.s;
import e.a.t;
import e.a.u;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Set;
import javax.sound.sampled.AudioFormat;

public class o {
    private static final boolean a = false;
    private static final boolean h = true;
    private static final boolean i = false;
    protected t b = p.b();
    protected g c;
    protected List d;
    private List j;
    protected c e;
    public Random f;
    protected String g = "SoundSystem";
    private static Class k = null;
    private static boolean l = false;
    private static s m = null;

    public o() {
        if (this.b == null) {
            this.b = new t();
            p.a(this.b);
        }
        this.a();
        LinkedList linkedList = p.a();
        if (linkedList != null) {
            ListIterator listIterator = linkedList.listIterator();
            while (listIterator.hasNext()) {
                Class class_ = (Class)listIterator.next();
                try {
                    this.a(class_);
                    return;
                }
                catch (s s2) {
                    this.b.b(s2, 1);
                }
            }
        }
        try {
            this.a(g.class);
            return;
        }
        catch (s s3) {
            this.b.b(s3, 1);
            return;
        }
    }

    public o(Class class_) {
        if (this.b == null) {
            this.b = new t();
            p.a(this.b);
        }
        this.a();
        this.a(class_);
    }

    protected void a() {
    }

    protected void a(Class class_) {
        this.b("", 0);
        this.b("Starting up " + this.g + "...", 0);
        this.f = new Random();
        this.d = new LinkedList();
        this.j = new LinkedList();
        this.e = new c(this);
        this.e.start();
        o.a(200L);
        this.c(class_);
        this.b("", 0);
    }

    public void b() {
        boolean bl2 = false;
        this.b("", 0);
        this.b(this.g + " shutting down...", 0);
        try {
            this.e.d();
            this.e.interrupt();
        }
        catch (Exception exception) {
            bl2 = true;
        }
        if (!bl2) {
            for (int i2 = 0; i2 < 50 && this.e.c(); ++i2) {
                o.a(100L);
            }
        }
        if (bl2 || this.e.c()) {
            this.d("Command thread did not die!", 0);
            this.b("Ignoring errors... continuing clean-up.", 0);
        }
        o.a(true, false);
        o.a(true, null);
        try {
            if (this.c != null) {
                this.c.a();
            }
        }
        catch (Exception exception) {
            this.d("Problem during Library.cleanup()!", 0);
            this.b("Ignoring errors... continuing clean-up.", 0);
        }
        try {
            if (this.d != null) {
                this.d.clear();
            }
        }
        catch (Exception exception) {
            this.d("Unable to clear the command queue!", 0);
            this.b("Ignoring errors... continuing clean-up.", 0);
        }
        try {
            if (this.j != null) {
                this.j.clear();
            }
        }
        catch (Exception exception) {
            this.d("Unable to clear the source management list!", 0);
            this.b("Ignoring errors... continuing clean-up.", 0);
        }
        this.f = null;
        this.c = null;
        this.d = null;
        this.j = null;
        this.e = null;
        this.c("Author: Paul Lamb, www.paulscode.com", 1);
        this.b("", 0);
    }

    public void c() {
        if (this.e == null) {
            this.d("Command Thread null in method 'interruptCommandThread'", 0);
            return;
        }
        this.e.interrupt();
    }

    public void b(String string) {
        this.a(new b(2, new d(string)));
        this.e.interrupt();
    }

    public void a(URL uRL, String string) {
        this.a(new b(2, new d(uRL, string)));
        this.e.interrupt();
    }

    public void a(byte[] arrby, AudioFormat audioFormat, String string) {
        this.a(new b(3, string, new n(arrby, audioFormat)));
        this.e.interrupt();
    }

    public void c(String string) {
        this.a(new b(4, string));
        this.e.interrupt();
    }

    public void a(String string, String string2) {
        this.a(new b(5, string, new d(string2)));
        this.e.interrupt();
    }

    public void a(String string, URL uRL, String string2) {
        this.a(new b(5, string, new d(uRL, string2)));
        this.e.interrupt();
    }

    public void b(String string, String string2) {
        this.a(new b(6, string, string2));
        this.e.interrupt();
    }

    public void a(String string, String string2, long l2) {
        d d2 = null;
        if (string2 != null) {
            d2 = new d(string2);
        }
        this.a(new b(7, string, d2, l2));
        this.e.interrupt();
    }

    public void a(String string, URL uRL, String string2, long l2) {
        d d2 = null;
        if (uRL != null && string2 != null) {
            d2 = new d(uRL, string2);
        }
        this.a(new b(7, string, d2, l2));
        this.e.interrupt();
    }

    public void a(String string, String string2, long l2, long l3) {
        this.a(new b(8, string, new d(string2), l2, l3));
        this.e.interrupt();
    }

    public void a(String string, URL uRL, String string2, long l2, long l3) {
        this.a(new b(8, string, new d(uRL, string2), l2, l3));
        this.e.interrupt();
    }

    public void d() {
        this.a(new b(9));
        this.e.interrupt();
    }

    public void a(String string, String string2, boolean bl2) {
        this.a(new b(12, true, true, bl2, string, new d(string2), 0.0f, 0.0f, 0.0f, 0, 0.0f, false));
        this.a(new b(24, string));
        this.e.interrupt();
    }

    public void a(String string, URL uRL, String string2, boolean bl2) {
        this.a(new b(12, true, true, bl2, string, new d(uRL, string2), 0.0f, 0.0f, 0.0f, 0, 0.0f, false));
        this.a(new b(24, string));
        this.e.interrupt();
    }

    public void a(boolean bl2, String string, String string2, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        this.a(new b(10, bl2, false, bl3, string, new d(string2), f2, f3, f4, n2, f5));
        this.e.interrupt();
    }

    public void a(boolean bl2, String string, URL uRL, String string2, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        this.a(new b(10, bl2, false, bl3, string, new d(uRL, string2), f2, f3, f4, n2, f5));
        this.e.interrupt();
    }

    public void b(boolean bl2, String string, String string2, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        this.a(new b(10, bl2, true, bl3, string, new d(string2), f2, f3, f4, n2, f5));
        this.e.interrupt();
    }

    public void b(boolean bl2, String string, URL uRL, String string2, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        this.a(new b(10, bl2, true, bl3, string, new d(uRL, string2), f2, f3, f4, n2, f5));
        this.e.interrupt();
    }

    public void a(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        this.a(new b(11, audioFormat, bl2, string, f2, f3, f4, n2, f5));
        this.e.interrupt();
    }

    public String a(boolean bl2, String string, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        String string2 = "Source_" + this.f.nextInt() + "_" + this.f.nextInt();
        this.a(new b(12, bl2, false, bl3, string2, new d(string), f2, f3, f4, n2, f5, true));
        this.a(new b(24, string2));
        this.e.interrupt();
        return string2;
    }

    public String a(boolean bl2, URL uRL, String string, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        String string2 = "Source_" + this.f.nextInt() + "_" + this.f.nextInt();
        this.a(new b(12, bl2, false, bl3, string2, new d(uRL, string), f2, f3, f4, n2, f5, true));
        this.a(new b(24, string2));
        this.e.interrupt();
        return string2;
    }

    public String b(boolean bl2, String string, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        String string2 = "Source_" + this.f.nextInt() + "_" + this.f.nextInt();
        this.a(new b(12, bl2, true, bl3, string2, new d(string), f2, f3, f4, n2, f5, true));
        this.a(new b(24, string2));
        this.e.interrupt();
        return string2;
    }

    public String b(boolean bl2, URL uRL, String string, boolean bl3, float f2, float f3, float f4, int n2, float f5) {
        String string2 = "Source_" + this.f.nextInt() + "_" + this.f.nextInt();
        this.a(new b(12, bl2, true, bl3, string2, new d(uRL, string), f2, f3, f4, n2, f5, true));
        this.a(new b(24, string2));
        this.e.interrupt();
        return string2;
    }

    public void a(String string, float f2, float f3, float f4) {
        this.a(new b(13, string, f2, f3, f4));
        this.e.interrupt();
    }

    public void a(String string, float f2) {
        this.a(new b(14, string, f2));
        this.e.interrupt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float d(String string) {
        Object object = p.a;
        synchronized (object) {
            if (this.c != null) {
                return this.c.j(string);
            }
            return 0.0f;
        }
    }

    public void b(String string, float f2) {
        this.a(new b(15, string, f2));
        this.e.interrupt();
    }

    public float e(String string) {
        if (this.c != null) {
            return this.c.k(string);
        }
        return 1.0f;
    }

    public void a(String string, boolean bl2) {
        this.a(new b(16, string, bl2));
        this.e.interrupt();
    }

    public void b(String string, boolean bl2) {
        this.a(new b(17, string, bl2));
        this.e.interrupt();
    }

    public void a(String string, int n2) {
        this.a(new b(18, string, n2));
        this.e.interrupt();
    }

    public void c(String string, float f2) {
        this.a(new b(19, string, f2));
        this.e.interrupt();
    }

    public void a(float f2) {
        this.a(new b(20, f2));
        this.e.interrupt();
    }

    public void b(float f2) {
        this.a(new b(21, f2));
        this.e.interrupt();
    }

    public void b(String string, float f2, float f3, float f4) {
        this.a(new b(22, string, f2, f3, f4));
        this.e.interrupt();
    }

    public void a(float f2, float f3, float f4) {
        this.a(new b(23, f2, f3, f4));
        this.e.interrupt();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public float f(String string) {
        Object object = p.a;
        synchronized (object) {
            return this.c.b(string);
        }
    }

    public void a(String string, byte[] arrby) {
        this.a(new b(25, string, arrby));
        this.e.interrupt();
    }

    public void g(String string) {
        this.a(new b(24, string));
        this.e.interrupt();
    }

    public void h(String string) {
        this.a(new b(26, string));
        this.e.interrupt();
    }

    public void i(String string) {
        this.a(new b(27, string));
        this.e.interrupt();
    }

    public void j(String string) {
        this.a(new b(28, string));
        this.e.interrupt();
    }

    public void k(String string) {
        this.a(new b(29, string));
        this.e.interrupt();
    }

    public void l(String string) {
        this.a(new b(30, string));
        this.e.interrupt();
    }

    public void m(String string) {
        this.a(new b(31, string));
        this.e.interrupt();
    }

    public void c(String string, boolean bl2) {
        this.a(new b(32, string, bl2));
        this.e.interrupt();
    }

    public void n(String string) {
        this.a(new b(33, string));
        this.e.interrupt();
    }

    public void b(float f2, float f3, float f4) {
        this.a(new b(34, f2, f3, f4));
        this.e.interrupt();
    }

    public void c(float f2, float f3, float f4) {
        this.a(new b(35, f2, f3, f4));
        this.e.interrupt();
    }

    public void c(float f2) {
        this.a(new b(36, f2));
        this.e.interrupt();
    }

    public void d(float f2) {
        this.a(new b(37, f2));
        this.e.interrupt();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        this.a(new b(38, f2, f3, f4, f5, f6, f7));
        this.e.interrupt();
    }

    public void e(float f2) {
        this.a(new b(39, f2));
        this.e.interrupt();
    }

    public float e() {
        return p.e();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public h f() {
        Object object = p.a;
        synchronized (object) {
            return this.c.n();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean b(Class class_) {
        Object object = p.a;
        synchronized (object) {
            o.a(true, false);
            HashMap hashMap = null;
            h h2 = null;
            boolean bl2 = false;
            i i2 = null;
            d d2 = null;
            String string = "";
            boolean bl3 = true;
            if (this.c != null) {
                o.a(true, null);
                hashMap = this.a(this.c.m());
                h2 = this.c.n();
                i2 = this.c.k();
                if (i2 != null) {
                    bl2 = true;
                    bl3 = i2.g();
                    string = i2.i();
                    d2 = i2.k();
                }
                this.c.a();
                this.c = null;
            }
            this.b("", 0);
            this.b("Switching to " + p.d(class_), 0);
            this.b("(" + p.e(class_) + ")", 1);
            try {
                this.c = (g)class_.newInstance();
            }
            catch (InstantiationException instantiationException) {
                this.d("The specified library did not load properly", 1);
            }
            catch (IllegalAccessException illegalAccessException) {
                this.d("The specified library did not load properly", 1);
            }
            catch (ExceptionInInitializerError exceptionInInitializerError) {
                this.d("The specified library did not load properly", 1);
            }
            catch (SecurityException securityException) {
                this.d("The specified library did not load properly", 1);
            }
            if (this.a(this.c == null, "Library null after initialization in method 'switchLibrary'", 1)) {
                s s2 = new s(this.g + " did not load properly.  " + "Library was null after initialization.", 4);
                o.a(true, s2);
                o.a(true, true);
                throw s2;
            }
            try {
                this.c.b();
            }
            catch (s s3) {
                o.a(true, s3);
                o.a(true, true);
                throw s3;
            }
            this.c.a(h2);
            if (bl2) {
                if (i2 != null) {
                    i2.a();
                }
                i2 = new i(bl3, string, d2);
                this.c.a(i2);
            }
            this.c.a(hashMap);
            this.b("", 0);
            o.a(true, null);
            o.a(true, true);
            return true;
        }
    }

    public boolean c(Class class_) {
        o.a(true, false);
        this.a(new b(40, class_));
        this.e.interrupt();
        for (int i2 = 0; !o.a(false, false) && i2 < 100; ++i2) {
            o.a(400L);
            this.e.interrupt();
        }
        if (!o.a(false, false)) {
            s s2 = new s(this.g + " did not load after 30 seconds.", 4);
            o.a(true, s2);
            throw s2;
        }
        s s3 = o.a(false, null);
        if (s3 != null) {
            throw s3;
        }
        return true;
    }

    private void e(Class class_) {
        o.a(true, false);
        String string = "Initializing ";
        if (this.c != null) {
            o.a(true, null);
            string = "Switching to ";
            this.c.a();
            this.c = null;
        }
        this.b(string + p.d(class_), 0);
        this.b("(" + p.e(class_) + ")", 1);
        try {
            this.c = (g)class_.newInstance();
        }
        catch (InstantiationException instantiationException) {
            this.d("The specified library did not load properly", 1);
        }
        catch (IllegalAccessException illegalAccessException) {
            this.d("The specified library did not load properly", 1);
        }
        catch (ExceptionInInitializerError exceptionInInitializerError) {
            this.d("The specified library did not load properly", 1);
        }
        catch (SecurityException securityException) {
            this.d("The specified library did not load properly", 1);
        }
        if (this.a(this.c == null, "Library null after initialization in method 'newLibrary'", 1)) {
            o.a(true, new s(this.g + " did not load properly.  " + "Library was null after initialization.", 4));
            this.c("Switching to silent mode", 1);
            try {
                this.c = new g();
            }
            catch (s s2) {
                o.a(true, new s("Silent mode did not load properly.  Library was null after initialization.", 4));
                o.a(true, true);
                return;
            }
        }
        try {
            this.c.b();
        }
        catch (s s3) {
            o.a(true, s3);
            o.a(true, true);
            return;
        }
        o.a(true, null);
        o.a(true, true);
    }

    private void m() {
        try {
            if (this.a(this.c == null, "Library null after initialization in method 'CommandInitialize'", 1)) {
                s s2 = new s(this.g + " did not load properly.  " + "Library was null after initialization.", 4);
                o.a(true, s2);
                throw s2;
            }
            this.c.b();
        }
        catch (s s3) {
            o.a(true, s3);
            o.a(true, true);
        }
    }

    private void a(d d2) {
        if (this.c != null) {
            this.c.a(d2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
        }
    }

    private void a(n n2, String string) {
        if (this.c != null) {
            this.c.a(n2, string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
        }
    }

    private void o(String string) {
        if (this.c != null) {
            this.c.a(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandLoadSound'", 0);
        }
    }

    private void a(String string, d d2) {
        if (this.c != null) {
            this.c.a(string, d2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandQueueSound'", 0);
        }
    }

    private void c(String string, String string2) {
        if (this.c != null) {
            this.c.a(string, string2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandDequeueSound'", 0);
        }
    }

    private void a(String string, d d2, long l2) {
        if (this.c != null) {
            this.c.a(string, d2, l2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandFadeOut'", 0);
        }
    }

    private void a(String string, d d2, long l2, long l3) {
        if (this.c != null) {
            this.c.a(string, d2, l2, l3);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandFadeOutIn'", 0);
        }
    }

    private void n() {
        if (this.c != null) {
            this.c.i();
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandCheckFadeVolumes'", 0);
        }
    }

    private void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5) {
        if (this.c != null) {
            if (d2.a().matches(p.g) && !p.r()) {
                this.c.a(bl4, string, d2);
            } else {
                this.c.a(bl2, bl3, bl4, string, d2, f2, f3, f4, n2, f5);
            }
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandNewSource'", 0);
        }
    }

    private void b(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        if (this.c != null) {
            this.c.a(audioFormat, bl2, string, f2, f3, f4, n2, f5);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandRawDataStream'", 0);
        }
    }

    private void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5, boolean bl5) {
        if (this.c != null) {
            if (d2.a().matches(p.g) && !p.r()) {
                this.c.a(bl4, string, d2);
            } else {
                this.c.a(bl2, bl3, bl4, string, d2, f2, f3, f4, n2, f5, bl5);
            }
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandQuickPlay'", 0);
        }
    }

    private void c(String string, float f2, float f3, float f4) {
        if (this.c != null) {
            this.c.a(string, f2, f3, f4);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandMoveSource'", 0);
        }
    }

    private void d(String string, float f2) {
        if (this.c != null) {
            this.c.b(string, f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetVolume'", 0);
        }
    }

    private void e(String string, float f2) {
        if (this.c != null) {
            this.c.c(string, f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetPitch'", 0);
        }
    }

    private void d(String string, boolean bl2) {
        if (this.c != null) {
            this.c.b(string, bl2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetPriority'", 0);
        }
    }

    private void e(String string, boolean bl2) {
        if (this.c != null) {
            this.c.c(string, bl2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetLooping'", 0);
        }
    }

    private void e(String string, int n2) {
        if (this.c != null) {
            this.c.a(string, n2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetAttenuation'", 0);
        }
    }

    private void f(String string, float f2) {
        if (this.c != null) {
            this.c.a(string, f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetDistOrRoll'", 0);
        }
    }

    private void f(float f2) {
        if (this.c != null) {
            p.c(f2);
            this.c.f();
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetDopplerFactor'", 0);
        }
    }

    private void g(float f2) {
        if (this.c != null) {
            p.d(f2);
            this.c.f();
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetDopplerFactor'", 0);
        }
    }

    private void d(String string, float f2, float f3, float f4) {
        if (this.c != null) {
            this.c.b(string, f2, f3, f4);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandVelocity'", 0);
        }
    }

    private void d(float f2, float f3, float f4) {
        if (this.c != null) {
            this.c.a(f2, f3, f4);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetListenerVelocity'", 0);
        }
    }

    private void p(String string) {
        if (this.c != null) {
            this.c.c(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandPlay'", 0);
        }
    }

    private void b(String string, byte[] arrby) {
        if (this.c != null) {
            this.c.a(string, arrby);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandFeedRawAudioData'", 0);
        }
    }

    private void q(String string) {
        if (this.c != null) {
            this.c.e(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandPause'", 0);
        }
    }

    private void r(String string) {
        if (this.c != null) {
            this.c.d(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandStop'", 0);
        }
    }

    private void s(String string) {
        if (this.c != null) {
            this.c.f(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandRewind'", 0);
        }
    }

    private void t(String string) {
        if (this.c != null) {
            this.c.g(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandFlush'", 0);
        }
    }

    private void f(String string, boolean bl2) {
        if (this.c != null) {
            this.c.a(string, bl2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetActive'", 0);
        }
    }

    private void u(String string) {
        if (this.c != null) {
            this.c.l(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandRemoveSource'", 0);
        }
    }

    private void e(float f2, float f3, float f4) {
        if (this.c != null) {
            this.c.b(f2, f3, f4);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandMoveListener'", 0);
        }
    }

    private void f(float f2, float f3, float f4) {
        if (this.c != null) {
            this.c.c(f2, f3, f4);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetListenerPosition'", 0);
        }
    }

    private void h(float f2) {
        if (this.c != null) {
            this.c.b(f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandTurnListener'", 0);
        }
    }

    private void i(float f2) {
        if (this.c != null) {
            this.c.c(f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetListenerAngle'", 0);
        }
    }

    private void b(float f2, float f3, float f4, float f5, float f6, float f7) {
        if (this.c != null) {
            this.c.a(f2, f3, f4, f5, f6, f7);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetListenerOrientation'", 0);
        }
    }

    private void v(String string) {
        if (this.c != null) {
            this.c.h(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandCull'", 0);
        }
    }

    private void w(String string) {
        if (this.c != null) {
            this.c.i(string);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandActivate'", 0);
        }
    }

    private void j(float f2) {
        if (this.c != null) {
            this.c.a(f2);
        } else {
            this.d("Variable 'soundLibrary' null in method 'CommandSetMasterVolume'", 0);
        }
    }

    protected void g() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(b b2) {
        Object object = p.a;
        synchronized (object) {
            if (b2 == null) {
                b b3;
                boolean bl2 = false;
                block49: while (this.d != null && this.d.size() > 0) {
                    b3 = (b)this.d.remove(0);
                    if (b3 == null) continue;
                    switch (b3.W) {
                        case 1: {
                            this.m();
                            continue block49;
                        }
                        case 2: {
                            this.a((d)b3.V[0]);
                            continue block49;
                        }
                        case 3: {
                            this.a((n)b3.V[0], b3.T[0]);
                            continue block49;
                        }
                        case 4: {
                            this.o(b3.T[0]);
                            continue block49;
                        }
                        case 5: {
                            this.a(b3.T[0], (d)b3.V[0]);
                            continue block49;
                        }
                        case 6: {
                            this.c(b3.T[0], b3.T[1]);
                            continue block49;
                        }
                        case 7: {
                            this.a(b3.T[0], (d)b3.V[0], b3.R[0]);
                            continue block49;
                        }
                        case 8: {
                            this.a(b3.T[0], (d)b3.V[0], b3.R[0], b3.R[1]);
                            continue block49;
                        }
                        case 9: {
                            this.n();
                            continue block49;
                        }
                        case 10: {
                            this.a(b3.S[0], b3.S[1], b3.S[2], b3.T[0], (d)b3.V[0], b3.Q[0], b3.Q[1], b3.Q[2], b3.P[0], b3.Q[3]);
                            continue block49;
                        }
                        case 11: {
                            this.b((AudioFormat)b3.V[0], b3.S[0], b3.T[0], b3.Q[0], b3.Q[1], b3.Q[2], b3.P[0], b3.Q[3]);
                            continue block49;
                        }
                        case 12: {
                            this.a(b3.S[0], b3.S[1], b3.S[2], b3.T[0], (d)b3.V[0], b3.Q[0], b3.Q[1], b3.Q[2], b3.P[0], b3.Q[3], b3.S[3]);
                            continue block49;
                        }
                        case 13: {
                            this.c(b3.T[0], b3.Q[0], b3.Q[1], b3.Q[2]);
                            continue block49;
                        }
                        case 14: {
                            this.d(b3.T[0], b3.Q[0]);
                            continue block49;
                        }
                        case 15: {
                            this.e(b3.T[0], b3.Q[0]);
                            continue block49;
                        }
                        case 16: {
                            this.d(b3.T[0], b3.S[0]);
                            continue block49;
                        }
                        case 17: {
                            this.e(b3.T[0], b3.S[0]);
                            continue block49;
                        }
                        case 18: {
                            this.e(b3.T[0], b3.P[0]);
                            continue block49;
                        }
                        case 19: {
                            this.f(b3.T[0], b3.Q[0]);
                            continue block49;
                        }
                        case 20: {
                            this.f(b3.Q[0]);
                            continue block49;
                        }
                        case 21: {
                            this.g(b3.Q[0]);
                            continue block49;
                        }
                        case 22: {
                            this.d(b3.T[0], b3.Q[0], b3.Q[1], b3.Q[2]);
                            continue block49;
                        }
                        case 23: {
                            this.d(b3.Q[0], b3.Q[1], b3.Q[2]);
                            continue block49;
                        }
                        case 24: {
                            this.j.add(b3);
                            continue block49;
                        }
                        case 25: {
                            this.j.add(b3);
                            continue block49;
                        }
                        case 26: {
                            this.q(b3.T[0]);
                            continue block49;
                        }
                        case 27: {
                            this.r(b3.T[0]);
                            continue block49;
                        }
                        case 28: {
                            this.s(b3.T[0]);
                            continue block49;
                        }
                        case 29: {
                            this.t(b3.T[0]);
                            continue block49;
                        }
                        case 30: {
                            this.v(b3.T[0]);
                            continue block49;
                        }
                        case 31: {
                            bl2 = true;
                            this.w(b3.T[0]);
                            continue block49;
                        }
                        case 32: {
                            this.f(b3.T[0], b3.S[0]);
                            continue block49;
                        }
                        case 33: {
                            this.u(b3.T[0]);
                            continue block49;
                        }
                        case 34: {
                            this.e(b3.Q[0], b3.Q[1], b3.Q[2]);
                            continue block49;
                        }
                        case 35: {
                            this.f(b3.Q[0], b3.Q[1], b3.Q[2]);
                            continue block49;
                        }
                        case 36: {
                            this.h(b3.Q[0]);
                            continue block49;
                        }
                        case 37: {
                            this.i(b3.Q[0]);
                            continue block49;
                        }
                        case 38: {
                            this.b(b3.Q[0], b3.Q[1], b3.Q[2], b3.Q[3], b3.Q[4], b3.Q[5]);
                            continue block49;
                        }
                        case 39: {
                            this.j(b3.Q[0]);
                            continue block49;
                        }
                        case 40: {
                            this.e(b3.U[0]);
                            continue block49;
                        }
                    }
                }
                if (bl2) {
                    this.c.h();
                }
                while (this.j != null && this.j.size() > 0) {
                    b3 = (b)this.j.remove(0);
                    if (b3 == null) continue;
                    switch (b3.W) {
                        case 24: {
                            this.p(b3.T[0]);
                            break;
                        }
                        case 25: {
                            this.b(b3.T[0], b3.O);
                        }
                    }
                }
                return this.d != null && this.d.size() > 0;
            }
            if (this.d == null) {
                return false;
            }
            this.d.add(b2);
            return true;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void h() {
        Object object = p.a;
        synchronized (object) {
            if (this.c != null) {
                this.c.g();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean a(String string) {
        Object object = p.a;
        synchronized (object) {
            if (this.c == null) {
                return false;
            }
            u u2 = (u)this.c.m().get(string);
            if (u2 == null) {
                return false;
            }
            return u2.t();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public boolean i() {
        Object object = p.a;
        synchronized (object) {
            if (this.c == null) {
                return false;
            }
            HashMap hashMap = this.c.m();
            if (hashMap == null) {
                return false;
            }
            Set set = hashMap.keySet();
            for (String string : set) {
                u u2 = (u)hashMap.get(string);
                if (u2 == null || !u2.t()) continue;
                return true;
            }
            return false;
        }
    }

    private HashMap a(HashMap hashMap) {
        Set set = hashMap.keySet();
        Iterator iterator = set.iterator();
        HashMap<String, u> hashMap2 = new HashMap<String, u>();
        while (iterator.hasNext()) {
            String string = (String)iterator.next();
            u u2 = (u)hashMap.get(string);
            if (u2 == null) continue;
            hashMap2.put(string, new u(u2, null));
        }
        return hashMap2;
    }

    public static boolean d(Class class_) {
        t t2 = p.b();
        if (t2 == null) {
            t2 = new t();
            p.a(t2);
        }
        t2.a("", 0);
        t2.a("Checking if " + p.d(class_) + " is compatible...", 0);
        boolean bl2 = p.c(class_);
        if (bl2) {
            t2.a("...yes", 1);
        } else {
            t2.a("...no", 1);
        }
        return bl2;
    }

    public static Class j() {
        return o.a(false, null);
    }

    public static boolean k() {
        return o.a(false, false);
    }

    public static s l() {
        return o.a(false, null);
    }

    public static void a(s s2) {
        o.a(true, s2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static boolean a(boolean bl2, boolean bl3) {
        Object object = p.a;
        synchronized (object) {
            if (bl2) {
                l = bl3;
            }
            return l;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static Class a(boolean bl2, Class class_) {
        Object object = p.a;
        synchronized (object) {
            if (bl2) {
                k = class_;
            }
            return k;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static s a(boolean bl2, s s2) {
        Object object = p.a;
        synchronized (object) {
            if (bl2) {
                m = s2;
            }
            return m;
        }
    }

    protected static void a(long l2) {
        try {
            Thread.sleep(l2);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
    }

    protected void b(String string, int n2) {
        this.b.a(string, n2);
    }

    protected void c(String string, int n2) {
        this.b.b(string, n2);
    }

    protected boolean a(boolean bl2, String string, int n2) {
        return this.b.a(bl2, this.g, string, n2);
    }

    protected void d(String string, int n2) {
        this.b.a(this.g, string, n2);
    }
}

