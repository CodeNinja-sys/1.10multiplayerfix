/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.a;
import e.a.b.b;
import e.a.b.i;
import e.a.d;
import e.a.e;
import e.a.g;
import e.a.h;
import e.a.n;
import e.a.p;
import e.a.u;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.c;
import org.lwjgl.openal.AL;
import org.lwjgl.openal.AL10;

public class f
extends g {
    private static final boolean h = false;
    private static final boolean i = true;
    private static final boolean j = false;
    private FloatBuffer k = null;
    private FloatBuffer l = null;
    private FloatBuffer m = null;
    private HashMap n = new HashMap();
    private static boolean o = true;

    public f() {
        this.g = true;
    }

    public void b() {
        boolean bl2 = false;
        try {
            AL.b();
            bl2 = this.w();
        }
        catch (c c2) {
            this.q("Unable to initialize OpenAL.  Probable cause: OpenAL not supported.");
            this.a(c2);
            throw new e.a.b.g(c2.getMessage(), 101);
        }
        if (bl2) {
            this.p("OpenAL did not initialize properly!");
        } else {
            this.o("OpenAL initialized.");
        }
        this.k = BufferUtils.f(3).put(new float[]{this.a.a.a, this.a.a.b, this.a.a.c});
        this.l = BufferUtils.f(6).put(new float[]{this.a.b.a, this.a.b.b, this.a.b.c, this.a.c.a, this.a.c.b, this.a.c.c});
        this.m = BufferUtils.f(3).put(new float[]{0.0f, 0.0f, 0.0f});
        this.k.flip();
        this.l.flip();
        this.m.flip();
        AL10.b(4100, this.k);
        bl2 = this.w() || bl2;
        AL10.b(4111, this.l);
        bl2 = this.w() || bl2;
        AL10.b(4102, this.m);
        bl2 = this.w() || bl2;
        AL10.a(p.g());
        bl2 = this.w() || bl2;
        AL10.b(p.h());
        boolean bl3 = bl2 = this.w() || bl2;
        if (bl2) {
            this.p("OpenAL did not initialize properly!");
            throw new e.a.b.g("Problem encountered while loading OpenAL or creating the listener.  Probable cause:  OpenAL not supported", 101);
        }
        super.b();
        b b2 = (b)this.e.get(1);
        try {
            AL10.a(b2.e.get(0), 4099, 1.0f);
            if (this.w()) {
                e.a.b.f.a(true, false);
                throw new e.a.b.g("OpenAL: AL_PITCH not supported.", 108);
            }
            e.a.b.f.a(true, true);
        }
        catch (Exception exception) {
            e.a.b.f.a(true, false);
            throw new e.a.b.g("OpenAL: AL_PITCH not supported.", 108);
        }
    }

    public static boolean s() {
        if (AL.a()) {
            return true;
        }
        try {
            AL.b();
        }
        catch (Exception exception) {
            return false;
        }
        try {
            AL.c();
        }
        catch (Exception exception) {
            // empty catch block
        }
        return true;
    }

    protected a a(int n2) {
        IntBuffer intBuffer = BufferUtils.d(1);
        try {
            AL10.a(intBuffer);
        }
        catch (Exception exception) {
            AL10.a();
            return null;
        }
        if (AL10.a() != 0) {
            return null;
        }
        b b2 = new b(n2, intBuffer);
        return b2;
    }

    public void a() {
        super.a();
        Set set = this.b.keySet();
        for (String string : set) {
            IntBuffer intBuffer = (IntBuffer)this.n.get(string);
            if (intBuffer == null) continue;
            AL10.h(intBuffer);
            this.w();
            intBuffer.clear();
        }
        this.b.clear();
        AL.c();
        this.b = null;
        this.k = null;
        this.l = null;
        this.m = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(d d2) {
        if (this.b == null) {
            this.b = new HashMap();
            this.p("Buffer Map was null in method 'loadSound'");
        }
        if (this.n == null) {
            this.n = new HashMap();
            this.p("Open AL Buffer Map was null in method'loadSound'");
        }
        if (this.a(d2 == null, "Filename/URL not specified in method 'loadSound'")) {
            return false;
        }
        if (this.b.get(d2.a()) != null) {
            return true;
        }
        e e2 = p.c(d2.a());
        if (this.a(e2 == null, "No codec found for file '" + d2.a() + "' in method 'loadSound'")) {
            return false;
        }
        e2.a(true);
        URL uRL = d2.b();
        if (this.a(uRL == null, "Unable to open file '" + d2.a() + "' in method 'loadSound'")) {
            return false;
        }
        e2.a(uRL);
        n n2 = e2.c();
        e2.e();
        e2 = null;
        if (this.a(n2 == null, "Sound buffer null in method 'loadSound'")) {
            return false;
        }
        this.b.put(d2.a(), n2);
        AudioFormat audioFormat = n2.b;
        int n3 = 0;
        if (audioFormat.getChannels() == 1) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n3 = 4352;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.q("Illegal sample size in method 'loadSound'");
                    return false;
                }
                n3 = 4353;
            }
        } else {
            if (audioFormat.getChannels() != 2) {
                this.q("File neither mono nor stereo in method 'loadSound'");
                return false;
            }
            if (audioFormat.getSampleSizeInBits() == 8) {
                n3 = 4354;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.q("Illegal sample size in method 'loadSound'");
                    return false;
                }
                n3 = 4355;
            }
        }
        IntBuffer intBuffer = BufferUtils.d(1);
        AL10.g(intBuffer);
        if (this.a(AL10.a() != 0, "alGenBuffers error when loading " + d2.a())) {
            return false;
        }
        AL10.a(intBuffer.get(0), n3, (ByteBuffer)BufferUtils.a(n2.a.length).put(n2.a).flip(), (int)audioFormat.getSampleRate());
        if (this.a(AL10.a() != 0, "alBufferData error when loading " + d2.a()) && this.a(intBuffer == null, "Sound buffer was not created for " + d2.a())) {
            return false;
        }
        this.n.put(d2.a(), intBuffer);
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean a(n n2, String string) {
        if (this.b == null) {
            this.b = new HashMap();
            this.p("Buffer Map was null in method 'loadSound'");
        }
        if (this.n == null) {
            this.n = new HashMap();
            this.p("Open AL Buffer Map was null in method'loadSound'");
        }
        if (this.a(string == null, "Identifier not specified in method 'loadSound'")) {
            return false;
        }
        if (this.b.get(string) != null) {
            return true;
        }
        if (this.a(n2 == null, "Sound buffer null in method 'loadSound'")) {
            return false;
        }
        this.b.put(string, n2);
        AudioFormat audioFormat = n2.b;
        int n3 = 0;
        if (audioFormat.getChannels() == 1) {
            if (audioFormat.getSampleSizeInBits() == 8) {
                n3 = 4352;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.q("Illegal sample size in method 'loadSound'");
                    return false;
                }
                n3 = 4353;
            }
        } else {
            if (audioFormat.getChannels() != 2) {
                this.q("File neither mono nor stereo in method 'loadSound'");
                return false;
            }
            if (audioFormat.getSampleSizeInBits() == 8) {
                n3 = 4354;
            } else {
                if (audioFormat.getSampleSizeInBits() != 16) {
                    this.q("Illegal sample size in method 'loadSound'");
                    return false;
                }
                n3 = 4355;
            }
        }
        IntBuffer intBuffer = BufferUtils.d(1);
        AL10.g(intBuffer);
        if (this.a(AL10.a() != 0, "alGenBuffers error when saving " + string)) {
            return false;
        }
        AL10.a(intBuffer.get(0), n3, (ByteBuffer)BufferUtils.a(n2.a.length).put(n2.a).flip(), (int)audioFormat.getSampleRate());
        if (this.a(AL10.a() != 0, "alBufferData error when saving " + string) && this.a(intBuffer == null, "Sound buffer was not created for " + string)) {
            return false;
        }
        this.n.put(string, intBuffer);
        return true;
    }

    public void a(String string) {
        this.n.remove(string);
        super.a(string);
    }

    public void a(float f2) {
        super.a(f2);
        AL10.a(4106, f2);
        this.w();
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5) {
        IntBuffer intBuffer = null;
        if (!bl3) {
            intBuffer = (IntBuffer)this.n.get(d2.a());
            if (intBuffer == null && !this.a(d2)) {
                this.q("Source '" + string + "' was not created " + "because an error occurred while loading " + d2.a());
                return;
            }
            intBuffer = (IntBuffer)this.n.get(d2.a());
            if (intBuffer == null) {
                this.q("Source '" + string + "' was not created " + "because a sound buffer was not found for " + d2.a());
                return;
            }
        }
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
        this.c.put(string, new i(this.k, intBuffer, bl2, bl3, bl4, string, d2, n3, f2, f3, f4, n2, f5, false));
    }

    public void a(AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        this.c.put(string, new i(this.k, audioFormat, bl2, string, f2, f3, f4, n2, f5));
    }

    public void a(boolean bl2, boolean bl3, boolean bl4, String string, d d2, float f2, float f3, float f4, int n2, float f5, boolean bl5) {
        IntBuffer intBuffer = null;
        if (!bl3) {
            intBuffer = (IntBuffer)this.n.get(d2.a());
            if (intBuffer == null) {
                this.a(d2);
            }
            if ((intBuffer = (IntBuffer)this.n.get(d2.a())) == null) {
                this.q("Sound buffer was not created for " + d2.a());
                return;
            }
        }
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
        i i2 = new i(this.k, intBuffer, bl2, bl3, bl4, string, d2, n3, f2, f3, f4, n2, f5, false);
        this.c.put(string, i2);
        this.a(i2);
        if (bl5) {
            i2.a(true);
        }
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
        if (this.n == null) {
            this.n = new HashMap();
            this.p("Open AL Buffer Map was null in method'copySources'");
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
            if (!u2.f && n2 == null) continue;
            this.c.put(string, new i(this.k, (IntBuffer)this.n.get(u2.j.a()), u2, n2));
        }
    }

    public void c(float f2, float f3, float f4) {
        super.c(f2, f3, f4);
        this.k.put(0, f2);
        this.k.put(1, f3);
        this.k.put(2, f4);
        AL10.b(4100, this.k);
        this.w();
    }

    public void c(float f2) {
        super.c(f2);
        this.l.put(0, this.a.b.a);
        this.l.put(2, this.a.b.c);
        AL10.b(4111, this.l);
        this.w();
    }

    public void a(float f2, float f3, float f4, float f5, float f6, float f7) {
        super.a(f2, f3, f4, f5, f6, f7);
        this.l.put(0, f2);
        this.l.put(1, f3);
        this.l.put(2, f4);
        this.l.put(3, f5);
        this.l.put(4, f6);
        this.l.put(5, f7);
        AL10.b(4111, this.l);
        this.w();
    }

    public void a(h h2) {
        super.a(h2);
        this.k.put(0, h2.a.a);
        this.k.put(1, h2.a.b);
        this.k.put(2, h2.a.c);
        AL10.b(4100, this.k);
        this.w();
        this.l.put(0, h2.b.a);
        this.l.put(1, h2.b.b);
        this.l.put(2, h2.b.c);
        this.l.put(3, h2.c.a);
        this.l.put(4, h2.c.b);
        this.l.put(5, h2.c.c);
        AL10.b(4111, this.l);
        this.w();
        this.m.put(0, h2.d.a);
        this.m.put(1, h2.d.b);
        this.m.put(2, h2.d.c);
        AL10.b(4102, this.m);
        this.w();
    }

    public void a(float f2, float f3, float f4) {
        super.a(f2, f3, f4);
        this.m.put(0, this.a.d.a);
        this.m.put(1, this.a.d.b);
        this.m.put(2, this.a.d.c);
        AL10.b(4102, this.m);
    }

    public void f() {
        super.f();
        AL10.a(p.g());
        this.w();
        AL10.b(p.h());
        this.w();
    }

    private boolean w() {
        switch (AL10.a()) {
            case 0: {
                return false;
            }
            case 40961: {
                this.q("Invalid name parameter.");
                return true;
            }
            case 40962: {
                this.q("Invalid parameter.");
                return true;
            }
            case 40963: {
                this.q("Invalid enumerated parameter value.");
                return true;
            }
            case 40964: {
                this.q("Illegal call.");
                return true;
            }
            case 40965: {
                this.q("Unable to allocate memory.");
                return true;
            }
        }
        this.q("An unrecognized error occurred.");
        return true;
    }

    public static boolean t() {
        return e.a.b.f.a(false, false);
    }

    private static synchronized boolean a(boolean bl2, boolean bl3) {
        if (bl2) {
            o = bl3;
        }
        return o;
    }

    public static String u() {
        return "LWJGL OpenAL";
    }

    public static String v() {
        return "The LWJGL binding of OpenAL.  For more information, see http://www.lwjgl.org";
    }

    public String r() {
        return "LibraryLWJGLOpenAL";
    }
}

