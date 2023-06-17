/*
 * Decompiled with CFR 0.150.
 */
package e.a.b;

import e.a.b.c;
import e.a.n;
import java.util.LinkedList;
import java.util.List;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Mixer;
import javax.sound.sampled.SourceDataLine;

public class a
extends e.a.a {
    public Clip e = null;
    n f;
    public SourceDataLine g = null;
    private List h;
    private int i = 0;
    private Mixer j = null;
    private AudioFormat k = null;
    private FloatControl l = null;
    private FloatControl m = null;
    private FloatControl n = null;
    private float o = 0.0f;
    private float p = 0.0f;
    private boolean q = false;

    public a(int n2, Mixer mixer) {
        super(n2);
        this.a = c.class;
        this.j = mixer;
        this.e = null;
        this.g = null;
        this.h = new LinkedList();
    }

    public void a() {
        if (this.h != null) {
            n n2 = null;
            while (!this.h.isEmpty()) {
                n2 = (n)this.h.remove(0);
                n2.a();
                n2 = null;
            }
            this.h.clear();
        }
        this.e = null;
        this.f = null;
        this.g = null;
        this.h.clear();
        this.j = null;
        this.k = null;
        this.h = null;
        super.a();
    }

    public void a(Mixer mixer) {
        if (this.j != mixer) {
            try {
                if (this.e != null) {
                    this.e.close();
                } else if (this.g != null) {
                    this.g.close();
                }
            }
            catch (SecurityException securityException) {
                // empty catch block
            }
            this.j = mixer;
            if (this.c != null) {
                if (this.b == 0 && this.f != null) {
                    this.a(this.f);
                } else if (this.k != null) {
                    this.b(this.k);
                }
            }
        }
    }

    public boolean a(n n2) {
        if (this.a(this.b != 0, "Buffers may only be attached to non-streaming sources")) {
            return false;
        }
        if (this.a(this.j == null, "Mixer null in method 'attachBuffer'")) {
            return false;
        }
        if (this.a(n2 == null, "Buffer null in method 'attachBuffer'")) {
            return false;
        }
        if (this.a(n2.a == null, "Buffer missing audio data in method 'attachBuffer'")) {
            return false;
        }
        if (this.a(n2.b == null, "Buffer missing format information in method 'attachBuffer'")) {
            return false;
        }
        DataLine.Info info = new DataLine.Info(Clip.class, n2.b);
        if (this.a(!AudioSystem.isLineSupported(info), "Line not supported in method 'attachBuffer'")) {
            return false;
        }
        Clip clip = null;
        try {
            clip = (Clip)this.j.getLine(info);
        }
        catch (Exception exception) {
            this.c("Unable to create clip in method 'attachBuffer'");
            this.a(exception);
            return false;
        }
        if (this.a(clip == null, "New clip null in method 'attachBuffer'")) {
            return false;
        }
        if (this.e != null) {
            this.e.stop();
            this.e.flush();
            this.e.close();
        }
        this.e = clip;
        this.f = n2;
        this.k = n2.b;
        clip = null;
        try {
            this.e.open(this.k, n2.a, 0, n2.a.length);
        }
        catch (Exception exception) {
            this.c("Unable to attach buffer to clip in method 'attachBuffer'");
            this.a(exception);
            return false;
        }
        this.m();
        return true;
    }

    public void a(AudioFormat audioFormat) {
        this.b(audioFormat);
        if (this.c != null && this.c.b && this.c.s() && this.g != null) {
            this.g.start();
        }
    }

    public boolean b(AudioFormat audioFormat) {
        if (this.a(this.j == null, "Mixer null in method 'resetStream'")) {
            return false;
        }
        if (this.a(audioFormat == null, "AudioFormat null in method 'resetStream'")) {
            return false;
        }
        DataLine.Info info = new DataLine.Info(SourceDataLine.class, audioFormat);
        if (this.a(!AudioSystem.isLineSupported(info), "Line not supported in method 'resetStream'")) {
            return false;
        }
        SourceDataLine sourceDataLine = null;
        try {
            sourceDataLine = (SourceDataLine)this.j.getLine(info);
        }
        catch (Exception exception) {
            this.c("Unable to create a SourceDataLine in method 'resetStream'");
            this.a(exception);
            return false;
        }
        if (this.a(sourceDataLine == null, "New SourceDataLine null in method 'resetStream'")) {
            return false;
        }
        this.h.clear();
        this.i = 0;
        if (this.g != null) {
            this.g.stop();
            this.g.flush();
            this.g.close();
        }
        this.g = sourceDataLine;
        this.k = audioFormat;
        sourceDataLine = null;
        try {
            this.g.open(this.k);
        }
        catch (Exception exception) {
            this.c("Unable to open the new SourceDataLine in method 'resetStream'");
            this.a(exception);
            return false;
        }
        this.m();
        return true;
    }

    private void m() {
        switch (this.b) {
            case 0: {
                try {
                    this.m = !this.e.isControlSupported(FloatControl.Type.PAN) ? null : (FloatControl)this.e.getControl(FloatControl.Type.PAN);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.m = null;
                }
                try {
                    if (!this.e.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                        this.l = null;
                        this.o = 0.0f;
                    } else {
                        this.l = (FloatControl)this.e.getControl(FloatControl.Type.MASTER_GAIN);
                        this.o = this.l.getValue();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.l = null;
                    this.o = 0.0f;
                }
                try {
                    if (!this.e.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
                        this.n = null;
                        this.p = 0.0f;
                        break;
                    }
                    this.n = (FloatControl)this.e.getControl(FloatControl.Type.SAMPLE_RATE);
                    this.p = this.n.getValue();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.n = null;
                    this.p = 0.0f;
                }
                break;
            }
            case 1: {
                try {
                    this.m = !this.g.isControlSupported(FloatControl.Type.PAN) ? null : (FloatControl)this.g.getControl(FloatControl.Type.PAN);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.m = null;
                }
                try {
                    if (!this.g.isControlSupported(FloatControl.Type.MASTER_GAIN)) {
                        this.l = null;
                        this.o = 0.0f;
                    } else {
                        this.l = (FloatControl)this.g.getControl(FloatControl.Type.MASTER_GAIN);
                        this.o = this.l.getValue();
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.l = null;
                    this.o = 0.0f;
                }
                try {
                    if (!this.g.isControlSupported(FloatControl.Type.SAMPLE_RATE)) {
                        this.n = null;
                        this.p = 0.0f;
                        break;
                    }
                    this.n = (FloatControl)this.g.getControl(FloatControl.Type.SAMPLE_RATE);
                    this.p = this.n.getValue();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    this.n = null;
                    this.p = 0.0f;
                }
                break;
            }
            default: {
                this.c("Unrecognized channel type in method 'resetControls'");
                this.m = null;
                this.l = null;
                this.n = null;
            }
        }
    }

    public void a(boolean bl2) {
        this.q = bl2;
    }

    public void a(float f2) {
        if (this.m == null) {
            return;
        }
        float f3 = f2;
        if (f3 < -1.0f) {
            f3 = -1.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        this.m.setValue(f3);
    }

    public void b(float f2) {
        if (this.l == null) {
            return;
        }
        float f3 = f2;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        double d2 = this.l.getMinimum();
        double d3 = this.o;
        double d4 = 0.5 * d3 - d2;
        double d5 = Math.log(10.0) / 20.0;
        float f4 = (float)(d2 + 1.0 / d5 * Math.log(1.0 + (Math.exp(d5 * d4) - 1.0) * (double)f3));
        this.l.setValue(f4);
    }

    public void c(float f2) {
        if (this.n == null) {
            return;
        }
        float f3 = f2;
        if (f3 < 0.5f) {
            f3 = 0.5f;
        }
        if (f3 > 2.0f) {
            f3 = 2.0f;
        }
        this.n.setValue(f3 *= this.p);
    }

    public boolean a(LinkedList linkedList) {
        if (this.a(this.b != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.a(this.g == null, "SourceDataLine null in method 'preLoadBuffers'.")) {
            return false;
        }
        this.g.start();
        if (linkedList.isEmpty()) {
            return true;
        }
        byte[] arrby = (byte[])linkedList.remove(0);
        if (this.a(arrby == null, "Missing sound-bytes in method 'preLoadBuffers'.")) {
            return false;
        }
        while (!linkedList.isEmpty()) {
            this.h.add(new n((byte[])linkedList.remove(0), this.k));
        }
        this.g.write(arrby, 0, arrby.length);
        this.i = 0;
        return true;
    }

    public boolean a(byte[] arrby) {
        if (this.a(this.b != 1, "Buffers may only be queued for streaming sources.")) {
            return false;
        }
        if (this.a(this.g == null, "SourceDataLine null in method 'queueBuffer'.")) {
            return false;
        }
        if (this.a(this.k == null, "AudioFormat null in method 'queueBuffer'")) {
            return false;
        }
        this.h.add(new n(arrby, this.k));
        this.d();
        this.i = 0;
        return true;
    }

    public boolean d() {
        if (this.a(this.b != 1, "Buffers are only processed for streaming sources.")) {
            return false;
        }
        if (this.a(this.g == null, "SourceDataLine null in method 'processBuffer'.")) {
            return false;
        }
        if (this.h == null || this.h.isEmpty()) {
            return false;
        }
        n n2 = (n)this.h.remove(0);
        this.g.write(n2.a, 0, n2.a.length);
        if (!this.g.isActive()) {
            this.g.start();
        }
        n2.a();
        n2 = null;
        return true;
    }

    public int b(byte[] arrby) {
        if (this.a(this.b != 1, "Raw audio data can only be processed by streaming sources.")) {
            return -1;
        }
        if (this.a(this.h == null, "StreamBuffers queue null in method 'feedRawAudioData'.")) {
            return -1;
        }
        this.h.add(new n(arrby, this.k));
        return this.b();
    }

    public int b() {
        this.i = 0;
        if (this.a(this.b != 1, "Buffers may only be queued for streaming sources.")) {
            if (this.h != null) {
                this.h.clear();
            }
            return 0;
        }
        if (this.g == null) {
            if (this.h != null) {
                this.h.clear();
            }
            return 0;
        }
        if (this.g.available() > 0) {
            this.i = 1;
        }
        return this.i;
    }

    public void e() {
        if (this.b != 1) {
            return;
        }
        if (this.a(this.g == null, "SourceDataLine null in method 'flush'.")) {
            return;
        }
        this.g.stop();
        this.g.flush();
        this.g.drain();
        this.h.clear();
        this.i = 0;
    }

    public void f() {
        switch (this.b) {
            case 0: {
                if (this.e == null) break;
                this.e.stop();
                this.e.flush();
                this.e.close();
                break;
            }
            case 1: {
                if (this.g == null) break;
                this.e();
                this.g.close();
                break;
            }
        }
    }

    public void g() {
        switch (this.b) {
            case 0: {
                if (this.e == null) break;
                if (this.q) {
                    this.e.stop();
                    this.e.loop(-1);
                    break;
                }
                this.e.stop();
                this.e.start();
                break;
            }
            case 1: {
                if (this.g == null) break;
                this.g.start();
                break;
            }
        }
    }

    public void h() {
        switch (this.b) {
            case 0: {
                if (this.e == null) break;
                this.e.stop();
                break;
            }
            case 1: {
                if (this.g == null) break;
                this.g.stop();
                break;
            }
        }
    }

    public void i() {
        switch (this.b) {
            case 0: {
                if (this.e == null) break;
                this.e.stop();
                this.e.setFramePosition(0);
                break;
            }
            case 1: {
                if (this.g == null) break;
                this.g.stop();
                break;
            }
        }
    }

    public void j() {
        switch (this.b) {
            case 0: {
                if (this.e == null) break;
                boolean bl2 = this.e.isRunning();
                this.e.stop();
                this.e.setFramePosition(0);
                if (!bl2) break;
                if (this.q) {
                    this.e.loop(-1);
                    break;
                }
                this.e.start();
                break;
            }
            case 1: {
                break;
            }
        }
    }

    public float c() {
        switch (this.b) {
            case 0: {
                if (this.e == null) {
                    return -1.0f;
                }
                return (float)this.e.getMicrosecondPosition() / 1000.0f;
            }
            case 1: {
                if (this.g == null) {
                    return -1.0f;
                }
                return (float)this.g.getMicrosecondPosition() / 1000.0f;
            }
        }
        return -1.0f;
    }

    public boolean k() {
        switch (this.b) {
            case 0: {
                if (this.e == null) {
                    return false;
                }
                return this.e.isActive();
            }
            case 1: {
                if (this.g == null) {
                    return false;
                }
                return this.g.isActive();
            }
        }
        return false;
    }
}

