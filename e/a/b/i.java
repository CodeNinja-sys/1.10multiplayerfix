/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.a;
import e.a.b.b;
import e.a.b.f;
import e.a.d;
import e.a.n;
import e.a.p;
import e.a.u;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.LinkedList;
import javax.sound.sampled.AudioFormat;
import org.lwjgl.BufferUtils;
import org.lwjgl.openal.AL10;

public class i
extends u {
    private b F;
    private IntBuffer G;
    private FloatBuffer H;
    private FloatBuffer I;
    private FloatBuffer J;

    public i(FloatBuffer floatBuffer, IntBuffer intBuffer, boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        super(bl2, bl3, bl4, string, d2, n2, f2, f3, f4, n3, f5, bl5);
        this.F = (b)this.s;
        if (this.u != null) {
            this.u.a(true);
        }
        this.H = floatBuffer;
        this.G = intBuffer;
        this.a = f.class;
        this.q = 1.0f;
        this.z();
    }

    public i(FloatBuffer floatBuffer, IntBuffer intBuffer, u u2, n n2) {
        super(u2, n2);
        this.F = (b)this.s;
        if (this.u != null) {
            this.u.a(true);
        }
        this.H = floatBuffer;
        this.G = intBuffer;
        this.a = f.class;
        this.q = 1.0f;
        this.z();
    }

    public i(FloatBuffer floatBuffer, AudioFormat audioFormat, boolean bl2, String string, float f2, float f3, float f4, int n2, float f5) {
        super(audioFormat, bl2, string, f2, f3, f4, n2, f5);
        this.F = (b)this.s;
        this.H = floatBuffer;
        this.a = f.class;
        this.q = 1.0f;
        this.z();
    }

    public void a() {
        super.a();
    }

    public void a(FloatBuffer floatBuffer, IntBuffer intBuffer, boolean bl2, boolean bl3, boolean bl4, String string, d d2, n n2, float f2, float f3, float f4, int n3, float f5, boolean bl5) {
        super.a(bl2, bl3, bl4, string, d2, n2, f2, f3, f4, n3, f5, bl5);
        this.H = floatBuffer;
        this.G = intBuffer;
        this.q = 1.0f;
        this.z();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c() {
        if (!this.f) {
            this.d("Method 'incrementSoundSequence' may only be used for streaming sources.");
            return false;
        }
        Object object = this.y;
        synchronized (object) {
            AudioFormat audioFormat;
            if (this.x == null) return false;
            if (this.x.size() <= 0) return false;
            this.j = (d)this.x.remove(0);
            if (this.u != null) {
                this.u.e();
            }
            this.u = e.a.p.c(this.j.a());
            if (this.u == null) return true;
            this.u.a(true);
            if (this.u.f() == null) {
                this.u.a(this.j.b());
            }
            if ((audioFormat = this.u.f()) == null) {
                this.d("Audio Format null in method 'incrementSoundSequence'");
                return false;
            }
            int n2 = 0;
            if (audioFormat.getChannels() == 1) {
                if (audioFormat.getSampleSizeInBits() == 8) {
                    n2 = 4352;
                } else {
                    if (audioFormat.getSampleSizeInBits() != 16) {
                        this.d("Illegal sample size in method 'incrementSoundSequence'");
                        return false;
                    }
                    n2 = 4353;
                }
            } else {
                if (audioFormat.getChannels() != 2) {
                    this.d("Audio data neither mono nor stereo in method 'incrementSoundSequence'");
                    return false;
                }
                if (audioFormat.getSampleSizeInBits() == 8) {
                    n2 = 4354;
                } else {
                    if (audioFormat.getSampleSizeInBits() != 16) {
                        this.d("Illegal sample size in method 'incrementSoundSequence'");
                        return false;
                    }
                    n2 = 4355;
                }
            }
            this.F.a(n2, (int)audioFormat.getSampleRate());
            this.z = true;
            return true;
        }
    }

    public void f() {
        this.g();
    }

    public void a(float f2, float f3, float f4) {
        super.a(f2, f3, f4);
        if (this.I == null) {
            this.z();
        } else {
            this.g();
        }
        this.I.put(0, f2);
        this.I.put(1, f3);
        this.I.put(2, f4);
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            AL10.a(this.F.e.get(0), 4100, this.I);
            this.C();
        }
    }

    public void g() {
        this.A();
        this.B();
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            AL10.a(this.F.e.get(0), 4106, this.o * this.p * Math.abs(this.A) * this.B);
            this.C();
        }
        this.y();
    }

    private void y() {
        if (this.s != null && this.s.c == this && e.a.b.f.t() && this.F != null && this.F.e != null) {
            AL10.a(this.F.e.get(0), 4099, this.q);
            this.C();
        }
    }

    public void c(boolean bl2) {
        super.c(bl2);
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            if (bl2) {
                AL10.a(this.F.e.get(0), 4103, 1);
            } else {
                AL10.a(this.F.e.get(0), 4103, 0);
            }
            this.C();
        }
    }

    public void a(int n2) {
        super.a(n2);
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            if (n2 == 1) {
                AL10.a(this.F.e.get(0), 4129, this.m);
            } else {
                AL10.a(this.F.e.get(0), 4129, 0.0f);
            }
            this.C();
        }
    }

    public void a(float f2) {
        super.a(f2);
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            if (this.l == 1) {
                AL10.a(this.F.e.get(0), 4129, f2);
            } else {
                AL10.a(this.F.e.get(0), 4129, 0.0f);
            }
            this.C();
        }
    }

    public void b(float f2, float f3, float f4) {
        super.b(f2, f3, f4);
        this.J = BufferUtils.f(3).put(new float[]{f2, f3, f4});
        this.J.flip();
        if (this.s != null && this.s.c == this && this.F != null && this.F.e != null) {
            AL10.a(this.F.e.get(0), 4102, this.J);
            this.C();
        }
    }

    public void b(float f2) {
        super.b(f2);
        this.y();
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(a a2) {
        boolean bl2;
        if (!this.s()) {
            if (this.g) {
                this.h = true;
            }
            return;
        }
        if (a2 == null) {
            this.d("Unable to play source, because channel was null");
            return;
        }
        boolean bl3 = bl2 = this.s != a2;
        if (this.s != null && this.s.c != this) {
            bl2 = true;
        }
        boolean bl4 = this.v();
        super.a(a2);
        this.F = (b)this.s;
        if (bl2) {
            this.a(this.k.a, this.k.b, this.k.c);
            this.y();
            if (this.F != null && this.F.e != null) {
                if (e.a.b.f.t()) {
                    AL10.a(this.F.e.get(0), 4099, this.q);
                    this.C();
                }
                AL10.a(this.F.e.get(0), 4100, this.I);
                this.C();
                AL10.a(this.F.e.get(0), 4102, this.J);
                this.C();
                if (this.l == 1) {
                    AL10.a(this.F.e.get(0), 4129, this.m);
                } else {
                    AL10.a(this.F.e.get(0), 4129, 0.0f);
                }
                this.C();
                if (this.g && !this.f) {
                    AL10.a(this.F.e.get(0), 4103, 1);
                } else {
                    AL10.a(this.F.e.get(0), 4103, 0);
                }
                this.C();
            }
            if (!this.f) {
                if (this.G == null) {
                    this.d("No sound buffer to play");
                    return;
                }
                this.F.a(this.G);
            }
        }
        if (!this.t()) {
            if (this.f && !bl4) {
                AudioFormat audioFormat;
                if (this.u == null) {
                    this.d("Decoder null in method 'play'");
                    return;
                }
                if (this.u.f() == null) {
                    this.u.a(this.j.b());
                }
                if ((audioFormat = this.u.f()) == null) {
                    this.d("Audio Format null in method 'play'");
                    return;
                }
                int n2 = 0;
                if (audioFormat.getChannels() == 1) {
                    if (audioFormat.getSampleSizeInBits() == 8) {
                        n2 = 4352;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != 16) {
                            this.d("Illegal sample size in method 'play'");
                            return;
                        }
                        n2 = 4353;
                    }
                } else {
                    if (audioFormat.getChannels() != 2) {
                        this.d("Audio data neither mono nor stereo in method 'play'");
                        return;
                    }
                    if (audioFormat.getSampleSizeInBits() == 8) {
                        n2 = 4354;
                    } else {
                        if (audioFormat.getSampleSizeInBits() != 16) {
                            this.d("Illegal sample size in method 'play'");
                            return;
                        }
                        n2 = 4355;
                    }
                }
                this.F.a(n2, (int)audioFormat.getSampleRate());
                this.z = true;
            }
            this.s.g();
            if (this.q != 1.0f) {
                this.y();
            }
        }
    }

    public boolean l() {
        if (this.u == null) {
            return false;
        }
        this.u.a(this.j.b());
        LinkedList<byte[]> linkedList = new LinkedList<byte[]>();
        for (int i2 = 0; i2 < e.a.p.m(); ++i2) {
            this.t = this.u.b();
            if (this.t == null || this.t.a == null) break;
            linkedList.add(this.t.a);
        }
        this.g();
        this.s.a(linkedList);
        this.z = false;
        return true;
    }

    private void z() {
        this.I = BufferUtils.f(3).put(new float[]{this.k.a, this.k.b, this.k.c});
        this.J = BufferUtils.f(3).put(new float[]{this.n.a, this.n.b, this.n.c});
        this.I.flip();
        this.J.flip();
        this.g();
    }

    private void A() {
        if (this.H != null) {
            double d2 = this.k.a - this.H.get(0);
            double d3 = this.k.b - this.H.get(1);
            double d4 = this.k.c - this.H.get(2);
            this.r = (float)Math.sqrt(d2 * d2 + d3 * d3 + d4 * d4);
        }
    }

    private void B() {
        if (this.l == 2) {
            this.o = this.r <= 0.0f ? 1.0f : (this.r >= this.m ? 0.0f : 1.0f - this.r / this.m);
            if (this.o > 1.0f) {
                this.o = 1.0f;
            }
            if (this.o < 0.0f) {
                this.o = 0.0f;
            }
        } else {
            this.o = 1.0f;
        }
    }

    private boolean C() {
        switch (AL10.a()) {
            case 0: {
                return false;
            }
            case 40961: {
                this.d("Invalid name parameter.");
                return true;
            }
            case 40962: {
                this.d("Invalid parameter.");
                return true;
            }
            case 40963: {
                this.d("Invalid enumerated parameter value.");
                return true;
            }
            case 40964: {
                this.d("Illegal call.");
                return true;
            }
            case 40965: {
                this.d("Unable to allocate memory.");
                return true;
            }
        }
        this.d("An unrecognized error occurred.");
        return true;
    }
}

